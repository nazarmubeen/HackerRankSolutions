package designpatterns.strategy;

public class Demo {

	public static void main(String[] args)
	{
		FoodStall fs=new FoodStall();
		fs.BigBusinessRules();
		fs.smallBusinessType();
		fs.run();
		
		ShoppingMalls malls=new ShoppingMalls();
		malls.run();
		malls.BigBusinessRules();
		malls.smallBusinessType();
		
	}
}
