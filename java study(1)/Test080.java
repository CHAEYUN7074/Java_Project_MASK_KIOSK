/*
����迭����
-�迭�� �迭(2���� �迭)
=============================
*/

public class Test080
{
	public static void main(String[] args)
	{
		//�迭�� �迭 ����� �ʱ�ȭ
		//���1

		int[][]arr1 =new int[3][3];

		//arr1[0]=1;
		arr1[0][0]=1;
		arr1[0][1]=2;
		arr1[0][2]=3;
		arr1[1][0]=4;
		arr1[1][1]=5;
		arr1[1][2]=6;
		arr1[2][0]=7;
		arr1[2][1]=8;
		arr1[2][2]=9;

		//���2
		int[][]arr2={{1,2,3},{4,5,6},{7,8,9}};

		//���3
		int[][]arr3=new int[3][3];
		int n=1;
		for(int i=0; i<arr3.length; i++) //��~~0 1 2   - ��
		{
			for(int j=0; j<arr3[i].length; j++) //������ 012 012 012 -�繫��
			{
			//�׽�Ʈ
			//System.out.println("i:"+i+",j:"+j);
			arr3[i][j]=n;
			n++;
			}
		}
		//�迭�� �迭 ��� ��ü ���
		for(int i=0; i<arr3.length; i++) //������ 012 012 012 -�繫��
			{
			for(int j=0;j<arr3[i].length;j++)
			{
				System.out.printf("%2d",arr3[i][j]);
			}
			System.out.println();
		}
	}
}


/*
 1 2 3
 4 5 6
 7 8 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/