/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Calendar Ŭ����
========================================*/
/*
�۽ǽ�����
������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
���� ��¥ : 2021-8-11 ������
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? :

===========[Ȯ�ΰ��]===================
200�� �� : xxxx-xx-xx x����
*/
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test140
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Calendar time = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;			// ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;		
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ��
		
		y = time.get(Calendar.YEAR);
		m = time.get(Calendar.MONTH) + 1;		
		d = time.get(Calendar.DATE);
		w = time.get(Calendar.DAY_OF_WEEK);

		// ������ �� �� �� ���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week[w-1] + "����");

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = scan.nextInt();
		}
		while (nalsu < 1);

		time.add(Calendar.DATE, nalsu); //Ÿ���̶�� ��ü.add ==>���� ��¥ �������� �� ���� ���ϴ� ���� �޼ҵ�

		//��� ���
		System.out.println(); //����
		System.out.println("=======[ Ȯ�� ��� ]=======");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, time, time);
		System.out.println("===========================");

		//%tF: ������ ��¥�� %tY-%tm-%td(��/��/��) �������� ����Ѵ�.
		//%tA: ������ ��¥�� ���� ���� �������� ����Ѵ�. (�ѱ� ȯ�濡���� '��/ȭ/��/��/��/��/��+����'�� ��µȴ�.)

		
	}

}
