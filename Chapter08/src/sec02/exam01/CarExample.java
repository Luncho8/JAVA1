package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		mycar.run();
		
		mycar.frontLeftTire = new KumhoTire();
		mycar.frontRightTire = new KumhoTire();
		
		mycar.run();
	}

}
