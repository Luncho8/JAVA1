package sec01.exam04;

public class SupersonicAirPalne extends AirPlane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flyMode == SUPERSONIC) {
			System.out.println("초고속비행합니다.");
		}else {
			super.fly();
		}
		
	}
	
}
