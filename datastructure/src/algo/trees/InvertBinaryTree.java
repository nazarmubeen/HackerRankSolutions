package algo.trees;

import main.java.tree.TreeNode;

public class InvertBinaryTree {

    public static void main(String[] args) {

        TreeNode root = TreeOperations.generateTree();

        System.out.println("preorder");
        TreeOperations.preOrderTraverse(root);
        System.out.println("invert tree");
        root = swapNodes(root);
        TreeOperations.preOrderTraverse(root);

    }


    public static TreeNode swapNodes(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null)
            swapNodes(root.left);

        if (root.right != null)
            swapNodes(root.right);

        return root;
    }
}
