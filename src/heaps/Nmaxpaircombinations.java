package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Nmaxpaircombinations {

	public static void main(String[] args)
	{
		Nmaxpaircombinations obj=new Nmaxpaircombinations();
		ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(1,4,2,3));
		ArrayList<Integer> B=new ArrayList<Integer>(Arrays.asList(2,1,4,0));
		
		obj.solve(A,B);
		System.out.println(" "+obj.solve(A,B));
	}
	
	
	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        
        Collections.sort(A, Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i = 0; i < A.size(); ++i) {
            for(int j = 0; j < B.size(); ++j) {
                int sum = A.get(i) + B.get(j);
                System.out.println(" q is before"+q);
                if(q.size() < A.size()) {
                    q.add(sum);
                } else {
                    if(sum > q.peek()) {
                        q.poll();
                        q.add(sum);
                    } else {
                        break;
                    }
                }
                System.out.println(" q is after "+q);
            }
        }
        
        while(!q.isEmpty()) {
            result.add(q.poll());
        }
        Collections.sort(result, Collections.reverseOrder());
        
        return result;
    }
	
	

	
}
