/*========================================
  ���Ό��ó��  ���� (414p)
========================================*/
// ���� �ٽ� ������

public class Test148 {

	public static void main(String[] args) {

		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);  //�� ���ܹ߻�
			System.out.println("a : " + a); 
		}
		catch (Exception e) //�� �������
		{
			System.out.println("�� printStackTrace...........");
			e.printStackTrace();
		}

		
	}

	public int getData(int data) throws Exception // getdata���� �������� 45 getvalue���� ����
	{

		if(data < 0) {
			throw new Exception("data �� 0 ���� �۽��ϴ�.");
			// �� ���� �߻� -�����ų�/ try catch : 26���ϱ� ��������߳�
		}

		return data + 10;

	}
								// ����Ƴ� ���� �ٽ� ������ ���� �����ϵ��� ó��
	public int getValue(int value) throws Exception
	{

		int a = 0;

		try
		{
			a = getData(-1);		// �� ���� �߻�
		}
		catch (Exception e)			// �� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("�� printStackTrace.......");
			e.printStackTrace();

			// �� ��Ƴ� ���� �ٽ� ������ check~!!!
			throw e;
			// �ּ� ó�� ��(��, ��Ƴ� ���ܸ� �ٽ� ������ ���� ���)
			// getValue() �޼ҵ带 ȣ���ϰ� �ִ� main() �޼ҵ���
			// ���� ó�� ������ ������� �ʰ� �ȴ�.
		}

		return a;

	}

}









