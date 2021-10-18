import java.io.*;
import java.util.*;

public class Balance extends ChoiceManagementMode		
{
	public int manwon;
	public int ocheon; 
	public int cheon;
	public int obaek;
	public int baek; 


	private int totalChargedMoney = 0;		//-- 보충한 돈의 총 합
	private boolean check = false;

	private int total_profit = 0;			//-- 판매금
	private int rest_money = 0;				//-- 잔돈 남은 것

	//순수익 =  수익금 - (초기 세팅 값 - 현재 남아있는 잔돈 + 보충한 돈)
	private int earnings = 0;


   
	public static int supplement1=0;       //10000원
	public static int supplement2=0;		//5000원
	public static int supplement3=0;		//1000원
	public static int supplement4=0;		//500원
	public static int total=0;				//100원



	public void balanceDisp() throws IOException	//잔금관리 전체메뉴
	{
		System.out.println();
		System.out.println("\t1. 잔돈관리");
		System.out.println("\t2. 수익출력");
		System.out.println("\t3. 관리모드로 돌아가기");
		System.out.println("\t4. 종료");
		System.out.print("\n\t >> 번호를 선택해주세요: ");
		int sel = sc.nextInt();

		switch(sel)
		{
			case 1 : changeDisp();break; 
			case 2 : profit(); break;
			case 3 : choice();break;
			case 4 : exit();
		}
	  
   }//end balanceDisp()
   
   
   public void changeDisp() throws IOException      // 1. 잔돈관리 메뉴 line25
   {
	   System.out.println();
		System.out.println("\t1. 잔돈기본세팅");
		System.out.println("\t2. 잔돈초기화");
		System.out.println("\t3. 잔돈충전");
		System.out.println("\t4. 잔돈 확인");
		System.out.println("\t5. 잔금메뉴로 돌아가기");      
		System.out.print("\n\t >> 번호를 선택해주세요: ");
		int sel = sc.nextInt();
		
		switch(sel)
		{
			case 1 : changeSetting(); break; 
			case 2 : change(); break; 
			case 3 : charging();break;
			case 4 : showChanges();break;
			case 5 : balanceDisp();break;
			default : System.out.println("\t선택오류!!"); balanceDisp();break;
		}

   }



   public void changeSetting() throws IOException	// case1 수익금 + 잔돈기본세팅 
   {
	   // 수익금 초기화
	   profitmap.put(10000,0);
	   profitmap.put(5000,0);
	   profitmap.put(1000,0);
	   profitmap.put(500,0);
	   profitmap.put(100,0);
		
	   // 잔돈 초기화
	   moneymap.put(10000,0);
	   moneymap.put(5000,10);
	   moneymap.put(1000,10);
	   moneymap.put(500,10);
	   moneymap.put(100,10);
	   
	   System.out.println("\n\t잔돈기본세팅이 완료되었습니다.\n");
	   
	   changeDisp();
   }
   
 
   public void change() throws IOException   // case 2 잔돈초기화 
   {
	   System.out.print("\n5000원 1000원 500원 100원 순으로 개수를 입력해주세요 (공백구분) : ");
	   
	   ocheon   = sc.nextInt();
	   cheon    = sc.nextInt();
	   obaek    = sc.nextInt();
	   baek     = sc.nextInt();
	   
	   moneymap.put(5000,ocheon);
	   moneymap.put(1000,cheon);
	   moneymap.put(500,obaek);
	   moneymap.put(100,baek);
	   
	   System.out.println("\n\t잔돈 초기화가 완료되었습니다.\n");
	   
	   
	   //-- 잔고 부족시 메시지출력
	   if (moneymap.get(5000)<=3)
		   System.out.println("오천원권이 부족합니다. 보충해주세요./n");
	   
	   if (moneymap.get(1000)<=3)
		   System.out.println("천원권이 부족합니다. 보충해주세요./n");
	   
	   if (moneymap.get(1000)<=3)
		   System.out.println("오백원 동전이 부족합니다. 보충해주세요./n");
	   
	   if (moneymap.get(1000)<=3)
		   System.out.println("백원 동전이 부족합니다. 보충해주세요./n");
	   
	   
	   changeDisp(); 
   }



