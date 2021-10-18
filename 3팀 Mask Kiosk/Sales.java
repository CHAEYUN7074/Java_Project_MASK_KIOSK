import java.io.IOException;


public class Sales extends Modes
{

/*
	public Sales()
	{
		//System.out.println("생성자 생성 확인");
	}
*/
	// 메뉴 출력 메소드
	public void salesMenuDisp() throws IOException
	{
		System.out.println("\t\t\t[ 메\t뉴 ]");
		System.out.println("\t----------------------------------------");
		System.out.println("\t품번\t품명\t\t가격\t남은 수량 ");

		for (Product pd : p)
		{
			// 수량이 0인경우 품절 표시하기
			if (pd.getStock() == 0) 
			{
					System.out.println("\t" + pd.getpNum() + "\t" + pd.getProductName()
						+ "\t" + pd.getPrice() + "\t" + "-품절-");
					continue;
			}
			// 수량이 0이 아닌경우 정상 출력
			System.out.println("\t" + pd.getpNum() + "\t" + pd.getProductName()
									+ "\t" + pd.getPrice() + "\t" + pd.getStock());
		}
		System.out.println("\t----------------------------------------");
		System.out.println("\t※KF94마스크는 인당 5개 구매 가능");
		System.out.println("\t----------------------------------------");
		System.out.println("\t1. 장바구니에 담기");
		System.out.println("\t2. 장바구니 확인하기");
		System.out.println();		//개행
		System.out.println("\t0. 모드 선택으로 돌아가기");
		System.out.println("\n");	//개행

		System.out.print("\t>> 무엇을 하시겠습니까?: ");
		switch (br.readLine().trim())
		{
			case "1": b.salesMenuSelect(); break; //장바구니 담는 메소드 실행
			case "2": b.basketCheck(); break;	  //장바구니 확인 메소드 실행
			case "0": modeDisp(); break;		  //모드 출력 메소드로 돌아가기
			default: System.out.println("\n\t>> 메뉴 선택 오류~!!!\n"); salesMenuDisp(); break;	//선택 오류시 메뉴 출력 메소드 돌아기 
		}
	}
}