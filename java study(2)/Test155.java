/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
/*
�� Vector v = new Vector(8);
   �� 8���� �ʱ� elements �� ���� Vector �ڷᱸ�� ����.
      8���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

�� Vector v = new Vector(3, 5);
   �� 3���� �ʱ� elements �� ���� Vector �ڷᱸ�� ����.
      3���� ��� ä������ �Ǹ� (���ڶ�� �Ǹ�) 5�� ����(Ȯ��)�ȴ�.

�� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ� ... ����
   ��Ƴ��� ���� �����ϴ�.

   �� ���� ��� �� ������ ������ Ȯ���ϴ� ���� �߿��ϴ� -- check~~!!!

*/
import java.util.Vector;
import java.util.Iterator;

//MyVector Ŭ���� ���� �� Vector Ŭ���� ���
class MyVector extends Vector<Object>
{
	//����� ���� ������
	MyVector()
	{
		//Vector(����Ŭ����) ������ ȣ��
		super(1,1);
		//ù ��° ���� : �־��� �뷮
		//�� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}
	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()

	{
		int length = size();
		System.out.println("���� ��� ���� : " + length);
		
		Object o;
		
		for(int i=0; i<length; i++)

			o = elementAt(i);
		for (int i=0; i<length; i++)

		{
			o = elementAt(i); //������Ʈ Ÿ��

			// ��instanceof�� ������ (������Ʈ�ΰ� �˰ھ� �ٵ� �»��� ����? Ȯ���ϴ°�)
			//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��

			if (o instanceof char[])  //���� Ŭ����(?)�� �ƴ϶� �����ڽ��� �ȵ�...�١١�
			{
				// System.out.println("���ڹ迭 : " + o.toString());
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o)); //char�迭�� ���ڿ��� �١١�
			    //                                                    ----------������Ʈ�� ĳ���� ���ڹ迭�� ����ȯ
				//						                 --------------string�� ���� copyValueOf�� �ִµ� �̰� ���ڹ迭�� ���ڿ��� �ٲٴ� �޼ҵ�                            														
				/*
				for(int i; i<(char[]o).length;1++)
				{
					Systme.out.println((char[]o)[i]);
				}
				*/
			
			}
			else if (o instanceof String)	//-- o�� StringŸ������ Ȯ���ϴ� ������
			       //--           -------
				  //�ѱ����    �»��� ���ڿ�
			{
				System.out.println("���ڹ迭 : " + o.toString()); //��Ʈ���� to ��Ʈ���̴ϱ� ������ ���ڿ���
			}
			else if (o instanceof Integer) //o �� ��Ƽ�� ������� ������� object��� ��
			{
				System.out.println("������ : " + o); //object�� ������ Ŭ������@�ؽ��ڵ�

			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else
			{
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!!!");
			}
		}
		/*
		Iterator<Object> it = this.iterator();	//<Object> Ȯ��
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//--==>> 5
		//       3.14
		//       �ȳ��ϼ���
		//       [C@6d06d69c

		
		*/
	 }
	}

public class Test155
{
	public static void main(String[] args)
	{
		//MyVector Ŭ���� ��� �ν��Ͻ� ����
		MyVector v = new MyVector();

		//�ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);			//-- ���� �ڷᱸ���� ���� ����
		v.addFloat(real);			//-- ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);				//-- ���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);	//-- ���� �ڷᱸ���� �迭�ּ�(�迭����ü������ߴ�) ����
		
		v.write();

	}
}