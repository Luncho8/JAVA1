package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn(); //필드의 다향성
		myClass1.rc.setVolume(5); 
		
		System.out.println("--------------------");
		MyClass myClass2 = new MyClass(new audio());
		//생성자 RemoteControl = new audio();
		
		System.out.println("--------------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		// 메소드의 로컬변수 형식으로 인터페이스 변수 사용
		
		System.out.println("--------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new television());
		//메소드의 매개변수 형식으로 인테페이스 변수 사용
	}

}
