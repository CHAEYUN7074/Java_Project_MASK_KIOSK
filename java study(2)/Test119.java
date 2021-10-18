/*========================================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����(����Ŭ����)
========================================*/
class Test2
{

	static int a = 10;									// ��������, Test2�� �������, static ����(Ŭ���� ����)
	int b = 20;											// ��������, Test2�� �������, instance ����

	void write() {										// ù ��° write() �޼ҵ�
		
		System.out.println("write()... 1��");
		final int c = 30;								// ��������, ���ȭ�� ����(���� ������ �ʴ� ��)
		int d = 40;										// ��������, ���� ���÷� ���� �� �ִ� ����


		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(local class, ���� Ŭ����)
		class LocalTest
		{

			void write() {								// �� ��° write() �޼ҵ�

				System.out.println("write()... 2��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				// System.out.println("d : " + d);       // ���� �߻�(������ ����)


			}

		}

		// �� ���� c �� ���� d �� �� �� ��������������...
		//    c �� final �����̱� ������
		//    �� ��° write() �޼ҵ忡�� ���� �����ϴ���(�����ϴ� ������ ������)
		//    ������ ������ ������� �� �ִ�.
		//    �ݸ鿡 d �� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//    LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//    ������� �� ���� ������ d �� �����ϴ� ���� ���ؾ� �ϴ� ���̴�.

		d = 10;

		LocalTest ob1 = new LocalTest();
		ob1. write();				// �� ��° write() �޼ҵ� ȣ��

		d += 10;

	}

}

public class Test119 
	{
	public static void main(String[] args) 
	{
		
		Test2 ob2 = new Test2();
		ob2.write();				// ù ��° write() �޼ҵ� ȣ��

	}

}

