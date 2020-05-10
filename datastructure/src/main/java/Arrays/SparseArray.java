package main.java.Arrays;

import java.util.Scanner;
/* 4 Strings in one array 
 * 3 strings in another array
 * find count of each string from second array in first array?
 * 
 * Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output

2
1
0
 * 
 * 
 * 
 * 
 */
public class SparseArray {

    public static void main(String[] args) {
    	
    	//input from console
       Scanner sc=new Scanner(System.in);
       //assigning variable
        int a=sc.nextInt();
        //going to nextline
        sc.nextLine();
        String[] arr=new String[a];
        for(int i=0;i<a;i++)
            {
        	//copying each line to string array
            arr[i]=sc.nextLine();
        }
        
        int b=sc.nextInt();
         sc.nextLine();
       String[] qarr=new String[b];
         for(int i=0;i<b;i++)
            {
            qarr[i]=sc.nextLine();
        }
        int c=0;
        
        //bruteforce
        for(int j=0;j<b;j++)
            {
            for(int i=0;i<a;i++)
                {
                if(arr[i].equals(qarr[j]))
                    {
                    c=c+1;
                } 
            }
            System.out.println(c);
            c=0;
        }
        
    }
}
