/*==========================================================
 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
============================================================*
/// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
E J O T Y
D I N S X
C H M R W
B G L Q V
A F K P U
*/


public class Test085
{
	public static void main(String[] args)
	{

		//배열선언+메모리 할당
		char[][] alphabets = new char[5][5];	//5행 5열의 이차원배열 선언
		char ch = 'A';	//알파벳을 아스키코드로 증가시키기 위한 변수 선언
			
		//배열의 배열 각 방에 데이터(요소) 담아내기
		int n=65;

		for (int i=0; i<5; i++)			
		{
				for (int j =4; j>=0 ; j--)		
				{
					alphabets[j][i] = (char)ch++;			
				}
		}
        //전체 요소 출력
		for (int i=0; i<alphabets.length; i++)		
		{
			for (int j=0; j<alphabets[i].length; j++)
			{
			System.out.printf("%3c", alphabets[i][j]);	
			}
		System.out.println();
		}

	}
}


/*
public class Test085
{
	public static void main(String[] args)
	{
		//배열선언+메모리 할당
		int[][] arr = new int[5][5];

		//배열의 배열 각 방에 데이터(요소) 담아내기
		int n=65;

		for (int i=0; i<arr.length; i++)			
		{
				for (int j =0; j<arr[i].length ; j++)		
				{
					arr[4-j][i] = (char)n;
					n++;			
				}
		}
			
			
        //전체 요소 출력
		for (int i=0; i<arr.length; i++)		
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);	
			}
			System.out.println();
		}

	}
}
*/
