import java.io.*;
import java.util.*;

public class Balance extends ChoiceManagementMode		
{
	public int manwon;
	public int ocheon; 
	public int cheon;
	public int obaek;
	public int baek; 


	private int totalChargedMoney = 0;		//-- ������ ���� �� ��
	private boolean check = false;

	private int total_profit = 0;			//-- �Ǹű�
	private int rest_money = 0;				//-- �ܵ� ���� ��

	//������ =  ���ͱ� - (�ʱ� ���� �� - ���� �����ִ� �ܵ� + ������ ��)
	private int earnings = 0;


   
	public static int supplement1=0;       //10000��
	public static int supplement2=0;		//5000��
	public static int supplement3=0;		//1000��
	public static int supplement4=0;		//500��
	public static int total=0;				//100��



	public void balanceDisp() throws IOException	//�ܱݰ��� ��ü�޴�
	{
		System.out.println();
		System.out.println("\t1. �ܵ�����");
		System.out.println("\t2. �������");
		System.out.println("\t3. �������� ���ư���");
		System.out.println("\t4. ����");
		System.out.print("\n\t >> ��ȣ�� �������ּ���: ");
		int sel = sc.nextInt();

		switch(sel)
		{
			case 1 : changeDisp();break; 
			case 2 : profit(); break;
			case 3 : choice();break;
			case 4 : exit();
		}
	  
   }//end balanceDisp()
   
   
   public void changeDisp() throws IOException      // 1. �ܵ����� �޴� line25
   {
	   System.out.println();
		System.out.println("\t1. �ܵ��⺻����");
		System.out.println("\t2. �ܵ��ʱ�ȭ");
		System.out.println("\t3. �ܵ�����");
		System.out.println("\t4. �ܵ� Ȯ��");
		System.out.println("\t5. �ܱݸ޴��� ���ư���");      
		System.out.print("\n\t >> ��ȣ�� �������ּ���: ");
		int sel = sc.nextInt();
		
		switch(sel)
		{
			case 1 : changeSetting(); break; 
			case 2 : change(); break; 
			case 3 : charging();break;
			case 4 : showChanges();break;
			case 5 : balanceDisp();break;
			default : System.out.println("\t���ÿ���!!"); balanceDisp();break;
		}

   }



   public void changeSetting() throws IOException	// case1 ���ͱ� + �ܵ��⺻���� 
   {
	   // ���ͱ� �ʱ�ȭ
	   profitmap.put(10000,0);
	   profitmap.put(5000,0);
	   profitmap.put(1000,0);
	   profitmap.put(500,0);
	   profitmap.put(100,0);
		
	   // �ܵ� �ʱ�ȭ
	   moneymap.put(10000,0);
	   moneymap.put(5000,10);
	   moneymap.put(1000,10);
	   moneymap.put(500,10);
	   moneymap.put(100,10);
	   
	   System.out.println("\n\t�ܵ��⺻������ �Ϸ�Ǿ����ϴ�.\n");
	   
	   changeDisp();
   }
   
 
   public void change() throws IOException   // case 2 �ܵ��ʱ�ȭ 
   {
	   System.out.print("\n5000�� 1000�� 500�� 100�� ������ ������ �Է����ּ��� (���鱸��) : ");
	   
	   ocheon   = sc.nextInt();
	   cheon    = sc.nextInt();
	   obaek    = sc.nextInt();
	   baek     = sc.nextInt();
	   
	   moneymap.put(5000,ocheon);
	   moneymap.put(1000,cheon);
	   moneymap.put(500,obaek);
	   moneymap.put(100,baek);
	   
	   System.out.println("\n\t�ܵ� �ʱ�ȭ�� �Ϸ�Ǿ����ϴ�.\n");
	   
	   
	   //-- �ܰ� ������ �޽������
	   if (moneymap.get(5000)<=3)
		   System.out.println("��õ������ �����մϴ�. �������ּ���./n");
	   
	   if (moneymap.get(1000)<=3)
		   System.out.println("õ������ �����մϴ�. �������ּ���./n");
	   
	   if (moneymap.get(1000)<=3)
		   System.out.println("����� ������ �����մϴ�. �������ּ���./n");
	   
	   if (moneymap.get(1000)<=3)
		   System.out.println("��� ������ �����մϴ�. �������ּ���./n");
	   
	   
	   changeDisp(); 
   }



