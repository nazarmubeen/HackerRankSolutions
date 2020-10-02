package algo.graph;

import java.util.Stack;

//this is a class to define Graph
public class Graph {

	 int maxsize=20;
	 Vertex vertexlist[];
	 int matrixlist[][];
	 int vertexcount;
	 Stack stackobj;
	 

	 public Graph()
	 {
	  vertexlist = new Vertex[maxsize];
	  matrixlist=new int[maxsize][maxsize];
	  vertexcount=0;
	  for(int i=0;i<maxsize;i++)
	  {
	   for(int j=0;j<maxsize;j++)
	   {
	    matrixlist[i][j]=0;
	   }
	  }
	  stackobj=new Stack();   
	 }
	 
	 public void addVertex(char label)
	 {
	  vertexlist[vertexcount++]=new Vertex(label);
	 }
	 
	 public void addEdge(int i,int j)
	 {
	  matrixlist[i][j]=1;
	  matrixlist[j][i]=1;
	 }
	 
	 public void displayVertex(int v)
	 {
	  System.out.println(vertexlist[v].label);
	 }
	 
	 public int adjVertex(int v)
	 {
	  for(int i=0;i<maxsize;i++)
	  {
	   if(matrixlist[v][i]==1 && vertexlist[i].visited==false )
	    return i;
	  }
	  return -1;
	 }
}
