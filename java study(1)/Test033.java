//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//if~else문 실습
//==============================
//사용자로부터 임의의 정수 세 개를 입력받아
//작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다
//실행 예)
//첫 번째 정수 입력 : 5
//두 번째 정수 입력 : 15
//두 번째 정수 입력 : 10

//>>정렬 결과 : 5 10 15


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;

		System.out.print("첫 번째 정수 입력 : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer.parseInt(br.readLine()); //인티져

		System.out.print("세 번째 정수 입력 : ");
		c= Integer.parseInt(br.readLine()); //인티져

		if(a>b) 
		{	//a와b 자리 바꾸기
			a=a^b;
			b=b^a;
			a=a^b;
		}

		if(a>c) 
		{	//a와c 자리 바꾸기
			a=a^c;
			c=c^a;
			a=a^c;
		}

		if(b>c) 
		{	//b와c 자리 바꾸기
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.println("자리바꿈발생");
		System.out.printf("\n>>정렬 결과 : %d %d %d\n",a,b,c);
	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 50
세 번째 정수 입력 : 20

>>정렬 결과 : 10 20 50
계속하려면 아무 키나 누르십시오 . . .
*/