package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("장진호", "970501-xxxxx");
		System.out.println("k1.name = " + k1.name);
		System.out.println("k1.ssn = " + k1.ssn);
		
		Korean k2 = new Korean("김씨","980111-xxxxx");
		System.out.println("k2.name = " + k2.name);
		System.out.println("k2.ssn = " + k2.ssn);
	}

}
