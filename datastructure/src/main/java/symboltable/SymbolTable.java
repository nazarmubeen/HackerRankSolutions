package main.java.symboltable;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class SymbolTable<K,V> {
	
	private  Hashtable<K, V> table;
	
	public SymbolTable()
	{

	 table=new Hashtable<>();
	}
	
	
	public void put(K key,V value)
	{
			table.put(key, value);	
	}
	
	public V get(K key)
	{
		return table.get(key);
	}
	
	public void delete(K key)
	{
		table.remove(key);
	}
	
	public boolean contains(K key)
	{
		return table.containsKey(key);
	}
	
	public boolean isEmpty()
	{
		return table.size()<1;
	}
	
	public int size()
	{
		return table.size();
	}
	
	public void printElements()
	{
		System.out.println("printing");
		Set<Entry<K, V>> ir=table.entrySet();
		
		for(Entry<K, V> key :ir)
		{
			System.out.println(key);
		}
		System.out.println(" ");
		
	}
	
	
}
