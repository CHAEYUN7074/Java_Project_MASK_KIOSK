/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
/*
Queue�� FIFO ������ ���� �Էµ� �ڷḦ ���� ����ϸ�
ť �������̽��� ������ Ŭ������ ��� ���õ� �پ��� ����� �����Ѵ�

ť �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
new �����ڸ� �̿��Ͽ� ť �������̽��� ������(implements)
Ŭ������ �����ڸ� ȣ���Ѵ�

ex)Queue ob = new LinkedList();

���ֿ� �޼ҵ�
-E element()
 ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�
-boolean offer(E o)
������ ��Ҹ� ť�� �����Ѵ�
-E peek()
ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
ť�� �ڷᱸ���� ��Ƽ�� ��� null �� ��ȯ�Ѵ�
-E poll()
ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ� 
ť�� �ڷᱸ���� ��Ƽ�� ��� null �� ��ȯ�Ѵ�

-E remove
ť�� ��� ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
 
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		//Quere �ڷ� ���� ����
		//Queue my Queue = new Queue(); // �Ұ���..ť�� �ν��Ͻ��ϱ�
		Queue myQueue = new LinkedList<Object>(); //my ť�� ������Ʈ�� ��ڴ�
		
		//������ �غ�
		String str1 = "������";
		String str2 = "�����";
		String str3 = "�Ǽ���";
		String str4 = "��ҿ�";
		
		//myQue��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1); //str1�� ���� ������(?)�� ���� + ����� ������ �Ǿ��µ� true false ��ȯ
		myQue.offer(str2);
		myQue.offer(str3);
		myQue.offer(str4);

		System.out.prntln(myQue);
		//==> [������, �����, �Ǽ���, ��ҿ�] Ŭ�������� �����ϴ� ���� �����Ͱ� ���̴°� ���� �����Ͱ� �ƴ϶�
		//�̰ɷ� �����͸� ��Ʈ�� �Ϸ��� �ȵȴ�. (���̴� ������ ���� �� ������)
		//Ŭ������ �� �ؽ��ڵ�� ��µǾ����
		//Ŭ������ �� �濣 ��ü�� ����. 
		System.out.println(test);
		//==> true
		//ť��� �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " +(String)myQue.element());
									        //----------------object�� string���� ��ȯ
		System.out.println("��2 : " +(String)myQue.element()); //head��� ���� ���� �ʾƼ� �� ������ ����
										 
		//String[] arr = { "ȫ�浿", "�̼���", "������" };
			//           -------���ڿ� Ÿ��
					// 	------------------------------���ڿ� �迭 Ÿ��
	
		System.out.println();
		String val;

		//��
		//peek()
		//ť�� head��� ��ȯ. ���Ŵ� ����
		// ť�� empty �� ��� null ��ȯ
		/*
		while(myQue.peek() !=null)
		{
			//poll()
			//ť�� head ��� ��ȯ�ϰ� ������
			// ť�� empty �� ��� null ��ȯ
 			val = myQue.poll(); //���
			System.out.println("��� : " + val); //���+���� 
												 
		}
		System.out.println();
		// ��� : ������
		// ��� : �����
		// ��� : �Ǽ���
		// ��� : ��ҿ�
		*/
		
		/*
		//�׽�Ʈ : //���࿡ poll poll �̾��ٸ� 2���� �ϳ��� ��µ�
		while(myQue.poll() !=null)
		{
			val = myQue.poll(); //���
			System.out.println("��� : " + val); //���+���� 
			//��� : �����
			//��� : ��ҿ� 
		*/

		/*
		//�蹫�ѷ���
		while(true)
		{
			val = (String)myQue.poll();
			
			if(val==null)
				break;
			else
				System.out.println("��� : " +val);
		}
		System.out.println();
		*/
		
		//��
		while(!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
			
	}
}


����....