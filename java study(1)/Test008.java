//변수와 자료형
//변수와 자료형 실습 및 테스트 : char(2바이트 문자형)

public class Test008
{
	public static void main(String[]args)
	{
		//주요 변수 선언
		char ch1, ch2, ch3;
		int a; //★

		//연산 및 처리
		ch1='A'; //문자는 '로 표현 "안된다 이건 문자열 //65
		ch2='\n'; //우리눈엔 두개의 문자이지만 개행문자 1개로 취급한다
		ch3='대';
		a=(int)ch1;  //★자동형변환되지만 int 한번 더 넣어주는게 좋다 //

		//결과 출력
		System.out.println("ch1 :" +ch1);
		System.out.println("ch2 :" +ch2);
		System.out.println("ch3 :"+ch3);
		System.out.println("a :"+a);
	}
}

/*
ch1 :A
ch2 :

ch3 :대
a :65
계속하려면 아무 키나 누르십시오 . . .
*/