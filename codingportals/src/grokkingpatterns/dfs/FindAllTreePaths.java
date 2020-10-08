package grokkingpatterns.dfs;

import main.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class FindAllTreePaths {
    public static List<List<Integer>> findPaths(TreeNode root, int sum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        recursion(allPaths, currentList, root, sum);

        return allPaths;
    }

    static void recursion(List<List<Integer>> result, List<Integer> currentList, TreeNode root, int sum) {

        if (root == null)
            return;

        currentList.add(root.data);

        if (root.data == sum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(currentList));
        }

        recursion(result, currentList, root.left, sum - root.data);
        recursion(result, currentList, root.right, sum - root.data);

        currentList.remove(currentList.size() - 1);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        int sum = 23;
        List<List<Integer>> result = FindAllTreePaths.findPaths(root, sum);
        System.out.println("Tree paths with sum " + sum + ": " + result);
    }
}