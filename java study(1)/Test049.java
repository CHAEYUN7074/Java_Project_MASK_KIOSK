//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-반복문(while) 실습
//============================================
//○과제(구구단)
//사용자로부터 원하는 단(구구단)을 입력받아
//해당하는 구구단을 출력하는 프로그램을 구현한다
//단, 1~9단 사이의 수를 입력받은 상황이 아니라면
//프로그램을 종료해 버릴 수 있도록 처리한다.

//실행 예)
//원하는 단(1단~9단) 입력 : 7
// 7*1=7
// 7*2=14
// 7*3=21
// 7*4=28
//	:
// 7*9=63

//원하는 단(1단~9단) 입력 : 11
// 1 부터 9까지의 정수만 입력 가능합니다.

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test049
{
	public static void main(String[] args) throws IOException
	{
		// ○변수 선언		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 단 (1~9) 입력 : ");
		int i = Integer.parseInt(br.readLine());  // 사용자의 입력 값
		int n = 1; // 루프 변수
		
		// ○연산 및 처리		
		if( i<1 || i>9) // 1 ~ 9가 아닌 정수를 입력한 경우
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			return;
		}

		while (n<=9) 
		{ 
			System.out.printf("\n%d * %d = %d", i, n, (i*n));
			n++; 
		}
	System.out.println(); 
	}
}

/*
원하는 단 (1~9) 입력 : 9

9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .
*/