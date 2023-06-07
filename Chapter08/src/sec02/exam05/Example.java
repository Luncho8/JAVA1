package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsC imp1 = new ImplementsC();
		
		interfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		interfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		interfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}

}
