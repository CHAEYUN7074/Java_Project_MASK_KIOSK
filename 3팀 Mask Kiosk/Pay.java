import java.io.IOException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Pay extends Basket
{
	int tot = 0;				//-- �� ���� �ݾ�
	int total = 0;				//-- ��ȿ�� �˻� ����
	boolean check = false;		//-- ����ǰ�� ����ũ�� ���ԵǾ� �ִ��� �˻��ϴ� ����
	boolean listCheck = false;	//-- �̹� ����ũ�� ������ ����� �ִ��� �˻��ϴ� ����
	String name;				//-- ��ȿ�� �˻�� �Է¹޴� �̸�
	String number;				//-- ��ȿ�� �˻�� �Է¹޴� �ֹε�Ϲ�ȣ
	int a;
	int tt;						//-- ���� �ݾ� �� ��
	boolean checkReceipt = false;	//-- ������ ��� �����ϴ� ����
	boolean ch1 = false;
	boolean ch2 = false;
	boolean ch3 = false;
	boolean ch4 = false;
	boolean ch5 = false;
	Person pppp;
	
	// ���� �ݾ� �����ϴ� ����
	int m10000;
	int m5000;
	int m1000;
	int m500;
	int m100;

	int restMoney = 0;			//-- �Ž�����

	// �����ϱ� �޼ҵ�
	public void paying() throws IOException
	{
		tot = 0; // �Ѿ� �ʱ�ȭ

		// ������ ��� �����ֱ�(�ݾ� ����)
		System.out.println();
		System.out.println("\n\t[            �� �� Ȯ ��           ]");
		System.out.println("\t--------------------------------------");
		System.out.println("\tǰ��\tǰ��\t\t���� ����\t�ݾ�");
		for (Integer key : map.keySet()) 
		{
			Integer value = map.get(key);
			for (Product pd : p)
			{
				if(key == pd.getpNum())
				{
					System.out.println("\t" + key +"\t" + pd.getProductName() +"\t" + value + "\t\t" + value * pd.getPrice());
					tot += (value * pd.getPrice());
				}
			}
		}    
		System.out.println("\t--------------------------------------");
		System.out.println();	// ����
		System.out.println("\t�� �ݾ� \t\t\t " + tot); 
		System.out.println();
		System.out.println("\t1.�����ϱ�");
		System.out.println("\t2.��ٱ��Ϸ� ���ư���\n");

		System.out.print("\t>> ������ �Ͻðڽ��ϱ�?: ");

		int sel = sc.nextInt();
	
		System.out.println();	// ����

		// �����ܰ迡�� ��ٱ��Ϸ� �ǵ��ư�
		if (sel == 2)
			b.basketCheck();

//		// ��ٱ��� ��������� �ȳ� �޽��� ��� �� �������� ���ư���
		if (map.size() == 0)
		{
			System.out.println("\t��ٱ��ϰ� ����ֽ��ϴ�. �޴� ���� �������� ���ư��ϴ�.");
			salesMenuDisp();
		}

		// ����ũ �ִ��� ������ Ȯ��
		for(Integer key : map.keySet())
		{
			for(Product pd : p)
			{
			   if( pd.getpNum() == key && pd.getProductName().equals("KF94����ũ")) 			
			   {
				   a = key;		// KF94����ũ�� ����ִ� ��̸���Ʈ�� Ű���� a�� �޾ƿ� 
				   check = true;
				   break;
			   }
			} 
		}
		
		// �� ������
		if (check == true)
		{
			System.out.println("\t[KF94����ũ �����̷� ��ȸ]");
			// ��ȿ���˻� ���
			if (validityTest() == true) 
			{
				// ������ ��Ͽ� �ִ� ������� �˻�
				for(Person ps : pe)
				{
					if(ps.getpNumber().equals(number)) // �̹� ����Ǿ� �ִ��� �� ������ true
					{
						listCheck = true;
					}
				}

				//System.out.println(listCheck); // �׽�Ʈ

				if (listCheck == true)	// ����Ǿ� ������(������ ����ũ�� �����ߴ� ����̸�)
				{		
					for(Person ps : pe)
					{
						if( ps.getpNumber().equals(number) && (ps.getNumber()+map.get(a)) <= 5)		
						{	
							//  ������ ������ ����ũ�� �� + ��ٱ��Ͽ� ��� ����ũ(����ũ�� Ű���� ���� �ؽø��� value)�� 5�� ���ϸ� 

							ch4 = true;
							pppp = ps;
							payment(); // �� �޴� �޼ҵ�� �Ѿ
							break;
						}
						else if(ps.getpNumber().equals(number) && (ps.getNumber()+map.get(a)) > 5)// 5�� �ʰ��� ��
						{
							System.out.println("�׽�Ʈ" + ps.getpNumber());
							System.out.println("�׽�Ʈ "+ ps.getNumber());

							System.out.println("\t���� ������ ����ũ�� ������ �ʰ��Ͽ����ϴ�.");
							check = false;
							// ��ٱ��Ͽ��� ���� ���� ����
							for(Product pd : p)
							{
								for (Integer key : map.keySet() )
								{
								   if(pd.getpNum() == key)
								   {//�ش� ǰ�� ��� �ٽ� ä���ֱ� 
									  pd.setStock(pd.getStock() + map.get(key));
								   }
								}

							}
							
							map.clear();	// ��ٱ��� ����
							basketCheck();	// ��ٱ��� Ȯ���ϴ� �������� �Ѿ
						}
						else if(!ps.getpNumber().equals(number))
							continue;

					}
				}
				else						// ����Ǿ����� ���� ��(������ ����ũ�� �������� ���� ����̸�)
				{
					// ���� ����
					ch1 = true;
					payment(); // �� �޴� �޼ҵ�� �Ѿ
				}	
			}

			else				// �� ��ȿ�� �˻� ��� ���ϸ�
			{
				System.out.println("\t��ȿ�� �˻縦 ������� ���߽��ϴ�. ��ٱ��Ϸ� ���ư��ϴ�.");
				basketCheck(); // ��ٱ��� Ȯ���ϴ� ������
			}

		}
		else	// ��ٱ��Ͽ� ����ũ ������
			payment(); // ���� ����, �� �޴� �޼ҵ�� �Ѿ


		// ������ �Ϸ�Ǿ��ٸ� ������ ��� 
		if (checkReceipt)
		{
			printReceipt();
		}


	}

	// ������ ��� �޼ҵ�
	public void printReceipt() throws IOException
	{
		tot = 0;
		// ���� ��¥ + �ð� �ҷ�����
		Calendar cal = Calendar.getInstance();
		System.out.println("\t------������ ��� ����------\n");

		SimpleDateFormat sdf = new SimpleDateFormat("\tyyyy-MM-dd HH:mm:ss");
		String d = sdf.format(cal.getTime());
		System.out.println(d);
		System.out.println();	//����

		System.out.println("\t--------------------------------------");
		System.out.println("\tǰ��\t\t���� ����\t�ݾ�");
		// ���� �Ϸ�� ��ǰ ���
		for (Integer key : map.keySet()) 
		{
			Integer value = map.get(key);
			for (Product pd : p)
			{
				if(key == pd.getpNum())
				{
					System.out.println("\t" + pd.getProductName() +"\t" + value + "\t\t" + value * pd.getPrice());
					tot += value * pd.getPrice();				
				}

			}

			// ���� �Ϸ�� ��ǰ�� "�Ǹ��� ��ǰ ����Ʈ"�� �����ϴ� �ܰ�
			if ( soldProductsMap.containsKey(key) ) // ��ٱ��Ͽ� �ִ� ��ǰ�� "�Ǹ��� ��ǰ ����Ʈ"�� �̹� ����Ǿ� �ִٸ�
			{
				soldProductsMap.replace(key, soldProductsMap.get(key) + map.get(key)); // ���� ����Ʈ ������ ������ ���� �߰�
			}
			else // ����Ʈ�� ���� ǰ���̸� ���� ����
				soldProductsMap.put(key, map.get(key));


		}
		



		System.out.println("\t--------------------------------------");
		System.out.println();	// ����
		System.out.println("\t�� �ݾ� \t\t\t" + tot);
		System.out.println("\t--------------------------------------");
		System.out.println("\t���Աݾ� \t\t\t" + tt);
		System.out.println("\t�Ž����� \t\t\t" + (tt - tot));
		System.out.println();
		System.out.println();
		System.out.println("\t\t   �����մϴ�");
		System.out.println();

		System.out.println("\t------������ ��� �Ϸ�------\n");

		// �޴� ���� ȭ������ ���ư���
		check = false;
		checkReceipt = false;
		map.clear();	// ��ٱ��� ����
		salesMenuDisp();

	}

	// ��ȿ�� �˻� �޼ҵ�
	public boolean validityTest() throws IOException
	{
		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)


		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		System.out.print("\t�̸� �Է�: ");
		name = br.readLine();

		System.out.print("\t�ֹι�ȣ �Է�(xxxxxx-xxxxxxx): ");
		number = br.readLine();

		
		total = 0;

		if (number.length() != 14)
		{
			System.out.println("\t>> �Է� ����~!!! ��ٱ��Ϸ� ���ư��ϴ�.");
			basketCheck();
		}


		for (int i=0; i<13; i++)
		{
			if (i==6)
			{
				continue; 
			}
			total += chk[i] * Integer.parseInt(number.substring(i, (i+1))); // i���� i+1 �������� ���ڿ� ���� 
		}

		int su = 11 - total % 11; 
		su = su % 10;
		
		if (su == Integer.parseInt(number.substring(13)))
		{
			System.out.println("\t>> ��Ȯ�� �ֹι�ȣ~!!!");
			return true;
		}
		else
		{
				System.out.println("\t>> �߸��� �ֹι�ȣ~!!!");
				check = false;
				return false;
		}
	}

	// �� �޾Ƽ� ���Ϳ� �����ϱ� �޼ҵ�
	public void payment() throws IOException
	{
		// �ݾ� �ޱ�
		System.out.print("\t������ 10000���� ����: ");
		m10000 = sc.nextInt();
		System.out.print("\t������ 5000���� ����: ");
		m5000 = sc.nextInt();
		System.out.print("\t������ 1000���� ����: ");
		m1000 = sc.nextInt();
		System.out.print("\t������ 500�� ����: ");
		m500 = sc.nextInt();
		System.out.print("\t������ 100�� ����: ");
		m100 = sc.nextInt();

		tt = 10000*m10000 + 5000*m5000 + 1000*m1000 + 500*m500 + 100*m100;
		
		restMoney = tt - tot;
		
		if (restMoney < 0)
			System.out.println("\n\t���� �ݾ�: " + tt + "��, " + (-restMoney) + "���� �����մϴ�.");			
		else
			System.out.println("\n\t���� �ݾ�: " + tt + "��, �Ž�����: " + restMoney + "��");

		// �Ѿ׺��� ���� ���� �־��� ���
		if (tot > tt)
		{
			//��ٱ��� Ȯ������ ���ư��� �ϱ�
			System.out.println("\t��ٱ��Ϸ� ���ư��ϴ�.");
			basketCheck();
		}
		else // ���ų� ���� �־��� ���
		{
			// �ܵ� ���
			if ( checkPayment() == true )
			{
				// �����Ϸ�
				checkReceipt = true;
				ch2 = true;
				ch5 = true;
				System.out.println("\t������ �Ϸ�Ǿ����ϴ�.");
			}
			else	// �ܵ� ����
			{
				System.out.println( "\t �Ž����� �� " + restMoney + "���� �����ؼ� �ǸŰ� �Ұ��մϴ�. ��ٱ��Ϸ� ���ư��ϴ�.");
				basketCheck();	// ��ٱ��� Ȯ���ϴ� ȭ������
			}
		}

		if (ch1 && ch2)
		{
			pe.add(new Person(name, number, map.get(a)));	// ������ ��Ͽ� ����
		}
		if (ch4 && ch5)
		{
			pppp.setNumber((pppp.getNumber()+map.get(a)));	// ������ ����� ����ũ ������ �߰�
		}

		ch1 = ch2 = false;
		ch4 = ch5 = false;
		listCheck = false;
	}

	// �ܵ��� ������� Ȯ���ϰ� �ܵ� ��ȯ�ϴ� �޼ҵ�
	public boolean checkPayment()
	{
		int[] arr = {5000, 1000, 500, 100};
		int[] arr1 = {0, 0, 0, 0};
		
		for (int i=0; i<4; i++)
		{
			if (restMoney/arr[i]  > moneymap.get(arr[i]))
			{
				arr1[i] = moneymap.get(arr[i]);
				restMoney = restMoney - moneymap.get(arr[i])*arr[i];
			}
			else 
			{
				arr1[i] = restMoney/arr[i];
				restMoney = restMoney - (restMoney/arr[i])*arr[i];
			}

			// �ܵ� �������� ���� ���
			if (restMoney == 0)
			{
				System.out.println("\n\t�Ž������� ��ȯ�մϴ�.\t");

				// �������� � ��ȯ�ߴ��� ���(�մ����� �ȳ��� ����)
				System.out.println("\t5000��: " + arr1[0]);
				System.out.println("\t1000��: " + arr1[1]);
				System.out.println("\t500��: " + arr1[2]);
				System.out.println("\t100��: " + arr1[3] + "\n");

				// moneymap ������Ʈ(�� �� ����)
				moneymap.replace(5000, moneymap.get(5000) - arr1[0]);
				moneymap.replace(1000, moneymap.get(1000) - arr1[1]);
				moneymap.replace(500, moneymap.get(500) - arr1[2]);
				moneymap.replace(100, moneymap.get(100) - arr1[3]);

				// ���Ǳ⿡ ���� �� ����
				profitmap.replace(10000, profitmap.get(10000) + m10000);
				profitmap.replace(5000, profitmap.get(5000) + m5000);
				profitmap.replace(1000, profitmap.get(1000) + m1000);
				profitmap.replace(500, profitmap.get(500) + m500);
				profitmap.replace(100, profitmap.get(100) + m100);

				return true;
			}
		}
	
		// �ܵ� ������ ��� 
		if (restMoney != 0)
		{
			return false;
		}

		return false;
	}
}