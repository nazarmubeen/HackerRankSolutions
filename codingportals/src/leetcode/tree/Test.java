package leetcode.tree;


import main.java.tree.TreeNodeNext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    HashMap<Integer, List<TreeNodeNext>> levelMap;

    public TreeNodeNext connect(TreeNodeNext root) {

        if (root == null) {
            return null;
        }

        levelMap = new HashMap<>();

        helper(root, 0);


        for (int k : levelMap.keySet()) {

            List<TreeNodeNext> nodes = levelMap.get(k);
            for (int i = 0; i < nodes.size(); i++) {
                nodes.get(i).next = nodes.get(i + 1);
            }


        }

        return null;
    }

    public void helper(TreeNodeNext node, int level) {

        if (node == null) {
            return;
        }

        if (levelMap.get(level) == null) {
            List<TreeNodeNext> baseList = new ArrayList<>();
            levelMap.put(level, baseList);
        }

        levelMap.get(level).add(node);

        helper(node.left, ++level);
        helper(node.right, ++level);

    }
}
