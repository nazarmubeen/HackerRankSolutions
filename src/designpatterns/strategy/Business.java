package designpatterns.strategy;

public abstract class Business {

	SmallBusiness smallbusiness;
	BigBusiness bigbusiness;
	
	
	public void run()
	{
		//body will be overriden by implementing class
	}
	
	public void smallBusinessType()
	{
		smallbusiness.businessType();
	}
	
	public void BigBusinessRules()
	{
		bigbusiness.businessRules();
	}
	
}
