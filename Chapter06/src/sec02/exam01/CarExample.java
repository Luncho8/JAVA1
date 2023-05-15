package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(); //접근제한자가 public
		
		System.out.println("제작회사: " + car.company);
		System.out.println("모델명: " + car.model);
		System.out.println("색갈: " + car.color);
		System.out.println("최고속도: " + car.maxSpeed);
		System.out.println("현재속도: " + car.speed);
		
		car.speed = 60;
		System.out.println("현재속도: " + car.speed);
	}

}
