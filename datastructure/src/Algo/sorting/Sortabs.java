package Algo.sorting;

public class Sortabs {


	static int minimum(int i,int[] arr)
	{
		int min=i;
		
		for(int k=i+1;k<arr.length;k++)
		{
			
			
			if(Math.abs(arr[k])<Math.abs(arr[min]))
			{
				
				min=k;
			}
		}
		
		return min;
		
     }
     
	
	
	static int[] swapElem(int i,int j,int[] arr)
	{
		//System.out.println("swap="+" "+i+" "+j);
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}

	    public static void main(String args[] ) throws Exception {
	        /*
	         * Read input from stdin and provide input before running
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);

	        //Scanner */
	      //  Scanner s = new Scanner(System.in);
	        int N = 10;

			int[] arr={9 ,-10 ,-11, 20 ,1 ,2, -3, 4 ,-5 ,64};
	        
	       
			for (int i = 0; i < N; i++) {
	           
	           int position=minimum(i,arr);
	           System.out.print(" "+arr[position]);
	           arr= swapElem(i,position,arr);
	        }
	  		
	  		
	  		
	    }
	}

