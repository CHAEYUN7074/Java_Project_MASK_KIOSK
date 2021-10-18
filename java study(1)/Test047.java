//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-반복문(while) 실습
//============================================
//사용자로부터 임의의 두 정수를 입력받아
//작은 수 부터 큰 수 까지의 합을 구하여
//결과를 출력하는 프로그램을 구현한다

//실행 예)
//첫 번째 정수 입력 :
//두 번째 정수 입력 :
//>>10~20까지의 합 :  xxx

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test047
{
	public static void main(String[] args)throws IOException
	{

		//○주요 변수 선언

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su1,su2;    //첫 번째, 두 번째 입력값을 담을 변수
		int n;			//루프(반복) 변수로 활용할 변수
		int result=0;

		//○연산 및 처리
		
		System.out.print("첫 번째 정수 입력 : ");
		su1=Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		su2=Integer.parseInt(br.readLine());
		
		//입력받은 두 수의 크기 비교와 자리 바꾸기
		if(su1>su2) 
		{	
			//a와b 자리 바꾸기
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		//반복 연산 수행
		//반복 연산을 수행하기 전에 
		//작은 수를 따로 저장해서 루프 변수로 활용해야한다
		n=su1; //위의 위치바꾸는걸 통해서 su1에 작은 수가 위치하게 만들었어

		while(n<=su2)
		{
			result +=n;
			n++;
		}

		//○결과 출력
		System.out.printf(">>%d~%d 까지의 합 : %d\n", su1,su2,result); 
	
	}

}
