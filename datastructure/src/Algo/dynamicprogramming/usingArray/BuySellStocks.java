package Algo.dynamicprogramming.usingArray;

public class BuySellStocks {

	public static void main(String[] args) {
		int[] a = { 7, 1, 5, 3, 6, 4,9 };
		System.out.println(maxProfit(a));
	}

	public static int maxProfit(final int[] A) {

		if (A.length < 2) {
			return 0;
		}
		int minElement = A[0];
		int maxDiff = A[1] - A[0];

		for (int i : A) {
			int diff = i - minElement;
			if (diff > maxDiff) {
				maxDiff = diff;
			}
			if (i < minElement) {
				minElement = i;
			}
		}
		
		return maxDiff;
	}
}
