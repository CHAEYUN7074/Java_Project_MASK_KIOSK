/*
����迭����
-�迭�� �迭(2���� �迭)
=============================
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
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
		//�迭����+�޸� �Ҵ�
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
		//�迭�� �迭 ��� ��ü ���
		for(int i=0; i<arr1.length; i++) 
			{
			for(int j=0;j<arr1[i].length;j++)
				System.out.printf("%2d",arr1[i][j]);
			System.out.println();
		}
	}
}
