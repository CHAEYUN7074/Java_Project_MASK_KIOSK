/*
����Ŭ������ �ν��Ͻ�����
-�迭�� �⺻�� Ȱ��
=============================
������ �������� ����ִ� �迭�� ���� �����͵� ��
¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ�
���α׷��� �����Ѵ�

�迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8

���� ��)
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
��Ȥ�Ϸ��� �ƹ� Ű�� ��������...
*/


public class Test075
{
	public static void main(String[] args)
	{
		//�迭 ����
		//��� 1
		/*
		int[ ] arr=new int[9];//int arr[]
		arr[0]=4;
		arr[1]=7;
		arr[2]=9;
		arr[3]=1;
		arr[4]=3;
		arr[5]=2;
		arr[6]=5;
		arr[7]=6;
		arr[8]=8;
		*/

		//���2
		int[]arr={4,7,8,1,3,2,5,6,8};
		
		//System.out.println(arr);

		//�Ϲ����� ������ ��� ������ ����ϴ� ����(���)���δ�
		//�迭�� ��� �����͵��� ����� �� ����
		System.out.println("�迭 ��� ��ü ���");
		for(int i=0; i<9 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//�׽�Ʈ
		int[] arr2={4,7,9,1,3,2,5,6,8,4,7,9,1,3,2,5,6,8,4,7,9,1,3,2,5,6,8};
		//System.out.println(arr2[3]); //4��° ���� ��µ�
		for(int i=0; i<27;i++)
		{
			System.out.println(arr2[i]+"");
		}
		//�迭 arr2�� ����(���� ����) Ȯ��
		//System.out.println("arr2.length : "+arr2.length); //���赵.�Ӽ�

		System.out.println("�迭 ��� ��ü ���");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[1]+" ");
		System.out.println();

		System.out.println("¦�� ������ ���");
		for (int i=00;i<arr.length ;i++ )
		{
			if(arr[i]%2==0) //i��° ��Ұ� ¦�����
			{
				System.out.print(arr[i]+"");
			}
		System.out.println();


		}
		System.out.println("3�� ��� ������ ���");
		for (int i=0;i<arr.length ;i++ )
		{
			if(arr[i]%3==0)
			{
				System.out.print(arr[i]+"");
			}
		System.out.println();

	}
}





// ������ �������� ����ִ� ���迭�� ���� �����͵� ��
// ¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ�
// ���α׷��� �����Ѵ�.

// �迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8

// ���� ��)
// �迭 ��� ��ü ���
// 4 7 9 1 3 2 5 6 8
// ¦�� ������ ���
// 4 2 6 8
// 3�� ��� ������ ���
// 9 3 6
// ����Ϸ��� �ƹ�Ű�� ��������...

public class Test075
{
	public static void main(String[] args)
	{
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		System.out.println("�迭 ��� ��ü ���");
		for (int i = 0; i<=8 ; i++ )
		System.out.printf("%d ", arr[i]);
		System.out.println();		

		System.out.println("¦�� ������ ���");
		for (int i = 0; i<=8 ; i++ )
		{
			if (arr[i]%2==0)
				System.out.printf("%d ", arr[i]);
		}
		System.out.println();

		System.out.println("3�� ��� ������ ���");
		for (int i =0; i<=8 ; i++ )
		{
			if (arr[i]%3==0)
				System.out.printf("%d ", arr[i]);
		}
		System.out.println();


	}
}

// ���� ���
/*
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
