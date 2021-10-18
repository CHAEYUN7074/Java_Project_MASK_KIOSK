/*==========================================================
 ���� �޼ҵ� �ߺ�����(Method Overloading) ����
============================================================
�� �޼ҵ� �����ε� ����(�����ڡڡڡڿ������̵��̶� ��� ȥ������)
�޼ҵ� �����ε��̶� 
�޼ҵ尡 ó���ϴ� ����� ����
�޼ҵ� ��ȣ �ӿ� ���� �μ�(����,�Ű�����,�Ķ����)�� ������ �ٸ��ų�
�ڷ���(data type)�� �ٸ� ���
�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
���������� ����ϰ� �Ǵµ�
�̸� �޼ҵ� �����ε��̶�� �Ѵ�.
*/

public class Test099
{
	public static void main(String[] args)
	{
		drawLine();

		//--==>> ====================

		drawLine('-');

		//--==>> --------------------

		drawLine('+');

		//--==>> ++++++++++++++++++++

		drawLine('>', 30);

		//--==>> >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	}

	// ���� �׸��� �޼ҵ� ����
	
	public static void drawLine()
	{
		System.out.println("===================="); //'=' 20EA
	}

	// ���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	/*
	public static void drawLine()
	{
		System.out.println("+++++++++++++++++++");
	}
	*/

	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		System.out.print(c);
		System.out.println();

	}
	// ���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(c);
		System.out.println();
	}
}



