/* 실행 흐름의 컨트롤(제어문, 조건문과 반복문)
-반복문(for문) 실습
-별찍기 실습
==================================
다음과 같은 내용이 출력 될 수 있도록
반복문의 중첩 구문을 작성하여 프로그램을 구현한다

실행 예)
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public class Test059
{
	public static void main(String[] args)
	{
		
		int n, i;	                     // n : 반복 수, i : 루프 변수
		
		for (n=1;n<=5;n++)
		{
			for (i=1;i<=5-n;i++)		// 공백 출력 : 4 3 2 1 0
				System.out.print(' ');
		
			for (i=1;i<=(2*n-1);i++)	// 별 출력 : 1 3 5 7 9
				System.out.print('*');	
			
			System.out.println();
		}
		
		// 6번째줄 부터		
		for (n=1;n<=5;n++)
		{
			for (i=1;i<=n;i++)			// 공백 출력 : 1 2 3 4
				System.out.print(' ');
			
			for (i=1;i<=(9-2*n);i++)	// 별 출력 : 7 5 3 1
				System.out.print('*');	
						
			System.out.println();
		}
	}
}

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

계속하려면 아무 키나 누르십시오 . . .
*/