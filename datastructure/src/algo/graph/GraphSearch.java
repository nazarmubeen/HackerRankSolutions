package algo.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphSearch extends GraphBase {
	
	/*Depth First Search 
	 * Basically it works on the concept of stack we take vertex from it serach its neighbour and do the same till no vertex left
	*
	*1. Push first element in stack
	*2. Search for its neigbour and add them in stack and pop the vertex
	*3. do same for rest of the vertices until there is no vertex left in a stack
	*
	*/
	void searchBFS()
	{	
	Stack<Character> stack=new Stack<>();
	
	stack.push(vertexlist[0].label);
	
	while(!stack.isEmpty())
	{
		System.out.println("traverse"+stack.peek());
		ArrayList adjvertex=getNeighbours(stack.peek());
		stack.pop();
		if(adjvertex!=null)
		{
		for(int i=adjvertex.size()-1;i>=0;i--)
		{
			stack.push((Character) adjvertex.get(i));
		}
		}
	}
	
	
	
	}

	
	void searchDFS()
	{
		Queue<Character> queue=new LinkedList<Character>();
		
		queue.add(vertexlist[0].label);
		
		
	
		
		while(!queue.isEmpty())
		{
		
		ArrayList adjvertex=getNeighbours(queue.peek());
		System.out.println(queue.peek());
		queue.remove();
		if(adjvertex!=null)
		{
		for(int i=0;i<adjvertex.size();i++)
		{
			
			queue.add((Character) adjvertex.get(i));
		}
		}
		}
		
		
	}
}
