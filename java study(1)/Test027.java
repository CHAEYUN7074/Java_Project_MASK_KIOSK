//연산자
//-삼항연산자
//===============================
/*사용자로부터 임의의 정수를 입력받아
입력받은 정수가 양수인지 음수인지 0인지 구분하여
이 결과를 출력하는 프로그램을 구현한다
단, 입력데이터는 BufferedReader의 readLine()을 통해 넘겨받을 수 있도록 하낟.
조건 연산자를 활용하여 기능을 구현할 수 있도록 한다.

실행 예)
임의의 정수 입력 : -12
-12→음수

임의의 정수 입력 : 12
12→양수

임의의 정수 입력 : 0
0→영
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test027
{
	public static void main (String [] args)throws IOException
	{
		//주요 변수 선언
		int n;
		String strResult; //문자열(양수, 음수, 영)로 해야해(판별 결과를 담아둘 변수)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n=Integer.parseInt(br.readLine()); //정수형태로 변환

		strResult =(n>0)? ("양수") : ((n<0) ? "음수" : "영");

		//결과 출력
		System.out.printf("%d → %s\n",n,strResult);
		System.out.println("==========");
	}
}

/*
임의의 정수 입력 : 0
0 → 영
==========
계속하려면 아무 키나 누르십시오 . . .

*/