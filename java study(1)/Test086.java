/*==========================================================
 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
============================================================*
/// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
 1	 2	 3	 4	| 10
 5	 6	 7	 8	| 26	
 9	10	11	12  | 42
13	14	15	16	| 58
------------------------
28	32	36	40	|136
*/

/*
public class Test086
{
	public static void main(String[] args)
	{
		int a[][] = new int[5][5];

			int n = 1;

			for (int i = 0; i < 4 ; i++ )
				{
				for (int j = 0; j < 4 ; j++ )
				{
					a[i][j] = n;
					n++;

					a[i][4] = a[i][4] + a[i][j];
					a[4][j] = a[4][j] + a[i][j];
					a[4][4] = a[4][4] + a[i][j];

				}    

			}

			for (int i =0; i < 5 ; i++ ){
				for (int j =0; j < 5 ; j++ ){
					System.out.print(a[i][j] + "\t");

				}
				System.out.println();
			}
		}
	}

*/


/*
public class Test086
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n=1;

		for (int i=0; i<5 ;i++ )
		{
			for (int j=0; j<5 ;j++ )
			{
				arr[i][j] = n;
				 n++;

				 if (j==4)
				 {
					 	 n--;
						 arr[i][4] = arr[i][0] + arr[i][1] +arr[i][2]+arr[i][3];
					 	 
				 }

				 if (i==4)
				
					 arr[4][j] = arr[0][j] + arr[1][j] + arr[2][j]+ arr[3][j];
				
			}	
			
		}

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
				
				System.out.printf("%3d",arr[i][j]);
				
			System.out.println();
		}
	}
}

*/
public class Test086
{
	public static void main(String[] args)
	{
		int a[][] = new int[5][5];

			int n = 1;

			for (int i = 0; i < 4 ; i++ )
				{
				for (int j = 0; j < 4 ; j++ )
				{
					n++;
					a[i][j] = n;
					a[i][4]+=arr[i][j]
					a[4][j]+=arr[i][j]
					a[4][4]+=arr[i][j]

					}    

			}

			for (int i =0; i < 5 ; i++ ){
				for (int j =0; j < 5 ; j++ ){
					System.out.print(a[i][j] + "\t");

				}
				System.out.println();
			}
		}
	}				

