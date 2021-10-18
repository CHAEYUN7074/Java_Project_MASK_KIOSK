/*==========================================================
 ���� Ŭ���� �ν��Ͻ� ����
 ���� ���а� ��������������
============================================================*
����ڷκ��� ��, ��, ���� �Է¹޾�
�ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�
��, �޷� Ŭ������ ������� �ʴ´�
���� Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
�迭�� ���䵵 ������� �ۼ��Ѵ�
���������������� ���䵵 Ȯ���Ͽ� �ۼ�
����������
weekDay Ŭ���� ���踦 ����
Test095Ŭ���� main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�

���� ��)
�� �� �� �Է�(���� ����) : 1996 8 16
1996�� 8�� 16�� �� x����
*/
import java.util.Scanner;

class WeekDay 
	{
	// �ֿ� ���� ����
	private int y, m, d;		// ����ڰ� �Է��� ��, ��, ���� ��Ƴ� ����
	// �޼ҵ� ����(�Է�)
	public void input() 
		{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� �Է�[���� ����] : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		}

	// �޼ҵ� ����(���� ����)
	public String week() 
		{
		//�� ���� �ִ밪
		int[] months ={31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// ���� �̸��� ���� �迭 ����
		String[] weekNames = {"��", "��", "ȭ", "��", "��", "��", "��"};
		// �� ���� ������ ����
		int days;
		
		//2�� ���� �������� �����ϱ�
		if((y % 4 == 0  && y % 100 != 0) || y % 400 == 0) // ���� (4�� ����̸鼭 100�� ����� �ƴϰų� 400�� ����̸� ����) 
		{
		months[1] = 29;		// �����϶� 2��
		}
		else // ���
		{		
		months[1] = 28;		// ����϶� 2��
		}


		//������ ���� ��¥ ��
		// �Է������⵵*365 + �Է������⵵/4 - �Է������⵵/100 + �Է������⵵/400
		//�� 2021�� 1�� 1���� ������ ����Ϸ��� 2020�� 12��31�ϱ����� �� ���� ����ؾ��Ѵ�.

		days = ((y - 1) * 365) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400);  //���ڹٿ��� ���� �������� 0.xx �Ҽ������� ��Ÿ���� �ʰ� �׳� 0ó��
		//��)   2020������� ��	  ------------------------------    ------------
		//                    4�� ����̸鼭 100�� ����� �ƴ� ��	400�� ����� �Ϸ� �� �ϱ�
		
		//���� ���� ��¥ ��
		// �Է¹��� ���� ���� �� ������ �� �� ��� �� ��� ����� 1�� ����� ����
		for(int i = 0; i < (m - 1); i++) 
			{
			days += months[i];
			}
		// �Է¹��� ���� ��¥��ŭ �� �� ��� �� ����� �����ϴ� ����
		
		//�Ͽ� ���� ��¥ ��
		days += d;
		//���� Ȯ��
		int ob = days % 7;		// ��ü���� % 7 == 0 ���Ͽ���
								// ��ü���� % 7 == 1 �� ������
								// ��ü���� % 7 == 2 �� ȭ����

		//���ڿ� �迭 weekNames �迭
		return weekNames[ob];
		}

  // �޼ҵ� ����(��� ����ϱ�)
	public void print(String day) //������ �տ� �����Ѱ� ������ �Ѱ� �޾ƾ� ��
		
		{
		System.out.printf("%d�� %d�� %d�� -> %s����\n", y, m, d, day);
		}
	}


public class Test095
	{
	public static void main(String[] args) 
		{
		//�ν��Ͻ� ����
		WeekDay ob = new WeekDay();

		// �Է� �޼ҵ� ȣ��
		ob.input();
		
		// ���� ���� �޼ҵ� ȣ�� �� ��� Ȯ��
		String result = ob.week();

		// ��� �޼ҵ� ȣ��
		ob.print(result);

		}
	}


	/*
	import java.util.Scanner;

class WeekDay
{
	// �ֿ� ���� ����
	private int year;
	private int month;
	private int day;

	// �޼ҵ� ���� �� �Է¹ޱ�(input)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �� �� �Է�(���� ����) : ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	// �޼ҵ� ���� �� ���� �����ϱ�(week)
	public String week()
	// public void week()
	{
		// �� ���� ������ ��¥(�� ���� �ִ밪)�� �迭 ���·� ����
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// �׽�Ʈ
		// System.out.println(months.length);
		//--==>> 12

		// ���� �̸��� ���� �迭 ����
		String[] weekNames = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// �� ���� ������ ����
		int nalsu=0;

		for (int i=1; i<year; i++)
		{
			if (year%4==0 && year%100!=0 || year%400==0)
			{
				nalsu += 1;
			}
			nalsu += 365;
		}

		for (int i=0; i<month-1; i++)
		{
			if (year%4==0 && year%100!=0 || year%400==0)
			{
				months[1] = 29;
			}
			else
			{
		*/