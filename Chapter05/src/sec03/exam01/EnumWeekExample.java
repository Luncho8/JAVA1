package sec03.exam01;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;	
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;	
		}
		System.out.println(today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 HTML5 CSS3 프로젝트를 합니다.");
		}else if(today == Week.MONDAY){
			System.out.println("열심히 자바 HTML CSS3 프로젝트를 공부합니다.");
		}else if(today == Week.TUESDAY) {
			System.out.println("프로그래머스 Lv0");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("프로그래머스 Lv1");
		}else if(today == Week.THURSDAY) {
			System.out.println("프로그래머스 Lv2");
		}else if(today == Week.FRIDAY) {
			System.out.println("프로그래머스 Lv3");
		}else if(today == Week.SATURDAY) {
			System.out.println("프로그래머스 Lv4");
		}
	}

}
