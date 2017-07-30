package Graphs;

public class GraphUse {

	public static void main(String[] args) throws Exception {
		Graph g = new Graph();
		g.addVertex("G");
		g.addVertex("H");
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
		g.addEdge("C", "D");
		g.addEdge("B", "E");
		g.addEdge("G", "H");
		if(g.havePath("B", "F")){
			System.out.println("Have path");
		}
		else{
			System.out.println("Does Not Have path");
		}
		//g.removeVertex("A");
		//g.removeEdge("D", "C");
		
		//g.dfs();
		
		//g.print();
		
		
		/*int n = g.numVertices();
		if(g.numEdges() > n-1 && g.numEdges() < n*(n+1)/2 )
		{
			System.out.println("the graph is complete");
		}
		else {
			System.out.println("the graph is not complete");
		}*/
	}

}
