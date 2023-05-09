package sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87}; //선언과 동시에 값을 집어 넣는 방버
		//int[] scores1;
		//scores1 = {83, 90, 87}; //변수처럼 먼저 선언을 하고 나중에 값을 넣는것x 
		
		int[] scores2;
		scores2 = new int[] {83,90,87}; //참조변수 선언하듯 값을 넣는 것은 o
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i  = 0; i < scores.length; i++) {
			sum+= scores[i];
		}
		
		System.out.println("총합:" + sum);
		double avg = (double)sum /scores.length;
		System.out.println("평균:" + avg);
	}

}
