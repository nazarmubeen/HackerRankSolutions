package Algo.trees;

import main.java.tree.TreeNodeNext;

public class TraverseTree {

    //preorder
    public static void preOrder(TreeNodeNext root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    //postorder
    public static void postOrder(TreeNodeNext root) {

        if (root == null) {
            return;
        }


        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    //inorder
    public static void inOrder(TreeNodeNext root) {

        if (root == null) {
            return;
        }


        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);


    }
}
