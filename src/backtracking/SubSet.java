package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubSet {

	public static void main(String[] args)
	{
		ArrayList<Integer> asd = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println("a "+asd);
		System.out.println(subsets(asd));
		
	}
	
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		output.add(new ArrayList<Integer>());
		if (a.size() == 0)
			return output;
		Collections.sort(a);
		generate(a, output, new ArrayList<Integer>(), 0);
		return output;

	}
	
	public static void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index)
	{
		for (int i = index; i < a.size(); i++)
		{
			temp.add(a.get(i));
			output.add(new ArrayList<Integer>(temp));
			generate(a, output, temp, i+1);
			temp.remove(temp.size() - 1);
		}
	}

}
