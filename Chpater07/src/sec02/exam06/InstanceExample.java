package sec02.exam06;

public class InstanceExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("변환성공");
		}else {
			System.out.println("변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("변환성공");
		
	}
	
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		
		
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//method2(parentB);
	}
}
