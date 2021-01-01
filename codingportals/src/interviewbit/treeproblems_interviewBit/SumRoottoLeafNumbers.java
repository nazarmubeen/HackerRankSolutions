package interviewbit.treeproblems_interviewBit;

public class SumRoottoLeafNumbers {

    int sum;

    public static void main(String[] args) {

    }

    void helper(TreeNode root, StringBuilder sb) {

        if (root == null)
            return;

        sb.append(root.val);

        if (root.left == null && root.right == null) {
            sum += Integer.parseInt(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        helper(root.left, sb);
        helper(root.right, sb);

        sb.deleteCharAt(sb.length() - 1);
    }

}
