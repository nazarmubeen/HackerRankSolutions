package com.oops.interfaces;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompanyEmployeeDemo {

	
	public static void main(String[] args)
	{
		//static method of interface Stream.of
		List<Integer> nums=Stream.of(-3,1,4,-5,2,-6)
				.collect(Collectors.toList());
		System.out.println(nums);
		
		////default method of interface nums.removeIf
		boolean removed=nums.removeIf(n -> n <=0);
		System.out.print("Elements were removed"+
		(removed?"":"NOT")+"removed");
		
		System.out.println(nums);
		
		//iterator has default methods
		nums.forEach(System.out::print);
	}
}
