package algo.graph;

import java.util.ArrayList;
import java.util.HashMap;


abstract public class GraphBase {
	
	//declaring instance of vertex
	Vertex vertex;
	//declaring an array of vertex to hold all the vertex
	static Vertex[] vertexlist=new Vertex[10];
	//declaring edgelist to hold all edges
	static HashMap<Character,ArrayList<Character>> edgelist=new HashMap<>();
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

	/*
	 * in the same edgelist we add the vertices that are now in connection by simply updating value for a key
	 */
	int addEdge(char v1,char[] v2)
	{
		ArrayList<Character> vertextoadd=new ArrayList<>();
		for(int i=0;i<v2.length;i++)
		{
			edgecount++;
		vertextoadd.add(v2[i]);
		}
		edgelist.put(v1, vertextoadd);
		
		
		return edgecount;
	}
	

	
	//A function that returns neighbour vertices for a given vertex
	
	ArrayList getNeighbours(char vertex)
	{
		return edgelist.get(vertex);
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
