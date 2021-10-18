//자바 기본 프로그래밍
//-변수와 자료형
//-자바의 기본 입출력 : BufferedReader클래스☆☆☆☆


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//방에가서 어디가서 어디로 들어가봐 이게 설계도야

public class Test011
{
	public static void main(String [] args) throws IOException
	{
		//BuffereadReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 키보드의 입력값을 가져 오는 것이 System.in (바이트 형태로 가져옴)
		//InputStreamReader 바이트를 문자로 번역
		//BufferedReader 문자를 읽는 것

	   int r;
	   final double PI=3.141592;
	   double a, b;

	   //연산 및 처리
	   //ⓛ 사용자에게 안내 메시지 출력
	   System.out.print("원의 반지름 입력 :");
	   //② 사용자가 입력한 값을 받아와 반지름 변수 r에 담아내기
	   //r=br.redline(); //★
	   //r="20";

	   //Interger.parsnint() ->매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
	   //re = Integer.parseInt("20");
	   r=Integer.parseInt(br.readLine());//를 형태 통해 숫자형(정수형)으로 변환 후

	   //③연산
	   a=r*r*PI;
	   b=r*2*PI;

	   //결과 출력
	   //System.out.println(">>넓이 : "+a);
	   //System.out.println(">>둘레 : "+b);
	   
	   //System.out.printf(">>넓이 : ○\n",○에 넣을 값);
	   //System.out.printf(">>둘레 : ○\n",○에 넣을 값);

		System.out.printf(">>넓이 : %f\n",a);
		System.out.printf(">>둘레 : %f\n",b);
 }
}

/*
원의 반지름 입력 :25
>>넓이 : 1963.495000
>>둘레 : 157.079600
계속하려면 아무 키나 누르십시오 . . .
*/