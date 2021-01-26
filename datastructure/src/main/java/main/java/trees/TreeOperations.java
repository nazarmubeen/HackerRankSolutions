package main.java.trees;

import main.java.tree.TreeNode;

public class TreeOperations {

    TreeNode root;


    public static TreeNode binaryTreeInsert(TreeNode root, int data) {


        if (root == null) {
            root = new TreeNode(data);
            return root;
        } else {

            if (root.data > data) {
                root.left = binaryTreeInsert(root.left, data);
            } else {
                root.right = binaryTreeInsert(root.right, data);
            }
        }

        return root;

    }

    public static void preOrderTraverse(TreeNode root) {
        if (root == null)
            return;
        System.out.print(" -> " + root.data);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public static void inOrderTraverse(TreeNode root) {
        if (root == null)
            return;

        inOrderTraverse(root.left);
        System.out.print(" -> " + root.data);
        inOrderTraverse(root.right);
    }

    public static int sizeOfTree(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            return (sizeOfTree(root.left) + sizeOfTree(root.right) + 1);
        }
    }

    public static int maxDepth(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        else {
            int lDepth = maxDepth(treeNode.left);
            int rDepth = maxDepth(treeNode.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    static TreeNode generateTree() {
        TreeNode root = new TreeNode(7);
        TreeOperations.binaryTreeInsert(root, 3);
        TreeOperations.binaryTreeInsert(root, 18);
        TreeOperations.binaryTreeInsert(root, 2);
        TreeOperations.binaryTreeInsert(root, 5);
        TreeOperations.binaryTreeInsert(root, 11);
        TreeOperations.binaryTreeInsert(root, 21);
        TreeOperations.binaryTreeInsert(root, 1);
        TreeOperations.binaryTreeInsert(root, 6);
        TreeOperations.binaryTreeInsert(root, 19);
        return root;
    }

    static TreeNode generateNormalTree(TreeNode root) {
        root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);
        System.out.println("completed");
        return root;
    }

    static TreeNode generateNormalTree2(TreeNode root) {
        root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(80);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);
        System.out.println("completed");
        return root;
    }

    public TreeNode insertLeft(int data, TreeNode root) {
        TreeNode newnode = new TreeNode(data);
        if (root == null) {
            root = newnode;
            return root;
        }

        TreeNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }


        temp.left = newnode;

        return root;


    }

    public TreeNode insertRight(int data, TreeNode root) {
        TreeNode newnode = new TreeNode(data);
        if (root == null) {
            root = newnode;
            return root;
        }

        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        temp.right = newnode;

        return root;

    }

}
