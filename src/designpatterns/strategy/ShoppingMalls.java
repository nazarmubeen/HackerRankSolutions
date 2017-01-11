package designpatterns.strategy;

public class ShoppingMalls extends Business {

	public void run()
	{
		System.out.println(" running business in a city");
	}
	
	
	public ShoppingMalls()
	{
		smallbusiness=new citySmallBusiness();
		bigbusiness=new CityBigBusiness();
	}
}
