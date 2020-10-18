package main.java.graph;

import java.util.LinkedList;

public class BFSGraph  extends Graph{
	
	 
	 @SuppressWarnings({ "rawtypes", "unused" })
	 LinkedList queue;
	 
	 public BFSGraph()
	 {
		super();
	  queue= new LinkedList(); 
	 }
	 
	 public void bfs()
	 {
	  System.out.println("in bfs");
	  vertexlist[0].visited=true;
	  displayVertex(0);
	  queue.add(0);
	  int v2;
	  while(!queue.isEmpty())
	  {
	   int v1=(Integer) queue.remove();
	   //System.out.println("removed"+v1);
	   while( (v2=adjVertex(v1))!=-1)
	   {
	   vertexlist[v2].visited=true;
	   displayVertex(v2);
	   queue.add(v2);
	   }
	  }
	  for(int j=0;j<vertexcount;j++)
	  {
	   vertexlist[j].visited=false;
	  }
	 }
}
