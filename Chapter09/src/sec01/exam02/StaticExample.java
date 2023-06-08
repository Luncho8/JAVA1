package sec01.exam02;

class Name{
	static void print() {
		System.out.println("내이름은 xxxx입니다.");
	}
	void print2() {
		System.out.println("내이름은 1111입니다.");
	}
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name.print();
		
		Name name = new Name();
		name.print2();
	}

}
