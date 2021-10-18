//실행 흐름의 컨트롤(제어문,조건문과 반복문)
//if~else 문 실습
//=============================================
/*과제
사용자로부터 알파벳 한 문자를 입력받아 이를 판별하여
소문자를 입력받았을 경우 대문자로 변환하고
대문자를 입력받았을 경우 소문자로 변환하는
프로그램을 작성한다
단, 입력은 System.in.read() 메소드를 활용하여 구현한다

실행 예)
알파벳 한 문자 입력 : A
>> a
계속하려면 아무 키나...

알파벳 한 문자 입력 : c
>> C
계속하려면 아무 키나...

알파벳 한 문자 입력 : 7
>> 입력오류
계속하려면 아무 키나...
*/


import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		// ○주요 변수 선언
		
		int a;		// 입력받은 알파벳 int형으로 변수 선언

		System.out.print("알파벳 한 문자 입력 : ");
		a = System.in.read();

		// ○연산 및 처리
		if ((a>=65 && a<=90) || (a>=97 && a<=122))
		{
			if (a<=90)		// if 대문자
			{
				a = a+32;	// 대문자 + 32 = 소문자
			}
			else			// if 소문자
			{
				a = a-32;	// 소문자 - 32 = 대문자
			}
			
		// ○ 결과 출력	
			System.out.println(">> " + (char)a); // 아스키코드값을 char형으로 변환
			}
				else
			{
			System.out.println(">> 입력 오류~!!!");
			}
	
	}
}