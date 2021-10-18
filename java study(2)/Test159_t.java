/*========================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
========================================================*/

// �� �ǽ� ����
// Test159 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1
	
	1��° ��� �Է�: �չ���
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : Y

	2��° ��� �Է�: ���±�
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : n

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		�չ���
		���±�
	���� ��ü ��� �Ϸ�~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է�: ����ȭ

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է�: �չ���

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է�: ���ش�

	[���� ��� ���]
	�׸��� �������� �ʾƼ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է�: ���±�

	[���� ��� ���]
	���±� �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է�: ������

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է�: �չ���
	������ ���� �Է�: ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
����Ϸ���...

*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus		//-- �ϼ�
{
	public static final int E_ADD = 1;		//-- ��� �߰�
	public static final int E_DISP = 2; 	//-- ��� ���
	public static final int E_FIND = 3; 	//-- ��� �˻�
	public static final int E_DEL = 4; 	//-- ��� ����
	public static final int E_CHA = 5; 	//-- ��� ����
	public static final int E_EXIT = 6; 	//-- ���α׷� ����
}

public class Test159_t
{
	// �ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;
	private static String con;

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("\t[�޴� ����]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");	
		
		System.out.print("\t>> �޴� ����(1~6) :");

	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		sel = Integer.parseInt(br.readLine());
		System.out.println();
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD: addElement(); break;
			case Menus.E_DISP: dispElement(); break;
			case Menus.E_FIND: findElement(); break;
			case Menus.E_DEL: delElement(); break;
			case Menus.E_CHA: chaElement(); break;
			case Menus.E_EXIT: exit(); break;
			default: System.out.println("\t>> �޴� ���� ����~!!!"); break;
		
		}

		
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		do
		{
			System.out.print( "\t" + (vt.size()+1) + "��° ��� �Է�: ");

			boolean b = vt.add(br.readLine());

			if (b)
				System.out.println("\t" + vt.size() + "��° ��� �Է� ����~!!!");
			else
				System.out.println("\t�Է¿���\n");

			System.out.print( "\n\t��� �Է� ���(Y/N)? :");

			con = br.readLine().toUpperCase();

		}		
		while (con.equals("Y"));
	}


	// ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println("\t[���� ��ü ���]");


		for(int i=0; i<vt.size(); i++)
		{
			System.out.println("\t" + vt.get(i));
		}

		System.out.println("\t���� ��ü ��� �Ϸ�~!!!\n");

	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.print("\t�˻��� ��� �Է�: ");

		if ( vt.contains(br.readLine()) )
		{
			System.out.println("\t[�˻� ��� ���]");
			System.out.println("\t�׸��� �����մϴ�.\n" );
		}
		else
		{
			System.out.println("\t[�˻� ��� ���]");
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.\n");
		}

		System.out.println();

	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		System.out.print("\t������ ��� �Է�: ");
		String s = br.readLine();

		System.out.println(); //����
		System.out.println("\t[���� ��� ���]");

		if(vt.contains(s))
		{			
			if ( vt.remove(s) )	// ������ �� ����Ǿ����� Ȯ�� �� �޽��� ���
				System.out.println( s + "\t�׸��� �����Ǿ����ϴ�.\n");	
			else 
				System.out.println("\t���� ����");
		}
		else
		{
			System.out.println("\t�׸��� �������� �ʾƼ� ������ �� �����ϴ�.\n");
		}



	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("\t������ ��� �Է�: ");
		String s = br.readLine();
		//boolean f = false;
		//int i;

		/*
		for(i=0; i<vt.size(); i++)
		{
			if (s.equals(vt.get(i)))
			{
				f = true;
				break;
			}
		}

		if (f)
		{				
			System.out.print("\t������ ���� �Է�: ");
			vt.set(i, br.readLine());
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.\n");	
		}
		else
		{
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ ����� �������� �ʽ��ϴ�.\n");
		}
		*/

		if(vt.contains(s))
		{			
			System.out.print("\t������ ���� �Է�: ");
			vt.set(vt.indexOf(s), br.readLine());
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.\n");	
		}
		else
		{
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ ����� �������� �ʽ��ϴ�.\n");
		}
		
	}

	// ���α׷� ���� �޼ҵ� -- �ϼ�
	public static void exit()
	{
		System.out.println("\t���α׷� ����~!!!");
		System.exit(-1);
	}

	// main() �޼ҵ� -- �ϼ�
	public static void main(String[] args) throws IOException
	{
		/*
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		*/
	}



}