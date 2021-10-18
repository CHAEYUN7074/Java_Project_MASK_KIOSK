/*========================================
  ���Ό��ó��  ���� (414p)
========================================*/

// �ٸ� ���� �ٽ� ������

public class Test149 
{
	public int getValue(int value) 
	{
		int a = 0;

		try
		{
			a = getData(-2);					//�� ���ܹ߻� ���� ���߹�
		}
		catch (Exception e)						//�� ���� ����
		{
			//�������� ó�� ��
			System.out.println("printStacktrace................");
			e.printStackTrace();
			//�� ���ο� ���� �߻� ��Ŵ(�Ķ� ���߹�) (cf) throw e --> ���� ����(e) �ٽ� ������
			throw new Exception("value�� �����Դϴ�.");
		}
		
		return a;
	}
	public int getData(int data) throws Exception //�� ���� ������ 
												  //   ���� ���߹�
	{
		if(data<0)
			throw new Exception("data�� 0���� �۽��ϴ�."); //�翹�ܹ߻�
														   // ���� ���߹�
		return data + 10;
	}

	public static void main(String [] args)
	{
		Test149 ob=new Test149(); //�ν��Ͻ� ����
		
		try
		{
			int a = ob.getValue(-1);   // ��� �߻� �Ķ� ���߹�
			System.out.println("a : " +a);
		}
		catch (Exception e) //�� ������Ƴ��� �Ķ� ���߹�
		{
			//�� ����ó�� �Ķ� ���߹�
			System.out.println("printStacktrace................");
			e.printStackTrace();
		}
		int a = ob.getValue(-1); //���� �޼ҵ忡 �������°� �Ķ� ���߹�
		System.out.println("a : " +a);
	}
}
		