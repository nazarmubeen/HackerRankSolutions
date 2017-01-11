package designpatterns.strategy;

public abstract class Business {

	SmallBusiness smallbusiness;
	BigBusiness bigbusiness;
	
	
	public abstract void run();
	
	public void smallBusinessType()
	{
		smallbusiness.businessType();
	}
	
	public void BigBusinessRules()
	{
		bigbusiness.businessRules();
	}
	
}
