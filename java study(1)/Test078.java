/*
■■■클래스와 인스턴스■■■
-배열의 기본적 활용
=============================
과제
사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아서
입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다
단, 배열을 활용하여 구현할 수 있도록 한다.

실행 예)
입력할 데이터의 갯수 : 10
데이터 입력(공백 구분) :74 65 13 91 5 67 41 2 50 11
>>가장 큰 수 → 91
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test078
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//사용자가 입력할 데이터의 갯수 담아둘 변수
		int numCount=0;			//사용자가 입력한 데이터의 갯수

		System.out.print("입력할 데이터의 갯수 : ");
		numCount = sc.nextInt();


		//배열 생성
		int[] num = new int[numCount];


		//사용자로부터 데이터 입력 담아둘 변수
		System.out.print("데이터 입력(공백 구분) : ");
		for (int i=0; i<numCount; i++)
			 num[i]= sc.nextInt();

		//가장 큰 수 출력
		int max = num[0];			//사용자가 입력한 수 중 가장 큰 수
		for (int i=0; i<num.length; i++)
		{
			if (num[i]>max)
				max = num[i];
		}		
		System.out.printf(">> 가장 큰 수 → %d\n", max);

	}
}

/*
입력할 데이터의 갯수 : 10
데이터 입력(공백 구분) : 74 65 13 91 5 67 41 2 50 11
>> 가장 큰 수 → 91
계속하려면 아무 키나 누르십시오 . . .
*/