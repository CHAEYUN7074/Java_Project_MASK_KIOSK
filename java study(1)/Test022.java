public class Test022
{
	public static void main(String [] args)
	{
		int a = 13, b = 7;
		int c,d,e;

		//���� �� ó��
		c = a & b;
		d = a | b;
		e = a ^ b;

		//��� ���
		System.out.printf("a&b : %d\n", c);
		System.out.printf("a|b : %d\n", d);
		System.out.printf("a^b : %d\n", e);

		//�������ڷ� ȥ�� ����!! ��Ʈ��� �������̴١�

	}
}
/*
a&b : 5
a|b : 15
a^b : 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/



/*00000000 �ΰ� �� �ڸ��� ������ 1 �ٸ��� 0, |�� or����, ^�� ������ 0 �ٸ���1
*/