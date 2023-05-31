package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		//부모 클래스타입으로 변환되서 method3 사용 불가능
	
	}
}
