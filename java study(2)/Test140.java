/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -Calendar 클래스
========================================*/
/*
○실습문제
오늘을 기준으로 입력받는 날짜만큼 후의 년, 월, 일, 요일을 확인하여
결괄르 출력하는 프로그램을 구현한다.

실행 예)
오늘 날짜 : 2021-8-11 수요일
몇 일 후의 날짜를 확인하고자 하십니까? :

===========[확인결과]===================
200일 후 : xxxx-xx-xx x요일
*/
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test140
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Calendar time = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;			// 사용자로부터 입력받은 날 수
		int y, m, d, w;		
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일, 요일 확인
		
		y = time.get(Calendar.YEAR);
		m = time.get(Calendar.MONTH) + 1;		
		d = time.get(Calendar.DATE);
		w = time.get(Calendar.DAY_OF_WEEK);

		// 현재의 연 월 일 요일 확인결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week[w-1] + "요일");

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = scan.nextInt();
		}
		while (nalsu < 1);

		time.add(Calendar.DATE, nalsu); //타임이라는 객체.add ==>현재 날짜 기준으로 날 수를 더하는 연산 메소드

		//결과 출력
		System.out.println(); //개행
		System.out.println("=======[ 확인 결과 ]=======");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, time, time);
		System.out.println("===========================");

		//%tF: 현재의 날짜를 %tY-%tm-%td(년/월/일) 형식으로 출력한다.
		//%tA: 현재의 날짜를 요일 영문 형식으로 출력한다. (한글 환경에서는 '월/화/수/목/금/토/일+요일'로 출력된다.)

		
	}

}
