package sec01.exam01;

public class StringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "장진호";
		String strVar2 = "장진호";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		
		String strvar3 = new String("장진호");
		String strvar4 = new String("장진호");
		
		if(strvar3 == strvar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strvar3.equals(strvar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
