/*========================================
  ���� Ŭ���� ��� ����
  - �������̽�
========================================*/

//    ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

//    ���� ��)
//    �ο� �� �Է�(1~10) : 2
//    1��° �л��� �й� �̸� �Է�(���� ����) : 2108006 ������
//	  ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
//    2��° �л��� �й� �̸� �Է�(���� ����) : 2108024 ������
//	  ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

//    2108006 ������	90 100 85	275	91
//						�� ��  ��
//    2108024 ������	85 70  65   220 73
//                      �� ��  ��

import java.util.Scanner;


class Record
{
	String hak, name;			// �й� �̸�
	int kor, eng, mat;			// ���� ���� ���� ����
	int tot, avg;				// ���� ���(���ǻ� ����)
}

// �������̽�
interface Sungjuk
{
	public void set();		// �ο� �� ����
	public void input();	// �� ������ �Է�
	public void print();	// ��� ���
}

// �ڡ��ʿ��� Ŭ���� �����sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	int inwon;
	Record[] arr;
	String[] grade = {"��", "��", "��", "��", "��"};

	@Override
	public void set() 
		{
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = scan.nextInt();
		}
		while (1 > inwon || inwon > 10);
		arr = new Record[inwon];
		}

	@Override
	public void input() 
		{
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < inwon; i++) 
			{
			arr[i] = new Record();
			
			System.out.print((i + 1) + "��° �л��� �й� �̸� �Է�(���鱸��) : ");
			arr[i].hak = scan.next();
			arr[i].name = scan.next();

	
			System.out.print("���� ���� ���� ���� �Է�(���� ����) : ");
			arr[i].kor = scan.nextInt();		
			arr[i].eng = scan.nextInt();		
			arr[i].mat = scan.nextInt();		
				
			arr[i].tot += (arr[i].kor + arr[i].eng + arr[i].mat); //���� ���� ��
			arr[i].avg = arr[i].tot / 3; //���
			}		
		}

	@Override
	public void print() 
		{
		String kor, eng, mat;

		for(int i = 0; i < inwon; i++) 
			{
			kor = Sungjukgrade(arr[i].kor);
			eng = Sungjukgrade(arr[i].eng);
			mat = Sungjukgrade(arr[i].mat);
			
			System.out.printf("%s %s %d\t %d\t %d\t %d\t %d\t\n", arr[i].hak, arr[i].name, arr[i].kor, arr[i].eng, arr[i].mat, arr[i].tot, arr[i].avg);
			System.out.printf("\t \t %s\t  %s\t  %s\t\n", kor, eng, mat);												
			}
		}

	private String Sungjukgrade(int n) 
		{
		String result;

		if(n >= 90) 
			result = grade[0];
		else if(n >= 80) 
			result = grade[1];
		else if(n >= 70) 
			result = grade[2];
		else if(n >= 60) 
			result = grade[3];
		else
			result = grade[4];
				
		return result;

		}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test117 
	{
	public static void main(String[] args) 
	{
		SungjukImpl ob = new SungjukImpl();
		// �ʿ��� ob ����
		ob.set();
		ob.input();
		ob.print();

	}

}
