package test;

public class Basic {
	
	static String message;
	public static void main(String[] args){
		
	}
	
	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		Basic.message = message;
	}

	static void basicString(){
		setMessage("this is basic test");
		System.out.println(message);
	}
}
