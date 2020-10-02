package algo.trees;

import main.java.tree.TreeNode;

public class LargestBSTSubTree {

    public static void main(String[] args) {
        TreeNode root = null;
        //root=TreeOperations.generateNormalTree(root);
        root = TreeOperations.generateTree();
        TreeOperations.preOrderTraverse(root);
        System.out.println(" ");
        System.out.println(findLargestBST(root).size);
    }

    // Recursive function to find the size of the largest BST in a given binary tree
    public static SubTreeInfo findLargestBST(TreeNode root) {
        // Base case: empty tree
        if (root == null) {

            return new SubTreeInfo(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
        }

        // Recur for left subtree and right subtrees
        SubTreeInfo left = findLargestBST(root.left);
        SubTreeInfo right = findLargestBST(root.right);
        System.out.println("current node " + root.data + " left " + left.toString() + " right " + right.toString());
        SubTreeInfo info = null;

        // Check if binary tree rooted under the current root is a BST

        // 1. Left and right subtree are also BST
        // 2. The value of the root node should be more than the largest value
        //	in the left subtree
        // 3. The value of the root node should be less than the smallest value
        //	in the right subtree
        if (left.isBST && right.isBST &&
                (root.data > left.max && root.data < right.min)) {
            System.out.println("current node " + root.data);
            info = new SubTreeInfo(Math.min(root.data, Math.min(left.min, right.min)),
                    Math.max(root.data, Math.max(left.max, right.max)),
                    left.size + 1 + right.size,
                    true);
        } else {
            System.out.println("current node not bst  " + root.data);
            // If binary tree rooted under the current root is not a BST
            // return the size of largest BST in its left and right subtree

            info = new SubTreeInfo(0, 0, Math.max(left.size, right.size), false);
        }

        return info;
    }

    ;

    static class SubTreeInfo {

        // Constructor
        SubTreeInfo(int min, int max, int size, boolean isBST) {
            this.min = min;
            this.max = max;
            this.size = size;
            this.isBST = isBST;
        }

        // stores the min and the max value in the binary tree rooted under the current node
        // min, max fields are relevant only if isBST flag is true
        int min, max;

        // stores the size of largest BST in binary tree rooted under the current node
        int size;

        // true if binary tree rooted under the current node is a BST
        boolean isBST;

        @Override
        public String toString() {
            return "SubTreeInfo{" +
                    "min=" + min +
                    ", max=" + max +
                    ", size=" + size +
                    ", isBST=" + isBST +
                    '}';
        }
    }
}
