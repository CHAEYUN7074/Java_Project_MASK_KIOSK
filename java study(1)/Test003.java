/* 
자바 기본 프로그래밍
-변수와 자료형
*/

public class Test003
{
	public static void main(String[] args)
	{
		//변수 선언
		int a;
		//변수 초기화 (변수 a에 10 대입)
		a=10;
		//변수 선언 및 초기화(선언과 대입을 한번에 처리)
		int b = 20;
		//변수 선언
		int c;
		//출력문을 통해 확인(테스트)
		//System.out.println(c); → 컴파일 에러
		
		//연산 및 처리
		c= a + b;

		//결과 출력
		System.out.println(c);

		//System.out.println(a b c);
		//-->컴파일 에러

		//※덧셈 연산자(+)
		//  피연산자 중 어느 하나라도 문자열 형태의 데이커다 존재한다면 산술연산자로써의 기능을 수행X
		//  문자열 결합 연산자로써의 기능을 수행한다.

		System.out.println("1"+2);
		//-->12(12가 아니라 문자열 일이로 출력)
		System.out.println(a+" "+b+" "+c);
		//-->10 20 30

		System.out.println("a의 값은" + a + "입니다.");
	}
}