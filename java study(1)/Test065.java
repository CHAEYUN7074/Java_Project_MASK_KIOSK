/*Ŭ������ �ν��Ͻ�
*/
// ���簢�� Ŭ���� ����

/*
���簢���� ���̿� �ѷ� ���, Ŭ������ ǥ��
Ŭ������ ��ü�� �� ���簢��
Ŭ������ �Ӽ�   �� ����,����,����, �ѷ�, ����, ����, ����, �÷�
Ŭ������ ���   �� ���� ���, �ѷ� ���, ���μ��� �Է�, ��� ���

��ü�� ����    �� ������(�Ӽ�, ����)+���(����, ����)
	��                    ��                  ��
Ŭ������ ����  ��        ����       +       �޼ҵ�

class ���簢��
{
	//������(�Ӽ�, ����) �� ����
	int ����, ����;

	//���(����, ����) �� �޼ҵ�
	���μ��� �Է�()
	{
	}
	�ѷ� ���()
	{
	}
	���� ���()
	{
	}
	������()
	{
	}
}


*/
import java.util.Scanner;

class Rect  //���簢�� Ŭ���� ����
{
	//������(�Ӽ�, ����) �� ����
	int w,h;  //����, ����; ��������

	//���(����, ����) �� �޼ҵ�
	void input() //���μ��� �Է�() //�޼ҵ� �������� return���� �����ϱ� void
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		w=sc.nextInt(); //�������·� �޾ƿͼ� w�� ��ڴ�
		System.out.print("���� �Է� : ");
		h=sc.nextInt(); //�������·� �޾ƿͼ� h�� ��ڴ�
		
	}
	
	int calLength() //�ѷ��� ��ȯ�ؾ��ϱ⶧���� (�Ӽ��� �ѷ��� ���� ���� �������� �ʾҰ�)
	{
		//��������� ��ȯ�ϰ� �� ���� ���� �� �ʱ�ȭ
		int result=0;
		//������ ������ �� ä���ֱ�
		result = (w+h)*2;
		//���� ����� ��ȯ
		return result;
	}

	int calArea() // ���� ���(). �Ű����� �Ѱ����� �ʾƵ��ż�(?) ����ֵ� ��
	{
		int result=0;
		result = w*h;
		return result;
		
	}
	void print(int a, int l)//������() ������ ���� ���� a,l�� ���ؼ��� �Ű� ������ �ʿ���
	{
		System.out.println("���� : "+w);
		System.out.println("���� : "+h);
		System.out.println("���� : "+a);
		System.out.println("�ѷ� : "+l);
	}
}

/*
�ϳ��� �ڹ� ���Ͽ� ���� ���� Ŭ������ ���� �� �ִ�
������ public class�� �ϳ��� �� �� �ִ�
������ ������ ���� �̸���
�� public class�� �̸����� �����ؼ� �����ؾ��Ѵ�
�Ϲ������� �ϳ��� ���Ͽ� �ϳ��� Ŭ������ �����Ѵ�
���� ���� ���� Ŭ������ ����� ������ �������ϰ� �Ǹ�
���ο� ����� Ŭ������ �� ��ŭ Ŭ���� ������ �Ļ��ȴ�.
(�ǹ������� Ŭ������ �ϳ��� �����ϴ°� �Ϲ���)
*/
public class Test065
{
	public static void main(String[] args)
	{
		//Rect Ŭ���� �ν��Ͻ� ����
		Rect ob=new Rect();

		//������ �ν��Ͻ� ob�� Ȱ���Ͽ� �Է� �޼ҵ� ȣ��
		ob.input();

		//������ �ν��Ͻ� ob�� Ȱ���Ͽ� ���� ���� �޼ҵ� ȣ��
		//��޼ҵ� ȣ��� �� ���� ��Ƴ� �غ� (int�� �����ϱ� int�� �޾Ƶ��� �غ�)
		int area = ob.calArea();

		//������ �ν��Ͻ� ob�� Ȱ���Ͽ� ���� ���� �޼ҵ� ȣ��
		//��޼ҵ� ȣ��� �� ���� ��Ƴ� �غ� (int�� �����ϱ� int�� �޾Ƶ��� �غ�)
		int length = ob.calLength();

		//������ �ν��Ͻ� ob�� Ȱ���Ͽ� ���� ���� �޼ҵ� ȣ��
		//��޼ҵ� ȣ��� �� ���� ��Ƴ� �غ� (int�� �����ϱ� int�� �޾Ƶ��� �غ�)
		ob.print(area, length);
		
	}
}






import java.util.Scanner;

class Rect
{
	int w,h;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		w=sc.nextInt();
		System.out.print("���� �Է� : ");
		h=sc.nextInt();
		
	}
	int calLength()
	{
		int result=0; ��
		result = (w+h)*2;
		return result;
	}

	int calArea()
	{
		int result=0;
		result = w*h;
		return result;
		
	}
	void print(int a, int l)//������() ������ ���� ���� a,l�� ���ؼ��� �Ű� ������ �ʿ��ء�
	{
		System.out.println("���� : "+w);
		System.out.println("���� : "+h);
		System.out.println("���� : "+a);
		System.out.println("�ѷ� : "+l);
	}
}

public class Test065
{
	public static void main(String[] args)
	{
		Rect ob=new Rect();

		ob.input();

		int area = ob.calArea();

		int length = ob.calLength();

		//������ �ν��Ͻ� ob�� Ȱ���Ͽ� ���� ���� �޼ҵ� ȣ��
		//��޼ҵ� ȣ��� �� ���� ��Ƴ� �غ� (int�� �����ϱ� int�� �޾Ƶ��� �غ�)
		ob.print(area, length);
		
	}
}