/*
����Ŭ������ �ν��Ͻ�����
-�迭�� ����� �ʱ�ȭ
-�迭�� �⺻�� Ȱ��
=============================
//����ڷκ��� ó�� �Է¹��� �ο� �� ��ŭ��
//�л� �̸��� ��ȭ��ȣ�� �Է¹ް�
//�Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�
//��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
//�Է� ó���� �л� �� �Է�(��,1~10) : 24
//�Է� ó���� �л� �� �Է�(��,1~10) : 3
//�̸� ��ȭ��ȣ �Է�[1](���� ����) : ���� 010-1111-1111
//�̸� ��ȭ��ȣ �Է�[2](���� ����) : �̸�� 010-2222-2222
//�̸� ��ȭ��ȣ �Է�[3](���� ����) : ä��� 010-3333-3333

-----------------------
��ü �л� �� : 3��
------------------------
�̸� ��ȭ��ȣ

���� 010-1111-1111
�̸�� 010-2222-2222
ä��� 010-3333-3333
--------------------------
����Ϸ��� �ƹ� Ű�� ��������
*/

import java.util.Scanner;
import java.io.IOException;

public class Test077
{							//���ڿ� �迭�� args��� �̸��� �ο��Ѱ�
	public static void main(String[] args) throws IOException
	{ 
        // ��� �� - �迭�� �켱 10���� ��� �����ϱ�
		Scanner sc = new Scanner(System.in); 
		String[] name = new String[10];
		String[] pNumber = new String[10];
		int num=0; //�л� �� ��Ƶ� ����

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10): ");
			num = sc.nextInt();
		} 
		while (num<1 || num>10);
		
		//�迭����(�̸��迭 ��ȭ��ȣ �迭)
		//- ����ڷκ��� �Է¹��� �ο��� ��ŭ�� �迭�� ����
		
		//�̸� ���� �迭
		String[] names =new String[num];

		//��ȭ��ȣ ���� �迭
		String[] tels=new String[num];
		//String[] tels=new String[names.length]
		
		for (int i=0; i<num; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����): ",(i+1));
			name[i] = sc.next();
			pNumber[i] = sc.next();		
		}
		//������� ���
		System.out.println();
		System.out.println("--------------------------");
		System.out.printf("��ü ǰ�� : %d��\n",num);
		System.out.println("--------------------------");
		System.out.printf("ǰ�� ����");
		
		for (int i=0; i<num; i++)
			System.out.printf("%4s %14s\n",names[i],price[i]);
		



		/*
		for (int i=0; i<num; i++)
		{
			System.out.print("�̸� ��ȭ��ȣ �Է�[" + (i+1) +"](���� ����): ");
			name[i] = sc.next();
			pNumber[i] = sc.next();
		}

		System.out.println("------------------");
		System.out.println("��ü �л� ��: " + num + "��");
		System.out.println("------------------");
		System.out.println("�̸�\t��ȭ��ȣ");

		for (int i=0; i<num; i++)
		{
			System.out.println(name[i] + "\t" + pNumber[i]);
		}
		*/

		// ��� �� - �迭�� 0���� ��� �Է¹��� �л� ���� �ٽ� �ʱ�ȭ
       /*
		Scanner sc = new Scanner(System.in);
		String[] name = new String[0];
		String[] pNumber = new String[0];
		int num=0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10): ");
			num = sc.nextInt();
			name = new String[num];
			pNumber = new String[num];
		} 
		while (num<1 || num>10);

		for (int i=0; i<num; i++)
		{
			System.out.print("�̸� ��ȭ��ȣ �Է�[" + (i+1) +"](���� ����): ");
			name[i] = sc.next();
			pNumber[i] = sc.next();
		}

		System.out.println("------------------");
		System.out.println("��ü �л� ��: " + num + "��");
		System.out.println("------------------");
		System.out.println("�̸�\t��ȭ��ȣ");

		for (int i=0; i<num; i++)
			System.out.println(name[i] + "\t" + pNumber[i]);
        */

	}
}

// ���� ���
/*
�Է� ó���� �л� �� �Է�(��, 1~10): 24
�Է� ó���� �л� �� �Է�(��, 1~10): 3
�̸� ��ȭ��ȣ �Է�[1](���� ����): ������ 010-0000-0000
�̸� ��ȭ��ȣ �Է�[2](���� ����): ���� 010-1234-1234
�̸� ��ȭ��ȣ �Է�[3](���� ����): ������ 010-4567-8435
------------------
��ü �л� ��: 3��
------------------
�̸�    ��ȭ��ȣ
������  010-0000-0000
����  010-1234-1234
������  010-4567-8435
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/