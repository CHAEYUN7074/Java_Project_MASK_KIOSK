/*==========================================================
 ■■■ 클래스 인스턴스 ■■■
 정보 은닉과 접근제어지시자
============================================================*
사용자로부터 년, 월, 일을 입력받아
해당 날짜의 요일을 출력하는 프로그램을 구현한다
단, 달력 클래스는 사용하지 않는다
또한 클래스의 개념을 활용하여 작성할 수 있도록 한다.
배열의 개념도 적용시켜 작성한다
접근제어지시자의 개념도 확인하여 작성
최종적으로
weekDay 클래스 설계를 통해
Test095클래스 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다

실행 예)
년 월 일 입력(공백 구분) : 1996 8 16
1996년 8월 16일 → x요일
*/
import java.util.Scanner;

class WeekDay 
	{
	// 주요 변수 선언
	private int y, m, d;		// 사용자가 입력한 년, 월, 일을 담아낼 변수
	// 메소드 정의(입력)
	public void input() 
		{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력[공백 구분] : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		}

	// 메소드 정의(요일 산출)
	public String week() 
		{
		//각 달의 최대값
		int[] months ={31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 요일 이름에 대한 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
		// 날 수를 종합할 변수
		int days;
		
		//2월 평년과 윤년으로 구분하기
		if((y % 4 == 0  && y % 100 != 0) || y % 400 == 0) // 윤년 (4의 배수이면서 100의 배수가 아니거나 400의 배수이면 윤년) 
		{
		months[1] = 29;		// 윤년일때 2월
		}
		else // 평년
		{		
		months[1] = 28;		// 평년일때 2월
		}


		//연도에 따른 날짜 수
		// 입력이전년도*365 + 입력이전년도/4 - 입력이전년도/100 + 입력이전년도/400
		//※ 2021년 1월 1일의 요일을 계산하려면 2020년 12월31일까지의 날 수를 계산해야한다.

		days = ((y - 1) * 365) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400);  //★자바에선 정수 나머지는 0.xx 소수점으로 나타내지 않고 그냥 0처리
		//예)   2020년까지의 날	  ------------------------------    ------------
		//                    4의 배수이면서 100의 배수가 아닌 날	400의 배수면 하루 더 하기
		
		//월에 따른 날짜 수
		// 입력받은 월의 이전 월 까지의 날 수 계산 후 계산 결과를 1번 결과에 누적
		for(int i = 0; i < (m - 1); i++) 
			{
			days += months[i];
			}
		// 입력받은 일의 날짜만큼 날 수 계산 후 결과에 누적하는 연산
		
		//일에 따른 날짜 수
		days += d;
		//요일 확인
		int ob = days % 7;		// 전체날수 % 7 == 0 →일요일
								// 전체날수 % 7 == 1 → 월요일
								// 전체날수 % 7 == 2 → 화요일

		//문자열 배열 weekNames 배열
		return weekNames[ob];
		}

  // 메소드 정의(결과 출력하기)
	public void print(String day) //요일은 앞에 선언한게 없으니 넘겨 받아야 해
		
		{
		System.out.printf("%d년 %d월 %d일 -> %s요일\n", y, m, d, day);
		}
	}


public class Test095
	{
	public static void main(String[] args) 
		{
		//인스턴스 생성
		WeekDay ob = new WeekDay();

		// 입력 메소드 호출
		ob.input();
		
		// 요일 산출 메소드 호출 및 결과 확인
		String result = ob.week();

		// 출력 메소드 호출
		ob.print(result);

		}
	}


	/*
	import java.util.Scanner;

class WeekDay
{
	// 주요 변수 선언
	private int year;
	private int month;
	private int day;

	// 메소드 정의 → 입력받기(input)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	// 메소드 정의 → 요일 산출하기(week)
	public String week()
	// public void week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 테스트
		// System.out.println(months.length);
		//--==>> 12

		// 요일 이름에 대한 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

		// 날 수를 종합할 변수
		int nalsu=0;

		for (int i=1; i<year; i++)
		{
			if (year%4==0 && year%100!=0 || year%400==0)
			{
				nalsu += 1;
			}
			nalsu += 365;
		}

		for (int i=0; i<month-1; i++)
		{
			if (year%4==0 && year%100!=0 || year%400==0)
			{
				months[1] = 29;
			}
			else
			{
		*/