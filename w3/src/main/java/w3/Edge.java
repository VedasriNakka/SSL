package w3;

public class Edge {
	public Vertex start;
	public Vertex end;
	public int weight;
	
	Edge(Vertex v1, Vertex v2, int i){
		this.start = v1;
		this.end = v2;
		this.weight = i;
	}

}
