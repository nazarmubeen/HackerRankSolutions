package javaconcepts;

import java.util.Comparator;

public class Dog implements Comparable<Dog> {

	String dogname;
	int dogsize;
	int dogweight;
	
	
	public Dog(String dogname, int dogsize, int dogweight) {
		super();
		this.dogname = dogname;
		this.dogsize = dogsize;
		this.dogweight = dogweight;
	}


	public String getDogname() {
		return dogname;
	}


	public void setDogname(String dogname) {
		this.dogname = dogname;
	}

	public int getDogsize() {
		return dogsize;
	}


	public void setDogsize(int dogsize) {
		this.dogsize = dogsize;
	}


	public int getDogweight() {
		return dogweight;
	}


	public void setDogweight(int dogweight) {
		this.dogweight = dogweight;
	}



	@Override
	public int compareTo(Dog o) {
		
		if(this.dogsize>o.dogsize)
			return 1;
		else if(this.dogsize<o.dogsize)
			return -1;
		else
			return 0;
	
	}


	@Override
	public String toString() {
		return "Dog [dogname=" + dogname + ", dogsize=" + dogsize + ", dogweight=" + dogweight + "]";
	}


	
	
	
}
