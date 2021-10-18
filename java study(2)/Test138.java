/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -Calendar 클래스
========================================*/
/*

※ Calendar 클래스는 추상 클래스이기 때문에 객체를 생성할 수 없다.
   (추상 클래스 : 미완성된 클래스)

   Calendar cal = new Calendar();
   -> 이와 같은 구문을 통해 인스턴스 생성이 불가


○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 3가지 방법

   1. Calendar cal = Calendar.getInstance();	-> 정적 메소드(static 클래스)

   2. Calendar cal = new GregorianCalendar();	-> 자식 캐스팅을 불러 업 캐스팅

   3. GregorianCalendar cal = new GregorianCalendar();

   ( ※ GregorianCalendar : Calendar 클래스의 하위 클래스)

   

*/

// 년, 월, 일, 요일을 Calendar 클래스로부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138 {

	public static void main(String[] args) {

		// Calendar 클래스 기반 인스턴스 생성
		// Calendar rightNow = new Calendar();		-> 생성 불가
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 -> [ get() ]
		int y = rightNow.get(Calendar.YEAR);
		System.out.println(y);
		// 2020
														// check~!!!
		int m = rightNow.get(Calendar.MONTH) + 1;		// 가져올 때는 [ + 1 ]	
		System.out.println(m);							// 설정할 때는 [ - 1 ]
		// 8

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		// 27

		int w = rightNow.get(Calendar.DAY_OF_WEEK);		// 일 월 화 수 목 금 토
		System.out.println(w);
		// 5
		

		// 테스트(확인)
		/*
		System.out.println(Calendar.SUNDAY);			// 1	-> 일요일
		System.out.println(Calendar.MONDAY);			// 2	-> 월요일
		System.out.println(Calendar.TUESDAY);			// 3	-> 화요일
		System.out.println(Calendar.WEDNESDAY);			// 4	-> 수요일
		System.out.println(Calendar.THURSDAY);			// 5	-> 목요일
		System.out.println(Calendar.FRIDAY);			// 6	-> 금요일
		System.out.println(Calendar.SATURDAY);			// 7	-> 토요일
		*/

		System.out.println(y + "-" + m + "-" + d + " " + w);
		// 2020-8-27 5

		String week = "";
		switch(w) 
		{

			// case 1 : week = "일요일"; break;
			case Calendar.SUNDAY : week = "일요일"; break;
			
			// case 2 : week = "월요일"; break;
			case Calendar.MONDAY : week = "월요일"; break;

			// case 3 : week = "화요일"; break;
			case Calendar.TUESDAY : week = "화요일"; break;

			// case 4 : week = "수요일"; break;
			case Calendar.WEDNESDAY : week = "수요일"; break;

			// case 5 : week = "목요일"; break;
			case Calendar.THURSDAY : week = "목요일"; break;

			// case 6 : week = "금요일"; break;
			case Calendar.FRIDAY : week = "금요일"; break;

			// case 7 : week = "토요일"; break;
			case Calendar.SATURDAY : week = "토요일"; break;

		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		// 2020-8-27 목요일


		//-------------------------------------------------------

		// Calendar 클래스 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		// 달력의 날짜 세팅 -> [ set() ] 메소드 활용
		rightNow2.set(2020, 9, 20); // 10월		-> check~!!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		// --==>> 3 -> 화요일
		// 2020년 10월 20일은 화요일~!!!

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		// --==>> 화요일

		// 달력의 날짜 세팅
		rightNow2.set(1994, 0, 27);
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		

	}

}
