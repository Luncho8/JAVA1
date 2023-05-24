package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.setGas(5);
		
		boolean gasState = car.isLefGas();
		if(gasState) {
			System.out.println("곧 출발합니다.");
			car.run();
		}
		
		if(car.isLefGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요");
		}
	}

}
