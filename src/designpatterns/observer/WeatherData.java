package designpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class WeatherData implements Subject {

	private ArrayList observers;
	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		observers=new ArrayList<Observer>();
	}
	
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		
		Iterator<Observer> it=observers.iterator();
		while(it.hasNext())
		{
			Observer on=it.next();
			on.update(temprature, humidity, pressure);
		}
		
	}

	public void measurementChanged()
	{
		notifyObserver();
	}
	
	public void setMeasurements(float temprature,float pressure,float humidity)
	{
		this.temprature=temprature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementChanged();
	}
	

}
