package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
	public static void main(String args[]) {
		NQueens obj=new NQueens();
		obj.solveNQueens(4);
	 
	  }
	
	public ArrayList<ArrayList<String>> solveNQueens(int a) {
		 ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
			
			int value=a;
			int[] board = new int[a];
			
		    placeQueenOnBoard(0, board,value,result);
		    return result;
	}

	 
	  private  void placeQueenOnBoard(int Qi, int[] board,int value,ArrayList<ArrayList<String>> result) {
	    int n = board.length;
	    //base case
	    if (Qi == n) {// a valid configuration found.
	    System.out.println("valid configuration ");
	     System.out.println(Arrays.toString(board));
	     
	     insertQueen(board,value,result);
	      
	    } else {
	      //try to put the ith Queen (Qi) in all of the columns
	      for (int column = 0; column < n; column++) {
	    	  System.out.println(" row "+Qi+" column "+column);
	        if (isSafePlace(column, Qi, board)) {
	         System.out.println(" safe place search for next position ");
	          board[Qi] = column;
	          //then place remaining queens.
	          
	        placeQueenOnBoard(Qi + 1, board,value,result);
	         System.out.println("back track");
	          /**
	           * backtracking. It is not required in this as we only look previously
	           * placed queens in isSafePlace method and it doesnot care what values
	           * are available in next positions.*
	           */
	          board[Qi] = -1;
	        }
	      }
	    }
	  }
	  
	  static void insertQueen(int[] resultarr,int max,ArrayList<ArrayList<String>> result)
	  {
		  ArrayList<String> list=new ArrayList<>();
		  String value="";
			for(int j=0;j<max;j++)
			{
				value=value+".";
			}
			
			for(int i=0;i<max;i++)
			{
				list.add(value);
			} 
		  
		
		for(int i=0;i<resultarr.length;i++)
		{
			String a=list.get(i);
			char[] ar=a.toCharArray();
			ar[resultarr[i]]='Q';
			a=String.valueOf(ar);	
			list.set(i,a);
		}
		System.out.println(" st "+list);
		result.add(list);
	  }
	 
	  //check if the column is safe place to put Qi (ith Queen)
	  private  boolean isSafePlace(int column, int Qi, int[] board) {
	 
	    //check for all previously placed queens
	    for (int i = 0; i < Qi; i++) {
	      if (board[i] == column) { // the ith Queen(previous) is in same column
	        return false;
	      }
	      //the ith Queen is in diagonal
	      //(r1, c1) - (r2, c1). if |r1-r2| == |c1-c2| then they are in diagonal
	      if (Math.abs(board[i] - column) == Math.abs(i - Qi)) {
	        return false;
	      }
	    }
	    return true;
	  }
}
