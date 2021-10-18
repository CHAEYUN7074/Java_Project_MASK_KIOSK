import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MenusManagement extends ChoiceManagementMode
{

	public static final int E_ADD  = 1;	
	public static final int E_NAMEUPDATE = 2;
	public static final int E_PRICEUPDATE = 3;
	public static final int E_DELETE = 4;
	public static final int E_MODE = 5;


	public static String con;

	public int pNum;         //-- 품번
	public String productName;   //-- 상품 이름
	public int price;         //-- 가격
	public int stock;         //-- 재고


	static
	{
		con = "Y";
	}

	public void menuDisp() throws IOException //메뉴 출력
	{
		System.out.println("\t\t\t[ 메\t뉴 ]");
		System.out.println("\t-----------------------------------------");
		System.out.println("\t품번\t품명\t\t가격\t 남은 수량 ");
		System.out.println("\t-----------------------------------------");
		for (Product pd : p)
		{
			System.out.println("\t" + pd.getpNum() + "\t" + pd.getProductName()
								+ "\t" + pd.getPrice() + "\t" + pd.getStock());
		}
		System.out.println("\t-----------------------------------------");

		System.out.println("\t1. 상품 생성");
		System.out.println("\t2. 상품명 변경");
		System.out.println("\t3. 상품 가격 변경");
		System.out.println("\t4. 상품 삭제");
		System.out.println("\t5. 기본 세팅");
		System.out.println("\t6. : 관리자 메뉴로 돌아가기");
		System.out.println("\t7. : 종료");

		menuSelect();

	}

	public void menuSelect() throws IOException, NumberFormatException //메뉴 선택
	{
		System.out.print("\n\t>> 무엇을 하시겠습니까?: ");
		sel = Integer.parseInt(br.readLine());
		menuRun();
		System.out.println();
		
	}

	public void basicSetting() throws IOException	//5번 기본세팅
	{
		p.add(new Product(1, "KF94마스크", 1500,10));
		p.add(new Product(2, "덴탈마스크", 500, 10));
		p.add(new Product(3, "자가진단키트", 4400, 10));
		p.add(new Product(4, "손소독제", 2000, 10));
		p.add(new Product(5, "항균물티슈", 1000, 10));

		System.out.println("\n\t기본 세팅이 정상적으로 완료되었습니다.");

		menuDisp();
	}

	public void createMenu() throws IOException //상품 생성
	{	
		do
		{
			System.out.println();
			System.out.printf("%d번 째 품번(6번부터 입력), 이름, 가격, 재고 입력 (공백 구분) : ", (p.size() + 1));
			
			pNum = sc.nextInt();

			productName = sc.next();

			price = sc.nextInt();

			stock = sc.nextInt();

			p.add(new Product(pNum, productName, price, stock));

			System.out.println();
			System.out.print("상품 입력을 더 하시겠습니까?  ");

			con = br.readLine().toUpperCase();
			System.out.println();

			
		}
		while (con.equals("Y"));

		menuDisp();

		// *참고 : 기본세팅이 1~5번 정해져있기 때문에 기본세팅을 먼저 하고 이외의 상품 6번부터 추가등록해야함.

	}

	public void updateMenuName() throws IOException //상품명 변경
	{
		System.out.println();
		System.out.print("\t기존 상품 입력: ");
		String ele = br.readLine();
		boolean flag = false;
      

		for(Product pro : p)
		{
			if(pro.getProductName().equals(ele))
			{
         
			System.out.print("\t변경할 상품 입력 : ");
			String chaEle = br.readLine();

			pro.setProductName(chaEle);
			flag = true;
			System.out.println("\t상품이 변경되었습니다. ");
         }
      }

      if(!flag)
		  System.out.println("\t상품이 존재하지 않습니다.");
	 
	  System.out.println();
	  menuDisp();


	}

	
	public void updateMenuPrice() throws IOException //상품가격 변경
	{
		System.out.println();
		System.out.print("\t기존 상품 입력: ");
		String ele = (br.readLine());
		boolean flag = false;
		
		for(Product pro : p)
		{
			if(pro.getProductName().equals(ele))
			{
				System.out.print("\t변경할 상품 가격 입력 : ");
				Integer chaEle = Integer.parseInt(br.readLine());

				pro.setPrice(chaEle);
				flag = true;
				System.out.println("\t상품가격이 변경되었습니다. ");
			}
      }

      if(!flag)
		  System.out.println("\t상품이 존재하지 않습니다.");

      

      System.out.println();
      menuDisp();

	}

	public void deleteMenu() throws IOException
	{
		System.out.println();
		System.out.print("\t삭제할 상품 이름 입력: ");
		String ele = br.readLine();
		boolean flag = false;

		for(Product pro : p){
			if(pro.getProductName().equals(ele))
			{

				p.remove(pro);
				flag = true;
				System.out.printf("\t%s 상품이 삭제되었습니다.\n", ele);
				break;
			
			}
		}
		if (!flag)
			System.out.println("\t상품이 존재하지 않습니다.");

		menuDisp();

	}

	public void menuRun() throws IOException
	{
	
		switch(sel){
		case 1 : createMenu(); break;
		case 2 : updateMenuName(); break;
		case 3 : updateMenuPrice(); break;
		case 4 : deleteMenu(); break;
		case 5 : basicSetting(); break;	
		case 6 : choice(); break;
		case 7 : exit(); break;
		default : System.out.println("\t>> 메뉴 선택 오류"); menuDisp(); break;
		}

	}

	public void exit() 
	{
		System.exit(-1);
	}
		
	

}