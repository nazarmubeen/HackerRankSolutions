package Graph;

import java.util.Map.Entry;

public class GraphImpl extends GraphBase {

	public static void main(String[] args)
	{
		GraphImpl graph=new GraphImpl();
		//Adding vertices
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addVertex('H');
		
		//Adding edges and this is how we initialize inline array
		graph.addEdge('A', new char[]{'B','C'});
		graph.addEdge('B', new char[]{'D','E'});
		graph.addEdge('C',new char[]{'F','G'} );
		graph.addEdge('D',new char[]{'H'} );
		graph.listOfVertex();
		
		GraphSearch search=new GraphSearch();
		search.searchDFS();
	}
}
