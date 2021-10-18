/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
/*
��List �������̽�
-������ ����, �迭�� ����, ������ ���
-�ֿ� ���� Ŭ����
Vector(����ȭ ����)
ArrayList(����ȭ �������� ����)
LinkedList(ü��,��ũ,����)

*/
import java.util.*;

public class Test162
{
	public static void main(String[] args)
	{
		List<String>list = new ArrayList<String>();
		
		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		list.add("�뱸");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		//����üũ
		System.out.println(list);

		System.out.println("��ü ���� : " + list.size());

		//ù ��° ��� ���
		System.out.println("ù ��° ��� : " + list.get(0));
		//������ ��� ���
		System.out.println("������ ��� : " + list.get(list.size()-1));
		//ó�� ��ġ�� ���� �߰�
		list.add(0,"����"); //�ε���(0) �ְ� �ѱ�� �ش� ��ġ��
		//����üũ
		System.out.println(list);

		//ó�� ��ġ�� ������(���)�� "���ѹα�"���� ����
		//����°� add�� �ƴ϶� set
		list.set(0,"���ѹα�");
		//����üũ
		System.out.println(list);

		//���� ���� ���� Ȯ��
		if(list.contains("����")) //constains��� �޼ҵ�
			System.out.println("������ �����մϴ�."); //������ ��� �ȵ�
		
		//���ѹα� �����
		//list.remove("���ѹα�"); //�׽�Ʈ ���ؼ� �ּ�ó��
		list.remove(0); //�̷��� ó���ص� ��

		System.out.println(list);
		
		//ArrayList �ڷᱸ�� list�� ��ü ��� ���
		System.out.println("��ü ��� ���..1");
		for(int idx=0; idx<list.size();idx++);
		{
			System.out.println(list.get(idx)+ " "); //!!!!!
		}
		System.out.println();
		
		
		
		System.out.println("���� ���..2");
		for(int idx=list.size()-1; idx>=0;idx--);
		{
			System.out.println(list.get(idx)+ " ");
		}
		System.out.println();
		

		
		System.out.println("��ü ��� ���..3");
		for(String s : list); //��
		{
			System.out.print( s + " ");
		}
		System.out.println();
		
		
		System.out.println("��ü ���..4");
		Iterator<String> it =list.iterator();
		while(it.hasNext())
		{
			String s =it.next();
			System.out.print(s+ " ");
		}
		System.out.println();

		System.out.println("��ü ���..5");
		ListIterator<String> li =list.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+ " ");
		}
		System.out.println();
		
		
		System.out.println("�������..6");
		while(li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s+ " ");
		}
		System.out.println();
			
	}
}



//����!!!!!