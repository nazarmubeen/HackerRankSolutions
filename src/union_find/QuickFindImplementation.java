package union_find;

public class QuickFindImplementation {
	
	public static void main(String[] args)
	{
		int N=10;
		QuickFind uf=new QuickFind(N);
		uf.printNumbers();
		uf.union(3, 8);
		uf.union(4, 3);
		uf.union(9, 4);
		uf.union(6, 5);
		uf.union(2, 1);
		uf.union(5, 4);
		uf.union(5, 0);
		uf.union(7, 2);
		uf.union(6, 1);
		uf.printNumbers();
	}
}
