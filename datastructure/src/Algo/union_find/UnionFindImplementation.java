package Algo.union_find;

public class UnionFindImplementation {

	public static void main(String[] args)
	{
		int N=10;
		UnionFind uf=new UnionFind(N);
		uf.printNumbers();
		uf.union(1, 2);
		uf.union(3, 4);
		uf.union(4, 9);
		uf.union(3, 8);
		uf.union(5, 6);
		uf.printNumbers();
	}
}
