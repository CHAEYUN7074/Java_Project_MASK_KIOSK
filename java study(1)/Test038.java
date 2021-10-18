//실행 흐름의 컨트롤(제어문,조건문과 반복문)
//switch 문 실습
//============================================
/*사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단, switch을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수형으로 처리될 수 있도록 하낟.

실행 예)
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 14
연산자 입력[+ - * /] :+

>> 20+14=34
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		//①
		int a, b, result=0; 
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer.parseInt(br.readLine()); //인티져

		//Integer.parseInt() 어쨌든 숫자 모양으로 되어있어야 인티져로 정수로 변경이 가능해

		System.out.print("연산자 입력 [+ - * /] : ");
		op = (char)System.in.read(); //(오류)앞은 chr, 뒤는 int라 형변환이 필요하다
		
		//+ → op : 43, -는 45, *은 42 ,/는 47
		switch(op)
		{
			case 43 : result=a+b; break; 
			case 45 : result=a-b; break; 
			case 42 : result=a*b; break; 
			case 47 : result=a/b; break; 
			//default : return; //result를 0으로 초기화하지 않은 경우
		}

		//return의 의미
		//1. 값의 반환
		//2. 메소드의 종료->프로그램 종료

		System.out.println();
		System.out.printf(">>%d %c %d=%d\n", a,op,b,result);
		*/

		//②
		int a, b, result=0; 
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer.parseInt(br.readLine()); //인티져

		//Integer.parseInt() 어쨌든 숫자 모양으로 되어있어야 인티져로 정수로 변경이 가능해

		System.out.print("연산자 입력 [+ - * /] : ");
		op = (char)System.in.read(); //(오류)앞은 chr, 뒤는 int라 형변환이 필요하다
		
		//+ → op : 43, -는 45, *은 42 ,/는 47
		switch(op)
		{
			case 43 : result=a+b; break; 
			case 45 : result=a-b; break; 
			case 42 : result=a*b; break; 
			case 47 : result=a/b; break; 

		}


		System.out.println();
		System.out.printf(">>%d %c %d=%d\n", a,op,b,result);
		

	}
}
