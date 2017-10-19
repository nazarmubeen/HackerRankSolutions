package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MinJumpsArray {

	public static void main(String[] args) {
		MinJumpsArray obj = new MinJumpsArray();
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList( 46, 46, 0, 2, 47, 1, 24, 45, 0, 0, 24, 18, 29, 27, 11, 0, 0, 40, 12, 4, 0, 0, 0, 49, 42, 13, 5, 12, 45, 10, 0, 29, 11, 22, 15, 17, 41, 34, 23, 11, 35, 0, 18, 47, 0, 38, 37, 3, 37, 0, 43, 50, 0, 25, 12, 0, 38, 28, 37, 5, 4, 12, 23, 31, 9, 26, 19, 11, 21, 0, 0, 40, 18, 44, 0, 0, 0, 0, 30, 26, 37, 0, 26, 39, 10, 1, 0, 0, 3, 50, 46, 1, 38, 38, 7, 6, 38, 27, 7, 25, 30, 0, 0, 36, 37, 6, 39, 40, 32, 41, 12, 3, 44, 44, 39, 2, 26, 40, 36, 35, 21, 14, 41, 48, 50, 21, 0, 0, 23, 49, 21, 11, 27, 40, 47, 49 ));
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)==0)
			{
				a.set(i, i);
			}
		}
		System.out.println(obj.jump(a));
	}

	public int jump(ArrayList<Integer> a) {

		if (a.size() == 0 || a.get(0) == 0)
			return -1; // if first element is 0,
						// end cannot be reached
		if (a.size() == 1 && a.get(0) == 0)
			return 0;
		
		int i, j;
		int[] jumps = new int[a.size()];
		jumps[0] = 0;

		// Find the minimum number of jumps to reach arr[i]
		// from arr[0], and assign this value to jumps[i]
		for (i = 1; i < a.size(); i++) {
			jumps[i] = Integer.MAX_VALUE;
			print(jumps);
			for (j = 0; j < i; j++) {
				if (i <= j + a.get(j) && jumps[j] != Integer.MAX_VALUE) {
					jumps[i] = Math.min(jumps[i], jumps[j] + 1);
					break;
				}
			}
		}
		
		if(jumps[a.size()-1]==Integer.MAX_VALUE)
		{
			return -1;
		}

		return jumps[a.size() - 1];

	}

	void print(int[] arr) {
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);
		System.out.println(" ");
	}
}
