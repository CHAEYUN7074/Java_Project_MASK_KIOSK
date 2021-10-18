/* 실행 흐름의 컨트롤(제어문, 조건문과 반복문)
-반복문(for문) 실습
-다중 for문(반복문의 중첩)을 활용한 구구단 출력 실습
====================
실행 예)
[2단]
2*1=2
2*2=4
2*3=6
 :
2*9=18

[3단]
3 x 1 = 3
3 x 2 = 6
 ...
3 x 9 = 27

[9단]
9 x 1 = 9
9 x 2 = 18
 ...
9 x 9 = 81
계속하려면 아무 키나 누르세요...
*/


public class Test054
{
	public static void main(String[]args)
	{


		/*
		// 변수 선언
		int i, j;

		// 웅~ 웅~
		for(i =2; i <= 9; i++) {
			System.out.println("===[" + i + "단]===");
			// 쓩~ 쓩~
			for(j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		*/

	

		// 내 풀이
		for(int i = 2; i <= 9; i++) {
		
			System.out.println("===[" + i + "단]===");

			for(int j = 1; j <= 9; j++) {

				System.out.println(i + " X " + j + " = " + (i * j));

			}
			System.out.println();
		}

	}
}

