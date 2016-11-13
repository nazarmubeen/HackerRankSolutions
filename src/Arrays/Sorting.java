package Arrays;

//Sort elements upto k in ascending and k to last in descending
public class Sorting {

	 static int[] sortArrayAsc(int[] arr, int initial,int finalvalue)
	{
		
	//	 System.out.println("initial="+initial+" "+"final="+finalvalue);
		 
		 while(initial!=finalvalue)
		 {
			 int index=findMinimum(arr,initial,finalvalue);
	//		 System.out.println("index="+index);
	//		 System.out.println("arr value at index="+arr[index]);
			 int temp=arr[initial];
			 arr[initial]=arr[index];
			 arr[index]=temp; 
			 initial++;
		 }
		  
		 return arr;
	}
	 
	 static int[] sortArrayDsc(int[] arr, int initial,int finalvalue)
		{
		System.out.println("initial="+initial+" "+"final="+finalvalue);
			 
			 while(finalvalue!=initial)
			 {
				 int index=findMinimum(arr,initial,finalvalue);
			//	 System.out.println("index="+index);
			//	 System.out.println("arr value at index="+arr[index]);
				 int temp=arr[finalvalue];
				 arr[finalvalue]=arr[index];
				 arr[index]=temp; 
				 finalvalue--;
			 }
			 return arr;
		}
	
	static int findMinimum(int[] arr,int initial,int finalvalue)
	{
		int index = initial;
		int minimum=initial;
		while(index!=finalvalue-1)
		{
			if(arr[index+1]<arr[minimum])
			{
				minimum=index+1;
			}
			index++;
		}

		return minimum;
	}
	
	static void print(int[] arr)
	{
		System.out.println("" );
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	 
	public static void main(String[] args)
	{
		
		int[] arr={42,12,5,55,6,61,3,59,32,1,8};
		int k=4;
		//result should be 5,12,42,55,61,59,32,8,6,3,1
		
		arr=sortArrayAsc(arr,0,4);
		
		print(arr);
		arr=sortArrayDsc(arr,4,arr.length-1);
		print(arr);
	}
}
