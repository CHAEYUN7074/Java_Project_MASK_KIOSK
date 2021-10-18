//실행 흐름의 컨트롤(제어문,조건문과 반복문)
//if~else 문 실습
//=============================================
/*과제
사용자로부터 알파벳 한 문자를 입력받아
이를 판별하여 입력받은 알파벳이 모음일 경우만
결과를 출력하는 프로그램을 구현한다
단, 대소문자를 모두 적용할 수 있도록 처리한다
또한, 알파벳 이외의 문자가 입력되었을 경우
입력 오류에 댛란 내용을 사용자에게 안내해 줄 수 있도록 한다
*/

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : e
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		
		// ○주요 변수 선언
		char a;

		// ○연산 및 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("알파벳 한 문자 입력 : ");
		a = (char)System.in.read();

		// ○ 결과 출력
		if ((a>=65 && a<=90) || (a>=97 && a<=122))
		{
			if (a==65 || a==69 || a==73 || a==79 || a==85
				|| a==97 || a==101 || a==105 || a==111 || a==117)
			
			{
				System.out.println(">> 모음 OK~!!!");
			}
		}

		else
		{
			System.out.println(">> 입력 오류~!!!");
		}
	}
}
