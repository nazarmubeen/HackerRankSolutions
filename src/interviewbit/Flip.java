package interviewbit;

public class Flip {

	public static void main(String[] args)
	{
		
		String A="101";
		flip2(A);
	}
	
	//another way to do the same thing
	public  static int[] flip2(String A)
	{
		int wL = 0, wR = 0; 
		int nZero = 0;
		int bestWindowWidth = -1;
		int bestWL = 0,bestWR = 0;int m=2;

		while(wR < A.length()){	
			//expand to the right, update '0' count:
			if (nZero <= m){
				wR++;
				System.out.println("wR = "+wR);
				if (wR<A.length() && A.charAt(wR) == '0') nZero++; 
			}

			//shrink from left, update '0' count:
			if (nZero > m){ 
				System.out.println("wL = "+wL);
				if (A.charAt(wL) == '0') nZero--;
				wL++;
			}
			
			//update best window:
			if (wR - wL > bestWindowWidth){
				System.out.println("bestWindowWidth = "+bestWindowWidth);
				bestWindowWidth = wR - wL;
				bestWR = wR;
				bestWL = wL;
			}
		}
		
		System.out.println("bestWL  "+bestWL+"bestWR "+bestWR);
		return new int[]{bestWL,bestWR};
	}
	
	
	public static int[] flip(String a) {
		 
        int gmax=0, lmax = 0, ones = 0;
        int left=0, right=0,lleft=0;
        for(int i=0; i<a.length(); i++)
        {
        	System.out.println(" i = "+i);
            int value = 1;
            if(a.charAt(i) == '1')
            {
                value = -1;
                ones++;
            }
            System.out.println(" value "+value+" ones "+ones);
            if(lmax == -1)
               lleft = i;
            if(lmax+value >= value)
                lmax += value;
            else
            {
                lmax = value;
            }
            
            System.out.println(" lmax "+lmax);
            System.out.println(" value "+value);
            System.out.println("lleft "+lleft);
            System.out.println(" gmax "+gmax);
            if(gmax < lmax)
            {
                gmax = lmax;
                right = i;
                left = lleft;
            }
            
        }
        if(gmax==0)
        {
            int arr[] = new int[0];
            return arr;
        }
        else
        {
            int arr[] = new int[2];
            arr[0] = left+1;
            arr[1] = right+1;
            return arr;
        }
	}
	
	public static void print(int[] A)
	{
		System.out.println(" ");
		for(int i=0;i<A.length;i++)
		System.out.print(A[i]);
		System.out.println(" ");
	}
}
