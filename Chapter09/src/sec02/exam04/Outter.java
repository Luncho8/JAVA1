package sec02.exam04;

public class Outter {
	public void method1(final int arg) {
		final int localVarius = 1;
		//arg = 100;
		//localVarius = 100;
		class Inner{
			public void method() {
				int result = arg+ localVarius;
			}
		}
	}
//메소드 실행이 종료되면 없어지는 것이 일반적이지만, 메소드가 종료되어도 계속 실행 상태로 존재할 수 있다.
//	
	public void method2(int arg) {
		//로컬메소드의 매개 변수나 로컬변수를 로컬 클래스에서 사용할때만 제한
		int localVarius = 1;
		
		class Inner{
			public void method() {
				int result = arg+ localVarius;
			}
		}
	}
}
