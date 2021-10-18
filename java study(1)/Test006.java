//변수와 자료형
//-형 변환/접미사 활용

public class Test006
{
	public static void main(String [] args)
	{
		int a;
		a=10;
		System.out.println("a의 결과 :" +a);
		int b=20;
		System.out.println("b의 결과 :" +b);
		short c;
		//연산 및 처리(대입 연산)
		//c=a; int(큰걸) short(작은거)에 넣지 못한다--에러
		c=(short)a;
		//정수형인 10을 short형의 10으로 바꿔 넣어준다
		
		System.out.println("c의 결과 :" +c); 

		//변수 선언 및 초기화
		//long d =10000000000; //백억
		long d=10000000000l; // long 형은 숫자(상수) 뒤에 L또는 l을 붙여 상수를 표현해야한다.
		//★즉 약 21억 이상 되는 상수에는 데이터 뒤에 접미사를 꼭 붙여줄 수 있도록 한다.
		//결과출력
		System.out.println("d의 결과 : " +d);

		//변수 선언 및 초기화
		int e = 030;
		
		System.out.println("e의 결과 : "+e);
		// e의 결과 : 24
		//☆접두어 0 -->8진수

		//변수 선언 및 초기화
		int f=0xa6;
		//결과 출력
		System.out.println("f의 결과 : "+f);
		//f결과 : 166
		//☆접두어 0x -->16진수
		// 1 2 3 4 5 6 7 8 9 a b c d e f (10부터 15까지는 알파벳으로 표현)

		//변수 선언 및 초기화
		float g=0.0f; //실수 형태의 자바라 double로 메모리 공간을 잡게되어 오류..그래서 float로 잡아달라고 f를 붙임
		//★★ 데이터 타입 좌우를 같게 한다
		//결과 출력
		System.out.println("g의 결과 : "+g);

	}
}
/*
a의 결과 :10
b의 결과 :20
c의 결과 :10
d의 결과 : 10000000000
e의 결과 : 24
f의 결과 : 166
g의 결과 : 0.0
계속하려면 아무 키나 누르십시오 . . .
*/