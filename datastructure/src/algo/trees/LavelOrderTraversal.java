package algo.trees;

import main.java.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LavelOrderTraversal {

    public static void main(String[] args) {

        TreeNode root = TreeOperations.generateTree();

        Queue<TreeNode> queue = new LinkedList<>();

        visitTree(root, queue);

    }


    static void visitTree(TreeNode root, Queue<TreeNode> q) {
        System.out.println("Lavel Order Traversing ");
        preOrderTraverse(root, q);

    }


    public static void preOrderTraverse(TreeNode root, Queue<TreeNode> q) {

        if (root == null) {
            return;
        }

        System.out.print(" " + root.data);

        if (null != root.left)
            q.add(root.left);

        if (null != root.right)
            q.add(root.right);
        preOrderTraverse(q.poll(), q);
    }


}
