/*========================================
  ���� �߻� Ŭ����(Abstract) ����
  - �̿ϼ��� Ŭ����
========================================*/
/*

�� �߻� Ŭ����(Abstract)��
   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ�������� �������̵�(Override)�� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

�� ���� �� ����
  [ �������������� ] abstract class Ŭ������
  {
	  [ �������������� ] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
	  
  }

�� Ư¡
   
   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �տ� [ abstract ] Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ�, �߻� Ŭ������ ������ ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.

   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   ����� ���ؼ��� �����ϸ�
   �߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵�(Override)�ؾ� �Ѵ�.

�� [ abstract ] Ű�����
   Ŭ������ �޼ҵ忡���� ����� �� ������
   ��� ������ ���� ���������� ��� �Ұ����ϴ�.
  

*/

// �߻� Ŭ����
abstract class SortInt111
{

	private int[] value;

	protected void sort(int[] value) 
		{
		this.value = value;
		sorting();
		}
	
	// �߻� �޼ҵ�
	protected abstract void sorting();

	protected int dataLength() 
		{
		return value.length;
		}

	protected final int compare(int i, int j) 
		{
		int x = value[i];
		int y = value[j];

		if(x == y) 
			return 0;
		else if(x > y) 
			return 1;
		else
			return -1;
		}
	
	protected final void swap(int i, int j) 
		{
		
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;

		}

}
//Sort111(�߻�Ŭ������) ��ӹ��� Ŭ���� ->�ϴ� �߻� Ŭ����
public class Test111 extends SortInt111 
{

	int i, j;
	static int[] data = {7, 10, 3, 8, 7};
	
	@Override
	protected void sorting()  //������
	{
		// selection sort
		for(i = 0; i < dataLength()-1; i++) 
		{
			for(j = i + 1; j < dataLength(); j++) 
			{
				// �ڸ� �ٲ�
				if(compare(i, j) == 1) 
				swap(i, j);
			}
		}
	}

	public static void main(String[] args) 
		{
		System.out.print("Source Data : ");
		for(int n : data) //data �ϳ��� ������ n���ٰ� ���
		{
			System.out.print(n + " ");
		}
		System.out.println();
		
		Test111 ob = new Test111();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for(int n : data) 
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
