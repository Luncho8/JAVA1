package sec01.exam03;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCricle() 실헹");
		return Math.PI * r *r;
	}
}
