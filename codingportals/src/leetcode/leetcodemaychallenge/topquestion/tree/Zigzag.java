package leetcode.leetcodemaychallenge.topquestion.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Zigzag {

    //https://leetcode.com/submissions/detail/334396891/?from=/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/787/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();

        Stack<TreeNode> rightStack=new Stack<>();
        Stack<TreeNode> leftStack=new Stack<>();
        leftStack.push(root);
        helper(0,root,rightStack,leftStack,lists);
        return lists;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> results) {
        if(node == null) {
            return;
        }
        if(level >= results.size()) {
            LinkedList<Integer> levelList = new LinkedList<Integer>();
            levelList.add(node.val);
            results.add(levelList);
        } else {
            if(level%2 ==0) {
                results.get(level).add(node.val);
            } else {
                results.get(level).add(0, node.val);
            }
        }
        dfs(node.left, level+1, results);
        dfs(node.right, level+1, results);
    }

    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(root, 0, results);
        return results;
    }

    void helper(int level,TreeNode root, Stack<TreeNode> rightStack,Stack<TreeNode> leftStack,List<List<Integer>> lists){

        while(!leftStack.isEmpty() && !rightStack.isEmpty()){


            if(lists.get(level)==null){
                ArrayList<Integer> list=new ArrayList<>();
                lists.add(list);
            }

            if(level%2==0){
                while(!leftStack.isEmpty()){
                    lists.get(level).add(leftStack.peek().val);
                    TreeNode node=leftStack.pop();
                    if(node!=null){
                        rightStack.push(node.left);
                        rightStack.push(node.right);
                    }
                }

            }
            else{
                while(!rightStack.isEmpty()){
                    lists.get(level).add(rightStack.peek().val);
                    TreeNode node=leftStack.pop();
                    if(node!=null){
                        leftStack.push(node.right);
                        leftStack.push(node.left);
                    }
                }

            }
            System.out.println("level "+level);
            level++;
        }

    }

   // https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/790/

}
