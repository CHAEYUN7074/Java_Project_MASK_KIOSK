import java.io.IOException;

public class ChoiceManagementMode extends Modes 
{


	public void choice() throws IOException // 관리자전체메뉴
	{
		//sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("\t1. 메뉴관리");
		System.out.println("\t2. 재고관리");
		System.out.println("\t3. 잔고관리");
		System.out.println("\t4. 구매자정보조회");
		System.out.println("\t5. 모드 선택으로 돌아가기");
		System.out.print("\n\t >> 번호를 선택해주세요: ");
		int a = sc.nextInt();
		
		if (a == 1)
		{
			m.menuDisp();	//1. 메뉴관리 
		}
		else if (a == 2)
		{
			//재고관리
			st.stockMenuChoice();
		}
		else if (a == 3)
		{
			//잔고관리
			bs.balanceDisp();
		}
		else if (a == 4)
		{
			// 구매자정보조회
			bc.checkDisp();
		}
		else if (a == 5)
		{
			// 모드 선택으로 돌아가기
			modeDisp();
		}

		else
		{
			System.out.println("잘못 입력하셨습니다.");
			choice();
		}
	
		
	}



}
