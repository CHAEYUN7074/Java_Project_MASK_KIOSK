/*
����迭����
-�迭�� �迭(2���� �迭)
=============================
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test081
{
	public static void main(String[] args)
	{
		//�迭����+�޸� �Ҵ�
		int[][]arr1=new int[5][5];
		int n=1;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++) 
			{
				arr1[i][j]=n;
				n++;
			}
		}
		//�迭�� �迭 ��� ��ü ���
		for(int i=0; i<arr1.length; i++) 
			{
			for(int j=0;j<arr1[i].length;j++)
				System.out.printf("%3d",arr1[i][j]);
			System.out.println();
		}
	}
}