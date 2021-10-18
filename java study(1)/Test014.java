//자바 기본 프로그래밍
//-자바의 기본 입출력 : System.in.read()
//=========================================
//실행 예)
//한 문자 입력 : A
//한 자리 정수 입력 : 7

//>> 입력한 문자 : A
//>> 입력한 정수 : 7

/*
System.in.read() 메소드는 한 문자만 가져온다
단, 하나의 문자를 입력받아 입력받은 문자의 ASCII(아스키) Code 코드를 반환한다
*/

import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		char ch; // 입력받은 문자를 담을 변수
		int n; // 입력받은 정수를 담을 변수

		//연산 및 처리
		//사용자에게 안내 메시지
		System.out.print("한 문자 입력: ");
		//ch = System.in.read(); //System.in.read(A); - A라는 문자 가져온게 아니라 65라는 정수를 가져온게 되니까
		                       //ch가 아니라 int 타입이고 큰 자료형을 작은 자료형에 옮겨 담을 수 없어서 error
		ch=(char)System.in.read(); //char로 형변환해서 데려와야한다.
		//※입력 대기열에 남아있는 \r과 \n을 스킵해서 건너뛰기
		System.in.skip(2);
		
		
		//사용자에게 안내 메시지 출력 및 입력값 얻어오기
		System.out.print("한 자리 정수 입력:" );
		n=System.in.read();

		//1->49 ★
		//2->50
		//48만큼 더해서 나오는 규칙을 발견했으니 n을 48만큼 감소시켜야한다
		//n-=48; //

		temp=(char)n;

		//결과출력
		System.out.println();
		System.out.println(">>입력한 문자 : "+ch);
		System.out.println(">>입력한 정수 : "+n);
		//System.out.println(">>입력한 정수 : "+temp); //----오
	}
}