package backtracking;

public class FourQueenProblem {

	public static void main(String[] args)
	{
		FourQueenProblem obj=new FourQueenProblem();
		obj.FourQueenProblemhelper(4);
	}
	
	
	void FourQueenProblemhelper(int n)
	{
		isSolution();
		
	}
	
	boolean isSolution()
    {
        int board[][] = {{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0}
        		,{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0},
        		{0, 0, 0, 0,0,0,0,0,0, 0, 0, 0,0,0,0,0}
        };
 
        if (solveNQUtil(board, 0) == false)
        {
            System.out.print("Solution does not exist");
            return false;
        }
 
        printSolution(board);
        return true;
    }
	
	

	boolean solveNQUtil(int board[][], int col)
    {
        /* base case: If all queens are placed
           then return true */
        if (col >= board.length)
            return true;
 
        /* Consider this column and try placing
           this queen in all rows one by one */
        for (int i = 0; i <board.length; i++)
        {
        	System.out.println("row = "+i);
            /* Check if queen can be placed on
               board[i][col] */
            if (isSafe( i, col,board))
            {
            	System.out.println(" "+ "col = "+col);
                /* Place this queen in board[i][col] */
                board[i][col] = 1;
 
                /* recur to place rest of the queens */
                if (solveNQUtil(board, col + 1) == true)
                    return true;
 
                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
                System.out.println("doesn't lead to solution backtrack");
                board[i][col] = 0; // BACKTRACK
            }
        }	
        /* If queen can not be place in any row in
        this colum col, then return false */
        System.out.println("can not be placed in any row");
     return false;
 }
	
	boolean isSafe(int row,int column,int[][] arr)
	{
		int i,j;
		
		for(i=0;i<arr.length;i++)
		{
			
			if(arr[i][column]==1)
			{
				return false;
			}
			
			if(arr[row][i]==1)
			{
				return false;
			}
		    
		}
		
		/* Check upper diagonal on left side */
        for (i=row,  j=column; i>=0 && j>=0; i--, j--)
            if (arr[i][j] == 1)
                return false;
 
        /* Check lower diagonal on left side */
        for (i=row, j=column; j>=0 && i<arr.length; i++, j--)
            if (arr[i][j] == 1)
                return false;
		
		return true;
	}
	
	

	/* A utility function to print solution */
	void printSolution(int board[][])
	{
	    for (int i = 0; i < board.length; i++)
	    {
	        for (int j = 0; j < board.length; j++)
	            System.out.print(" " + board[i][j]
	                             + " ");
	        System.out.println();
	    }
	}

	

}
	
