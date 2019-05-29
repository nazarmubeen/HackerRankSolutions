package primitivetypes;

import java.util.Random;

public class Basics {

	public static void main(String[] args){
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Boolean.TRUE);
		
		//values
		System.out.println(Double.valueOf("1.23"));
		System.out.println(Float.toString((float) -1.23));
		
		//math
		System.out.println(Math.abs(3.25)+" "+Math.abs(3.78));
		System.out.println(Math.min(3, 5)+" "+Math.ceil(3.25)+" "+Math.floor(3.25));

		
	}
	
}
