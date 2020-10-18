package main.java.trees;

import main.java.tree.TreeNodeNext;

public class LowestCommonAncestor {


    /*
     * if node data is greater than n1 and n2 traverse left
     * if node data is less than n1 and n2 traverse right
     * if node data is in between n1 and n2 then node is LCA
     *
     *
     */

    TreeNodeNext LCA(TreeNodeNext root, int n1, int n2) {
        if ((root.data > n1) && (root.data > n2)) {
            root = LCA(root.left, n1, n2);
        } else if ((root.data < n1) && (root.data < n2)) {
            root = LCA(root.right, n1, n2);
        }
        return root;
    }
}
