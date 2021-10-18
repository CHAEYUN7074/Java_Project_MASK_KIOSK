/*
/*=====================================
 ■■■정렬(Sort) 알고리즘■■■
 -버블 정렬
======================================*/
/*

○ 정렬
   
   데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)


○ 정렬의 목적
   
   데이터 처리 과정의 편의성이나 가독성을 높이기 위함
   -> 보기 좋게 ~ 검색하기 위함


○ 정렬의 종류

   선택, 버블, 삽입, 힙, 퀵, 쉘 정렬 ...

*/

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...


public class Test104 
{
	public static void main(String[] args) 
	{
		
		/*

		52 42 12 62 60

		42 52 12 62 60
		== --

		42 12 52 62 60
		   == --

		42 12 52 62 60
		      == --

		42 12 52 60 62
		         == --

		--------------------- 1회전

		42 12 52 60 62

		12 42 52 60 62
		== --

		12 42 52 60 62
		   == --

		12 42 52 60 62
		      == --
		
		--------------------- 2회전

		12 42 52 60 62
		== --
		   == --

		--------------------- 2회전

		12 42 52 60 62
		== --


		*/

		// 풀이 코드

		
		int i, j;

		int[] a = {52, 42, 12, 62, 60};

		System.out.print("Source Data : ");
		for(int n : a) {
			System.out.print(n  + "ㅁ");
		}
		System.out.println();

		// Bubble Sort 구현
		for(i = 1; i < a.length; i++) {			// 웅~~~		-> 뒤에서 비교대상을 하나씩 줄여주는 역할
			for(j = 0; j < a.length-i; j++) {	// 쑝쑝쑝
				
				// 테스트(확인)
				// System.out.print("[" + j + ", " + (j + 1) + "]");
				// [0, 1][1, 2][2, 3][3, 4][0, 1][1, 2][2, 3][0, 1][1, 2][0, 1]

				if(a[j] > a[j + 1]) 
				{		// 오름차순 정렬

					a[j] = a[j]^a[j+1];
					a[j + 1] = a[j]^a[j+1];
					a[j] = a[j]^a[j+1];
				}

			}
		}

		System.out.print("Sorted Data : ");
		for(int n : a) {
			System.out.print(n  + " ");
		}
		System.out.println();


		/*
		int i, j, temp;
		
		int[] a = {52, 42, 12, 62, 60};

		System.out.print("Source Data : ");
		for(i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		int n = a.length - 1;		// 비교기준까지만 2번째 for문이 돌면 되기 때문에 -1 해준다.

		for(i = 0; i < a.length; i++) {
			for(j = 0; j < n ; j++) {
				
				if(a[j] > a[j + 1]) {		// 오름차순
					
					temp     = a[j + 1];
					a[j + 1] = a[j];
					a[j]	 = temp;

				}

			}
			n--;
		}

		System.out.print("Sorted Data : ");
		for(i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		*/

	}

}

/*

실행 결과

Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .


*/
