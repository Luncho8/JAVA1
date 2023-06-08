package sec02.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
//맴버 클래스가 객체 생성없이 사용할수 있는 정적으로 선언되면 객체를 생성해서 사용해야 하는 바깥 클래스의 필드나 메소드 사용x	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C{
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
