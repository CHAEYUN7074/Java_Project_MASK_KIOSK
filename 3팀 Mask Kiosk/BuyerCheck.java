import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyerCheck extends Modes
{	


	public void checkDisp() throws IOException{
	
	System.out.println();
	System.out.println("\t1. ������ ���� ��ȸ");
    System.out.println("\t2. ��� �������� ����");	
	System.out.println("\t3. ����");

	checkSelect();
	
	}

	public void checkSelect() throws IOException{

		System.out.print("\n\t>> ���� : ");
		sel = sc.nextInt();
		personRun();
	}

	// ��ȸ
	public void checkPerson() throws IOException
	{
		System.out.println("\t[\t������ ���� ��ȸ\t]");
		System.out.println("\t------------------------------------");
		System.out.println("\t�̸�\t�ֹε�Ϲ�ȣ\t����ũ ���� ����");
		for (Person ps : pe)
		{
			System.out.println("\t" + ps.getpName() + "\t" + ps.getpNumber()
								+ "\t" + ps.getNumber());
		}
		System.out.println("\t------------------------------------");
		
		checkDisp();
	}

	public void personRun() throws IOException
	{
		switch(sel)
		{
		case 1 : checkPerson(); break;
		case 2 : modeDisp(); break;
		case 3 : exit(); break;
		default : System.out.println("\t>> �޴� ���� ����"); checkDisp(); break;

		}

	}

	public void exit() 
    {
      System.exit(-1);
    }

}