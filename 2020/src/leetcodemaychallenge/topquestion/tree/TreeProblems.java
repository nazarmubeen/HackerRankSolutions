package leetcodemaychallenge.topquestion.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeProblems {

    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);

        return Math.max(leftDepth,rightDepth)+1;

    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists=new LinkedList<>();
        helper(root,0,lists);
        return lists;
    }

    void helper(TreeNode root, int currentLevel, List<List<Integer>> lists){

        if(root==null){
            return;
        }

        //     System.out.println(currentLevel);

        if(lists.size()<=currentLevel){

            lists.add(new LinkedList<>());
        }

        lists.get(currentLevel).add(root.val);

        // System.out.println(lists);
        helper(root.left,currentLevel+1,lists);
        helper(root.right,currentLevel+1,lists);
    }
}
