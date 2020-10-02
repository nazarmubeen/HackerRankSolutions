package algo.trees;

import main.java.tree.TreeNode;

public class FlattenTreeToList {

    public static void main(String[] args) {
        TreeNode root = TreeOperations.generateTree();
        flattenTree(root);
        TreeOperations.inOrderTraverse(root);
        ;
    }

    static void flattenTree(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode rightmostofleft = rightMost(root.left);
        //System.out.println("right data"+root.right.data);

        if (rightmostofleft != null) {
            System.out.println(rightmostofleft.data);
            rightmostofleft.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        flattenTree(root.right);

    }


    public static TreeNode rightMost(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return root;
        }
        return rightMost(root.right);
    }

}
