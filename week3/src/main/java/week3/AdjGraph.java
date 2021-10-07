package week3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AdjGraph{
	public class Edge{
		int v,w;
		public Edge(int v,int w){
			this.v=v; this.w=w;
		}
		@Override
		public String toString(){
			return "("+v+","+w+")";
		}
	}
	List<Edge> G[];
	public AdjGraph(int n){
		G=new LinkedList[n];
		for(int i=0;i<G.length;i++)
			G[i]=new LinkedList<Edge>();
	}
	boolean isConnected(int u,int v){
		for(Edge i: G[u])
			if(i.v==v) return true;
		return false;
	}
	void addEdge(int u,int v,int w){
		G[u].add(0,new Edge(v,w)); 
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<G.length;i++)
			result+= i+"=>"+G[i]+"\n";
		return result;
	}
//}

//public class AdjGraph {
	public static void main(String[] args) {
		AdjGraph g=new AdjGraph(10);
//		g.addEdge(0, 2, 10);
//		g.addEdge(0, 5, 15);
//		g.addEdge(2, 5, 10);
//		g.addEdge(9, 3, 16);
		

	      try 
	      {
	    	  
	    	  File readFile = new File("C:\\Users\\Veda\\Desktop\\gragh.csv"); //Reading Text file
	    	  Scanner sc = new Scanner(readFile);
	    	  System.out.println(sc);

	    	  while(sc.hasNext()){		
	    	  	String line = sc.nextLine();
	    	  	String[] values = line.split(",");
	    	  	int[] numArr = new int[values.length];
	    	  	for(int i = 0; i < numArr.length; i++){
	    	  	    numArr[i] = Integer.parseInt(values[i]);
	    	  	  System.out.println(numArr);
	    	  	  
	    	  	}
	    	  	System.out.println(numArr);
	    	  	//g.addEdge(numArr[0],numArr[1],numArr[2]);
	    	  	
	    	  }

	    	  sc.close();	     
	      }
	      catch( Exception e ) 
	      {
	        System.out.println("Unable to open file" + e.toString());
	        
	      }
	      
		
		System.out.println(g);
		System.out.println(g.isConnected(9,3));
	}
}