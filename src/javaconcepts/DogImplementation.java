package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class DogImplementation {

	public static void main(String[] args)
	{
		Dog d1=new Dog("Rio", 12, 45);
		Dog d2=new Dog("SecondRio", 22, 35);
		
		ArrayList <Dog> doglist=new ArrayList<Dog>();
		doglist.add(d2);
		doglist.add(d1);
		Collections.sort(doglist);
		
		Iterator<Dog> it=doglist.iterator();
		while(it.hasNext())
		{
			System.out.println("dogs"+it.next().toString());
		}
		
		Collections.sort(doglist, new DogWeightSort());
		it=doglist.iterator();
		while(it.hasNext())
		{
			System.out.println("dogs"+it.next().toString());
		}
	}
}
