package Algo.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args)
	{
		int[] arr={3, 30, 34, 5, 9};
	System.out.println(largestNumber(arr));
	}
	
  static public String largestNumber(final int[] A) {

	  //create string array
 String[] arr = new String[A.length];
 // build string array
 for(int i=0; i<A.length; i++){
     arr[i]=String.valueOf(A[i]);
 }

 //sort string array using comparator
 Arrays.sort(arr, new Comparator<String>(){
     public int compare(String a, String b){
         return (b+a).compareTo(a+b);

     }
 });

 StringBuilder sb = new StringBuilder();
 for(String s: arr){
     sb.append(s);
 }

 while(sb.charAt(0)=='0'&&sb.length()>1)
     sb.deleteCharAt(0);

 return sb.toString();}
}

