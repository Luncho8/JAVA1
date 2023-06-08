package sec02.exam01;

public class A {
	A(){System.out.println("객체생성:A");}
	
	//인스턴스 클래스
	public class B{
		B(){System.out.println("객체생성:B");}
		int field1;
		//static int field2; b는 인스턴스 클래스라서 반드시 인스턴스를 생성하고 사용이 가능하지만 static을 붙이면 객체 생성없이 접근이 가능해져서 불가능해진다.
		void method1() {}
		//void method2() {}
	}
	
	static class C{
		C(){System.out.println("객체생성:C");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
	}
	
	void method() {
		class D{
			D(){System.out.println("객체생성:D");}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
