package Algo.Arrays;

public class RepeatAndMissingNumberArray {

	public static void main(String[] args)
	{
		
	}
	
	public int[] repeatedNumber(final int[] A) {
        int []aux = new int[A.length];
       int []result = new int[2];
       
       if(A == null || A.length <= 1)
           return aux;
       
       for(int i = 0; i < A.length; i++){
           if(aux[A[i]-1] == 1){
               result[0] = A[i];
               continue;
           }
           aux[A[i]-1] = 1;
       }
       for(int i = 0; i < aux.length; i++){
           if(aux[i] == 0){
               result[1] = i+1;
               return result;
           }
       }
       return result;
   }
   
}
