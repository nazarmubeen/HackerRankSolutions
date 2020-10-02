package main.java.tree;


public class TreeNode {

    public TreeNode left;
    public TreeNode right;
    public int data;

    public TreeNode(TreeNode left, TreeNode right, int data) {
        super();
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public TreeNode(int data) {
        super();
        this.left = null;
        this.right = null;
        this.data = data;
    }


}
