/*
����Ŭ������ �ν��Ͻ�����
-������(constructor)
=============================
*/

class NumberTest2
{
	int num;

	/*
	NumberTest2()
	{
	}
	*/
	NumberTest2(int n)
	{
		num=n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " +n);
	}
	int getNum()
	{
		return num;
	}
}
public class Test070
{
	public static void main(String[] args)
	{
		//NumberTest2 Ŭ���� �ν��Ͻ� ����
		//NumberTest2 ob1=new NumberTest2();
		//������ ����
		//Nmber2 Ŭ��������
		//����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱⿡ default �����ڰ� �ڵ����� ���Ե��� ������
		//����� ���� �����ڴ� �Ű������� ���� �����̱� ������
		//���� ���� �Ű����� ���� ������ ȣ�� �� ������ �߻��ڡ�

		NumberTest2 ob1 = new NumberTest2(10);
		//������ ȣ�� �� �Ű����� ���� : 10
		System.out.println("�޼ҵ� ��ȯ �� : "+ob1.getNum());
		
		NumberTest2 ob2=new NumberTest2(5214);

		System.out.println("�޼ҵ� ��ȯ �� : "+ob2.getNum());
	}
}