/*==========================================================
 ���� �迭 ����
 - �迭�� �迭(2���� �迭)
============================================================*
/// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
A	B	C	D	E
F	G	H	I	J
K	L	M	N	O
P	Q	R	S	T
U	V	W	X	Y
����Ϸ��� �ƹ� Ű�� ��������...
*/
public class Test087
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];
		char c = 'A';

		// �迭 ��� ä���ֱ�
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				arr[i][j] = c;
				c++;					
			}
		}
		
		// ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}
	}
}