/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
/*
��vector(����) --���� �� ������ �ʴ� �ڷᱸ��
�ڹ��� �ڷ� ���� ����� �����ϴ� Ŭ������ �� ���� �⺻���� Ŭ������
�迭�� ���������, �迭�� �޸� �ٸ� ������ ������ ���� ����
������ ��Ҹ� ���� �� ������, �����Ͱ� �������� �ڵ����� ���� ������
Ȯ���Ű�� �ȴ�.

����, ��ü ���۷����� �����ϱ� ������
jdk 1.5 ������ �ڹ� �⺻�� �����ʹ� ������ �� ��������
���ĺ��ʹ� ����ڽ�, �����ڽ� ����� �����Ǹ鼭
�⺻ ���������� ���� ��������

���� Ŭ������ �⺻ ������
������ ������ ������ ����ϸ�
������ ������ ������ �������� �ε��� ���� ���� ��ġ�� �����ϰ� �ȴ�\
���� �ڷ� ������ �� ���ܿ����� ������ ������ ť��
���� �������� ������ ������ ���ð� �޸�
������ ������ �ε��� ���� �̿��Ͽ� �ڷᱸ���� ������ ��������
���� �� ���ٱ� �����ϴ�

������ ������ ������
List �������̽��� ���� �����ް� �ֱ� ������
List �������̽��� ��� �޼ҵ带 ����� �� �ִ�.

-void add(int index, E element)
-void insertElementAt(E obj, int index)
//�����ϰ��� �ϴ� obj�� ��ġ�� add�� insert�� �޶� ���� �򰥸���..
�־��� ��ġ�� ��ü�� �����Ѵ�
�־��� ��ġ�� ��ü���� ������ �ϳ��� �̵��Ѵ�

-void addElement(E obj)
-boolean add(E e)
��ü�� ���� ���� �߰��Ѵ�

-void removeElement(object obj)
-E remove(int index)
�־��� ��ġ�� ��ü�� �����Ѵ�
���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��Ѵ�
E remove(int index) �޼ҵ�� ����Ǿ��� ��ü�� ��ȯ�Ѵ�.

 - boolean removeElement(Object obj)
 - boolean remove(Object obj)

 : ��� ��ü�� �����Ѵ�.
  ���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��Ѵ�.
  ��ü�� ���������� ���ŵǾ����� true �� ��ȯ�Ѵ�.

- void removeAllElement()
- void clear()

: ������ ��� ��Ҹ� �����Ѵ�.

- void setElementAt(E obj, int index)
- E set(int index, E element)

: ������ index ��ġ�� �־��� ��ü�� �����Ѵ�.
�־��� ��ġ�� ����Ǿ� �ִ� ��ü�� �Ҹ��Ѵ�.(�� ������� ����)

- E elementAt(int index)
- E get(int index)
: �־��� ��ġ�� ����� ��ü�� ��ȯ�Ѵ�.

- Enumeration<E> elements()
: ������ ��� ��Ҹ� ��ȯ�Ѵ�.

- int indexOf(Object o)
: �־��� ��ü�� ����� ��ġ�� ��ȯ�Ѵ�.
�������� ���� ��� ���������� ��ȯ�Ѵ�.

- int indexOf(Object o, int index)
: �־��� ��ü�� ����� ��ġ�� index ��ġ���� ã�Ƽ� ��ȯ�Ѵ�.
index ��ġ�� ��ĵ�� �����ϴ� ��ġ.

- boolean contains(Object o)
���Ͱ� �־��� ��ü�� �����ϰ� �ִ����� ���θ� ��ȯ�Ѵ�.

- void ensureCapacity(int minCapacity)
: ������ �뷮�� �־��� ũ�⺸�� ũ���� �����Ѵ�.

- E firstElement()
: ������ ù ��° ����� �����͸� ��ȯ�Ѵ�.

- E lastElement()
: ������ ������ ����� �����͸� ��ȯ�Ѵ�.

- void setSize(int newSize)

: ������ ũ�⸦ �����Ѵ�.
���� �־��� ũ�Ⱑ ���� ũ�⺸�� �۴ٸ� �������� ������.
�ݴ�� �־��� ũ�Ⱑ ���� ũ�⺸�� ũ�ٸ�
�� ������ null ��ü�� ä��� �ȴ�. (��ü�� �������� ������ �ǹ�)

- int capacity()
: ���� ������ �뷮�� ��ȯ�Ѵ�.

- int size()
: ���� ���Ϳ� ����� ��ü�� ����(size)�� ��ȯ�Ѵ�.

- int trimToSize()
: ������ �뷮�� ����� ��ü�� ������ �µ��� �ּ�ȭ�Ѵ�.

�� ȣȯ�� ���� ���ܵ����� �߾Ⱦ��� �ڷᱸ���̴�.

*/

import java.util.Vector;

public class Test154
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
		
	public static void main (String[] args)
	{
		int i;
		String str;

		//vector �ڷᱸ�� v ����
		Vector<Object> v = new Vector<Object>();
		//v ��� ���� �ڷᱸ����
		//colors �迭�� ����ִ� ������ ��Ƴ���
		//add()
		for(i=0; i<colors.length ; i++)
		{
			v.add(colors[i]);
		}	
		
		//������(���) �߰�->�� �ڿ� �߰��ǰ� �ȴ�(add�� addElement��)
		//addElement()
		v.addElemnet("�Ͼ�");


		//firstElement()
		str = (String)v.firstElement();
		System.out.println("ù ��° ��� : " + str);

		//get()
		str = (String)v.get(1);
		System.out.println("�� ��° ��� : " + str);

		//get()
		str = (String)v.get(0);
		System.out.println("ù ��° ��� : " + str);

		//elemnetAt()
		v.elementAt(1);
		System.out.println("�� ��° ��� : " + str);
		
		//lastElemnet()
		str = (String)v.lastElemnet();
		System.out.println("������ ��� : " + str);
		
		//��ü ��� ��� �� ��ü ��� ���� �� check!
		// Iterator(���ͷ�����)�� ���� ��ü ���

		// hasNext() : ���� ������ ��Ұ� �ִ����� ���θ� ��ȯ.

		// next()    : ���� ������ ��Ҹ� ���������� ��ȯ.

		Iterator<object> it = v.iterator()
		
	}
}