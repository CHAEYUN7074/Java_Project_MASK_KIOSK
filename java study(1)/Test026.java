//연산자
//-삼항 연산자(=조건연산자)
//============================================
/*

	피연산자 연산자 피연산자 연산자 피연산자
	--------        --------        --------
		1항				2항				3항
	피연산자 ? 피연산자 : 피연산자
	--------   --------   --------
		1항			2항			3항
*/

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수의 짝수, 홀수를 판별하는 프로그램 구현
//조건연산자(삼항연산자) 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 10

//==[판별 결과]==
//10 → 짝수
//====================================================
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test026
{
	public static void main (String [] args)throws IOException
	{
		//주요 변수 선언
		int n;
		String strResult; //문자열(짝수야, 홀수야)로 해야해(판별 결과를 담아둘 변수)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n=Integer.parseInt(br.readLine());
				
		//홀수인지 짝수인지에 대한 판별 연산
		//_____?_____:_______;
		//수식1 수식2  수식3
		//수식 1: true or false을 반환할 수 있는 수식 형태로 작성
		//수식 2: 수식 1의 처리 결과가 참일 경우 수행하는 영역
		//수식 3: 수식 1의 처리 결과가 거짓일 경우 수행하는 영역

		//입력받은 정수가 홀수인지 짝수인지 확인하기 위한 연산
		//n을 2로 나눈 나머지가 0이면 짝수 아니면 홀수

		strResult =(n%2==0)? "짝수" : "홀수"; //★


		//결과 출력
		System.out.println("\n==[판별 결과]==");
		System.out.printf("%d → %s\n",n,strResult);
		System.out.println("==========");
	}
}

/*
임의의 정수 입력 : 10

==[판별 결과]==
10 → 짝수
==========
계속하려면 아무 키나 누르십시오 . . .


임의의 정수 입력 : 9

==[판별 결과]==
9 → 홀수
==========
계속하려면 아무 키나 누르십시오 . . .
*/
