/*==========================================================
 ���� ����޷¡���
============================================================
���� ��)
���������� �Է��ϼ��� : 2021
�������� �Է��ϼ��� : 8

	[2020�� 8��]
��	��	ȭ	��	��	��	��
===========================
 1	 2	 3	 4	5	6	7
 8	 9	10	11	12	13	14
15	16	17	18	19	20	21
29	30	31
===========================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

public class Test101 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int y, m, day;
		int[] days;

		//�Է¹޾� ��������
		System.out.print("���������� �Է��ϼ��� : ");
		y = scan.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		m = scan.nextInt();

		String[] weekNames = {"��", "��", "ȭ", "��", "��", "��", "��"};

		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int nalsu;
		
		// ���� ��� ����
		if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) 
			{
			months[1] = 29;
			}
		else 
			{
			months[1] = 28;
			}
		//���� ���� 12�� 31�ϱ����� �� ��
		nalsu = ((y - 1) * 365) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400);
		
		//���� �������� �� ��
		for(int i = 0; i < (m - 1); i++) 
			{
			nalsu += months[i];
			}
		
		day = months[m-1]; //�ش� ���� �� �� ���

		days = new int[day];  //days �迭�� �ش� �� ������ŭ ���� Ȯ��(ĭ �����)
		
		for(int i = 0; i < days.length; i++) //days �迭�� 1~������������ ���
			{
			days[i] += i + 1;		
			}

		day = (nalsu % 7) + 1; //1���� ���� ��������..day�� ���

		
		System.out.printf("    [%d�� %d��]   \n", y, m);
		System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("====================");
		
		for(int i = 0; i < day; i++) 
			{
			System.out.print("   ");  // Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
			}
		for(int i = 0; i < days.length; i++) 
			{
			System.out.print(days[i] + " "); // 11	12	13 ��¥�� ������ ����

			if(days[i] < 10)
				{
				System.out.print(" "); //_1 _2 _3 _4 _5 _6 _7 _8 _9 ��� ���� �Էµǵ���
				}

			if((day+i+1) % 7 == 0) //���ٿ� 7��(7��) �ǵ��� ����
				{
				System.out.println();
				}
		}
		System.out.println();
	}
}
