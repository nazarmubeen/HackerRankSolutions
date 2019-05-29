package primitivetypes;

public class ComputeParity {

	//compute parity of 64 bits
	//The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise,
	//it is 0. For example, the parity of 1011 is 1, and the parity of 10001000 is 0.
	
	public static void main(String[] args){
		
		parity(9223372036854775807l);
	}
	
	public static short parity(long x)
	{
		short result=0;
		
		while(x!=0)
		{
			System.out.println(x);
			result^=(x & 1);
			System.out.println(" result = "+result);
			System.out.println(x>>>1);
			x>>>=1;
		}
		
		return result;
	}
}
