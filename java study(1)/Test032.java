//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//if~else문 실습
//=============================

//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
//단, if 조건문을 활용하여 처리할 수 있도록 하며,
//연산 결과는 편의상 정수형으로 처리될 수 있도록 하낟.

//실행 예)
//첫 번째 정수 입력 : 20
//두 번째 정수 입력 : 14
//연산자 입력[+ - * /] :+

//>> 20+14=34
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args)throws IOException //readLine때문에 쓴거 IOException
	{
		/*
		//방법①	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		char op; //연산자
		System.out.print("첫 번째 정수 입력 : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer.parseInt(br.readLine()); //인티져

		//Integer.parseInt() 어쨌든 숫자 모양으로 되어있어야 인티져로 정수로 변경이 가능해

		System.out.print("연산자 입력 [+ - * /] : ");
		//op = Stytem.in.read(); //(오류)앞은 chr, 뒤는 int라 형변환이 필요하다
		op=(char)System.in.read();

		if(op=='+')
		{
			System.out.printf("\n>>%d+%d=%d\n",a,b,(a+b));
		}
		else if(op=='-')
		{	
			System.out.printf("\n>>%d-%d=%d\n",a,b,(a-b));
		}
		else if(op=='*')
		{
			System.out.printf("\n>>%d*%d=%d\n",a,b,(a*b));
		}
		else if(op=='/')
		{	
			System.out.printf("\n>>%d/%d=%d\n",a,b,(a/b));
		}
		else
		{
			System.out.printf("입력과정에 오류가 존재합니다.\n");
		}
		*/

		
		/*
		//방법②
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op; //연산자도 정수로 받기
		
		System.out.print("첫 번째 정수 입력 : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer.parseInt(br.readLine()); //인티져

		//Integer.parseInt() 어쨌든 숫자 모양으로 되어있어야 인티져로 정수로 변경이 가능해

		System.out.print("연산자 입력 [+ - * /] : ");
		op = System.in.read(); //(오류)앞은 chr, 뒤는 int라 형변환이 필요하다
			---------------
			아스키코드 받아온다
		

		if(op==43)
			System.out.printf("\n>>%d+%d=%d\n",a,b,(a+b)); // 코드가 한줄이면 {}(블레이스) 생략 가능
		else if(op==45)
			System.out.printf("\n>>%d-%d=%d\n",a,b,(a-b));
		else if(op==42)
			System.out.printf("\n>>%d*%d=%d\n",a,b,(a*b));
		else if(op==47)
			System.out.printf("\n>>%d/%d=%d\n",a,b,(a/b));
		else
			System.out.printf("입력과정에 오류가 존재합니다.\n");
		*/

		//방법③
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//check!!
		int a, b, result=0; //0으로 초기화해서 else 없어도 괜찮다.
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer.parseInt(br.readLine()); //인티져

		//Integer.parseInt() 어쨌든 숫자 모양으로 되어있어야 인티져로 정수로 변경이 가능해

		System.out.print("연산자 입력 [+ - * /] : ");
		op = (char)System.in.read(); //(오류)앞은 chr, 뒤는 int라 형변환이 필요하다
		

		if(op=='+')
			result=a+b;
		else if(op=='-')
			result=a-b;
		else if(op=='*')
			result=a*b;
		else if(op=='/')
			result=a/b;

		System.out.printf("\n>>%d%c%d\n", a,op, b);


	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
연산자 입력 [+ - * /] : +

>>10+2=12
계속하려면 아무 키나 누르십시오 . . .
*/