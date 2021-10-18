import java.io.IOException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Pay extends Basket
{
	int tot = 0;				//-- 총 결제 금액
	int total = 0;				//-- 유효성 검사 변수
	boolean check = false;		//-- 결제품목에 마스크가 포함되어 있는지 검사하는 변수
	boolean listCheck = false;	//-- 이미 마스크를 구매한 기록이 있는지 검사하는 변수
	String name;				//-- 유효성 검사시 입력받는 이름
	String number;				//-- 유효성 검사시 입력받는 주민등록번호
	int a;
	int tt;						//-- 투입 금액 총 합
	boolean checkReceipt = false;	//-- 영수증 출력 결정하는 변수
	boolean ch1 = false;
	boolean ch2 = false;
	boolean ch3 = false;
	boolean ch4 = false;
	boolean ch5 = false;
	Person pppp;
	
	// 투입 금액 저장하는 변수
	int m10000;
	int m5000;
	int m1000;
	int m500;
	int m100;

	int restMoney = 0;			//-- 거스름돈

	// 결제하기 메소드
	public void paying() throws IOException
	{
		tot = 0; // 총액 초기화

		// 결제할 목록 보여주기(금액 포함)
		System.out.println();
		System.out.println("\n\t[            결 제 확 인           ]");
		System.out.println("\t--------------------------------------");
		System.out.println("\t품번\t품명\t\t선택 수량\t금액");
		for (Integer key : map.keySet()) 
		{
			Integer value = map.get(key);
			for (Product pd : p)
			{
				if(key == pd.getpNum())
				{
					System.out.println("\t" + key +"\t" + pd.getProductName() +"\t" + value + "\t\t" + value * pd.getPrice());
					tot += (value * pd.getPrice());
				}
			}
		}    
		System.out.println("\t--------------------------------------");
		System.out.println();	// 개행
		System.out.println("\t총 금액 \t\t\t " + tot); 
		System.out.println();
		System.out.println("\t1.결제하기");
		System.out.println("\t2.장바구니로 돌아가기\n");

		System.out.print("\t>> 무엇을 하시겠습니까?: ");

		int sel = sc.nextInt();
	
		System.out.println();	// 개행

		// 결제단계에서 장바구니로 되돌아감
		if (sel == 2)
			b.basketCheck();

//		// 장바구니 비어있으면 안내 메시지 출력 후 메인으로 돌아가기
		if (map.size() == 0)
		{
			System.out.println("\t장바구니가 비어있습니다. 메뉴 선택 페이지로 돌아갑니다.");
			salesMenuDisp();
		}

		// 마스크 있는지 없는지 확인
		for(Integer key : map.keySet())
		{
			for(Product pd : p)
			{
			   if( pd.getpNum() == key && pd.getProductName().equals("KF94마스크")) 			
			   {
				   a = key;		// KF94마스크가 들어있는 어레이리스트의 키값을 a에 받아옴 
				   check = true;
				   break;
			   }
			} 
		}
		
		// → 있으면
		if (check == true)
		{
			System.out.println("\t[KF94마스크 구매이력 조회]");
			// 유효성검사 통과
			if (validityTest() == true) 
			{
				// 구매자 목록에 있는 사람인지 검사
				for(Person ps : pe)
				{
					if(ps.getpNumber().equals(number)) // 이미 저장되어 있는지 → 맞으면 true
					{
						listCheck = true;
					}
				}

				//System.out.println(listCheck); // 테스트

				if (listCheck == true)	// 저장되어 있으면(기존에 마스크를 구매했던 사람이면)
				{		
					for(Person ps : pe)
					{
						if( ps.getpNumber().equals(number) && (ps.getNumber()+map.get(a)) <= 5)		
						{	
							//  기존에 구매한 마스크의 수 + 장바구니에 담긴 마스크(마스크의 키값을 가진 해시맵의 value)가 5개 이하면 

							ch4 = true;
							pppp = ps;
							payment(); // 돈 받는 메소드로 넘어감
							break;
						}
						else if(ps.getpNumber().equals(number) && (ps.getNumber()+map.get(a)) > 5)// 5개 초과할 때
						{
							System.out.println("테스트" + ps.getpNumber());
							System.out.println("테스트 "+ ps.getNumber());

							System.out.println("\t구매 가능한 마스크의 수량을 초과하였습니다.");
							check = false;
							// 장바구니에서 재고로 수량 복구
							for(Product pd : p)
							{
								for (Integer key : map.keySet() )
								{
								   if(pd.getpNum() == key)
								   {//해당 품목 재고에 다시 채워넣기 
									  pd.setStock(pd.getStock() + map.get(key));
								   }
								}

							}
							
							map.clear();	// 장바구니 비우기
							basketCheck();	// 장바구니 확인하는 페이지로 넘어감
						}
						else if(!ps.getpNumber().equals(number))
							continue;

					}
				}
				else						// 저장되어있지 않을 때(기존에 마스크를 구매하지 않은 사람이면)
				{
					// 결제 가능
					ch1 = true;
					payment(); // 돈 받는 메소드로 넘어감
				}	
			}

			else				// → 유효성 검사 통과 못하면
			{
				System.out.println("\t유효성 검사를 통과하지 못했습니다. 장바구니로 돌아갑니다.");
				basketCheck(); // 장바구니 확인하는 페이지
			}

		}
		else	// 장바구니에 마스크 없으면
			payment(); // 결제 가능, 돈 받는 메소드로 넘어감


		// 결제가 완료되었다면 영수증 출력 
		if (checkReceipt)
		{
			printReceipt();
		}


	}

	// 영수증 출력 메소드
	public void printReceipt() throws IOException
	{
		tot = 0;
		// 현재 날짜 + 시간 불러오기
		Calendar cal = Calendar.getInstance();
		System.out.println("\t------영수증 출력 시작------\n");

		SimpleDateFormat sdf = new SimpleDateFormat("\tyyyy-MM-dd HH:mm:ss");
		String d = sdf.format(cal.getTime());
		System.out.println(d);
		System.out.println();	//개행

		System.out.println("\t--------------------------------------");
		System.out.println("\t품명\t\t선택 수량\t금액");
		// 결제 완료된 물품 출력
		for (Integer key : map.keySet()) 
		{
			Integer value = map.get(key);
			for (Product pd : p)
			{
				if(key == pd.getpNum())
				{
					System.out.println("\t" + pd.getProductName() +"\t" + value + "\t\t" + value * pd.getPrice());
					tot += value * pd.getPrice();				
				}

			}

			// 결제 완료된 물품을 "판매한 물품 리스트"에 저장하는 단계
			if ( soldProductsMap.containsKey(key) ) // 장바구니에 있던 물품이 "판매한 물품 리스트"에 이미 저장되어 있다면
			{
				soldProductsMap.replace(key, soldProductsMap.get(key) + map.get(key)); // 기존 리스트 수량에 결제한 수량 추가
			}
			else // 리스트에 없는 품목이면 새로 저장
				soldProductsMap.put(key, map.get(key));


		}
		



		System.out.println("\t--------------------------------------");
		System.out.println();	// 개행
		System.out.println("\t총 금액 \t\t\t" + tot);
		System.out.println("\t--------------------------------------");
		System.out.println("\t투입금액 \t\t\t" + tt);
		System.out.println("\t거스름돈 \t\t\t" + (tt - tot));
		System.out.println();
		System.out.println();
		System.out.println("\t\t   감사합니다");
		System.out.println();

		System.out.println("\t------영수증 출력 완료------\n");

		// 메뉴 선택 화면으로 돌아가기
		check = false;
		checkReceipt = false;
		map.clear();	// 장바구니 비우기
		salesMenuDisp();

	}

	// 유효성 검사 메소드
	public boolean validityTest() throws IOException
	{
		// 입력받는 주민번호(문자열 형태)


		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		System.out.print("\t이름 입력: ");
		name = br.readLine();

		System.out.print("\t주민번호 입력(xxxxxx-xxxxxxx): ");
		number = br.readLine();

		
		total = 0;

		if (number.length() != 14)
		{
			System.out.println("\t>> 입력 오류~!!! 장바구니로 돌아갑니다.");
			basketCheck();
		}


		for (int i=0; i<13; i++)
		{
			if (i==6)
			{
				continue; 
			}
			total += chk[i] * Integer.parseInt(number.substring(i, (i+1))); // i에서 i+1 전까지의 문자열 추출 
		}

		int su = 11 - total % 11; 
		su = su % 10;
		
		if (su == Integer.parseInt(number.substring(13)))
		{
			System.out.println("\t>> 정확한 주민번호~!!!");
			return true;
		}
		else
		{
				System.out.println("\t>> 잘못된 주민번호~!!!");
				check = false;
				return false;
		}
	}

	// 돈 받아서 수익에 저장하기 메소드
	public void payment() throws IOException
	{
		// 금액 받기
		System.out.print("\t투입할 10000원권 개수: ");
		m10000 = sc.nextInt();
		System.out.print("\t투입할 5000원권 개수: ");
		m5000 = sc.nextInt();
		System.out.print("\t투입할 1000원권 개수: ");
		m1000 = sc.nextInt();
		System.out.print("\t투입할 500원 개수: ");
		m500 = sc.nextInt();
		System.out.print("\t투입할 100원 개수: ");
		m100 = sc.nextInt();

		tt = 10000*m10000 + 5000*m5000 + 1000*m1000 + 500*m500 + 100*m100;
		
		restMoney = tt - tot;
		
		if (restMoney < 0)
			System.out.println("\n\t투입 금액: " + tt + "원, " + (-restMoney) + "원이 부족합니다.");			
		else
			System.out.println("\n\t투입 금액: " + tt + "원, 거스름돈: " + restMoney + "원");

		// 총액보다 적게 돈을 넣었을 경우
		if (tot > tt)
		{
			//장바구니 확인으로 돌아가게 하기
			System.out.println("\t장바구니로 돌아갑니다.");
			basketCheck();
		}
		else // 많거나 같게 넣었을 경우
		{
			// 잔돈 충분
			if ( checkPayment() == true )
			{
				// 결제완료
				checkReceipt = true;
				ch2 = true;
				ch5 = true;
				System.out.println("\t결제가 완료되었습니다.");
			}
			else	// 잔돈 부족
			{
				System.out.println( "\t 거스름돈 중 " + restMoney + "원이 부족해서 판매가 불가합니다. 장바구니로 돌아갑니다.");
				basketCheck();	// 장바구니 확인하는 화면으로
			}
		}

		if (ch1 && ch2)
		{
			pe.add(new Person(name, number, map.get(a)));	// 구매자 목록에 저장
		}
		if (ch4 && ch5)
		{
			pppp.setNumber((pppp.getNumber()+map.get(a)));	// 구매자 목록의 마스크 수량에 추가
		}

		ch1 = ch2 = false;
		ch4 = ch5 = false;
		listCheck = false;
	}

	// 잔돈이 충분한지 확인하고 잔돈 반환하는 메소드
	public boolean checkPayment()
	{
		int[] arr = {5000, 1000, 500, 100};
		int[] arr1 = {0, 0, 0, 0};
		
		for (int i=0; i<4; i++)
		{
			if (restMoney/arr[i]  > moneymap.get(arr[i]))
			{
				arr1[i] = moneymap.get(arr[i]);
				restMoney = restMoney - moneymap.get(arr[i])*arr[i];
			}
			else 
			{
				arr1[i] = restMoney/arr[i];
				restMoney = restMoney - (restMoney/arr[i])*arr[i];
			}

			// 잔돈 부족하지 않은 경우
			if (restMoney == 0)
			{
				System.out.println("\n\t거스름돈을 반환합니다.\t");

				// 권종별로 몇개 반환했는지 출력(손님한테 안내할 사항)
				System.out.println("\t5000원: " + arr1[0]);
				System.out.println("\t1000원: " + arr1[1]);
				System.out.println("\t500원: " + arr1[2]);
				System.out.println("\t100원: " + arr1[3] + "\n");

				// moneymap 업데이트(쓴 돈 빼기)
				moneymap.replace(5000, moneymap.get(5000) - arr1[0]);
				moneymap.replace(1000, moneymap.get(1000) - arr1[1]);
				moneymap.replace(500, moneymap.get(500) - arr1[2]);
				moneymap.replace(100, moneymap.get(100) - arr1[3]);

				// 자판기에 들어온 돈 저장
				profitmap.replace(10000, profitmap.get(10000) + m10000);
				profitmap.replace(5000, profitmap.get(5000) + m5000);
				profitmap.replace(1000, profitmap.get(1000) + m1000);
				profitmap.replace(500, profitmap.get(500) + m500);
				profitmap.replace(100, profitmap.get(100) + m100);

				return true;
			}
		}
	
		// 잔돈 부족한 경우 
		if (restMoney != 0)
		{
			return false;
		}

		return false;
	}
}