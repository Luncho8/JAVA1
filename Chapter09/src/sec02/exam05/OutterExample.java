package sec02.exam05;

public class OutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter outter = new Outter();
		Outter.Nested nasted = outter.new Nested();
		nasted.print();
	}

}
