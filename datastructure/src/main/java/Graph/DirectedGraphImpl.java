package main.java.Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraphImpl extends DirectedGraph {
	
	//Algorithm to search the shortest path
	public void djiksta(DirectedGraphImpl g)
	{
		//Creating new instance of grapg passed in parameter
		DirectedGraphImpl newgraph=new DirectedGraphImpl();
		newgraph=g;
		
		/*
		 * Declaring hashmap for holding vertex value in character and distance from source in Integer
		 */
		HashMap<Character,Integer> map=new HashMap<>();
		/*
		 * Declaring queue to iterate graph in BFS fashion
		 */
		Queue<Character> queue=new LinkedList<Character>();
		
		//Initializing new instance of graph with vertex and distance as minimum value
		for(int i=0;i<newgraph.vertexcount;i++)
		{
			map.put(vertexlist[i].label, Integer.MIN_VALUE);
		}
		
		//adding root to the queue
	    queue.add(newgraph.vertexlist[0].label);
		
		
		
		while(!queue.isEmpty())
		{
			//checking vertex distance if it minimum distance make it as 0
			if(map.get(queue.peek())==Integer.MIN_VALUE)
			{
				map.put(queue.peek(), 0);
			}
			
			//Storing previous vertex name
			char previousvertex=queue.peek();
			
			//Getting neigbours of previous vertex as well as removing the same from queue tail
			HashMap<Character,Integer> neigbours=newgraph.getNeighbours(queue.remove());
			
			//if neighbours are there
			if(neigbours!=null)
			{
				
				//iterating over neighbours
			for(Character key:neigbours.keySet())
			{
				//Adding neighbour in queue from front
				
				/*
				 * checking condition if distance(new vertex from previous vertex)+distance(source to previous vertex)
				 * is less than what we have in able assign new distance to the table
				 * 
				 * 
				 * supose from A to B distance is 4
				 * from A to C distance is 1 and from C to A distance is 2 then
				 * 
				 *  A to B 4 will be replaced by 3
				 */
				queue.add(key);
				int newvalue=neigbours.get(key)+map.get(previousvertex);
				
				//loop will only run when distance is less or distance not yet defined
				if(newvalue<map.get(key) || map.get(key)==Integer.MIN_VALUE)
				{
					map.put((Character) key, newvalue);
				}
				
			}
			}
			
		}
		
		//calling method to show final matrix of Vertex distance relation
		showShortestDistance(map);
				
	}
	

	
	//Iterating Hash Map to show the shortest distance of vertex from Source
	public void showShortestDistance(HashMap map)
	{
		for(Object key:map.keySet())
		{
			System.out.println(key.toString()+"    "+map.get(key));
		}
	}
	
	
	public static void main(String[] args)
	{
		DirectedGraphImpl dgraph=new DirectedGraphImpl();
		dgraph.addVertex('A');
		dgraph.addVertex('B');
		dgraph.addVertex('C');
		dgraph.addVertex('D');
		dgraph.addVertex('E');
		
		dgraph.addEdge('A', new char[]{'B','C'},new int[]{4,1} );
		dgraph.addEdge('B', new char[]{'E'},new int[]{4} );
		dgraph.addEdge('C', new char[]{'B','D'},new int[]{2,4} );
		dgraph.addEdge('D', new char[]{'E'},new int[]{4} );
		dgraph.listOfVertex();
		System.out.println("shortest distance in a graph using djikstra");
		dgraph.djiksta(dgraph);
		
	}

}
