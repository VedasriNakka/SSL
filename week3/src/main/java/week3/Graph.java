package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



import week3.Vertex;
import week3.Edge;
import LinkedList.Matrix;


public class Graph {

	List<Edge> edges;
	Graph(){
		this.edges = new ArrayList<Edge>();
		
	}	
	
	public static void main(String args[]) throws IOException{
		
		//create graph object
		Graph g = new Graph();
		File readFile = new File("C:\\Users\\Veda\\Desktop\\graph.csv");
		FileReader fr = new FileReader(readFile);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		// Stores only unique vertices
		Set<String> allVertices = new HashSet<String>();
		
		// printing line in a file
		while((line = br.readLine()) != null) {
			System.out.println(line.toString()+ "\n");
			String S[] = line.split(",");
			
//			for(int i=0; i<S.length;i++) {
//				System.out.println(S[i]);
//			}
			
			// creating object of vertex
			Vertex v1 = new Vertex(S[0]);
			Vertex v2 = new Vertex(S[2]);
			int s1 = Integer.parseInt(S[1]);
			
			// create edge object
			Edge e1 = new Edge(v1, v2, s1);	
			g.edges.add(e1);	
			
			allVertices.add(S[0]);
			allVertices.add(S[2]);
		}
		

		for(Edge e: g.edges) {
			
			System.out.println("the edge from "+ e.start.label + " to "+ e.end.label +" with weight "+ e.weight);
		}
		
		//Define a hash table to map string and integer for adjacency matrix
		Hashtable<String, Integer> hs = new Hashtable<String, Integer>();
		
		//fill the hash table with key as vertex label and value as index 
		int i=0;
		for(String setE: allVertices) {
			System.out.println( setE);	
			hs.put(setE, i);
			i++;
		}
		
		int setSize = allVertices.size();
		int adjm[][] = new int[setSize][setSize];	
		
		// Loop over all edges to fill adjacency matrix
		for(Edge e: g.edges) {
			System.out.println(e.start.label + e.end.label + e.weight);		
			int r = hs.get(e.start.label);
			int c = hs.get(e.end.label);
			adjm[r][c] = e.weight;
			adjm[c][r] = e.weight;
			
		}
		
		// Creating matrix object to use print function
		Matrix m = new Matrix( setSize , setSize, adjm);
		m.print_matrix();	
			
	}
}
