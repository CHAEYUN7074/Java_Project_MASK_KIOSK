import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Modes 
{
	public static final int S_MODE = 1;		//-- �Ǹ� ���
	public static final int M_MODE = 2; 	//-- ���� ���
	public static final int P_END = 3; 		//-- ���α׷� ����
	private static final String pass = "1234";

	// �ֿ� �Ӽ� ����
	public static BufferedReader br;
	public static Scanner sc;
	public static Integer sel;
	public static Map<Integer, Integer> map;		//-- ǰ��, ����
	public static ArrayList<Product> p;
	public static ArrayList<Person> pe = new ArrayList<Person>();
	public static Map<Integer, Integer> moneymap;
    public static Map<Integer, Integer>profitmap;
    public static Map<Integer, Integer> soldProductsMap;	//-- �Ǹ��� ��ǰ ����Ʈ


	public static Sales s = new Sales();
	public static MenusManagement m = new MenusManagement();
	public static Basket b = new Basket();
	public static Pay py = new Pay();
	public static Stock st = new Stock();
	public static BuyerCheck bc = new BuyerCheck();
	public static Balance bs = new Balance();
	 
	

	
  



	// static �ʱ�ȭ ��
	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));
		//scanner �ν��Ͻ� ����
		sc = new Scanner(System.in);
		// HashMap �ڷᱸ�� ����
		map = new HashMap<Integer, Integer>();
		moneymap = new HashMap<Integer,Integer>();
		profitmap = new HashMap<Integer,Integer>();
		soldProductsMap = new HashMap<Integer, Integer>();

		p = new ArrayList<Product>();


		// ����� �Է°� �ʱ�ȭ
		sel = 1;
	}

	// ��� ��� �޼ҵ�
	public void modeDisp() throws IOException
	{
		System.out.println("\t[��� ����]");
		System.out.println("\t1. �Ǹ� ���");
		System.out.println("\t2. ���� ���");
		System.out.println("\t3. ����");	
		
		System.out.print("\t>> ��� ����(1, 2, 3) :");
		modeSelect();

	}

	// ��� ���� �޼ҵ�
	public void modeSelect() throws IOException, NumberFormatException
	{
		sel = Integer.parseInt(br.readLine());
		System.out.println();
		modeRun();
	}

	// ���õ� ��� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public void modeRun() throws IOException
	{
		switch (sel)
		{
			case Modes.S_MODE: System.out.println("\t[�ǸŸ��� ��ȯ�մϴ�.]\n"); s.salesMenuDisp(); break;
			case Modes.M_MODE: System.out.println("\t[�������� ��ȯ�մϴ�.]\n");
							   System.out.print("\t��й�ȣ�� �Է��ϼ���.");
							   if(pass.equals(br.readLine())) m.choice();
							   else 
							   {
							       System.out.println("��й�ȣ ����\n");
								   modeDisp();
							   } break;
			case P_END:exit(); break;
			default: System.out.println("\t>> �޴� ���� ����~!!!");  break;
		
		}
	}

	public void exit() 
	{
		System.exit(-1);
	}

	public void test()
	{
		System.out.println("test");
	}
}