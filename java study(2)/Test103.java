/*=====================================
 ■■■정렬(Sort) 알고리즘■■■
======================================*/
/*
정렬 : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순 등)

정렬은 어떤 걸 쓰던 데이터 소모가 심하다

실행 예)
Source Data : 52	42	12	62	60
Sorted Data : 12	42	52	60	62
계속하려면 아무 키나 누르세요..

*/
/*
public class Test103
{
	public static void main(Spring [] args)
	{
		int[] a ={52, 42, 12, 62, 60};
		
		42	52	12	62	60	0과1번째 비교
		12	52	42	62	60	0과2번째 비교
		12	52	42	62	60	0과3번째 비교
		12	52	42	60	62	0과4번째 비교
		----------------------------------1회전
		12	42	52	62	60	1과2번째 비교
		12	42	52	62	60	1과3번째 비교
		12	42	52	62	60	1과4번째 비교
		----------------------------------2회전
		12	42	52	62	60	2와3번째 비교
				--	--
		12	42	52	62	60	2와4번째 비교	
		----------------------------------3회전
		12	42	52	60	62	3와4번째 비교	
		----------------------------------4회전

	}
}

*/


/*
public class Test103 
{

	public static void main(String[] args) 
	{
		
	
		int[] a = {52, 42, 12, 62, 60};
		System.out.print("Source Data : ");

		for(int n : a) 
			{		
			System.out.print(n + " ");
			}
		System.out.println();


		for(int i = 0; i < a.length; i++) 
			{
			for(int j = i + 1; j < a.length; j++) 
			{
				
				if(a[i] > a[j]) 
					{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					}

			}

		}
		System.out.print("Sorted Data : ");
		for(int i = 0; i < a.length; i++) 
			{
			System.out.print(a[i] + " ");
			}
			System.out.println();
	}
}
*/

public class Test103 
{

	public static void main(String[] args) 
	{
	
		int i, j;
		int[] a = {52, 42, 12, 62, 60};

		System.out.print("Source Data : ");
		/*
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// --==> Source Data : 52 42 12 62 60
		*/
		

		/*
		           2	                  1
		for(요소의데이터타입 변수명 : 자료구조) {
			변수명...
		}
		*/

		//향상된 for문 (forEach구문이라고도 한다)


		for(int n : a) //a에서 하나 꺼내면(a의 요소) 'int 변수이름'  
			System.out.print(n + " ");
		System.out.println();
		

		// Selection Sort 구현
		for(i = 0; i < a.length-1; i++) {			// 비교 기준 데이터(0		1		2		3)
													//					|		|		|		|
			for(j = i + 1; j < a.length; j++) {		// 비교 기준 데이터(1234	234		34		4)
				//     a[i]        a[j]
				// if(비교기준이 비교대상보다 크다면) {
				//		자리 바꿔라

				// if(a[i] < a[j])		// 내림차순 정렬
				if(a[i] > a[j]) {		// 오름차순 정렬
					
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];

				}

			}

		}

		System.out.print("Sorted Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}





		