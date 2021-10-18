//자바의 개요 및 특징
//변수와 자료형
//키워드 및 식별자
//printf()

public class Test005
{
	public static void main(String[] args)
	{
		//변수 선언 및 초기화(메모리에 값 할당)
		//int a=10, int b=5;
		int a=10, b=5;
		//변수 선언
		int c, d;

		//연산 및 처리
		c=a+b; //a+b의 결과값을 변수 c에 대입
		d=a-b; //a-b의 결과값을 변수 d에 대입

		//결과 출력 10+5=15
		System.out.println(a+"+"+b+"="+c);
		//숫자 문자열 숫자 문자열 숫자
		//자바에서는 서로 다른 자료형의 데이터들끼리도 + 연산이 가능하며
		//다른 어떤 자료형 문자열 데이터의 + 연산 결과는 문자열
		//즉, 문자열 결합 연산자로써 +

		//pirnt()/ println()/ printf()/ format()
		//printf()/format()
		//jdk 1.5부터 지원되는 메소드
		//System.out.printf("○+○=○", 10,20,30);
		System.out.printf("%d+%d=%d\n", 10,20,30); 
		System.out.printf("%d+%d=%d\n", 10,20,30); //%n도 개행
		//%d는 정수형을 의미한다, \n(개행, 열바꾸기)
		System.out.printf("%d와 %.2f\n", 10, 3.141592); // %d는 정수 %.(소숫점자리 몇번째까지 표현할 지(반올림됨))f는 실수

		System.out.printf("%d와 %.4f\n", 10, 3.141592);
	}
}

/*10+5=15
10+20=30
10+20=30
10와 3.14
10와 3.1416
계속하려면 아무 키나 누르십시오 . . .
*/