package sec01.exam04;

public class SupersonicAirPlaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirPalne sa = new SupersonicAirPalne();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirPalne.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirPalne.NORMAL;
		sa.fly();
		sa.land();
	}

}
