package Algo.trees;

import main.java.tree.TreeNodeNext;

import java.util.Scanner;

/*
 * You are given a tree of N nodes where nodes are 
 * indexed from [1..N] and it is rooted at 1. You have
 *  to perform T swap operations on it, and after each 
 *  swap operation print the inorder traversal of the 
 *  current state of the tree.
 * 
 * 
3
2 3
-1 -1
-1 -1
2
1
1
 */

//using array implementation
public class SwapNodes {
	
	   static void print(int[] arr)
       {
      for(int i=0;i<arr.length;i++)
           {
          System.out.println(arr[i]);
       } 

   }

   public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
       
       int[] arr=new int[100];
       int i=1;
       while(sc.hasNext())
       {
       arr[i]=sc.nextInt();
     
       i++;
       }

       print(arr);
       /*  arr[0]=1;
       for(int i=1;i<arr[i];i++)
           {
           arr[i]=sc.nextInt();
       }
       print(arr);*/

   }


    static void inOrder(TreeNodeNext root) {

        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);


    }
}

