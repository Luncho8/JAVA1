package sec02.exam02;

public class A {
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 =new B();
		C var2 =new C();
	}
	
	// static 필드 초기화
	//static B field3 = new B();
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	//바깥쪽 정적 필드나 메소드에서는 객체 생성 없이 접근가능하지만 안쪽 인스턴스 객체(내용)는 그렇지 않기 때문에
	// 또는 맴버클래스가 인스턴스 객체 생성이 전체 조건인데 바깥필드나 메소드가 정적이라면 객체 생성이 안되어 있을 수 있기 때문에
	class B{
		
	}
	
	static class C{
		
	}
}
