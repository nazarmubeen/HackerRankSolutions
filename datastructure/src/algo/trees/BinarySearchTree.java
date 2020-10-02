package algo.trees;

import main.java.tree.TreeNodeNext;

public class BinarySearchTree {

    //insertion in binary search tree
    static TreeNodeNext Insert(TreeNodeNext mainroot, int value) {
        TreeNodeNext root = mainroot;
        if (root == null) {
            TreeNodeNext node = new TreeNodeNext();
            node.data = value;
            mainroot = node;
            return mainroot;

        }

        if ((value > root.data) && (root.right != null)) {
            //    System.out.println("going right");
            root = Insert(root.right, value);
        }

        if ((value < root.data) && (root.left != null)) {
            //      System.out.println("going left");
            root = Insert(root.left, value);
        }

        if ((value < root.data) && (root.left == null)) {
            //     System.out.println("going lreft creating node");
            TreeNodeNext node = new TreeNodeNext();
            node.data = value;
            root.left = node;
            return mainroot;
        }

        if ((value > root.data) && (root.right == null)) {
            //       System.out.println("going right creating node");
            TreeNodeNext node = new TreeNodeNext();
            node.data = value;
            root.right = node;
            return mainroot;
        }


        return mainroot;
    }


}
