package algo.union_find;

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
		System.out.println("weighted");
		QuickFind ufw=new QuickFind(N);
		ufw.unionQuickWeighted(3, 8);
		ufw.unionQuickWeighted(4, 3);
		ufw.unionQuickWeighted(9, 4);
		ufw.unionQuickWeighted(6, 5);
		ufw.unionQuickWeighted(2, 1);
		ufw.unionQuickWeighted(5, 4);
		ufw.unionQuickWeighted(5, 0);
		ufw.unionQuickWeighted(7, 2);
		ufw.unionQuickWeighted(6, 1);
		uf.printNumbers();
	}
}
