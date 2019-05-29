package primitivetypes;

public class BitsBasics {


	public static void main(String[] args)
	{
		System.out.println( 6 & 4);
		System.out.println(6 | 4);
		System.out.println(8>>1);
		System.out.println(8>>>2);
		System.out.println(8<<10);
		//shifting a number by one is equivalent to multiplying it by 2, or, in general,
		//left shifting a number by n positions is equivalent to multiplication by 2^n.
		System.out.println(2<<1); //multiply by 2
		System.out.println(2<<2);
		System.out.println(2<<3);
		//right shift operator (if negative empty space will be filled with 1 else 0
		System.out.println(">>");
		System.out.println(32>>1); //divide by 2
		System.out.println(32>>2); //divide by 4
		System.out.println(">>>");
		//right shift operator unsigned
		//The only difference is that the empty spaces in the left are 
		//filled with 0 irrespective of whether the number is positive or negative.
		System.out.println(32>>>1);
		System.out.println(32>>>2);
		System.out.println(" on x ");
		int x=16;
		
		System.out.println(x & 1); //and gives 1 if both are 1
		System.out.println(x | 1); //or gives 1 if any of them is 1
		System.out.println(x ^ 1); //xor gives 1 if both are different
		System.out.println(x >>> 1);
		System.out.println(" binary representation");
		//x & (x - 1) clears the lowest set bit in x
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(x-1));
		System.out.println(Integer.toBinaryString(x&(x-1)));
		//x & ~(x - 1) extracts the lowest set bit of x.
		System.out.println(Integer.toBinaryString(x&~(x-1)));
		
	}
}
