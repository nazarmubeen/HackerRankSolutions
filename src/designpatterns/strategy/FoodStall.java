package designpatterns.strategy;

public class FoodStall extends Business {

	public void run()
	{
		System.out.println("run food stall in village");
	}
	
	public FoodStall()
	{
		smallbusiness=new VillageSmallBusiness();
		bigbusiness=new VillageBigBusiness();
	}
	
	
}
