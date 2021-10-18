import java.io.*;
import java.util.*;


public class Stock extends MenusManagement
{
   
   
   //�����Ȳ, ��� ��� ����
   public void stockMenuChoice() throws IOException // ������ ��ü �޴�
   {
      System.out.println();
      System.out.println("\t1. �����Ȳ");
      System.out.println("\t2. �����");
	  System.out.println("\t3. �������� ���ư���");
	  System.out.println("\t4. ����");
      System.out.print("\n\t >> ��ȣ�� �������ּ���: ");
      int sel = sc.nextInt();

     switch(sel)
      {
      case 1 : printText(); break;
      case 2 : stockUpdate();break;
	  case 3 : choice();break;
	  case 4 : exit();
	  default: System.out.println("\t>> �޴� ���� ����~!!!"); stockMenuChoice(); break;
      }
      
   }
  

   public void printText() throws IOException	// �����Ȳ���
   {
      try 
      {
       BufferedWriter out = new BufferedWriter(new FileWriter("��� ��Ȳ.txt"));
       String s = "[\t\t��� ��Ȳ\t\t]";
       String l;
       int i;
       out.write(s); out.newLine();
       for (Product pd : p)
       {
          
         l = pd.getProductName()+"\t"+pd.getStock();
         out.write(l); out.newLine();

       }
        //out.write(l); out.newLine();!!!!!!!

        out.close();
         } 
         catch (IOException e) 
         {
         System.err.println(e); // ������ �ִٸ� �޽��� ���
         System.exit(1);
         }
		 System.out.println("\t��� ��Ȳ ������ ����Ǿ����ϴ�.");

      for (Product pd : p)
      { 
		    if(pd.getProductName().equals("KF94����ũ")&&pd.getStock()<=3)
		    System.out.println("\t KF94����ũ�� �����մϴ�. �������ּ���.");

		   if(pd.getProductName().equals("��Ż����ũ")&&pd.getStock()<=3)
		    System.out.println("\t ��Ż����ũ�� �����մϴ�. �������ּ���.");
	   
	   if(pd.getProductName().equals("�ڰ�����ŰƮ")&&pd.getStock()<=3)
		   System.out.println("\t �ڰ�����ŰƮ�� �����մϴ�. �������ּ���.");
	   
	    if(pd.getProductName().equals("�ռҵ���")&&pd.getStock()<=3)
		   System.out.println("\t �ռҵ����� �����մϴ�. �������ּ���.");
	   
	   if(pd.getProductName().equals("�ױչ�Ƽ��")&&pd.getStock()<=3)
		   System.out.println("\t �ױչ�Ƽ���� �����մϴ�. �������ּ���.");
	  
	  }

      stockMenuChoice();
 
   }// end printText()

  
   

   public void stockUpdate() throws IOException		//��� �ʱ�ȭ�ϱ�(�⺻���ÿ��� �ʱ�ȭ��)
   {
	         for (Product pd : p)
      { 

		   if(pd.getProductName().equals("��Ż����ũ")&&pd.getStock()<=3)
		    System.out.println("\t ��Ż����ũ�� �����մϴ�. �������ּ���.");
	   
	   if(pd.getProductName().equals("�ڰ�����ŰƮ")&&pd.getStock()<=3)
		   System.out.println("\t �ڰ�����ŰƮ�� �����մϴ�. �������ּ���.");
	   
	    if(pd.getProductName().equals("�ռҵ���")&&pd.getStock()<=3)
		   System.out.println("\t �ռҵ����� �����մϴ�. �������ּ���.");
	   
	   if(pd.getProductName().equals("�ױչ�Ƽ��")&&pd.getStock()<=3)
		   System.out.println("\t �ױչ�Ƽ���� �����մϴ�. �������ּ���.");
	  
	  }
    //�ڵ�����
	String ele;
	int num;

	boolean check=false;

      for (Product pd : p)
      {   
         if(pd.getProductName().equals("KF94����ũ")&&pd.getStock()<=3)
         {
               pd.setStock(20);
               System.out.println("\t ����ũ �ڵ����ָ� �����Ͽ����ϴ� >> "+pd.getStock()+"��");		   
         }
      }

	System.out.println(); //���� 
   
	//��������
	System.out.print("\t ������ ��ǰ���� �Է����ּ��� : ");
	ele = sc.next();
   
 
    for (Product pd : p) 
	{   
		 
		 if(!pd.getProductName().equals("KF94����ũ"))
		  {
			
				if(pd.getProductName().equals(ele))
				{
					System.out.print("\t��ǰ�� ��� �� ���� : ");
					num = sc.nextInt();
					pd.setStock(num); 
					check = true;
					System.out.println("\t ���� ���ָ� �����Ͽ����ϴ�");	
					break;
				}
		 }
	}

	 	 if (!check)
	 {
		System.out.println("\t��ǰ�� �������� �ʽ��ϴ�.");
		System.out.println("\t��KF94����ũ�� �ڵ����� ����Դϴ�");
	 }

		stockMenuChoice();

   }//end StockUpdate()
}