/*========================================
  ���Ό��ó��  ���� (414p)
========================================*/
//test146�� ��

class Demo2
{

	private int value;
                                 // �� �˰ھ� ���߹��� ������ ������
	public void setValue(int value) throws Exception 
		{
		if(value <= 0) 
		{

			// ���� ��ü�� ����ڴ�. ���߹� ������ ���⼭ �ع��� ��
			// ��
			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.");

		}

		this.value = value;

	}

	public int getValue() {
		
		return value;

	}

}

public class Test147 {
										   // �� �̰� ���ϸ� 44 set value�� ���߹��̴ϱ� �̷��� �ϴ���
	public static void main(String[] args) // throws Exception 
	{

		Demo2 ob = new Demo2();

		// �� �ƴϸ� try catch�� ��Ƴ�����
		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println("main() ���� ��Ƴ� ����");
			System.out.println(e.toString());
		}
		
	

	}

}








