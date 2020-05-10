package main.java.Trie;

public class Problem {

	public static void main(String[] args)
	{
		
		Trie obj=new Trie();
		obj.insert("thieo");
		obj.insert("abcd");
		obj.insert("thiou");
		obj.insert("abcer");
		
	}

	@Override
	public String toString() {
		return "Problem [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
