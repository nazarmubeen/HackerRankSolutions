package main.java.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testabcd {

	public static void main(String[] args) {
		List<String> result = new ArrayList<String>();
		result.add("01 box ape bit");
		result.add("21 mybox ape bit");
		result.add("a31 amybox ape bit");

		Collections.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				o1 = o1.substring(o1.indexOf(' ') + 1, o1.length());
				o2 = o2.substring(o2.indexOf(' ') + 1, o2.length());
				return o1.compareTo(o2);
			}

		});

		System.out.println(result);
		String s = "box ape bit";
		s = s.substring(s.indexOf(' ') + 1, s.length());
		System.out.println(s);
	}

	public List<String> prioritizedOrders(int numOrders, List<String> orderList) {

		List<String> result = new ArrayList<String>();

		// create list of string for non nonprimeorders
		List<String> nonprimeorders = new ArrayList<String>();
		// HashSet<String> nonprimeorders=new LinkedHashSet<String>();
		List<String> primeorders = new ArrayList<String>();

		for (String s : orderList) {
			if (Character.isDigit(s.charAt(s.length() - 1))) {
				nonprimeorders.add(s);
			} else {
				s = s.substring(s.indexOf(' '), s.length());
			}

		}

		Collections.sort(primeorders);
		result.addAll(primeorders);
		result.addAll(nonprimeorders);
		return result;

	}
}
