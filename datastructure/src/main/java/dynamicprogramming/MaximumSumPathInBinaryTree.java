package main.java.dynamicprogramming;


import main.java.tree.TreeNode;

/// same dataue can be used by multiple recursive calls.
class Res {
    int data;
}

public class MaximumSumPathInBinaryTree {
    static TreeNode root;

    public static void main(String[] args) {
        MaximumSumPathInBinaryTree obj = new MaximumSumPathInBinaryTree();
        TreeNode treeNode = null;
        obj.maxPathSum(treeNode);
    }


    // A utility function to find the maximum sum between any
    // two leaves.This function calculates two dataues:
    // 1) Maximum path sum between two leaves which is stored
    //    in res.
    // 2) The maximum root to leaf path sum which is returned.
    // If one side of root is empty, then it returns INT_MIN
    int maxPathSumUtil(TreeNode treeNode, Res res) {

        // Base cases
        if (treeNode == null)
            return 0;
        if (treeNode.left == null && treeNode.right == null)
            return treeNode.data;

        // Find maximum sum in left and right subtree. Also
        // find maximum root to leaf sums in left and right
        // subtrees and store them in ls and rs
        int ls = maxPathSumUtil(treeNode.left, res);
        int rs = maxPathSumUtil(treeNode.right, res);

        // If both left and right children exist
        if (treeNode.left != null && treeNode.right != null) {

            // Update result if needed
            res.data = Math.max(res.data, ls + rs + treeNode.data);

            // Return maxium possible dataue for root being
            // on one side
            return Math.max(ls, rs) + treeNode.data;
        }

        // If any of the two children is empty, return
        // root sum for root being on one side
        return (treeNode.left == null) ? rs + treeNode.data
                : ls + treeNode.data;
    }

    // The main function which returns sum of the maximum
    // sum path between two leaves. This function mainly
    // uses maxPathSumUtil()
    int maxPathSum(TreeNode treeNode) {
        Res res = new Res();
        res.data = Integer.MIN_VALUE;
        maxPathSumUtil(root, res);
        return res.data;
    }
	
	
	
	
	
}

