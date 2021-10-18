import java.io.*;
import java.util.*;


public class Stock extends MenusManagement
{
   
   
   //재고현황, 재고 등록 선택
   public void stockMenuChoice() throws IOException // 재고관리 전체 메뉴
   {
      System.out.println();
      System.out.println("\t1. 재고현황");
      System.out.println("\t2. 재고변경");
	  System.out.println("\t3. 관리모드로 돌아가기");
	  System.out.println("\t4. 종료");
      System.out.print("\n\t >> 번호를 선택해주세요: ");
      int sel = sc.nextInt();

     switch(sel)
      {
      case 1 : printText(); break;
      case 2 : stockUpdate();break;
	  case 3 : choice();break;
	  case 4 : exit();
	  default: System.out.println("\t>> 메뉴 선택 오류~!!!"); stockMenuChoice(); break;
      }
      
   }
  

   public void printText() throws IOException	// 재고현황출력
   {
      try 
      {
       BufferedWriter out = new BufferedWriter(new FileWriter("재고 현황.txt"));
       String s = "[\t\t재고 현황\t\t]";
       String l;
       int i;
       out.write(s); out.newLine();
       for (Product pd : p)
       {
          
         l = pd.getProductName()+"\t"+pd.getStock();
         out.write(l); out.newLine();

       }
        //out.write(l); out.newLine();!!!!!!!

        out.close();
         } 
         catch (IOException e) 
         {
         System.err.println(e); // 에러가 있다면 메시지 출력
         System.exit(1);
         }
		 System.out.println("\t재고 현황 파일이 저장되었습니다.");

      for (Product pd : p)
      { 
		    if(pd.getProductName().equals("KF94마스크")&&pd.getStock()<=3)
		    System.out.println("\t KF94마스크이 부족합니다. 보충해주세요.");

		   if(pd.getProductName().equals("덴탈마스크")&&pd.getStock()<=3)
		    System.out.println("\t 덴탈마스크가 부족합니다. 보충해주세요.");
	   
	   if(pd.getProductName().equals("자가진단키트")&&pd.getStock()<=3)
		   System.out.println("\t 자가진단키트가 부족합니다. 보충해주세요.");
	   
	    if(pd.getProductName().equals("손소독제")&&pd.getStock()<=3)
		   System.out.println("\t 손소독제가 부족합니다. 보충해주세요.");
	   
	   if(pd.getProductName().equals("항균물티슈")&&pd.getStock()<=3)
		   System.out.println("\t 항균물티슈가 부족합니다. 보충해주세요.");
	  
	  }

      stockMenuChoice();
 
   }// end printText()

  
   

   public void stockUpdate() throws IOException		//재고 초기화하기(기본세팅에서 초기화됨)
   {
	         for (Product pd : p)
      { 

		   if(pd.getProductName().equals("덴탈마스크")&&pd.getStock()<=3)
		    System.out.println("\t 덴탈마스크가 부족합니다. 보충해주세요.");
	   
	   if(pd.getProductName().equals("자가진단키트")&&pd.getStock()<=3)
		   System.out.println("\t 자가진단키트가 부족합니다. 보충해주세요.");
	   
	    if(pd.getProductName().equals("손소독제")&&pd.getStock()<=3)
		   System.out.println("\t 손소독제가 부족합니다. 보충해주세요.");
	   
	   if(pd.getProductName().equals("항균물티슈")&&pd.getStock()<=3)
		   System.out.println("\t 항균물티슈가 부족합니다. 보충해주세요.");
	  
	  }
    //자동발주
	String ele;
	int num;

	boolean check=false;

      for (Product pd : p)
      {   
         if(pd.getProductName().equals("KF94마스크")&&pd.getStock()<=3)
         {
               pd.setStock(20);
               System.out.println("\t 마스크 자동발주를 시행하였습니다 >> "+pd.getStock()+"개");		   
         }
      }

	System.out.println(); //개행 
   
	//수동발주
	System.out.print("\t 발주할 상품명을 입력해주세요 : ");
	ele = sc.next();
   
 
    for (Product pd : p) 
	{   
		 
		 if(!pd.getProductName().equals("KF94마스크"))
		  {
			
				if(pd.getProductName().equals(ele))
				{
					System.out.print("\t상품의 재고 수 설정 : ");
					num = sc.nextInt();
					pd.setStock(num); 
					check = true;
					System.out.println("\t 수동 발주를 시행하였습니다");	
					break;
				}
		 }
	}

	 	 if (!check)
	 {
		System.out.println("\t상품이 존재하지 않습니다.");
		System.out.println("\t※KF94마스크는 자동발주 대상입니다");
	 }

		stockMenuChoice();

   }//end StockUpdate()
}