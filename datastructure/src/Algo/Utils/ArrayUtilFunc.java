package Algo.Utils;

import java.util.Random;

public class ArrayUtilFunc {

	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}

	public static void printArray(char[] arr)
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

	static void printMatrix(int[][] arr){

		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr.length;col++){
				System.out.print( arr[row][col]+" ");
			}
			System.out.println(" ");
		}

	}

	static int[][] generateMatrix(int length,int range){

		int[][] arr=new int[length][length];
		for(int row=0;row<arr.length-1;row++){
			for(int col=0;col<arr[row].length-1;col++){
				arr[row][col]=new Random().nextInt(range);
			}
			System.out.println(" ");
		}
return arr;
	}
	
	public static void main(String[] args)
	{
		generateArray(51);
	}
}
