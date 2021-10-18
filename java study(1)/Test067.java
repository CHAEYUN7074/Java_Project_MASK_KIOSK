/*
■■■클래스와 인스턴스■■■
=============================
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 수 까지의 합을 연산하여
결과값을 출력하는 프로그램을 구현한다.

단 클래스와 인스턴스 개념을 활용하여 처리할 수 있도록 한다
또한 입력 처리 과정에서 BufferedReader를 활용하며
입력 데이터가 1보다 작거나 100보다 큰 경우
다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 하낟.

실행 예)
임의의 정수 입력 (1~100) :
임의의 정수 입력 (1~100) :
임의의 정수 입력 (1~100) : 100
>> 1~100까지의 합 : 5050
계속하려면 아무 키나 누르세요...

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	//○주요변수선언
	int n;
	//n : 외부로부터 사용자의 입력값을 담아둘 변수
			
	//○입력 메소드
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
		System.out.print("임의의 정수 입력(1~100) : ");
		n = Integer.parseInt(br.readLine());

		}
		while(n<1 || n>100);
	}

	//○연산 처리 메소드
	int cal()
		{
			int result=0;
			for (int i=1; i<=n; i++)
			{
			result += i;
			}
			return result;		
		}

    //○출력 메소드
	void print(int sum)
		{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n,sum);
		}
}



public class Test067
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();

		ob.input();
		int sum=ob.cal();
		ob.print(sum);
	}
}











