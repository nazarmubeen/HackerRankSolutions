package algo.symboltable;

public class BinarySerach<Key extends Comparable<Key>,Value extends Comparable<Value>> {
	
	Key[] keys;
	Value[] values;
	int N=0;
	int length;
	
	@SuppressWarnings("unchecked")
	public BinarySerach(int size)
	{
		keys=(Key[]) new Comparable[size];
		values=(Value[]) new Comparable[size];
		length=size;
	}
	
	public void put(Key key,Value value)
	{
		System.out.println("inserting key value");
		keys[N]=key;
		values[N]=value;
		N++;
	}
	
	
	public Value get(Key key)
	{
		if(!(N>0))
		{
			return null;
		}
		int i=rank(key);
		System.out.println("rank= "+i);
		if(i<N && keys[i].compareTo(key)==0)
			return values[i];
		else{
			return null;
		}
	}
	
	private int rank(Key key)
	{
		int lo=0,hi=N-1;
		
		while(lo<=hi)
		{
			int mid=lo+(hi-lo)/2;
			System.out.println("mid="+mid);
			int cmp=key.compareTo(keys[mid]);
			System.out.println("cmp="+cmp);
			if(cmp<0)hi=mid-1;
			if(cmp>0)lo=mid+1;
			else return mid;
		}	
		return lo;
		
	}

	
}
