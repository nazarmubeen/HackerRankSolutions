package main.java.symboltable;

public class SymbolTableClient {

	public static void main(String[] args)
	{
	SymbolTable<String, Integer> st=new SymbolTable<>();
	st.put("nazar", 5000);
	st.put("mubeen", 12000);
	st.put("ghar", 12364);
	st.printElements();
	
	}
}
