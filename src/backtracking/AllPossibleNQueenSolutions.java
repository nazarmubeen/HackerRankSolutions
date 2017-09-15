package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPossibleNQueenSolutions {

	public static void main(String[] args)
	{
		AllPossibleNQueenSolutions obj=new AllPossibleNQueenSolutions();
		System.out.println("final result"+obj.solveNQueens(4));
	}
	
	public ArrayList<ArrayList<String>> solveNQueens(int a) {
		ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		if(a < 1)
            return result;
		String value="";
		for(int j=0;j<a;j++)
		{
			value=value+".";
		}
		
	
		for(int k=0;k<a;k++)
		{
			ArrayList<String> arr=new ArrayList<>();
			for(int i=0;i<a;i++)
			{
			arr.add(value);
			}
			
			
			solveNQueen(arr,k);
			
			System.out.println(" k= "+k);
			
}
		
		return result;
	}
	
	boolean solveNQueen(ArrayList<String> result,int n)
	{
		 System.out.println("initial result = "+result);
		 
		 boolean status= solveNQUtil(result,n);
		 System.out.println("final result = "+result);
		 return status;
		 
	}
	
	
	boolean solveNQUtil(ArrayList<String> result, int row)
	{
		if(row>=result.size())
		{
			return true;
		}
		
		
		for(int i=0;i<result.size();i++)
		{
	//		System.out.println(" row = "+row+" column = "+i );
			if(checkValidEntry(row,i,result))
			{
				String a=result.get(row);
				char[] ar=a.toCharArray();
				ar[i]='Q';
				String anew=String.valueOf(ar);	
				result.set(row,anew);
	//			System.out.println("result after placing queen "+result);
				
				 /* recur to place rest of the queens */
                if (solveNQUtil(result, row + 1) == true)
                {
                    return true;
                }
                /* If placing queen in board[i][col]
                doesn't lead to a solution then
                remove queen from board[i][col] */
      //       System.out.println("doesn't lead to solution backtrack");
             result.set(row,a); // BACKTRACK
             
			}
		}
		  /* If queen can not be place in any row in
        this colum col, then return false */
    //    System.out.println("can not be placed in any row");
     return false;
	}
	

	
	boolean checkValidEntry(int row, int column,ArrayList<String> board)
	{
		
		int i,j;
		for(i=0;i<board.size();i++)
		{
		   if(board.get(row).charAt(i)=='Q')
		   {
			   return false;
		   }
		   
		   if(board.get(i).charAt(column)=='Q')
		   {
			   return false;
		   }
			
		}

		for(i=row,j=column;j>=0 && i>=0;j--,i--)
		{
			if(board.get(i).charAt(j)=='Q')
			{
				return false;
			}
		}
		
		for(i=row,j=column;j>=0 && i<board.size();j--,i++)
		{
			if(board.get(i).charAt(j)=='Q')
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	
}
