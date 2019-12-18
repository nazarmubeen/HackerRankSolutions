package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class ColorFulNumber {

	static boolean status=true;
	public static void main(String[] args)
	{
		ColorFulNumber obj=new ColorFulNumber();
		obj.colorful(23);
	}
	
	
	
	public int colorful(int a) {
		
		
		HashMap<Integer,Boolean> map=new HashMap<>();
		StringBuffer bf=new StringBuffer();
		ArrayList<Integer> i=new ArrayList<>();
		getDigits(i,a);
		System.out.println(" a "+i);
		boolean status=helper(0,map,i,bf);
		System.out.println(" statu = "+status);
		if(status==true)
		{
			return 1;
		}
		else{
			return 0;
		}
	}
	
	
	void getDigits(ArrayList<Integer> i,int a)
	{
		while(a!=0)
		{
			int r=a%10;
			i.add(r);
			a=a/10;
		}
		
	}
	
	boolean helper(int index,HashMap<Integer,Boolean> map,ArrayList<Integer> a ,StringBuffer bf)
	{
			
		while(index<a.size())
		{
		for(int i=index;i<a.size();i++)
		{
			bf.append(a.get(i));
			System.out.println(" bf = "+bf);
			int product=calculateProduct(bf);
			System.out.println("product = "+product);
			if(map.get(product)==null)
			{
				map.put(product, true);
				
			}
			else{
				return false;
			}
		}
		
		bf.setLength(0);
		index++;
		
		}
		return true;
		
	}
	
	
	int calculateProduct(StringBuffer bf)
	{
		int product=1;
		
		for(int i=0;i<bf.length();i++)
		{
			int value=Character.getNumericValue(bf.charAt(i));
			System.out.println(" value "+value);
			
			product=product*value;
		}
		
		return product;
	}
}

