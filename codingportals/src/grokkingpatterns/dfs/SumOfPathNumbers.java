package grokkingpatterns.dfs;

import main.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class SumOfPathNumbers {
    public static int findSumOfPathNumbers(TreeNode root) {

        int sum = 0;
        StringBuilder currentList = new StringBuilder();
        recursion(sum, currentList, root);
        return sum;
    }

    static int recursion(int sum, StringBuilder currentList, TreeNode root) {

        if (root == null)
            return 0;

        currentList.append(root.data);

        if (root.left == null && root.right == null) {
            System.out.println("currentList " + currentList.toString());
            sum = sum + Integer.parseInt(currentList.toString());
            //   System.out.println("sum "+sum);
            currentList.deleteCharAt(currentList.length() - 1);
            return sum;
        }

        sum = sum + recursion(sum, currentList, root.left) + recursion(sum, currentList, root.right);
        System.out.println("sum " + sum);
        currentList.deleteCharAt(currentList.length() - 1);
        return sum;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        System.out.println("Total Sum of Path Numbers: " + SumOfPathNumbers.findSumOfPathNumbers(root));
    }
}