   public void charging() throws IOException  // case3 �ܵ� ����
   {
	   check = false;

	  // ������ ��
	  supplement1=0;      //5000��
	  supplement2=0;      //1000��
	  supplement3=0;      //500��
	  supplement4=0;      //100��

	  System.out.print("������ ���� ������ �Է��ϼ���. ��) 5000 5 (���鱸��) :"); 
	  int k = sc.nextInt();
	  int v = sc.nextInt();

	  if (k==5000)
	  {
		 moneymap.put(k,moneymap.get(k) +v);
		 supplement1 = k * moneymap.get(k);

		System.out.println("\n\t5000�� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println("\t���� : "+moneymap.get(k));
	  }
	  else if (k == 1000)
	 {
		moneymap.put(k,moneymap.get(k) +v);
		 supplement2 = k * moneymap.get(k);
		System.out.println("\n\t1000�� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println("\t���� : "+moneymap.get(k));
	 }
	 else if (k == 500)
	 {
		moneymap.put(k,moneymap.get(k) +v);
		supplement3 = k * moneymap.get(k);
		System.out.println("\n\t500�� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println("\t���� : "+moneymap.get(k));
	 }
	 else if (k == 100)
	 {
		moneymap.put(k,moneymap.get(k) +v);
		 supplement4 = k * moneymap.get(k);

		System.out.println("\n\t100�� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println("\t���� : "+moneymap.get(k));

	 }
	 else
	   {
		check = true;
		System.out.print("\n\t������ �߸� �Է��ϼ̽��ϴ�.\n");
	   } 

  
	
	if (!check)		// ������ �� �� ��
	{
		totalChargedMoney += k * v;
	}
  	
	
	changeDisp(); 


   }// end charging()




   public void showChanges() throws IOException	// case4 �ܵ����
	{
		rest_money = moneymap.get(5000) * 5000 + moneymap.get(1000) * 1000 
							+ moneymap.get(500) * 500 + moneymap.get(100) * 100;
		
		System.out.println("\t5000��: " + moneymap.get(5000) + "��");
		System.out.println("\t1000��: " + moneymap.get(1000) + "��");
		System.out.println("\t500��: " + moneymap.get(500) + "��");
		System.out.println("\t100��: " + moneymap.get(100) + "��");

		System.out.println("\t���� �ִ� �ܵ��� ��: " + rest_money + "��");

		changeDisp();	 

	}

//============================================================================================������� ������½���	

   public void profit() throws IOException  //������¸޴� 
   {
	   //System.out.print("\n\t�� ���� �ݾ� : "); //�̰� ��� ������ �޾ƿ;��ϴµ�,,
	   
		System.out.println();
		System.out.println("\t1. �Ǹű� ���");
		System.out.println("\t2. ������ ���");
		System.out.println("\t3. �ܱݸ޴��� ���ư���");      
		System.out.print("\n\t >> ��ȣ�� �������ּ���: ");
		int sel = sc.nextInt();
		
		switch(sel)
		{
			case 1 : showProfit(); break; 
			case 2 : showEarnings(); break; 
			case 3 : balanceDisp();break;
			default : System.out.println("\t���ÿ���!!"); balanceDisp();break;
		}	   

   }


	public void showProfit() throws IOException	// case1 �Ǹű� ��� : ������X �Ǹ��� ������ü
	{
	   total_profit = profitmap.get(10000) * 10000 + profitmap.get(5000) * 5000 + profitmap.get(1000) * 1000 
					+ profitmap.get(500) * 500 + profitmap.get(100) * 100;

		System.out.println("\t10000��: " + profitmap.get(10000) + "��");
		System.out.println("\t5000��: " + profitmap.get(5000) + "��");
		System.out.println("\t1000��: " + profitmap.get(1000) + "��");
		System.out.println("\t500��: " + profitmap.get(500) + "��");
		System.out.println("\t100��: " + profitmap.get(100) + "��");

		System.out.println("\t�Ǹ��ؼ� ���� �ݾ��� ��: " + total_profit + "��");

		profit();	//������¸޴��� ���ư�����
	}

	
	public void showEarnings()	throws IOException	//case2 ������ ���
	{
		//*

		// �Ǹ��� ��ǰ �����ֱ�
		System.out.println("\t�Ǹ��� ǰ��\t\t����\t�ݾ�");
		System.out.println("\t-------------------------------------");

		for (Integer key : soldProductsMap.keySet()) 
		{
			Integer value = soldProductsMap.get(key);
			for (Product pd : p)
			{
				if(key == pd.getpNum())
				{
					System.out.println("\t" + pd.getProductName() +"\t\t" + value + "\t" + value * pd.getPrice());
				}

			}
		}
		System.out.println("\t-------------------------------------");



		// ���� �Ѿ�(���Ǳ⿡ ���� ��)
	   total_profit = profitmap.get(10000) * 10000 + profitmap.get(5000) * 5000 + profitmap.get(1000) * 1000 
							+ profitmap.get(500) * 500 + profitmap.get(100) * 100;

		// �����ִ� �ܵ��� �� ��
	   rest_money = moneymap.get(5000) * 5000 + moneymap.get(1000) * 1000 
							+ moneymap.get(500) * 500 + moneymap.get(100) * 100;

		//������ =  ���ͱ� - (�ʱ� ���� �� - ���� �����ִ� �ܵ� + ������ ��)
	   earnings = total_profit - (99000 - rest_money + totalChargedMoney);

	   System.out.println("\t-------------------------------------");
   	   System.out.println("\t������: " + earnings );

	   profit();	//������¸޴��� ���ư�����
	   
	}




	
	
   
}
