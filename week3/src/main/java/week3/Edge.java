package week3;

public class Edge {
	public Vertex start;
	public Vertex end;
	public int weight;
	
	Edge(Vertex s, Vertex e, int w){
		this.start = s;
		this.end = e;
		this.weight = w;	
		}

}
