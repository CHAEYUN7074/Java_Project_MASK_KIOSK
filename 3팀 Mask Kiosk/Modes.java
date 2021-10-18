import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Modes 
{
	public static final int S_MODE = 1;		//-- 판매 모드
	public static final int M_MODE = 2; 	//-- 관리 모드
	public static final int P_END = 3; 		//-- 프로그램 종료
	private static final String pass = "1234";

	// 주요 속성 구성
	public static BufferedReader br;
	public static Scanner sc;
	public static Integer sel;
	public static Map<Integer, Integer> map;		//-- 품번, 수량
	public static ArrayList<Product> p;
	public static ArrayList<Person> pe = new ArrayList<Person>();
	public static Map<Integer, Integer> moneymap;
    public static Map<Integer, Integer>profitmap;
    public static Map<Integer, Integer> soldProductsMap;	//-- 판매한 물품 리스트


	public static Sales s = new Sales();
	public static MenusManagement m = new MenusManagement();
	public static Basket b = new Basket();
	public static Pay py = new Pay();
	public static Stock st = new Stock();
	public static BuyerCheck bc = new BuyerCheck();
	public static Balance bs = new Balance();
	 
	

	
  



	// static 초기화 블럭
	static
	{
		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));
		//scanner 인스턴스 생성
		sc = new Scanner(System.in);
		// HashMap 자료구조 생성
		map = new HashMap<Integer, Integer>();
		moneymap = new HashMap<Integer,Integer>();
		profitmap = new HashMap<Integer,Integer>();
		soldProductsMap = new HashMap<Integer, Integer>();

		p = new ArrayList<Product>();


		// 사용자 입력값 초기화
		sel = 1;
	}

	// 모드 출력 메소드
	public void modeDisp() throws IOException
	{
		System.out.println("\t[모드 선택]");
		System.out.println("\t1. 판매 모드");
		System.out.println("\t2. 관리 모드");
		System.out.println("\t3. 종료");	
		
		System.out.print("\t>> 모드 선택(1, 2, 3) :");
		modeSelect();

	}

	// 모드 선택 메소드
	public void modeSelect() throws IOException, NumberFormatException
	{
		sel = Integer.parseInt(br.readLine());
		System.out.println();
		modeRun();
	}

	// 선택된 모드 실행에 따른 기능 호출 메소드
	public void modeRun() throws IOException
	{
		switch (sel)
		{
			case Modes.S_MODE: System.out.println("\t[판매모드로 전환합니다.]\n"); s.salesMenuDisp(); break;
			case Modes.M_MODE: System.out.println("\t[관리모드로 전환합니다.]\n");
							   System.out.print("\t비밀번호를 입력하세요.");
							   if(pass.equals(br.readLine())) m.choice();
							   else 
							   {
							       System.out.println("비밀번호 오류\n");
								   modeDisp();
							   } break;
			case P_END:exit(); break;
			default: System.out.println("\t>> 메뉴 선택 오류~!!!");  break;
		
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