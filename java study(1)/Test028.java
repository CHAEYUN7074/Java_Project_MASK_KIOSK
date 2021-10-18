//연산자
//삼항연산자
//==============================
/*사용자로부터 임의의 연도를 입력받아
입력받은 연도가 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램을 구현한다
단 입력은 BufferedReader를 활용하고
처리 과정은 조건 연산자를 활용하여 수행할 수 있도록 한다

실행 예)
임의의 연도 입력 : 
2021년 → 평년

연도가 4의 배수 이면서 100의 배수가 아니거나
400의 배수이면 윤년 아니면 평년
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args)throws IOException
	{
		//주요 변수 선언
		int year;
		String strResult; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		//(연도가 4의 배수 연도가 100의 배수 아님 연도가 400의 배수) - 한공간에 두개 이상의 조건이 등장하면 무조건 논리연산자가 와야한다
		strResult =(year%4==0 && year%100!=0 || year%400==0) ? ("윤년") : ("평년"); 
		//strResult =(year%4==0)? ("양수") : ((n<0) ? "음수" : "영"); 

		//결과 출력
		System.out.printf("%d년 → %s\n",year,strResult);
	}
}

/*
임의의 연도 입력 : 2000
2000년 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/