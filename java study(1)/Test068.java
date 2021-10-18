/*
■■■클래스와 인스턴스■■■
=============================
사용자로부터 임의의 두 정수를 입력받아
사칙연산을 수행하는 프로그램을 구현한다.
단 클래스와 인스턴스 개념을 활용하여 처리할 수 있도록 한다

실행 예)
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자 입력(+ - * /) : +
>> 10 + 5 =15
*/
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Calculate
{
	//○주요변수선언
	int a, b, result=0; 
	char op;
			
	//○입력 메소드
	void input() throws IOException //System.in.read();때문에
	{
		Scanner sc = new Scanner(System.in); //공백 기준으로 구분해서 받아올 수 있어
		System.out.print("임의의 두 정수 입력(공백 구분): ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("임의의 연산자 입력(+ - * /)   : ");
		op = (char)System.in.read();
	}

	//○연산 처리 메소드	
	int cal()
	{
		int result = 0;
		
		switch (op)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
			default  : System.out.println("연산자를 잘못 입력하셨습니다.");		
		}

		return result;
	}


    //○출력 메소드
	void print(int s)
		{
		System.out.printf(">>%d %c %d=%d\n", a,op,b,s);
		}
	
}


public class Test068 
{
	public static void main(String[] args) throws IOException
	{
		//Calculate 클래스 인스턴스 생성
		Calculate cal = new Calculate();

		cal.input(); 
  		int result=cal.cal();
		cal.print(result);
	}
}




















