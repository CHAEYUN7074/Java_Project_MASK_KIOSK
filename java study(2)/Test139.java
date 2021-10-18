/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Calendar Ŭ����
========================================*/
/*

�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð� �� ��¥�� ���õ� ������ �����Ѵ�.
   �׸��� Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
   ���� ���� �ִ�.

*/

// ����ڷκ��� ��, ���� �Է¹޾�
// �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
// ��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2021
// ��   �Է� : -2
// ��   �Է� : 16
// ��   �Է� : 8
/*

	[2021�� 8��]

  �� �� ȭ �� �� �� ��
 =====================
   1  2  3  4  5  6  7				 
   8  9 10 11 12 13 14
  15 16 17 18 19 20 21
  22 23 24 25 26 27 28
  29 30 31
 =====================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test139 
	{
	public static void main(String[] args) 
	{
		Calendar cal = new GregorianCalendar(); //��ĳ����
		Scanner scan = new Scanner(System.in);

		int y, m;

		do
		{
			System.out.print("���� �Է� : ");
			y = scan.nextInt();

		}
		while (y < 1);

		do
		{
			System.out.print("��   �Է� : ");
			m = scan.nextInt();

		}
		while (0 > m || m > 12);

		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, m);


		System.out.println();
		System.out.printf("   [ %d�� %d�� ]\n", y, m);
		System.out.println(" �� �� ȭ �� �� �� ��");
		System.out.println("=====================");

		cal.set(y, m-1, 1);
		int lastday = cal.getActualMaximum(Calendar.DATE); //�ش� �� ������ ��¥ 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //�ش� ��¥�� ����

		for(int i = 1; i <= lastday; i++) 
			{
			if(i == 1) 
			{
				for(int j = 1; j < dayOfWeek; j++) 
					{
					System.out.printf("%3c", 0);    
					}
			}
			System.out.printf("%3d", i);
			
			if(dayOfWeek % 7 == 0) 
				{
				System.out.println();
				}
			dayOfWeek++;
			}
		// ������ ++ �� dayOfWeek ������� ������ ������
		// --dayOfWeek�� ������Ѵ�.
		if(--dayOfWeek % 7 != 0) 
			{ 
			System.out.println();
			}
		System.out.println("=====================");
	}
}
