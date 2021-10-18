//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//if~else문 실습
//=============================
//과제
/*사용자로부터 임의의 연도를 입력받아
입력받은 연도가 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램을 구현한다.
단, 입력은 BufferedReader를 활용하고,
처리과정은 if 조건문 활용하여 수행할 수 있도록 한다

실행 예)
임의의 연도 입력 : 2021
2021년 → 평년
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[]args) throws IOException
	{
		//○주요 변수 선언
		int year;
		String strResult; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//○연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		//○조건문과 결과 출력
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			strResult="윤년";
		}
		else 
		{
			strResult= "평년";
		}
		System.out.println(year + "년"+ "→" + strResult);	
	}
}
		

/*
임의의 연도 입력 : 2021
2021→평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2024
2024→윤년
계속하려면 아무 키나 누르십시오 . . .
*/
