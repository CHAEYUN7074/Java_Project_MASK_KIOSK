/*==========================================================
 ■■■ 클래스 인스턴스 ■■■
 -클래스와 인스턴스 활용
============================================================*/
/*
1~3 사이의 난수를 발생시켜서
가위 바위 보 게임 프로그램을 구현한다
단, 클래스의 개념을 활용하여 처리할 수 있도록 한다
또한 배열을 활용하여 처리할 수 있도록 한다
최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

※기준 데이터 → 1: 가위, 2; 바위, 3:보

실행 예)
1: 가위 2: 바위 3:보 중 입력(1~3) : 4
1: 가위 2: 바위 3:보 중 입력(1~3) : -2
1: 가위 2: 바위 3:보 중 입력(1~3) : 2

-유저 : 바위
-컴퓨터 : 보

>>승부 최종 결과 : 컴퓨터가 이겼습니다.
계속하려면 아무 키나 누르세요...
*/
import java.util.Scanner;
import java.util.Random;



class RpsGame 
	{

	// 주요 속성 구성(변수 선언)
	private int user;
	private int com;
	// private String resultStr;

	// 주요 기능 구성(메소드 정의)
	//   - 사용자의 선택 내용을 입력받는 기능의 메소드
	public void input() 
		{
		Scanner scan = new Scanner(System.in);
		do 
		{
			System.out.print("1. 가위, 2. 바위, 3. 보 중 입력(1~3) : ");
			user = scan.nextInt();

		}
		while(1 > user || user > 3);
	}

	// 주요 기능 구성(메소드 정의)
	//   - 컴퓨터의 선택 내용을 입력받는 기능의 메소드
	private void runCom() 
		{
		Random ran = new Random();
		com = ran.nextInt(3) + 1;		// [ + 1 ] 0 1 2 -> 1 2 3
		}

	// 주요 기능 구성(메소드 정의)
	//   - 중간 결과 출력(서로의 선택 내용 확인)
	public void middleCale() 
		{
		String[] str = {"가위", "바위", "보"};
		System.out.println();
		System.out.println(" - 유저 : " + str[user - 1]);
		System.out.println(" - 컴퓨터 : " + str[com - 1]);
		// -- [ - 1] => str[1] str[2] str[3] -> str[0] str[1] str[2]
		}

	// 주요 기능 구성(메소드 정의)
	//   - 승부에 대한 연산
	public String resultCale() 
		{
			String result = "무승부 상황입니다~!!!";

		if((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {		// 유저가 승리한 상황

			result = "당신이 승리했습니다~!!!";

		}
		else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {		// 컴퓨터가 승리한 상황

			result = "컴퓨터가 승리했습니다~!!!";

		}

		return result;

	}

	// 주요 기능 구성(메소드 정의)
	//   - 최종 결과 출력
	public void print(String str) 
		{

		System.out.printf("\n>> 승부 최종 결과 : %s\n", str);

	}

}
public class Test098 
	{
	public static void main(String[] args) 
	{

		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCale();
		String result = ob.resultCale();
		// System.out.println(result);
		ob.print(result);

	}

}





