//Ŭ������ �ν��Ͻ�

//CricleTest.java ���ϰ� ��Ʈ
/*
���� ���̿� �ѷ� ���ϱ�
���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�
Ŭ������ : CircleTest

���� ���� = ������ * ������ *3.141592
���� �ѷ� = ������ * 2 *3.141592

���� ��)
������ �Է� : 13

�������� 13�� ����
���� : 
�ѷ� : 
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.io.IOException;
public class Test066
{
	public static void main(String[] args)throws IOException
	{
		// CircleTest Ŭ���� �ν��Ͻ� ����
		CircleTest ct=new CircleTest();

		//������ �ν��Ͻ� ct�� Ȱ���Ͽ� �Է� �޼ҵ� ȣ��
		ct.input();

		//������ �ν��Ͻ� ct�� Ȱ���Ͽ� ���� ���� �޼ҵ� ȣ��
		//��޼ҵ� ȣ��� �� ���� ��Ƴ� �غ� 
		double a = ct.calArea();

		//������ �ν��Ͻ� ct�� Ȱ���Ͽ� ���� ���� �޼ҵ� ȣ��
		//��޼ҵ� ȣ��� �� ���� ��Ƴ� �غ� 
		double l = ct.calLength();

		//������ �ν��Ͻ� ct�� Ȱ���Ͽ� ��� �޼ҵ� ȣ��
		ct.print(a, l);
		
	}
}

