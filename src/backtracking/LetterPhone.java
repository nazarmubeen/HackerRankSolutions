package backtracking;

import java.util.ArrayList;

public class LetterPhone {

	public static void main(String[] args)
	{
		String digit="2";
	   LetterPhone p=new LetterPhone();  	
		p.letterCombinations(digit);
		
	}
	
	
	public ArrayList<String> letterCombinations(String a) {
		
		ArrayList<String> combinations=new ArrayList<>();
		
		for(int i=0;i<a.length();i++)
	   {
		   combinations.add(getList(i,a));
			
	   }
		
		System.out.println(" combinations "+combinations);
		
	   ArrayList<String> result=new ArrayList<>();
		   	
	   StringBuffer bf=new StringBuffer();
	   
	   combine(result,combinations,bf,0);
	   
	   
	   return result;
	}
	
	
	void combine(ArrayList<String> result,ArrayList<String> combinations,StringBuffer bf,int index)
	{
		if(bf.length()==combinations.size())
		{
			System.out.println("returning");
			System.out.println(" bf "+bf.toString());
			result.add(bf.toString());
			
			return;
		}

			String first=combinations.get(index);
		
			for(int j=0;j<first.length();j++)
			{
				bf.append(first.charAt(j));
				combine(result,combinations,bf, index+1);
				bf.setLength(bf.length()-1);
			}
			
		
		
	}
	
	
	
	String getList(int i,String a)
	{
		String list = null;
		if(a.charAt(i)=='2')
		{
			 list="abc";
		}
		else if(a.charAt(i)=='3')
		{
			 list="def";
		}
		else if(a.charAt(i)=='4')
		{
			 list="def";
		}
		else if(a.charAt(i)=='5')
		{
			 list="def";
		}
		else if(a.charAt(i)=='6')
		{
			 list="def";
		}
		else if(a.charAt(i)=='7')
		{
			 list="def";
		}
		else if(a.charAt(i)=='8')
		{
			 list="def";
		}
		else if(a.charAt(i)=='9')
		{
			 list="wxyz";
		}
		else if(a.charAt(i)=='0')
		{
			 list="0";
		}
		else if(a.charAt(i)=='1')
		{
			 list="1";
		}
		return list;
	}
}
