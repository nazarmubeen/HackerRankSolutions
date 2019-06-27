package Utils;

import java.util.Random;

public class ArrayUtil {

	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
	
	static int[]  generateArray(int number)
	{
		Random random = new Random(1);

		int rand = random.nextInt(number);
		int[] arr=new int[rand];
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=random.nextInt(number);
		}
		printArray(arr);
		return arr;
	}
	
	public static void main(String[] args)
	{
		generateArray(51);
	}
}
