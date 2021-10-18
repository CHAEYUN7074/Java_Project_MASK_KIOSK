//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-반복문(while) 실습
//============================================
/*1부터 100까지의 정수 중에서
짝수들의 합과 홀수들의 합을 따로 구분하여 계산한다.
그리고 결과값을 출력하는 프로그램을 구현한다
반복문은 단,while 문을 활용하여 작성할 수 있도록 한다.
조건문은 if 조건문을 사용하여 작성할 수 있도록 한다.

실행 예)
1부터 100까지의 정수 중
짝수의 합 : 2550
홀수의 합 : 2500
계속하려면 아무 키나 누르세요...
*/

public class Test041
{
	public static void main(String[] args)
	{
		int n = 2;
		int even = 0, odd = 0;

		while(n<=100)
		{
			even += n;
			odd += n-1;
			n +=2;

		}

		System.out.println("1부터 100까지의 정수 중");
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);


	}
}


