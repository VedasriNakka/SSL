package w3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
//import com.google.common.primitives.Ints;

import w3.Vertex;
import w3.Edge;
import LinkedList.Matrix;

public class Graph1 {
	ArrayList<Edge> edges;
	
	Graph1(){
		this.edges = new ArrayList<Edge>();
	}
	
	public static void main(String args[]) throws IOException {
		
		Graph1 g = new Graph1();
		
		File readFile = new File("C:\\Users\\Veda\\Desktop\\graph.csv");
		FileReader fr = new FileReader(readFile);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		Set<String> set1 = new HashSet<String>();
		
		while((line = br.readLine()) != null) {
			String s[] = line.split(",");			
			
			Vertex v1 = new Vertex(s[0]);
			Vertex v2 = new Vertex(s[2]);
			int e1 = Integer.parseInt(s[1]);
			Edge e = new Edge(v1, v2, e1);
			
			g.edges.add(e);
			set1.add(s[0]);
			set1.add(s[2]);
		}
		ArrayList<String> arr1 = new ArrayList<String>();
		for(String setArr: set1) {
			arr1.add(setArr);
		}
		int size = arr1.size();

		int arrMat[][] = new int[size][size];
		
		for(Edge ed : g.edges) {
			int r = arr1.indexOf(ed.start.label);
			int c = arr1.indexOf(ed.end.label);
			 
			arrMat[r][c] = ed.weight; 
			arrMat[c][r] = ed.weight;
		}
		
		Matrix m = new Matrix(size, size, arrMat);
		m.print_matrix();	
	}
}

