package systemdesign.storage;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LRU {

	HashMap<Integer,Integer> cache;
	LinkedHashSet<Integer> set;
	int capacity;
	
    public LRU(int capacity) {
    	cache=new HashMap<>();
    	set=new LinkedHashSet<>();
        this.capacity=capacity;
    }
    
    public int get(int key) {
    //	System.out.println("key  "+key);
        if(cache.get(key) != null)
        {
        	set.remove(key);
        	set.add(key);
      //  	System.out.println("set is = " +set);
        	return cache.get(key);
        }

        return -1;
    }
    
    public void set(int key, int value) {
    	if(cache.size()==capacity)
    	{  		
    		//    System.out.println("cache size before = "+cache.size());
    		    if(cache.containsKey(key)){
    			set.remove(key);
    		    cache.remove(key);
    		    }
    		    else{
    		    	int top=set.iterator().next();
    		    	set.remove(top);
    		    	cache.remove(top);
    		    }
    		  //  System.out.println("cache size = "+cache.size());
    	}
    	    if(cache.containsKey(key)){
			set.remove(key);
		    cache.remove(key);
		    }
    		set.add(key);
    		cache.put(key, value);
    //		System.out.println(set);
    //		System.out.println("size "+cache.size());
    }
    
    //59 7 S 2 1 S 1 10 S 8 13 G 12 S 2 8 G 11 G 7 S 
    //14 7 S 12 9 S 7 10 G 11 S 9 3 S 14 15 G 15 G 9 S 4 
    //13 G 3 S 13 7 G 2 S 5 9 G 6 G 13
    public static void main(String[] args)
    {
    	LRU cache=new LRU(7);
    	cache.set(2,1);
    	cache.set(1,10);
    	cache.set(8,13);
    	System.out.println(cache.get(12));
    	cache.set(2,8);
    	System.out.println(cache.get(11));
    	System.out.println(cache.get(7));
    	cache.set(14,7);
    	cache.set(12,9);
    	cache.set(7,10);
    	System.out.println(cache.get(11));
    	cache.set(9,3);
    	cache.set(14,15);
    	System.out.println(cache.get(15));
    	System.out.println(cache.get(9));
    	cache.set(4,13);
    	System.out.println(cache.get(3));
    	//cache.set(14,15);
    	cache.set(13,7);
    	System.out.println(cache.set);
    	System.out.println(cache.get(2));
    	cache.set(5,9);
    	System.out.println(cache.get(6));
    	System.out.println(cache.get(13));
    	cache.set(4,5);
    	cache.set(3,2);
    	cache.set(4,12);
    	System.out.println(cache.get(13));
    //	System.out.println(" set "+cache.set);
    	System.out.println("fails");
    	System.out.println(cache.get(7));
    	//S 9 7 G 3 G 6 G 2 S 8 4
    	cache.set(9,7);
    	System.out.println(cache.get(3));
    	System.out.println(cache.get(6));
    	System.out.println(cache.get(2));
    	cache.set(8,4);
    	//S 8 9 S 1 4 S 2 9 S 8 8 G 13 G 3 G 13
    	cache.set(8,9);
    	cache.set(1,4);

    	cache.set(2,9);
    	cache.set(8,8);
    	System.out.println(cache.get(13));
    	System.out.println(cache.get(3));
    	System.out.println(cache.get(13));
    	
    //	System.out.println(cache.get(1));
    //	cache.set(1,5);
    //	cache.set(1,2);
    //	System.out.println(cache.get(1));
    //	System.out.println(cache.get(2));
    	/*cache.set(12,6);
    	cache.set(3,6);
    	cache.set(3,6);
    	cache.set(5,6);*/
    	
    //G 6 S 3 8 G 14 G 4 S 5 6 S 10 15 G 12 S 13 5 S 10 9 S 3 12 S 14 15 G 4 
    	System.out.println(cache.get(6));
    	cache.set(3,8);
    	System.out.println(cache.get(14));
    	System.out.println(cache.get(4));
    	cache.set(5,6);
    	cache.set(10,15);
    	System.out.println(cache.get(12));
    	cache.set(13,5);
    	cache.set(10,9);
    	cache.set(3,12);
    	cache.set(14,15);
    	System.out.println(cache.get(4));
    	
    //S 10 5 G 5 G 15 S 7 6 G 1 S 5 12 S 1 6 S 11 8
    	
    	
    	
    	
    }
    

}
