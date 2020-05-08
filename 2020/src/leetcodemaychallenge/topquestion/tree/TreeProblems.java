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



    public boolean isCousins(TreeNode root, int x, int y) {
        int[] depths={-1,-1};
        depths=depth(root,x,y,depths,0);
        //   System.out.println(" "+depths[0]+" "+depths[1]);
        if(depths[0]!=-1 && depths[0]==depths[1]){
            return true;
        }
        return false;
    }
//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/
    int[] depth(TreeNode root, int x, int y,int[] depths,int curDepth){

        if(root==null){
            return depths;
        }

        if(root.val==x){
            depths[0]=curDepth;
            return depths;
        }

        if(root.val==y){
            depths[1]=curDepth;
            return depths;
        }

        if(depths[0]!=-1 && depths[1]!=-1){
            return depths;
        }

        if(root.right != null && root.left!=null)
            if((x==root.right.val && y==root.left.val) || (x==root.left.val && y==root.right.val)){
                return depths;
            }

        depths=depth(root.left,x,y,depths,curDepth+1);
        depths=depth(root.right,x,y,depths,curDepth+1);

        return depths;
    }

}
