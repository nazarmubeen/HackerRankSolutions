package algo.heaps;

public class BasicHeapStructure {

	public static void main(String[] args)
	{
		BasicHeapStructure hp=new BasicHeapStructure();
		int[] maxHeapArr={1,4,3,7,8,9,10};
		hp.buildMaxHeap(maxHeapArr);
	}
	
	
	void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	
	void buildMaxHeap(int[] maxHeapArr)
	{
	
		
	
		
		print(maxHeapArr);
		
		
		
		int N=maxHeapArr.length;
		System.out.println(" N = "+N);
		
		for(int i = N/2 ; i >= 0 ; i-- )
		{
		System.out.println("build max heap "+i);
		buildHeap(maxHeapArr,i);
		}
		System.out.println("build max heap finished");
		print(maxHeapArr);
		
	}
	
	
	
	void buildHeap(int[] arr,int i)
	{
		int largest=i;
		int N=arr.length;
		System.out.println(" i = "+i);
		int left=2*i+1;
		int right=2*i+2;
		
	       if(left< N && arr[left] > arr[largest])
	       {
	       largest = left;
	       System.out.println("largest element is left one "+arr[largest]);
	       }
	       
	       if(right < N && arr[right] >arr[largest])
	       {
	       largest = right;
	       System.out.println("largest element is right one "+arr[largest]);;
	       }

	  
	       if(largest != i )
	       {
	    	   System.out.println("largest is "+arr[largest]+ " swap current element "+arr[i]+" with it");
	    	   swap (arr, i , largest);
	    	   buildHeap (arr,largest);
	       } 
	}
	
	void swap(int[] arr,int i ,int j)
	{
		System.out.println("swapping "+i+" "+j);
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

}
