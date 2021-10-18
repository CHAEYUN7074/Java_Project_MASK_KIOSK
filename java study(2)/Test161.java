/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
//List �� Vector, ArratList,...
//��������
//�迭�� ����
//�ߺ� ���

/*
�� ArrayList Ŭ����
- ArrayList �� Vector Ŭ������
List�� ũ�� ������ ������ �迭�� ������ ������
�������� vector Ŭ������ ��ü�� �⺻������ ����ȭ ������,
ArrayList�� �׷��� �ʴٴ� ���̴�.

-�񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
��������� �÷����� �������� �ʴ� ���α׷�������
�Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�,
ArrayList�� ����ȭ�� ������� ���� vector ó�� ���������ν� ������ ����ȭ��
������ �δ��� ������ �ʱ� ������
vector ���� �� ������ ����ȴ�

-null�� ������ ��� ��Ҹ� ����ϸ�
List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.

*/
import java.util.*;

public class Test161
{
	public static void main(String[] args)
	{
		//ArrayList �ڷᱸ�� �ν��Ͻ� ����
		//ArrayList<String>list = new ArrayList<String>();
		//Vector<String>list = new Vector <String>();
		//List<String> list = new Vector <String>();
		List<String> list1 = new ArrayList <String>();


		//list1�� ��� �߰� �� add()
		list1.add("���̺꽺�ƿ�");
		list1.add("�μ���");
		list1.add("���ͽ��ڶ�");
		
		//ArrayList �ڷᱸ�� �ν��Ͻ� ����
		List<String> list2 = new ArrayList<String>(list1);
		//list1�� �°��ϰ� �𰡵� �߰�

		//list2 �� ��� �߰�
		list2.add("�𰡵�");

		//ArrayList �ڷᱸ�� �ν��Ͻ� ����
		List<String> list3 = new ArrayList<String>();

		//list3�� list2 �� ��ü ��� �߰� �� addAll();
		list3.addAll(list2);

		//�μ��� �տ� �г��� ���� �߰�
		//1)�μ��� ã�� ��indexOf() ����ġ�� �ε��� ��ȯ
		int n = list3.indexOf("�μ���");

		//2) �μ��� ã�� �ε��� ��ġ�� �г��� ���� ����
		list3.add(n, "�г��� ����");
		//�׳� add �ϸ� �� �ڿ� �ٴµ�, n�� �־� ���°���� ���� �� �־�)

		//��� -> ���̵����� Ȯ��
		System.out.println("======================");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		System.out.println();
		//��� ->listIterator()�޼ҵ� Ȱ���Ͽ� ���
		System.out.println("======================");
		ListIterator<String> li = list3.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();

		System.out.println();
		//���->�������� ���
		System.out.println("======================");
		while(li.previous());

	}
	System.out.print();
}

����!!!