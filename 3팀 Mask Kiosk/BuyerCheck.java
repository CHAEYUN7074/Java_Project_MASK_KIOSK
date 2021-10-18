import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyerCheck extends Modes
{	


	public void checkDisp() throws IOException{
	
	System.out.println();
	System.out.println("\t1. 구매자 정보 조회");
    System.out.println("\t2. 모드 선택으로 가기");	
	System.out.println("\t3. 종료");

	checkSelect();
	
	}

	public void checkSelect() throws IOException{

		System.out.print("\n\t>> 선택 : ");
		sel = sc.nextInt();
		personRun();
	}

	// 조회
	public void checkPerson() throws IOException
	{
		System.out.println("\t[\t구매자 정보 조회\t]");
		System.out.println("\t------------------------------------");
		System.out.println("\t이름\t주민등록번호\t마스크 구매 수량");
		for (Person ps : pe)
		{
			System.out.println("\t" + ps.getpName() + "\t" + ps.getpNumber()
								+ "\t" + ps.getNumber());
		}
		System.out.println("\t------------------------------------");
		
		checkDisp();
	}

	public void personRun() throws IOException
	{
		switch(sel)
		{
		case 1 : checkPerson(); break;
		case 2 : modeDisp(); break;
		case 3 : exit(); break;
		default : System.out.println("\t>> 메뉴 선택 오류"); checkDisp(); break;

		}

	}

	public void exit() 
    {
      System.exit(-1);
    }

}