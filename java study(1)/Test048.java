//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-반복문(while) 실습
//============================================
//사용자로부터 임의의 두 정수를 입력받아
//1부터 입력받은 그 수 까지의
//전체 합과, 짝수의 합과, 홀수의 합을
//각각 결과값으로 출력하는 프로그램을 구현하다.

//실행 예)
//임의의 정수 입력 : 270
//>> 1~270 까지 정수의 합 :
//>> 1~270 까지 짝수의 합 :  xxx
//>> 1~270 까지 홀수의 합 :  xxx

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test048

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		// ○변수 선언		
		int num, sum, even, odd;			
		int i=1;
		sum=even=odd=0;
		// ○ 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine()); //사용자의 입력값 변환

		
		while (i <= num)		//--임의의 숫자까지 반복문
		{
			sum +=i;			//--임의의수 합
			
			if(i%2==0)			//짝수
			{
				even +=i;		
			}
			else if(i%2!=0)		//홀수
			{
				odd +=i;		
			}
			
			i++;
		}

		//○결과 출력

		System.out.printf("\n>> 1 ~ %d 까지 정수의 합 : %d", num, sum);
		System.out.printf("\n>> 1 ~ %d 까지 짝수의 합 : %d", num, even);
		System.out.printf("\n>> 1 ~ %d 까지 홀수의 합 : %d\n", num, odd);
	}
}
