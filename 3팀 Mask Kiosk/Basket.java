import java.io.IOException;

public class Basket extends Sales
{

   // 장바구니에 담기 메소드
   public void salesMenuSelect() throws IOException, NumberFormatException
   {
      System.out.print("\t>> 담을 품목번호와 수량 입력(품목번호 수량) :");
      
      Integer product = sc.nextInt();
      Integer number = sc.nextInt();
      System.out.println();
      boolean flag = true;

      // 구매 수량 제한 (마스크(5개 이하로만 선택하도록) + 재고 이하로 선택하도록(전체 품목에 해당))
      for (Product pd : p)
      {
         // 사용자가 입력한 품목번호가 실제로 저장된 데이터이고, 해당 품목의 재고수량이 사용자가 입력한 수량보다 충분할 때 
         if((pd.getpNum() == product) && (pd.getStock() >= number))   
         {
			//구매할 품목이 KF94마스크 일 경우 (* KF94마스크 5개 이상 구입 불가능)
            if( pd.getProductName().equals("KF94마스크"))
            {
               //구입 수량이 5개 이하면, 장바구니에 넣기
               if ( number <= 5 )
               {                  
                  // 이미 장바구니에 있는 품목인지 아닌지 판단
                  if ( map.containsKey(product) )
                  {
                     // 기존에 가진 수량과 새로 추가하려는 수량의 합이 5 이하면
                     if( map.get(product) + number <= 5)
                     {
						//업데이트
                        map.replace(product, map.get(product) + number);
                        System.out.println("\t장바구니에 추가되었습니다.");
						//마스크 재고 수량 수정
                        pd.setStock(pd.getStock() - number);
                        flag = false;
                        break;
                     }
                     else //기존에 가진 수량과 새로 추가하려는 수량의 합이 5 이상이면
                     {
                        System.out.println("\t마스크 구매 가능 개수 초과");
                        flag = false;
                        break;
                     }
                  }
                  else // 장바구니에 마스크 품목이 없을 경우 장바구니에 저장
                  {
                     map.put(product, number);
					 //마스크 재고 수량 수정
                     pd.setStock(pd.getStock() - number);
                     System.out.println("\t장바구니에 추가되었습니다.");
                     flag = false;
                     break;
                  }
               }
               else   //구입 수량이 5개 이상이면 안내메시지 출력하고, salesMenuDisp()메뉴로 돌아가기
               {
                  System.out.println("\t마스크 구매 가능 개수 초과");
                  flag = false;
                  break;
               }
            }

            else   //구매할 품목이 마스크가 아닌 경우
            {
			   //해당 품목 재고 수량 수정
               pd.setStock(pd.getStock() - number);

               // 이미 장바구니에 있는 품목인지 아닌지
               if ( map.containsKey(product) ) // 이미 장바구니에 있는 품목이면
               {
                  map.replace(product, map.get(product) + number);
               }
               else // 장바구니에 없으면
               {
                  map.put(product, number);
               }
               System.out.println("\t장바구니에 추가되었습니다.");
               flag = false;
               break;
            }
         }
      }//end for문
      System.out.println("\t-----------------------------\n");
		 
		 // 위의 해당 조건문이 해당 되지 않은 경우 메세지 출력
         if(flag)
	     {
            System.out.println("\t품번과 남은 수량을 다시 확인해주세요.");
		 }

	  //장바구니에 담기 후 다시 salesMenuDisp() 메뉴로 돌아가기
      salesMenuDisp();
   }

   //장바구니 확인 메소드
   public void basketCheck() throws IOException
   {
      System.out.println("\n\t\t\t[   장 바 구 니     ]");
      System.out.println("\t------------------------------------------------");
      System.out.println("\t| 품번\t품명\t\t선택수량\t금액   |");
      for (Integer key : map.keySet()) 
      {
		 //해당 키값의 value값 담기
         Integer value = map.get(key);
         for (Product pd : p)
         {
			//key값이 일치한 경우 -> 키값 품명 수량 결제 금액 출력
            if(key == pd.getpNum())
               System.out.println("\t   " + key + "\t" + pd.getProductName() +"\t" + value + "\t\t" + value * pd.getPrice());
         }

      }    
      System.out.println("\t------------------------------------------------");
      System.out.println();   // 개행

      System.out.println("\t1. 장바구니에 더 담기");
      System.out.println("\t2. 장바구니 비우기");
      System.out.println("\t3. 결제하기");

      System.out.println();   // 개행

      System.out.print("\t>> 무엇을 하시겠습니까?: ");
      switch (br.readLine())
      {
         case "1": System.out.println("\n\t장바구니에 담기를 선택하셨습니다.\n"); salesMenuDisp(); break;
         case "2": System.out.println("\n\t장바구니 비우기를 선택하셨습니다.\n"); basketClear(); break;
         case "3": py.paying(); break;
         default: System.out.println("\t>> 메뉴 선택 오류~!!!"); salesMenuDisp(); break;   
      }

   }


	// 장바구니 비우기 메소드
	public void basketClear() throws IOException
	{

		boolean falgDelete = true;

		System.out.println("\n\t [   장 바 구 니 지 우 기    ]");
		System.out.println("\t----------------------------------");
		System.out.println("\t 1. 선택 항목 삭제 ");
		System.out.println("\t 2. 전체 항목 삭제 ");
		System.out.println();	
		System.out.print("\t>> 무엇을 하시겠습니까?: ");
		
		switch (br.readLine())
		{

			//선택 항목 삭제를 입력했을 경우
			case "1": 

				System.out.print("\t지우고자 하는 품목번호 입력: ");
				Integer del = Integer.parseInt(br.readLine());

				for(Product pd : p)
				{
				   //삭제할 품목번호가 데이터에 있고, 사용자가 입력한 품목번호와 일치할 경우
				   if(map.containsKey(del) && pd.getpNum() == del)
				   {
					  //해당 품목 재고에 다시 채워넣기 
					  pd.setStock(pd.getStock() + map.get(del));
					  System.out.println("\n\t해당 품목이 장바구니에서 삭제 되었습니다!");
					  falgDelete = false;
				   }		  
				}

				//장바구니에 없는 상품을 지우려고 했을 경우 메시지출력
				if(falgDelete)
				{
					System.out.println("\n\t장바구니에서 없는 상품 입니다!");
				}

				map.remove(del); //장바구니에서 값 삭제 
				basketCheck();
				break;

			//전체 항목 삭제를 입력했을 경우	
			case "2": 
				
 				System.out.print("\n\t전체 항목 삭제를 선택하셨습니다.\n");
				//재고에 다시 채워넣기
				for(Product pd : p)
				{
					for (Integer key : map.keySet() )
					{
					   if(pd.getpNum() == key)
					   {
						  //해당 품목 재고에 다시 채워넣기 
						  pd.setStock(pd.getStock() + map.get(key));
					   }
					}

				}
				//장바구니의 모든 데이터 삭제 후 장바구니 확인으로 돌아가기
				map.clear();
				System.out.println("\n\t전체장바구니가 비워졌습니다!");
				basketCheck();
				break;
			
			//잘못된 메뉴 선택했을 경우 장바구니 확인으로 돌아가기
			default: System.out.println("\t>> 메뉴 선택 오류~!!!"); basketCheck(); break;	
		}
	}
}