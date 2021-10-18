/*
■■■클래스와 인스턴스■■■
-배열의 기본적 활용
=============================
과제
사용자로부터 학생 수를 입력받고
그만큼의 점수(정수 형태)를 입력받아
전체 학생 점수의 합, 평균, 편차를 구하여
결과를 출력하는 프로그램을 구현한다
단, 배열을 활용하여 처리할 수 있도록한다.

실행 예)
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>>합 : 370 
>>평균 : 74.0
>>편차
90 : 16.0
82 : 8.0
64 : -10
36 : -38
98 : 24
*/

import java.util.Scanner;
public class Test079
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int sum=0;		// 합을 구할 변수 선언 및 초기화
		double avg=0.0;	// 평균을 구할 변수 선언 및 초기화

		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();		// 학생 수를 입력 받을 변수 선언 및 초기화
		int[] arr = new int[n];		// 학생 수 만큼 배열 크기 생성

		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", (i+1));
			arr[i] = sc.nextInt();	// 입력 받을 학생의 점수를 0부터 n만큼 입력 받음
			sum += arr[i];			// 입력 받은 값을 모두 더함
		}

		avg = sum / n;	// 평균

		System.out.println(">> 합   : "+sum);
		System.out.println(">> 평균 : "+avg);
		System.out.println(">> 편차");

		for (int i=0; i<n; i++)
		{
			System.out.printf("%3d : %6.2f\n", arr[i], arr[i]-avg); // 입력 받은 학생의 점수 : 편차(점수-평균) 출력
		}

	}
}

/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98
>> 합   : 370
>> 평균 : 74.0
>> 편차
 90 :  16.00
 82 :   8.00
 64 : -10.00
 36 : -38.00
 98 :  24.00
계속하려면 아무 키나 누르십시오 . . .
*/