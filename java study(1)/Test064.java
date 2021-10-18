/*
지역변수와 전역변수
-전역변수의 초기화 테스트 실습
*/

//test063.java와 비교
//지역 변수는 초기화 과정을 거치지 않으면 사용할 수 없다
// 즉, 자바가 자동으로 초기화를 수행해 주거나 하지 않는다.

public class Test064
{
	//전역변수 a 선언
	int a; //자동으로 0으로 초기화 지원되어서 출력하면 0으로 나옴
	boolean b;
	char c;
	double d;

	public static void main(String[] args) //메인 메소드
	{
		//test064 인스턴스 생성
		Test064 ob = new Test064(); //그냥 a=10 이런식으로 쓸게 아니라 먼저 이렇게 해줘야해
		System.out.println("ob.a : "+ob.a);
		//                  -- -- 
		//				   test064 064가 가지고 있는 a
		//>>0b.a : 0
		System.out.println("ob.b : "+ob.b);
		System.out.println("ob.c : "+ob.c);
		System.out.println("ob.d : "+ob.d);
	}
}

/*
ob.a : 0
ob.b : false
ob.c :
ob.d : 0.0
계속하려면 아무 키나 누르십시오 . . .
*/


// 변수				=> 속성 -> 값 -> 데이터 -> 상태
// 메소드(함수)		=> 기능 -> 행위 -> 동작


// 객체 = (속성, 값, 데이터, 상태) + ( 기능, 행위, 동작)
//	 	
//	 |
//   
// 클래스