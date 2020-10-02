package algo.trees;

import main.java.tree.TreeNode;

import java.util.ArrayList;

public class isBST {


    public static void main(String[] args) {
        TreeNode root = null;
        root = TreeOperations.generateNormalTree(root);
        TreeOperations.preOrderTraverse(root);
        System.out.println(" ");
        System.out.println(isBinarySearchTree(root.right));
        System.out.println(isBinarySearchTree(root.left));
        root = TreeOperations.generateNormalTree2(root);
        TreeOperations.preOrderTraverse(root);
        System.out.println(" ");
        System.out.println(isBinarySearchTree(root.right));
        System.out.println(isBinarySearchTree(root.left));

        //this one is correct
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(isBinarySearchTreeMethod2(root.right, list));
        System.out.println(isBinarySearchTreeMethod2(root.left, list));
    }

    public static ArrayList<Integer> inOrderTraverse(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return list;

        inOrderTraverse(root.left, list);
        list.add(root.data);
        inOrderTraverse(root.right, list);
        return list;
    }


    static boolean isBinarySearchTreeMethod2(TreeNode root, ArrayList<Integer> list) {
        list = inOrderTraverse(root, list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                return false;
            }
        }
        return true;
    }


    static boolean isBinarySearchTree(TreeNode root) {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBinarySearchTree(TreeNode root, int low, int high) {
        if (root == null) {
            return true;
        }
        if (root.data <= low || root.data >= high) {
            return false;
        }
        return isBinarySearchTree(root.left, low, root.data) &&
                isBinarySearchTree(root.right, root.data, high);
    }
}
