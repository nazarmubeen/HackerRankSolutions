package algo.dynamicprogramming;

public class IntersectingChordInCircle {


	
	public static void main(String[] args)
	{
		IntersectingChordInCircle obj=new IntersectingChordInCircle();
		System.out.println(obj.chordCnt(20));
		
	}
	public int chordCnt(int A) {
		
	    int[] temp = new int[A+1];
        temp[0] = 1;
        temp[1] = 1;
        
        for(int i=2; i<temp.length; i++){
            for(int j=0; j<i; j++){
            	System.out.println(" i= "+i);
            	System.out.println("temp [j] "+temp[j]+" temp[i-j-1] "+temp[i-j-1]);
                temp[i] += ((long)temp[j]*temp[i-j-1])%1000000007;    
                if(temp[i]>=1000000007)
                    temp[i] -= 1000000007;
    
            }
        }
        return temp[A];
	}
	

	
}
