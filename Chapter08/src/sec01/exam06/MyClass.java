package sec01.exam06;

public class MyClass {
	//필드의 다향성
	RemoteControl rc = new television();
	
	//생성자
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	void methodA() {
		RemoteControl rc = new audio();//지역변수
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	
}
