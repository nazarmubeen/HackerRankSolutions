package algo.graph;

import java.util.HashMap;

abstract public class DirectedGraph {

	Vertex[] vertexlist=new Vertex[10];
	HashMap<Character,HashMap<Character,Integer>> edgelist=new HashMap<>();
	Vertex vertex;
	//count of vertex and edge
	static int vertexcount=0;
	int edgecount=0;
	/*
	 * This function takes a label and insert in the vertex list as well as edge list since it is new vertex it will add
	 * null to its adjoining vertices
	 */
	int addVertex(char label)
	{
		vertex=new Vertex(label);
		vertexlist[vertexcount]=vertex;
		System.out.println(vertexlist[vertexcount].label);
		edgelist.put(vertex.label, null);
		vertexcount++;
		return vertexcount;
	}
	
	int addEdge(char label,char[] labels,int[] distances)
	{
		HashMap<Character,Integer> vertexlist=new HashMap<>();
		for(int i=0;i<labels.length;i++)
		{
		vertexlist.put(labels[i], distances[i]);
		}
		edgelist.put(label, vertexlist);
		return edgecount;
	}
	
	int removeEdge(char labelfrom,char labelto)
	{
		edgelist.get(labelfrom).remove(labelto);
		edgecount--;
		return edgecount;
	}
	
	HashMap<Character,Integer> getNeighbours(char label)
	{
		return edgelist.get(label);
	}
	
	void listOfVertex()
	{
		System.out.println("Total Vertex:"+ vertexcount);
		
		//This is how we traverse over a hashmap
		for(Object key:edgelist.keySet())
		{
			System.out.println(key+" " +edgelist.get(key));
		}
		
	}
}
