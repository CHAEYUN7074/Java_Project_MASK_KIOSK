/* ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
-�ݺ���(for��) �ǽ�
-���� for��(�ݺ����� ��ø)�� Ȱ���� ������ ��� �ǽ�
====================
���� ��)
[2��]
2*1=2
2*2=4
2*3=6
 :
2*9=18

[3��]
3 x 1 = 3
3 x 2 = 6
 ...
3 x 9 = 27

[9��]
9 x 1 = 9
9 x 2 = 18
 ...
9 x 9 = 81
����Ϸ��� �ƹ� Ű�� ��������...
*/


public class Test054
{
	public static void main(String[]args)
	{


		/*
		// ���� ����
		int i, j;

		// ��~ ��~
		for(i =2; i <= 9; i++) {
			System.out.println("===[" + i + "��]===");
			// ��~ ��~
			for(j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		*/

	

		// �� Ǯ��
		for(int i = 2; i <= 9; i++) {
		
			System.out.println("===[" + i + "��]===");

			for(int j = 1; j <= 9; j++) {

				System.out.println(i + " X " + j + " = " + (i * j));

			}
			System.out.println();
		}

	}
}