   public void charging() throws IOException  // case3 잔돈 충전
   {
	   check = false;

	  // 보충할 돈
	  supplement1=0;      //5000원
	  supplement2=0;      //1000원
	  supplement3=0;      //500원
	  supplement4=0;      //100원

	  System.out.print("권종과 보충 개수를 입력하세요. 예) 5000 5 (공백구분) :"); 
	  int k = sc.nextInt();
	  int v = sc.nextInt();

	  if (k==5000)
	  {
		 moneymap.put(k,moneymap.get(k) +v);
		 supplement1 = k * moneymap.get(k);

		System.out.println("\n\t5000원 충전이 완료되었습니다.");
		System.out.println("\t개수 : "+moneymap.get(k));
	  }
	  else if (k == 1000)
	 {
		moneymap.put(k,moneymap.get(k) +v);
		 supplement2 = k * moneymap.get(k);
		System.out.println("\n\t1000원 충전이 완료되었습니다.");
		System.out.println("\t개수 : "+moneymap.get(k));
	 }
	 else if (k == 500)
	 {
		moneymap.put(k,moneymap.get(k) +v);
		supplement3 = k * moneymap.get(k);
		System.out.println("\n\t500원 충전이 완료되었습니다.");
		System.out.println("\t개수 : "+moneymap.get(k));
	 }
	 else if (k == 100)
	 {
		moneymap.put(k,moneymap.get(k) +v);
		 supplement4 = k * moneymap.get(k);

		System.out.println("\n\t100원 충전이 완료되었습니다.");
		System.out.println("\t개수 : "+moneymap.get(k));

	 }
	 else
	   {
		check = true;
		System.out.print("\n\t권종을 잘못 입력하셨습니다.\n");
	   } 

  
	
	if (!check)		// 보충한 돈 총 합
	{
		totalChargedMoney += k * v;
	}
  	
	
	changeDisp(); 


   }// end charging()




   public void showChanges() throws IOException	// case4 잔돈출력
	{
		rest_money = moneymap.get(5000) * 5000 + moneymap.get(1000) * 1000 
							+ moneymap.get(500) * 500 + moneymap.get(100) * 100;
		
		System.out.println("\t5000원: " + moneymap.get(5000) + "개");
		System.out.println("\t1000원: " + moneymap.get(1000) + "개");
		System.out.println("\t500원: " + moneymap.get(500) + "개");
		System.out.println("\t100원: " + moneymap.get(100) + "개");

		System.out.println("\t남아 있는 잔돈의 합: " + rest_money + "원");

		changeDisp();	 

	}

//============================================================================================여기부터 수익출력시작	

   public void profit() throws IOException  //수익출력메뉴 
   {
	   //System.out.print("\n\t총 결제 금액 : "); //이거 대신 수익을 받아와야하는데,,
	   
		System.out.println();
		System.out.println("\t1. 판매금 출력");
		System.out.println("\t2. 순수익 출력");
		System.out.println("\t3. 잔금메뉴로 돌아가기");      
		System.out.print("\n\t >> 번호를 선택해주세요: ");
		int sel = sc.nextInt();
		
		switch(sel)
		{
			case 1 : showProfit(); break; 
			case 2 : showEarnings(); break; 
			case 3 : balanceDisp();break;
			default : System.out.println("\t선택오류!!"); balanceDisp();break;
		}	   

   }


	public void showProfit() throws IOException	// case1 판매금 출력 : 순수익X 판매한 수익전체
	{
	   total_profit = profitmap.get(10000) * 10000 + profitmap.get(5000) * 5000 + profitmap.get(1000) * 1000 
					+ profitmap.get(500) * 500 + profitmap.get(100) * 100;

		System.out.println("\t10000원: " + profitmap.get(10000) + "개");
		System.out.println("\t5000원: " + profitmap.get(5000) + "개");
		System.out.println("\t1000원: " + profitmap.get(1000) + "개");
		System.out.println("\t500원: " + profitmap.get(500) + "개");
		System.out.println("\t100원: " + profitmap.get(100) + "개");

		System.out.println("\t판매해서 들어온 금액의 합: " + total_profit + "원");

		profit();	//수익출력메뉴로 돌아가도록
	}

	
	public void showEarnings()	throws IOException	//case2 순수익 출력
	{
		//*

		// 판매한 물품 보여주기
		System.out.println("\t판매한 품목\t\t수량\t금액");
		System.out.println("\t-------------------------------------");

		for (Integer key : soldProductsMap.keySet()) 
		{
			Integer value = soldProductsMap.get(key);
			for (Product pd : p)
			{
				if(key == pd.getpNum())
				{
					System.out.println("\t" + pd.getProductName() +"\t\t" + value + "\t" + value * pd.getPrice());
				}

			}
		}
		System.out.println("\t-------------------------------------");



		// 수익 총액(자판기에 들어온 돈)
	   total_profit = profitmap.get(10000) * 10000 + profitmap.get(5000) * 5000 + profitmap.get(1000) * 1000 
							+ profitmap.get(500) * 500 + profitmap.get(100) * 100;

		// 남아있는 잔돈의 총 합
	   rest_money = moneymap.get(5000) * 5000 + moneymap.get(1000) * 1000 
							+ moneymap.get(500) * 500 + moneymap.get(100) * 100;

		//순수익 =  수익금 - (초기 세팅 값 - 현재 남아있는 잔돈 + 보충한 돈)
	   earnings = total_profit - (99000 - rest_money + totalChargedMoney);

	   System.out.println("\t-------------------------------------");
   	   System.out.println("\t순수익: " + earnings );

	   profit();	//수익출력메뉴로 돌아가도록
	   
	}




	
	
   
}
