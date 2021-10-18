/*
■■■배열■■■
-배열의 배열(2차원 배열)
=============================
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다

실행 예)
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9

*/
public class Test082
{
	public static void main(String[] args)
	{
		//배열선언+메모리 할당
		int[][]arr1=new int[5][5];
		int n=0;
		for(int i=0; i<arr1.length; i++)
		{
		n=i+1;
			for(int j=0; j<arr1[i].length; j++) 
			{
				arr1[i][j]=n;
				n++;
				
			}
		}
		//배열의 배열 요소 전체 출력
		for(int i=0; i<arr1.length; i++) 
			{
			for(int j=0;j<arr1[i].length;j++)
				System.out.printf("%2d",arr1[i][j]);
			System.out.println();
		}
	}
}
