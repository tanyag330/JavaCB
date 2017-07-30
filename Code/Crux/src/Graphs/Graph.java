package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import datastructure.linklist.StackEmptyException;
import datastructure.linklist.StackUsingLL;
import datastructure.linklist.hashmap_intersection;

public class Graph {

	ArrayList<Vertex> vertices;

	Graph(){
		vertices = new ArrayList<>();
	}

	public boolean isEmpty(){
		return vertices.size()==0;
	}


	public int numVertices(){
		return vertices.size();
	}

	public int numEdges(){
		int count=0;
		for(Vertex v : vertices){
			count = count + v.numEdges();
		}

		return count/2;
	}

	public Vertex getVertex(String name){
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return v;
			}
		}
		return null;

	}

	public void addVertex(String name){
		if(getVertex(name) != null){
			return;
		}

		Vertex newVertex = new Vertex(name);
		vertices.add(newVertex);
	}

	public void addEdge(String name1, String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);

		if(v1 == null || v2 == null){
			return;
		}

		if(areAdjacent(v1.name,v2.name)){
			return;
		}

		Edge e = new Edge();
		e.first = v1;
		e.second = v2;
		v1.addEdge(e);
		v2.addEdge(e);

	}

	public boolean areAdjacent(String name1, String name2) {
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);

		if(v1 == null || v2 == null){
			return  false;
		}

		return v1.isAdjacent(v2);	
	}

	public void removeVertex(String name){
		Vertex v = getVertex(name);
		if(v==null){
			return;
		}
		ArrayList<Vertex> adjacent = getAdjacent(v);
		for(Vertex adjV : adjacent){
			adjV.removeEdgeWith(v);
		}
		vertices.remove(v);
	}


	public void removeEdge(String name1,String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);

		if(v1 == null || v2 == null){
			return ;
		}
		if(!areAdjacent(name1, name2)){
			return;
		}

		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
	}

	public ArrayList<Vertex> getAdjacent(Vertex v){
		if(v==null){
			return null;
		}
		ArrayList<Vertex> adjacent = v.getAdjacent();
		return adjacent;
	}

	public void print(){

		for(Vertex v : vertices){
			v.print();
		}
	}

	public void dfs() throws Exception{
		if(isEmpty()){
			return;
		}
		StackUsingLL<Vertex> pendingNodes = new StackUsingLL<>();
		HashMap<Vertex, Boolean> map = new HashMap<>();
		//pendingNodes.push(vertices.get(0));
		//map.put(vertices.get(0), true);

		for(Vertex v1 : vertices){
			if (!map.containsKey(v1)){
				pendingNodes.push(v1);
				map.put(v1, true);
				while(!pendingNodes.isempty()){
					Vertex currentVertex = pendingNodes.pop();
					System.out.println(currentVertex.name +" ");
					ArrayList<Vertex> adjacent = getAdjacent(currentVertex);
					for(Vertex v : adjacent){
						if (!map.containsKey(v)){
							pendingNodes.push(v);
							map.put(v, true);
						}
					}
				}
			}
		}
	}


	public boolean havePath(String name1,String name2) throws Exception{
		HashMap<Vertex,Boolean> map = new HashMap<>();
		return havePath(name1, name2, map);
	}

	public Boolean havePath(String name1,String name2,HashMap<Vertex, Boolean> map) throws Exception{
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		//	StackUsingLL<Vertex> pendingNodes = new StackUsingLL<>();
		//	pendingNodes.push(vertices.get(0));
		map.put(vertices.get(0), true);

		if(v1 == null || v2 == null){
			return false;
		}
		if(areAdjacent(name1, name2)){
			return true;
		}

		ArrayList<Vertex> adjacent = getAdjacent(v1);
		for(Vertex v : adjacent){
			if (!map.containsKey(v)){
				//pendingNodes.push(v);
				map.put(v, true);
				if(havePath(v.name, name2,map)){
					return true;
				}
			}
		}
			return false;

		
	}
}