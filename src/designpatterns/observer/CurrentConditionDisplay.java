package designpatterns.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{

	private float temprature;
	private float humidity;
	private float pressure;
	private Subject weatherdata;
	
	public CurrentConditionDisplay(Subject weatherdata)
	{
		this.weatherdata=weatherdata;
		weatherdata.registerObserver(this);
	}
	
	
	@Override
	public void display() {
		System.out.println("temprature :="+temprature);
		System.out.println("humidity :="+humidity);
		System.out.println("pressure :="+pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temprature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
		
	}

}
