import java.io.IOException;

public class ChoiceManagementMode extends Modes 
{


	public void choice() throws IOException // ��������ü�޴�
	{
		//sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("\t1. �޴�����");
		System.out.println("\t2. ������");
		System.out.println("\t3. �ܰ����");
		System.out.println("\t4. ������������ȸ");
		System.out.println("\t5. ��� �������� ���ư���");
		System.out.print("\n\t >> ��ȣ�� �������ּ���: ");
		int a = sc.nextInt();
		
		if (a == 1)
		{
			m.menuDisp();	//1. �޴����� 
		}
		else if (a == 2)
		{
			//������
			st.stockMenuChoice();
		}
		else if (a == 3)
		{
			//�ܰ����
			bs.balanceDisp();
		}
		else if (a == 4)
		{
			// ������������ȸ
			bc.checkDisp();
		}
		else if (a == 5)
		{
			// ��� �������� ���ư���
			modeDisp();
		}

		else
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			choice();
		}
	
		
	}



}
