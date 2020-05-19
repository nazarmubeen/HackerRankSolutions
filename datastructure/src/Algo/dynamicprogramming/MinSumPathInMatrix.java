package Algo.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MinSumPathInMatrix {

	public static void main(String[] args) {
		MinSumPathInMatrix obj = new MinSumPathInMatrix();
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(20, 29, 84, 4, 32, 60, 86, 8, 7, 37));
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(77, 69, 85, 83, 81, 78, 22, 45, 43, 63));
		ArrayList<Integer> c = new ArrayList<>(Arrays.asList(60, 21, 0, 94, 59, 88, 9, 54, 30, 80));
		result.add(a);
		result.add(b);
		result.add(c);
		int re = obj.minPathSum(result);
		System.out.println("re =" + re);
	}

	int minPathSum(ArrayList<ArrayList<Integer>> a) {
		if (a == null || a.size() == 0)
			return 0;

		int m = a.size();
		int n = a.get(0).size();

		int[][] dp = new int[m][n];
		dp[0][0] = a.get(0).get(0);

		// initialize top row
		for (int i = 1; i < n; i++) {
			dp[0][i] = dp[0][i - 1] + a.get(0).get(i);
		}

		// initialize left column
		for (int j = 1; j < m; j++) {
			dp[j][0] = dp[j - 1][0] + a.get(j).get(0);
		}

		// fill up the dp table
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {

				int top = dp[i - 1][j];
				int left = dp[i][j - 1];

				dp[i][j] = Math.min(top, left) + a.get(i).get(j);
			}
		}

		return dp[m - 1][n - 1];
	}
}
