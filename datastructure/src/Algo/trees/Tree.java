package Algo.trees;

import main.java.tree.TreeNode;

public class Tree {


    TreeNode root = null;


    public TreeNode constructRoot(int data) {

        this.root = new TreeNode(data);
        return root;
    }


}
