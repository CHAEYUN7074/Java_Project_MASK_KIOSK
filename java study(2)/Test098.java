/*==========================================================
 ���� Ŭ���� �ν��Ͻ� ����
 -Ŭ������ �ν��Ͻ� Ȱ��
============================================================*/
/*
1~3 ������ ������ �߻����Ѽ�
���� ���� �� ���� ���α׷��� �����Ѵ�
��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�
���� �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�
���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

�ر��� ������ �� 1: ����, 2; ����, 3:��

���� ��)
1: ���� 2: ���� 3:�� �� �Է�(1~3) : 4
1: ���� 2: ���� 3:�� �� �Է�(1~3) : -2
1: ���� 2: ���� 3:�� �� �Է�(1~3) : 2

-���� : ����
-��ǻ�� : ��

>>�º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�.
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.util.Scanner;
import java.util.Random;



class RpsGame 
	{

	// �ֿ� �Ӽ� ����(���� ����)
	private int user;
	private int com;
	// private String resultStr;

	// �ֿ� ��� ����(�޼ҵ� ����)
	//   - ������� ���� ������ �Է¹޴� ����� �޼ҵ�
	public void input() 
		{
		Scanner scan = new Scanner(System.in);
		do 
		{
			System.out.print("1. ����, 2. ����, 3. �� �� �Է�(1~3) : ");
			user = scan.nextInt();

		}
		while(1 > user || user > 3);
	}

	// �ֿ� ��� ����(�޼ҵ� ����)
	//   - ��ǻ���� ���� ������ �Է¹޴� ����� �޼ҵ�
	private void runCom() 
		{
		Random ran = new Random();
		com = ran.nextInt(3) + 1;		// [ + 1 ] 0 1 2 -> 1 2 3
		}

	// �ֿ� ��� ����(�޼ҵ� ����)
	//   - �߰� ��� ���(������ ���� ���� Ȯ��)
	public void middleCale() 
		{
		String[] str = {"����", "����", "��"};
		System.out.println();
		System.out.println(" - ���� : " + str[user - 1]);
		System.out.println(" - ��ǻ�� : " + str[com - 1]);
		// -- [ - 1] => str[1] str[2] str[3] -> str[0] str[1] str[2]
		}

	// �ֿ� ��� ����(�޼ҵ� ����)
	//   - �ºο� ���� ����
	public String resultCale() 
		{
			String result = "���º� ��Ȳ�Դϴ�~!!!";

		if((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {		// ������ �¸��� ��Ȳ

			result = "����� �¸��߽��ϴ�~!!!";

		}
		else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {		// ��ǻ�Ͱ� �¸��� ��Ȳ

			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!";

		}

		return result;

	}

	// �ֿ� ��� ����(�޼ҵ� ����)
	//   - ���� ��� ���
	public void print(String str) 
		{

		System.out.printf("\n>> �º� ���� ��� : %s\n", str);

	}

}
public class Test098 
	{
	public static void main(String[] args) 
	{

		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCale();
		String result = ob.resultCale();
		// System.out.println(result);
		ob.print(result);

	}

}





