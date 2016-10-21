package javaconcepts;

//this class is about converting various 
// datatypes to each other
public class ConversionsInJava {
	public static void main(String[] args)
	{
	
	int number=445453;
	String string="56";
	Character chars='c';
	
	System.out.println(Integer.parseInt(string));
	System.out.println(Character.getNumericValue(chars));
	System.out.println(String.valueOf(number));
	
	}
}
