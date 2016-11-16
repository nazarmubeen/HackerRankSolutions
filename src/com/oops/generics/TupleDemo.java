package com.oops.generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TupleDemo {

	public static void main(String[] args)
	{
		
		Tuple<String, Integer> t=new Tuple("nazar", 25);
		System.out.println(t);
		Tuple<LocalDate, List<String>> tnew=new 
				Tuple(LocalDate.now(), Arrays.asList("gdsj","sgjda","something"));
		System.out.println(tnew);
	}
}
