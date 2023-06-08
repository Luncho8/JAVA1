package sec02.exam01;

import sec02.exam01.A.C;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B b = a.new B(); //인스턴스 클래스 객체 생성
	
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();//정적 클래스 객체 생성
		c.field1 = 5;
		c.method1();
		
		A.C.field2 = 6;//static이라서 바로 접근 가능
		A.C.method2();
		
		
		a.method();//로컬 클래스 호출
	}

}
