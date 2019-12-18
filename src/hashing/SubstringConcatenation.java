package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubstringConcatenation {
	
	static boolean[] used;

	public static void main(String[] args)
	{
		SubstringConcatenation obj=new SubstringConcatenation();
		String a="barootfoothefoobarootfooman";
		List<String> b=new ArrayList<String>(Arrays.asList( "foo", "bar","oot","foo"));
		
		System.out.println("call ");
		System.out.println(obj.findSubstring(a, b));
	}
	
	//////////////
	public List<Integer> findSubstring(String s, List<String> words) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    if(s==null||s.length()==0||words==null||words.size()==0){
	        return result;
	    } 
	 
	    //frequency of words
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    for(String w: words){
	        if(map.containsKey(w)){
	            map.put(w, map.get(w)+1);
	        }else{
	            map.put(w, 1);
	        }
	    }
	    
	    System.out.println(" map = "+map);
	 
	    int len = words.get(0).length();
	    System.out.println(" first word length "+len);
	 
	    for(int j=0; j<len; j++){
	    	
	    	System.out.println(" index j "+j);
	    	
	        HashMap<String, Integer> currentMap = new HashMap<String, Integer>();
	        int start = j;//start index of start
	        int count = 0;//count totoal qualified words so far
	        System.out.println(" start  "+start+" count "+count);
	        for(int i=j; i<=s.length()-len; i=i+len){
	            String sub = s.substring(i, i+len);
	            System.out.println(" sub "+sub);
	            if(map.containsKey(sub)){
	            	System.out.println(" map contains "+ sub);
	                //set frequency in current map
	                if(currentMap.containsKey(sub)){
	                	System.out.println(" icreasing current map frequenxy "+ sub);
	                    currentMap.put(sub, currentMap.get(sub)+1);
	                }else{
	                	System.out.println(" adding current map frequenxy "+ sub);
	                    currentMap.put(sub, 1);
	                }
	 
	                count++;
	                System.out.println(" count now "+count);
	                while(currentMap.get(sub)>map.get(sub)){
	                	System.out.println(" while currentMap is > map" +currentMap.get(sub)+" "+map.get(sub));
	                    String left = s.substring(start, start+len);
	                    System.out.println(" left substring "+left);
	                    currentMap.put(left, currentMap.get(left)-1);
	                    System.out.println(" decrease from currentMap "+left);
	 
	                    count--;
	                    System.out.println(" count decrease "+count);
	                    start = start + len;
	                    System.out.println(" start is now"+start);
	                }
	 
	 
	                if(count==words.size()){
	                	System.out.println(" count is equal to word size");
	                    result.add(start); //add to result
	 
	                    //shift right and reset currentMap, count & start point         
	                    String left = s.substring(start, start+len);
	                    System.out.println(" left substring "+left);
	                    currentMap.put(left, currentMap.get(left)-1);
	                    System.out.println(" decrease from currentMap "+left);
	                    count--;
	                    System.out.println(" count decrease "+count);
	                    start = start + len;
	                    System.out.println(" start is now"+start);
	                }
	            }else{
	            	System.out.println(" map doesn't contains string");
	            	System.out.println(" clear current map");
	                currentMap.clear();
	                start = i+len;
	                System.out.println(" strat is "+start);
	                count = 0;
	                System.out.println(" count is zero");
	            }
	        }
	    }
	 
	    return result;
	}
	
	
}
