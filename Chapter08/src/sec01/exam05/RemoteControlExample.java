package sec01.exam05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		rc = new television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		
		rc = new audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
