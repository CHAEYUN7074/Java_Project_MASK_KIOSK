
//사용자로부터 여러 개의 정수를 입력받아
//그 합을 계산하여 결과를 출력하는 프로그램을 구현한다
//단, 사용자가 -1을 입력하게 되면
//반복해서 입력받던 행위를 중지하고,
//그 동안 입력해둔 정수들의 합을
//연산하여 출력할 수 있도록 처리한다
//입력받는 과정은 scanner 인스턴스를 생성하여 처리할 수 있도록 한다.

//실행 예)
//1번째 정수 입력[-1 종료] : 8
//2번째 정수 입력[-1 종료] : 28
//3번째 정수 입력[-1 종료] : 84
//4번째 정수 입력[-1 종료] : 824
//5번째 정수 입력[-1 종료] : -1

//>>현재까지 입력된 정수의 합 :
//계속하려면 아무 키나 누르세요...


import java.util.Scanner;

public class Test051 
	{

		public static void main(String[] args) 
		{

		Scanner scan = new Scanner(System.in);

		int num;
		int sum = 0; //누적합을 담아 둘 변수

		boolean run = true;

		int i = 1;  //루프 변수로 활용하여 몇 번째 입력값인지를 담을 변수
 
		do
		{
			

			System.out.print(i + "번째 정수 입력[-1 종료] : ");  //("%d번째 정수 입력[-1종료] :",i); 이렇게 해도 괜찮아
			num = scan.nextInt();

			if(num != -1) 
				{

				sum += num; //sum을 num 만큼 증가시켜라

				}
			else if(num == -1) 
				{
				run = false;
				System.out.printf("\n>> 현재까지 입력된 정수의 합 : %d\n",sum);

				}
					i++;

				}
		 while (run);
		}
	}

/*		do
		{	
			System.out.print(i + "번째 정수 입력[-1 종료] : ");  //("%d번째 정수 입력[-1종료] :",i); 이렇게 해도 괜찮아
			num = scan.nextInt();
			sum+=num;

			n++;
		}
		while(num!=-1);

				System.out.printf("\n>> 현재까지 입력된 정수의 합 : %d\n",(sum+1);
*/






	/*
	1번째 정수 입력[-1 종료] : 8
2번째 정수 입력[-1 종료] : 4
3번째 정수 입력[-1 종료] : 16
4번째 정수 입력[-1 종료] : 722
5번째 정수 입력[-1 종료] : 85
6번째 정수 입력[-1 종료] : -1
>> 현재까지 입력된 정수의 합 : 835
계속하려면 아무 키나 누르십시오 . . .
*/

