/*==========================================================
 ■■■ 만년달력■■■
============================================================
실행 예)
『연도』를 입력하세요 : 2021
『월』을 입력하세요 : 8

	[2020년 8월]
일	월	화	수	목	금	토
===========================
 1	 2	 3	 4	5	6	7
 8	 9	10	11	12	13	14
15	16	17	18	19	20	21
29	30	31
===========================
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test101 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int y, m, day;
		int[] days;

		//입력받아 가져오기
		System.out.print("『연도』를 입력하세요 : ");
		y = scan.nextInt();
		System.out.print("『월』을 입력하세요 : ");
		m = scan.nextInt();

		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int nalsu;
		
		// 윤년 평년 구분
		if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) 
			{
			months[1] = 29;
			}
		else 
			{
			months[1] = 28;
			}
		//이전 연도 12월 31일까지의 날 수
		nalsu = ((y - 1) * 365) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400);
		
		//이전 월까지의 날 수
		for(int i = 0; i < (m - 1); i++) 
			{
			nalsu += months[i];
			}
		
		day = months[m-1]; //해당 월에 날 수 담기

		days = new int[day];  //days 배열을 해당 월 날수만큼 공간 확보(칸 만들기)
		
		for(int i = 0; i < days.length; i++) //days 배열에 1~마지막날까지 담기
			{
			days[i] += i + 1;		
			}

		day = (nalsu % 7) + 1; //1일이 무슨 요일인지..day에 담기

		
		System.out.printf("    [%d년 %d월]   \n", y, m);
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("====================");
		
		for(int i = 0; i < day; i++) 
			{
			System.out.print("   ");  // 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
			}
		for(int i = 0; i < days.length; i++) 
			{
			System.out.print(days[i] + " "); // 11	12	13 날짜들 사이의 공백

			if(days[i] < 10)
				{
				System.out.print(" "); //_1 _2 _3 _4 _5 _6 _7 _8 _9 대신 공백 입력되도록
				}

			if((day+i+1) % 7 == 0) //한줄에 7개(7일) 되도록 개행
				{
				System.out.println();
				}
		}
		System.out.println();
	}
}
