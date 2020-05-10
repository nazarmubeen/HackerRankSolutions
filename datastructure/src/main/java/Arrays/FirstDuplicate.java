package main.java.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 5, 3, 2 };
		System.out.println(firstDuplicate(a));
	}

	static int firstDuplicate(int[] a) {

		Set<Integer> s = new HashSet<Integer>();
		for (int i : a) {
			if (s.contains(i)) {
				return i;
			}
			s.add(i);
		}

		return -1;

	}
}
