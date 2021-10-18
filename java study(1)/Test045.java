//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-반복문(while) 실습
//============================================

//1*2*3*...*9*10
//실행 예)
//연산 결과 : xxx
//계속하려면 아무 키나 누르세요...

public class Test045
{
	public static void main(String[] args)
	{
		
		//int n=0,result=0;
		int n=0,result=1; //누적 곱은 1로 초기화 해야한다 0아님
		while(n<10)
		{
			n++;
			result*=n;

		}
	
	System.out.println("연산 결과 : " +result);
	}
}

/*
연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/