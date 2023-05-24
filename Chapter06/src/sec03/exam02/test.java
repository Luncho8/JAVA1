package sec03.exam02;
import java.util.*;
public class test {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				System.out.print("학생 수:");
				int num2 = scanner.nextInt();
				studentNum = num2;
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int i  = 0; i < studentNum; i++) {
					System.out.print("scores["+ i +"]>");
					int num3 = scanner.nextInt();
					scores[i] = num3;
				}
			}else if(selectNo == 3) {
				for(int i  = 0; i < studentNum; i++) {
					System.out.println("scores["+ i +"]>" + scores[i] );
				}
			}else if(selectNo == 4) {
				int max = 0;
				for(int i  = 0; i < studentNum; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
			    }
				
				int sum = 0;
				double avg = 0.0;
				
				for(int i  = 0; i < studentNum; i++) {
					sum+=scores[i];
				}
				
				avg = sum / scores.length;
				System.out.println(max);
				System.out.println(avg);
			}
		}
	}
}
