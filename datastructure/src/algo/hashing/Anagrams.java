package algo.hashing;

import java.util.*;
import java.util.stream.Collectors;


public class Anagrams {

	public static void main(String[] args)
	{
		Anagrams obj=new Anagrams();
		//List<String> a=new ArrayList<>(Arrays.asList("abbbaabbbabbbbabababbbbbbbaabaaabbaaababbabbabbaababbbaaabbabaabbaabbabbbbbababbbababbbbaabababba", "abaaabbbabaaabbbbabaabbabaaaababbbbabbbaaaabaababbbbaaaabbbaaaabaabbaaabbaabaaabbabbaaaababbabbaa", "babbabbaaabbbbabaaaabaabaabbbabaabaaabbbbbbabbabababbbabaabaabbaabaabaabbaabbbabaabbbabaaaabbbbab", "bbbabaaabaaaaabaabaaaaaaabbabaaaabbababbabbabbaabbabaaabaabbbabbaabaabaabaaaabbabbabaaababbaababb", "abbbbbbbbbbbbabaabbbbabababaabaabbbababbabbabaaaabaabbabbaaabbaaaabbaabbbbbaaaabaaaaababababaabab", "aabbbbaaabbaabbbbabbbbbaabbababbbbababbbabaabbbbbbababaaaabbbabaabbbbabbbababbbaaabbabaaaabaaaaba", "abbaaababbbabbbbabababbbababbbaaaaabbbbbbaaaabbaaabbbbbbabbabbabbaabbbbaabaabbababbbaabbbaababbaa", "aabaaabaaaaaabbbbaabbabaaaabbaababaaabbabbaaaaababaaabaabbbabbababaabababbaabaababbaabbabbbaaabbb" ));
		List<String> a=new ArrayList<>(Arrays.asList("cat", "dog", "god" ,"tca"));
		//obj.anagrams(a);
	//	obj.anagrams2(a);
		obj.anagrams3(a);
		
	}
	
	
	
	public ArrayList<ArrayList<Integer>> anagrams3(final List<String> a) {
	    HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
	    for(int i = 0 ; i < a.size();i++){
	    	System.out.println(" a.get(i) = "+a.get(i));
	        char[] t = a.get(i).toCharArray();
	        Arrays.sort(t);
	      //  System.out.println(" t = "+t);
	        String token = new String(t);
	        System.out.println(" token = "+token);
	        ArrayList<Integer> val = null;
	        if(map.get(token) == null){
	            val = new ArrayList<Integer>();
	        }
	        else
	            val = map.get(token);
	       val.add(i+1);
	       map.put(token,val);
	    }
	    System.out.println("map "+map);
	    ArrayList<ArrayList<Integer>> o = new ArrayList<ArrayList<Integer>>();
	    for(String l : map.keySet()){
	        ArrayList<Integer> val = map.get(l);
	        o.add(val);
	    }
	    return o;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ArrayList<ArrayList<Integer>> anagrams2(final List<String> a) {
	    Map<String, ArrayList<Integer>> anagramsMap = new HashMap<>();
	    
	    for (int i = 0;i < a.size();i++) {
	        String word = sortString2(a.get(i));
	        
	        List<Integer> wordAnagrams = anagramsMap.computeIfAbsent(word, s -> new ArrayList<>());
            wordAnagrams.add(i + 1);
	    }
	    
	    ArrayList<ArrayList<Integer>> anagramsLists = new ArrayList<>();
	    anagramsLists.addAll(anagramsMap.values().stream()
	        .filter(l -> !l.isEmpty())
	        .collect(Collectors.toList()));
	    System.out.println("anagramsLists "+anagramsLists);
	    return anagramsLists;
	}
	
	public String sortString2(String word) {
	    char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
	}
	
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		helper(result,a);
		System.out.println(" result "+result);
		return result;
		
	}
	
	void helper(ArrayList<ArrayList<Integer>> result,final List<String> a)
	{
		ArrayList<HashMap<Character,Integer>> mapList=new ArrayList<HashMap<Character,Integer>>();
		for(int i=0;i<a.size();i++)
		{
			String first=a.get(i);
			
			HashMap<Character,Integer> map=new HashMap<>();
			
			for(int j=0;j<first.length();j++)
			{
			//	System.out.println();
				if(map.get(first.charAt(j))==null)
				{
					map.put(first.charAt(j), 1);
				}
				else{
					map.put(first.charAt(j), map.get(first.charAt(j))+1);
				}
			}
			
			System.out.println(" map count "+map);
			mapList.add(map);
			
		}
		checkAnagaram(mapList,result);
		System.out.println("final result "+result);
	}
	

	void checkAnagaram2(ArrayList<HashMap<Character,Integer>> mapList,ArrayList<ArrayList<Integer>> result)
	{
		
	}

	
	
	void checkAnagaram(ArrayList<HashMap<Character,Integer>> mapList,ArrayList<ArrayList<Integer>> result)
	{
		HashMap<Integer,Boolean> statusMap=new HashMap<>();
		for(int i=0;i<mapList.size();i++)
		{
			if(statusMap.get(i)==null)
			{
			HashMap<Character,Integer> map=mapList.get(i);
			ArrayList<Integer> list=new ArrayList<>();
			list.add(i+1);
			statusMap.put(i, true);
			int index=i+1;
			System.out.println("i = "+i);
			while(index<mapList.size())
			{
				System.out.println(" index = "+index);
				HashMap<Character,Integer> compareMap=mapList.get(index);
				System.out.println(" map "+map);
				System.out.println("compare map "+compareMap);
				if(map.size()!=compareMap.size())
				{
					index++;
					System.out.println("size not equal");
					continue;
				}
				else{
					boolean status=true;
					for(Character k:map.keySet())
					{
						System.out.println(" key is "+k+" count is "+map.get(k));
						if(compareMap.get(k)==null || compareMap.get(k)!=map.get(k))
						{
							System.out.println("character count not equal ");
							status=false;
							break;
						}
						
					}
					if(status==true)
					{
						statusMap.put(index, true);
						list.add(index+1);
					}
				}
				
				index++;
			}
			
			if(list.size()>0)
			{
				System.out.println(" list "+list);
				result.add(list);
				
				
			}
		}
	}
	}
}
