import java.io.IOException;


public class Sales extends Modes
{

/*
	public Sales()
	{
		//System.out.println("������ ���� Ȯ��");
	}
*/
	// �޴� ��� �޼ҵ�
	public void salesMenuDisp() throws IOException
	{
		System.out.println("\t\t\t[ ��\t�� ]");
		System.out.println("\t----------------------------------------");
		System.out.println("\tǰ��\tǰ��\t\t����\t���� ���� ");

		for (Product pd : p)
		{
			// ������ 0�ΰ�� ǰ�� ǥ���ϱ�
			if (pd.getStock() == 0) 
			{
					System.out.println("\t" + pd.getpNum() + "\t" + pd.getProductName()
						+ "\t" + pd.getPrice() + "\t" + "-ǰ��-");
					continue;
			}
			// ������ 0�� �ƴѰ�� ���� ���
			System.out.println("\t" + pd.getpNum() + "\t" + pd.getProductName()
									+ "\t" + pd.getPrice() + "\t" + pd.getStock());
		}
		System.out.println("\t----------------------------------------");
		System.out.println("\t��KF94����ũ�� �δ� 5�� ���� ����");
		System.out.println("\t----------------------------------------");
		System.out.println("\t1. ��ٱ��Ͽ� ���");
		System.out.println("\t2. ��ٱ��� Ȯ���ϱ�");
		System.out.println();		//����
		System.out.println("\t0. ��� �������� ���ư���");
		System.out.println("\n");	//����

		System.out.print("\t>> ������ �Ͻðڽ��ϱ�?: ");
		switch (br.readLine().trim())
		{
			case "1": b.salesMenuSelect(); break; //��ٱ��� ��� �޼ҵ� ����
			case "2": b.basketCheck(); break;	  //��ٱ��� Ȯ�� �޼ҵ� ����
			case "0": modeDisp(); break;		  //��� ��� �޼ҵ�� ���ư���
			default: System.out.println("\n\t>> �޴� ���� ����~!!!\n"); salesMenuDisp(); break;	//���� ������ �޴� ��� �޼ҵ� ���Ʊ� 
		}
	}
}