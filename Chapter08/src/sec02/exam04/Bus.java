package sec02.exam04;

public class Bus implements Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFara() {
		System.out.println("체크");
	}
}
