package designpatterns.observer;

public class WeatherStation {

	public static void main(String[] args)
	{
		WeatherData data=new WeatherData();
		
		CurrentConditionDisplay display=new CurrentConditionDisplay(data);
		data.setMeasurements(21, 30, 30.4f);
		data.setMeasurements(36, 80, 56.3f);
	}
}
