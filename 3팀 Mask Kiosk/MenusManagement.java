import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MenusManagement extends ChoiceManagementMode
{

	public static final int E_ADD  = 1;	
	public static final int E_NAMEUPDATE = 2;
	public static final int E_PRICEUPDATE = 3;
	public static final int E_DELETE = 4;
	public static final int E_MODE = 5;


	public static String con;

	public int pNum;         //-- ǰ��
	public String productName;   //-- ��ǰ �̸�
	public int price;         //-- ����
	public int stock;         //-- ���


	static
	{
		con = "Y";
	}

	public void menuDisp() throws IOException //�޴� ���
	{
		System.out.println("\t\t\t[ ��\t�� ]");
		System.out.println("\t-----------------------------------------");
		System.out.println("\tǰ��\tǰ��\t\t����\t ���� ���� ");
		System.out.println("\t-----------------------------------------");
		for (Product pd : p)
		{
			System.out.println("\t" + pd.getpNum() + "\t" + pd.getProductName()
								+ "\t" + pd.getPrice() + "\t" + pd.getStock());
		}
		System.out.println("\t-----------------------------------------");

		System.out.println("\t1. ��ǰ ����");
		System.out.println("\t2. ��ǰ�� ����");
		System.out.println("\t3. ��ǰ ���� ����");
		System.out.println("\t4. ��ǰ ����");
		System.out.println("\t5. �⺻ ����");
		System.out.println("\t6. : ������ �޴��� ���ư���");
		System.out.println("\t7. : ����");

		menuSelect();

	}

	public void menuSelect() throws IOException, NumberFormatException //�޴� ����
	{
		System.out.print("\n\t>> ������ �Ͻðڽ��ϱ�?: ");
		sel = Integer.parseInt(br.readLine());
		menuRun();
		System.out.println();
		
	}

	public void basicSetting() throws IOException	//5�� �⺻����
	{
		p.add(new Product(1, "KF94����ũ", 1500,10));
		p.add(new Product(2, "��Ż����ũ", 500, 10));
		p.add(new Product(3, "�ڰ�����ŰƮ", 4400, 10));
		p.add(new Product(4, "�ռҵ���", 2000, 10));
		p.add(new Product(5, "�ױչ�Ƽ��", 1000, 10));

		System.out.println("\n\t�⺻ ������ ���������� �Ϸ�Ǿ����ϴ�.");

		menuDisp();
	}

	public void createMenu() throws IOException //��ǰ ����
	{	
		do
		{
			System.out.println();
			System.out.printf("%d�� ° ǰ��(6������ �Է�), �̸�, ����, ��� �Է� (���� ����) : ", (p.size() + 1));
			
			pNum = sc.nextInt();

			productName = sc.next();

			price = sc.nextInt();

			stock = sc.nextInt();

			p.add(new Product(pNum, productName, price, stock));

			System.out.println();
			System.out.print("��ǰ �Է��� �� �Ͻðڽ��ϱ�?  ");

			con = br.readLine().toUpperCase();
			System.out.println();

			
		}
		while (con.equals("Y"));

		menuDisp();

		// *���� : �⺻������ 1~5�� �������ֱ� ������ �⺻������ ���� �ϰ� �̿��� ��ǰ 6������ �߰�����ؾ���.

	}

	public void updateMenuName() throws IOException //��ǰ�� ����
	{
		System.out.println();
		System.out.print("\t���� ��ǰ �Է�: ");
		String ele = br.readLine();
		boolean flag = false;
      

		for(Product pro : p)
		{
			if(pro.getProductName().equals(ele))
			{
         
			System.out.print("\t������ ��ǰ �Է� : ");
			String chaEle = br.readLine();

			pro.setProductName(chaEle);
			flag = true;
			System.out.println("\t��ǰ�� ����Ǿ����ϴ�. ");
         }
      }

      if(!flag)
		  System.out.println("\t��ǰ�� �������� �ʽ��ϴ�.");
	 
	  System.out.println();
	  menuDisp();


	}

	
	public void updateMenuPrice() throws IOException //��ǰ���� ����
	{
		System.out.println();
		System.out.print("\t���� ��ǰ �Է�: ");
		String ele = (br.readLine());
		boolean flag = false;
		
		for(Product pro : p)
		{
			if(pro.getProductName().equals(ele))
			{
				System.out.print("\t������ ��ǰ ���� �Է� : ");
				Integer chaEle = Integer.parseInt(br.readLine());

				pro.setPrice(chaEle);
				flag = true;
				System.out.println("\t��ǰ������ ����Ǿ����ϴ�. ");
			}
      }

      if(!flag)
		  System.out.println("\t��ǰ�� �������� �ʽ��ϴ�.");

      

      System.out.println();
      menuDisp();

	}

	public void deleteMenu() throws IOException
	{
		System.out.println();
		System.out.print("\t������ ��ǰ �̸� �Է�: ");
		String ele = br.readLine();
		boolean flag = false;

		for(Product pro : p){
			if(pro.getProductName().equals(ele))
			{

				p.remove(pro);
				flag = true;
				System.out.printf("\t%s ��ǰ�� �����Ǿ����ϴ�.\n", ele);
				break;
			
			}
		}
		if (!flag)
			System.out.println("\t��ǰ�� �������� �ʽ��ϴ�.");

		menuDisp();

	}

	public void menuRun() throws IOException
	{
	
		switch(sel){
		case 1 : createMenu(); break;
		case 2 : updateMenuName(); break;
		case 3 : updateMenuPrice(); break;
		case 4 : deleteMenu(); break;
		case 5 : basicSetting(); break;	
		case 6 : choice(); break;
		case 7 : exit(); break;
		default : System.out.println("\t>> �޴� ���� ����"); menuDisp(); break;
		}

	}

	public void exit() 
	{
		System.exit(-1);
	}
		
	

}