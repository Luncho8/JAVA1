package sec01.exam01;

class Member{
	static int num = 0; //스태틱 필드
	int num1 = 0; //인스턴스 필드
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member number1 = new Member();
		Member number2 = new Member();
		
		number1.num++;
		number1.num1++;
		
		System.out.println(number2.num);
		System.out.println(number2.num1);
	}

}
