package Arrays;

/*
 * 12345 to 34512
 */

/* Left Rotation Program
 * sample input
 * 5 4(d=4 that is 4 rotations)
	1 2 3 4 5
	sample output
	51234
 */
public class LeftRotation {
	
	public static void printArray(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
	
	//method which returns rotated array using extra array
	public static int[] leftRotate(int[] arr, int rotation)
	{
		int temparr[]=new int[arr.length];
		int pos;
		for(int i=0;i<arr.length;i++)
		{
			pos=(arr.length+(i-rotation))%arr.length;
			temparr[pos]=arr[i];
		}
		printArray(temparr);
		
		return temparr;
	}

	//method which returns rotated array using same array
	public static int[] leftRotate2(int[] arr, int rotation)
	{
		
		int pos,tempinit,temppos=arr[0],i=0,c=0;
		
		while(c!=arr.length){
			tempinit=temppos;
			pos=(arr.length+(i-rotation))%arr.length;
			temppos=arr[pos];
			arr[pos]=tempinit;	
			i=pos;
			c++;
		}
		
		printArray(arr);
		
		return arr;
	}

	
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		leftRotate(arr, 3);
		leftRotate2(arr, 3);
	}
}
