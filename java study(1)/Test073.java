/*
����Ŭ������ �ν��Ͻ�����
-������(constructor)�� �ʱ�ȭ ��(initialized bolck)
=============================
*/

public class Test073
{	
	//int n=100;
	//int m=200;
	int n;
	int m;

	//Ŭ���������� ������ �ϴ� ���� ��Ģ������ �Ұ��ؼ� {}�ȿ� �־ �ؾ��Ѵ�
	// �� ���� �ʱ�ȭ ���̶�� �Ѵ�
	{
		n=100;
		m=200;
		System.out.println("�ʱ�ȭ �� ����...");

	}


	//������(Constructor)
	Test073()
	{
		n=1000;
		m=2000;
		System.out.println("������ ����...");
	}

	//������(Constructor)
	Test073(int n, int m)
	{
		n=100;
		m=200;
		System.out.println("�Ű����� �ִ� ������ ����...");
	}


	//��� �޼ҵ� ����
	void write()
	{
		System.out.println("n:"+n+",m"+m);
	}
	public static void main(String[]args)
	{
		Test073 ob1=new Test073();
		//�ʱ�ȭ �� ����
		ob1.write();
		//n:1000, m:2000

		Test073 ob2=new Test073(1234,5678);

		ob1.write();


		}

	}
