package algo.trees;

import main.java.tree.TreeNode;

import java.util.ArrayList;

public class KthSmallestInTree {
    public static void main(String[] args) {

        TreeNode root = TreeOperations.generateTree();
        kthSmallest(root, 7);
        System.out.println("element is " + kthSmallest(root, 8));
    }


    public static int kthSmallest(TreeNode root, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrderTraverse(root, arr, n);
        return arr.get(arr.size() - 1);
    }


    public static void inOrderTraverse(TreeNode root, ArrayList<Integer> arr, int n) {
        if (root == null)
            return;

        inOrderTraverse(root.left, arr, n);
        arr.add(root.data);
        if (arr.size() == n) {
            return;
        }
        inOrderTraverse(root.right, arr, n);
    }

}
