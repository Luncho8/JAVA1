package sec03.exam04;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	Car(){
		
	}
	
	Car(String model){
		//this.model = model;
		this(model, null, 0);
	}
	
	Car(String model , String color){
		//this.model = model;
		//this.color = color;
		this(model, null, 0);
	}
	
	Car(String model , String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
}
