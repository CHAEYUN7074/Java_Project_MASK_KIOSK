/*==========================================================
 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
============================================================*
/// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
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

		//�迭����+�޸� �Ҵ�
		char[][] alphabets = new char[5][5];	//5�� 5���� �������迭 ����
		char ch = 'A';	//���ĺ��� �ƽ�Ű�ڵ�� ������Ű�� ���� ���� ����
			
		//�迭�� �迭 �� �濡 ������(���) ��Ƴ���
		int n=65;

		for (int i=0; i<5; i++)			
		{
				for (int j =4; j>=0 ; j--)		
				{
					alphabets[j][i] = (char)ch++;			
				}
		}
        //��ü ��� ���
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
		//�迭����+�޸� �Ҵ�
		int[][] arr = new int[5][5];

		//�迭�� �迭 �� �濡 ������(���) ��Ƴ���
		int n=65;

		for (int i=0; i<arr.length; i++)			
		{
				for (int j =0; j<arr[i].length ; j++)		
				{
					arr[4-j][i] = (char)n;
					n++;			
				}
		}
			
			
        //��ü ��� ���
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
