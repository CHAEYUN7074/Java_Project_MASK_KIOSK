/*========================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
========================================================*/

// ○ 실습 문제
// Test159 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1
	
	1번째 요소 입력: 손범석
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : Y

	2번째 요소 입력: 서승균
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : n

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		손범석
		서승균
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력: 정미화

	[검색 결과 출력]
	항목이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력: 손범석

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력: 송해덕

	[삭제 결과 출력]
	항목이 존재하지 않아서 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력: 서승균

	[삭제 결과 출력]
	서승균 항목이 삭제되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력: 이지영

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력: 손범석
	수정할 내용 입력: 정가연

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
계속하려면...

*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus		//-- 완성
{
	public static final int E_ADD = 1;		//-- 요소 추가
	public static final int E_DISP = 2; 	//-- 요소 출력
	public static final int E_FIND = 3; 	//-- 요소 검색
	public static final int E_DEL = 4; 	//-- 요소 삭제
	public static final int E_CHA = 5; 	//-- 요소 변경
	public static final int E_EXIT = 6; 	//-- 프로그램 종료
}

public class Test159_t
{
	// 주요 속성 구성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;
	private static String con;

	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("\t[메뉴 선택]");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");	
		
		System.out.print("\t>> 메뉴 선택(1~6) :");

	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		sel = Integer.parseInt(br.readLine());
		System.out.println();
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD: addElement(); break;
			case Menus.E_DISP: dispElement(); break;
			case Menus.E_FIND: findElement(); break;
			case Menus.E_DEL: delElement(); break;
			case Menus.E_CHA: chaElement(); break;
			case Menus.E_EXIT: exit(); break;
			default: System.out.println("\t>> 메뉴 선택 오류~!!!"); break;
		
		}

		
	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		do
		{
			System.out.print( "\t" + (vt.size()+1) + "번째 요소 입력: ");

			boolean b = vt.add(br.readLine());

			if (b)
				System.out.println("\t" + vt.size() + "번째 요소 입력 성공~!!!");
			else
				System.out.println("\t입력오류\n");

			System.out.print( "\n\t요소 입력 계속(Y/N)? :");

			con = br.readLine().toUpperCase();

		}		
		while (con.equals("Y"));
	}


	// 요소 출력 메소드
	public static void dispElement()
	{
		System.out.println("\t[벡터 전체 출력]");


		for(int i=0; i<vt.size(); i++)
		{
			System.out.println("\t" + vt.get(i));
		}

		System.out.println("\t벡터 전체 출력 완료~!!!\n");

	}

	// 요소 검색 메소드
	public static void findElement() throws IOException
	{
		System.out.print("\t검색할 요소 입력: ");

		if ( vt.contains(br.readLine()) )
		{
			System.out.println("\t[검색 결과 출력]");
			System.out.println("\t항목이 존재합니다.\n" );
		}
		else
		{
			System.out.println("\t[검색 결과 출력]");
			System.out.println("\t항목이 존재하지 않습니다.\n");
		}

		System.out.println();

	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.print("\t삭제할 요소 입력: ");
		String s = br.readLine();

		System.out.println(); //개행
		System.out.println("\t[삭제 결과 출력]");

		if(vt.contains(s))
		{			
			if ( vt.remove(s) )	// 연산이 잘 수행되었는지 확인 후 메시지 출력
				System.out.println( s + "\t항목이 삭제되었습니다.\n");	
			else 
				System.out.println("\t삭제 오류");
		}
		else
		{
			System.out.println("\t항목이 존재하지 않아서 삭제할 수 없습니다.\n");
		}



	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.print("\t변경할 요소 입력: ");
		String s = br.readLine();
		//boolean f = false;
		//int i;

		/*
		for(i=0; i<vt.size(); i++)
		{
			if (s.equals(vt.get(i)))
			{
				f = true;
				break;
			}
		}

		if (f)
		{				
			System.out.print("\t수정할 내용 입력: ");
			vt.set(i, br.readLine());
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.\n");	
		}
		else
		{
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.\n");
		}
		*/

		if(vt.contains(s))
		{			
			System.out.print("\t수정할 내용 입력: ");
			vt.set(vt.indexOf(s), br.readLine());
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.\n");	
		}
		else
		{
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.\n");
		}
		
	}

	// 프로그램 종료 메소드 -- 완성
	public static void exit()
	{
		System.out.println("\t프로그램 종료~!!!");
		System.exit(-1);
	}

	// main() 메소드 -- 완성
	public static void main(String[] args) throws IOException
	{
		/*
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		*/
	}



}