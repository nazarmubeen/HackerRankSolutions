package grokkingpatterns.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumBinaryTreeDepth {
    public static int findDepth(TreeNode root) {
        if (root == null)
            return -1;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int minLevel = 0;
        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();
            minLevel++;
            while (levelSize > 0) {
                TreeNode node = queue.poll();
                if (node.right == null && node.left == null)
                    return minLevel;
                list.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                levelSize--;
            }

        }
        return minLevel;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree Minimum Depth: " + MinimumBinaryTreeDepth.findDepth(root));
        root.left.left = new TreeNode(9);
        root.right.left.left = new TreeNode(11);
        System.out.println("Tree Minimum Depth: " + MinimumBinaryTreeDepth.findDepth(root));
    }
}
