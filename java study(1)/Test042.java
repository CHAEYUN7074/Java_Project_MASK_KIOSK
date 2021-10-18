//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-반복문(while) 실습
//============================================
/*
실행 예)
1부터 100까지의 정수의 합 : 5050
1부터 100까지의 짝수의 합 : 2550
1부터 100까지의 홀수의 합 : 2500
계속하려면 아무 키나 누르세요...
*/

public class Test042
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		int n=1, sum, even, odd;
		sum=even=odd=0; //0으로 초기화

		//연산 및 처리
		while(n<=100)
		{
			//정수합 처리
			sum+=n;
			//짝/홀수합 처리
			if(n%2==0)
			{
				even+=n;
			}
			else if(n%2!=0)
			{
				odd+=n;
			}
			else
			{
				System.out.println("판별불가 데이터");
			}
			//나머지 처리
			n++;

		}
		//결과 출력
		System.out.println("1부터 100까지 정수의 합 : "+sum);
		System.out.println("1부터 100까지 짝수의 합 : "+even);
		System.out.println("1부터 100까지 홀수의 합 : "+odd);


	}
}