package leetcodemaychallenge.topquestion.tree;

import java.util.ArrayList;
import java.util.List;

class BinaryTreePaths {

    public List binaryTreePaths(TreeNode root) {
        List paths = new ArrayList();
        if (root == null) return paths;

        StringBuilder sb = new StringBuilder();
        pathFinder(root, sb, paths);
        return paths;
    }

    public void pathFinder(TreeNode root, StringBuilder sb, List paths) {
        if (root == null) return;
        int len = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            paths.add(sb.toString());
        } else {
            sb.append("->");
            pathFinder(root.left, sb, paths);
            pathFinder(root.right, sb, paths);
        }
        sb.setLength(len);
    }

}