package Algo.trees;

import main.java.tree.TreeNode;

public class SortedArrayToTree {

    public static void main(String[] args) {
        int[] arr = {5, 5, 8, 10, 45, 67, 98, 110};
        TreeNode root = buildTree(arr);
        TreeOperations.inOrderTraverse(root);

    }

    static TreeNode buildTree(int[] arr) {
        TreeNode root = null;
        root = sortedArrayToBST(arr, 0, arr.length - 1);
        return root;
    }


    public static TreeNode sortedArrayToBST(int[] num, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid - 1);
        root.right = sortedArrayToBST(num, mid + 1, end);

        return root;
    }

}
