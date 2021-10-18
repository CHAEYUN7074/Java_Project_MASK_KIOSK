import java.io.IOException;

public class Basket extends Sales
{

   // ��ٱ��Ͽ� ��� �޼ҵ�
   public void salesMenuSelect() throws IOException, NumberFormatException
   {
      System.out.print("\t>> ���� ǰ���ȣ�� ���� �Է�(ǰ���ȣ ����) :");
      
      Integer product = sc.nextInt();
      Integer number = sc.nextInt();
      System.out.println();
      boolean flag = true;

      // ���� ���� ���� (����ũ(5�� ���Ϸθ� �����ϵ���) + ��� ���Ϸ� �����ϵ���(��ü ǰ�� �ش�))
      for (Product pd : p)
      {
         // ����ڰ� �Է��� ǰ���ȣ�� ������ ����� �������̰�, �ش� ǰ���� �������� ����ڰ� �Է��� �������� ����� �� 
         if((pd.getpNum() == product) && (pd.getStock() >= number))   
         {
			//������ ǰ���� KF94����ũ �� ��� (* KF94����ũ 5�� �̻� ���� �Ұ���)
            if( pd.getProductName().equals("KF94����ũ"))
            {
               //���� ������ 5�� ���ϸ�, ��ٱ��Ͽ� �ֱ�
               if ( number <= 5 )
               {                  
                  // �̹� ��ٱ��Ͽ� �ִ� ǰ������ �ƴ��� �Ǵ�
                  if ( map.containsKey(product) )
                  {
                     // ������ ���� ������ ���� �߰��Ϸ��� ������ ���� 5 ���ϸ�
                     if( map.get(product) + number <= 5)
                     {
						//������Ʈ
                        map.replace(product, map.get(product) + number);
                        System.out.println("\t��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
						//����ũ ��� ���� ����
                        pd.setStock(pd.getStock() - number);
                        flag = false;
                        break;
                     }
                     else //������ ���� ������ ���� �߰��Ϸ��� ������ ���� 5 �̻��̸�
                     {
                        System.out.println("\t����ũ ���� ���� ���� �ʰ�");
                        flag = false;
                        break;
                     }
                  }
                  else // ��ٱ��Ͽ� ����ũ ǰ���� ���� ��� ��ٱ��Ͽ� ����
                  {
                     map.put(product, number);
					 //����ũ ��� ���� ����
                     pd.setStock(pd.getStock() - number);
                     System.out.println("\t��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
                     flag = false;
                     break;
                  }
               }
               else   //���� ������ 5�� �̻��̸� �ȳ��޽��� ����ϰ�, salesMenuDisp()�޴��� ���ư���
               {
                  System.out.println("\t����ũ ���� ���� ���� �ʰ�");
                  flag = false;
                  break;
               }
            }

            else   //������ ǰ���� ����ũ�� �ƴ� ���
            {
			   //�ش� ǰ�� ��� ���� ����
               pd.setStock(pd.getStock() - number);

               // �̹� ��ٱ��Ͽ� �ִ� ǰ������ �ƴ���
               if ( map.containsKey(product) ) // �̹� ��ٱ��Ͽ� �ִ� ǰ���̸�
               {
                  map.replace(product, map.get(product) + number);
               }
               else // ��ٱ��Ͽ� ������
               {
                  map.put(product, number);
               }
               System.out.println("\t��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
               flag = false;
               break;
            }
         }
      }//end for��
      System.out.println("\t-----------------------------\n");
		 
		 // ���� �ش� ���ǹ��� �ش� ���� ���� ��� �޼��� ���
         if(flag)
	     {
            System.out.println("\tǰ���� ���� ������ �ٽ� Ȯ�����ּ���.");
		 }

	  //��ٱ��Ͽ� ��� �� �ٽ� salesMenuDisp() �޴��� ���ư���
      salesMenuDisp();
   }

   //��ٱ��� Ȯ�� �޼ҵ�
   public void basketCheck() throws IOException
   {
      System.out.println("\n\t\t\t[   �� �� �� ��     ]");
      System.out.println("\t------------------------------------------------");
      System.out.println("\t| ǰ��\tǰ��\t\t���ü���\t�ݾ�   |");
      for (Integer key : map.keySet()) 
      {
		 //�ش� Ű���� value�� ���
         Integer value = map.get(key);
         for (Product pd : p)
         {
			//key���� ��ġ�� ��� -> Ű�� ǰ�� ���� ���� �ݾ� ���
            if(key == pd.getpNum())
               System.out.println("\t   " + key + "\t" + pd.getProductName() +"\t" + value + "\t\t" + value * pd.getPrice());
         }

      }    
      System.out.println("\t------------------------------------------------");
      System.out.println();   // ����

      System.out.println("\t1. ��ٱ��Ͽ� �� ���");
      System.out.println("\t2. ��ٱ��� ����");
      System.out.println("\t3. �����ϱ�");

      System.out.println();   // ����

      System.out.print("\t>> ������ �Ͻðڽ��ϱ�?: ");
      switch (br.readLine())
      {
         case "1": System.out.println("\n\t��ٱ��Ͽ� ��⸦ �����ϼ̽��ϴ�.\n"); salesMenuDisp(); break;
         case "2": System.out.println("\n\t��ٱ��� ���⸦ �����ϼ̽��ϴ�.\n"); basketClear(); break;
         case "3": py.paying(); break;
         default: System.out.println("\t>> �޴� ���� ����~!!!"); salesMenuDisp(); break;   
      }

   }


	// ��ٱ��� ���� �޼ҵ�
	public void basketClear() throws IOException
	{

		boolean falgDelete = true;

		System.out.println("\n\t [   �� �� �� �� �� �� ��    ]");
		System.out.println("\t----------------------------------");
		System.out.println("\t 1. ���� �׸� ���� ");
		System.out.println("\t 2. ��ü �׸� ���� ");
		System.out.println();	
		System.out.print("\t>> ������ �Ͻðڽ��ϱ�?: ");
		
		switch (br.readLine())
		{

			//���� �׸� ������ �Է����� ���
			case "1": 

				System.out.print("\t������� �ϴ� ǰ���ȣ �Է�: ");
				Integer del = Integer.parseInt(br.readLine());

				for(Product pd : p)
				{
				   //������ ǰ���ȣ�� �����Ϳ� �ְ�, ����ڰ� �Է��� ǰ���ȣ�� ��ġ�� ���
				   if(map.containsKey(del) && pd.getpNum() == del)
				   {
					  //�ش� ǰ�� ��� �ٽ� ä���ֱ� 
					  pd.setStock(pd.getStock() + map.get(del));
					  System.out.println("\n\t�ش� ǰ���� ��ٱ��Ͽ��� ���� �Ǿ����ϴ�!");
					  falgDelete = false;
				   }		  
				}

				//��ٱ��Ͽ� ���� ��ǰ�� ������� ���� ��� �޽������
				if(falgDelete)
				{
					System.out.println("\n\t��ٱ��Ͽ��� ���� ��ǰ �Դϴ�!");
				}

				map.remove(del); //��ٱ��Ͽ��� �� ���� 
				basketCheck();
				break;

			//��ü �׸� ������ �Է����� ���	
			case "2": 
				
 				System.out.print("\n\t��ü �׸� ������ �����ϼ̽��ϴ�.\n");
				//��� �ٽ� ä���ֱ�
				for(Product pd : p)
				{
					for (Integer key : map.keySet() )
					{
					   if(pd.getpNum() == key)
					   {
						  //�ش� ǰ�� ��� �ٽ� ä���ֱ� 
						  pd.setStock(pd.getStock() + map.get(key));
					   }
					}

				}
				//��ٱ����� ��� ������ ���� �� ��ٱ��� Ȯ������ ���ư���
				map.clear();
				System.out.println("\n\t��ü��ٱ��ϰ� ��������ϴ�!");
				basketCheck();
				break;
			
			//�߸��� �޴� �������� ��� ��ٱ��� Ȯ������ ���ư���
			default: System.out.println("\t>> �޴� ���� ����~!!!"); basketCheck(); break;	
		}
	}
}