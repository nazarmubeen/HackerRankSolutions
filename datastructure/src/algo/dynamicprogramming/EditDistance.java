package algo.dynamicprogramming;

/*
 * 
 * 
Given two words A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character

Example : 
edit distance between
"Anshuman" and "Antihuman" is 2.

Operation 1: Replace s with t.
Operation 2: Insert i.
 */
public class EditDistance {

	public static void main(String[] args) {
		EditDistance obj = new EditDistance();
		String a = "sam";
		String b = "sadi";
		obj.minDistance(a, b);
	}

	public int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
	    System.out.println("len 1 "+len1+"len2 "+len2);
		// len1+1, len2+1, because finally return dp[len1][len2]
		int[][] dp = new int[len1 + 1][len2 + 1];
		
		System.out.println("initial array");
		printArray(dp,len1,len2);
		 
		 
		for (int i = 0; i <= len1; i++) {
			dp[i][0] = i;
		}
		
		
		
		for (int j = 0; j <= len2; j++) {
			dp[0][j] = j;
		}
		
		printArray(dp,len1,len2);
		 
		//iterate though, and check last char
		for (int i = 0; i < len1; i++) {
			char c1 = word1.charAt(i);
			for (int j = 0; j < len2; j++) {
				char c2 = word2.charAt(j);
	           System.out.println("i = "+i+" j=  "+j);
				//if last two chars equal
				if (c1 == c2) {
					//update dp value for +1 length
					dp[i + 1][j + 1] = dp[i][j];
					System.out.println("last char are equal");
					printArray(dp,len1,len2);
				} else {
					System.out.println("last are unequal");
					int replace = dp[i][j] + 1;
					int insert = dp[i][j + 1] + 1;
					int delete = dp[i + 1][j] + 1;
					System.out.println("min is r "+replace+" i "+insert+" d "+delete);
					
					int min = replace > insert ? insert : replace;
					min = delete > min ? min : delete;
					printArray(dp,len1,len2);
					dp[i + 1][j + 1] = min;
				}
				
			}
		}
		 printArray(dp,len1,len2);
		return dp[len1][len2];
	}
	
	void printArray(int[][] dp,int l1,int l2)
	{
		System.out.println(" ------------------------------ ");
		l1++;
		l2++;
		for(int i=0;i<l1;i++)
		{
			System.out.println(" ");
			for(int j=0;j<l2;j++)
			{
				System.out.print(" "+dp[i][j]);
			}
		}
		System.out.println(" ");
		System.out.println("-------------------------------------- ");
	}
}
