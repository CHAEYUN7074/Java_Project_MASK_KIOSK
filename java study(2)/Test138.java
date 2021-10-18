/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Calendar Ŭ����
========================================*/
/*

�� Calendar Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
   (�߻� Ŭ���� : �̿ϼ��� Ŭ����)

   Calendar cal = new Calendar();
   -> �̿� ���� ������ ���� �ν��Ͻ� ������ �Ұ�


�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� 3���� ���

   1. Calendar cal = Calendar.getInstance();	-> ���� �޼ҵ�(static Ŭ����)

   2. Calendar cal = new GregorianCalendar();	-> �ڽ� ĳ������ �ҷ� �� ĳ����

   3. GregorianCalendar cal = new GregorianCalendar();

   ( �� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)

   

*/

// ��, ��, ��, ������ Calendar Ŭ�����κ��� �����ͼ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138 {

	public static void main(String[] args) {

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		// Calendar rightNow = new Calendar();		-> ���� �Ұ�
		Calendar rightNow = Calendar.getInstance();

		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� -> [ get() ]
		int y = rightNow.get(Calendar.YEAR);
		System.out.println(y);
		// 2020
														// check~!!!
		int m = rightNow.get(Calendar.MONTH) + 1;		// ������ ���� [ + 1 ]	
		System.out.println(m);							// ������ ���� [ - 1 ]
		// 8

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		// 27

		int w = rightNow.get(Calendar.DAY_OF_WEEK);		// �� �� ȭ �� �� �� ��
		System.out.println(w);
		// 5
		

		// �׽�Ʈ(Ȯ��)
		/*
		System.out.println(Calendar.SUNDAY);			// 1	-> �Ͽ���
		System.out.println(Calendar.MONDAY);			// 2	-> ������
		System.out.println(Calendar.TUESDAY);			// 3	-> ȭ����
		System.out.println(Calendar.WEDNESDAY);			// 4	-> ������
		System.out.println(Calendar.THURSDAY);			// 5	-> �����
		System.out.println(Calendar.FRIDAY);			// 6	-> �ݿ���
		System.out.println(Calendar.SATURDAY);			// 7	-> �����
		*/

		System.out.println(y + "-" + m + "-" + d + " " + w);
		// 2020-8-27 5

		String week = "";
		switch(w) 
		{

			// case 1 : week = "�Ͽ���"; break;
			case Calendar.SUNDAY : week = "�Ͽ���"; break;
			
			// case 2 : week = "������"; break;
			case Calendar.MONDAY : week = "������"; break;

			// case 3 : week = "ȭ����"; break;
			case Calendar.TUESDAY : week = "ȭ����"; break;

			// case 4 : week = "������"; break;
			case Calendar.WEDNESDAY : week = "������"; break;

			// case 5 : week = "�����"; break;
			case Calendar.THURSDAY : week = "�����"; break;

			// case 6 : week = "�ݿ���"; break;
			case Calendar.FRIDAY : week = "�ݿ���"; break;

			// case 7 : week = "�����"; break;
			case Calendar.SATURDAY : week = "�����"; break;

		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		// 2020-8-27 �����


		//-------------------------------------------------------

		// Calendar Ŭ���� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// �޷��� ��¥ ���� -> [ set() ] �޼ҵ� Ȱ��
		rightNow2.set(2020, 9, 20); // 10��		-> check~!!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		// --==>> 3 -> ȭ����
		// 2020�� 10�� 20���� ȭ����~!!!

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		// --==>> ȭ����

		// �޷��� ��¥ ����
		rightNow2.set(1994, 0, 27);
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		

	}

}
