/*
■■■클래스와 인스턴스■■■
-배열의 선언과 초기화
-배열의 기본적 활용
=============================
//사용자로부터 처음 입력받은 인원 수 만큼의
//학생 이름과 전화번호를 입력받고
//입력받은 내용을 전체 출력하는 프로그램을 구현한다
//단, 배열을 활용하여 처리할 수 있도록 한다.

//실행 예)
//입력 처리할 학생 수 입력(명,1~10) : 24
//입력 처리할 학생 수 입력(명,1~10) : 3
//이름 전화번호 입력[1](공백 구분) : 김모모 010-1111-1111
//이름 전화번호 입력[2](공백 구분) : 이모모 010-2222-2222
//이름 전화번호 입력[3](공백 구분) : 채모모 010-3333-3333

-----------------------
전체 학생 수 : 3명
------------------------
이름 전화번호

김모모 010-1111-1111
이모모 010-2222-2222
채모모 010-3333-3333
--------------------------
계속하려면 아무 키나 누르세요
*/

import java.util.Scanner;
import java.io.IOException;

public class Test077
{							//문자열 배열에 args라는 이름을 부여한거
	public static void main(String[] args) throws IOException
	{ 
        // 방법 ① - 배열을 우선 10으로 잡고 시작하기
		Scanner sc = new Scanner(System.in); 
		String[] name = new String[10];
		String[] pNumber = new String[10];
		int num=0; //학생 수 담아둘 변수

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10): ");
			num = sc.nextInt();
		} 
		while (num<1 || num>10);
		
		//배열생성(이름배열 전화번호 배열)
		//- 사용자로부터 입력받은 인원수 만큼의 배열방 구성
		
		//이름 저장 배열
		String[] names =new String[num];

		//전화번호 저장 배열
		String[] tels=new String[num];
		//String[] tels=new String[names.length]
		
		for (int i=0; i<num; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분): ",(i+1));
			name[i] = sc.next();
			pNumber[i] = sc.next();		
		}
		//최종결과 출력
		System.out.println();
		System.out.println("--------------------------");
		System.out.printf("전체 품목 : %d개\n",num);
		System.out.println("--------------------------");
		System.out.printf("품목 가격");
		
		for (int i=0; i<num; i++)
			System.out.printf("%4s %14s\n",names[i],price[i]);
		



		/*
		for (int i=0; i<num; i++)
		{
			System.out.print("이름 전화번호 입력[" + (i+1) +"](공백 구분): ");
			name[i] = sc.next();
			pNumber[i] = sc.next();
		}

		System.out.println("------------------");
		System.out.println("전체 학생 수: " + num + "명");
		System.out.println("------------------");
		System.out.println("이름\t전화번호");

		for (int i=0; i<num; i++)
		{
			System.out.println(name[i] + "\t" + pNumber[i]);
		}
		*/

		// 방법 ② - 배열을 0으로 잡고 입력받은 학생 수로 다시 초기화
       /*
		Scanner sc = new Scanner(System.in);
		String[] name = new String[0];
		String[] pNumber = new String[0];
		int num=0;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10): ");
			num = sc.nextInt();
			name = new String[num];
			pNumber = new String[num];
		} 
		while (num<1 || num>10);

		for (int i=0; i<num; i++)
		{
			System.out.print("이름 전화번호 입력[" + (i+1) +"](공백 구분): ");
			name[i] = sc.next();
			pNumber[i] = sc.next();
		}

		System.out.println("------------------");
		System.out.println("전체 학생 수: " + num + "명");
		System.out.println("------------------");
		System.out.println("이름\t전화번호");

		for (int i=0; i<num; i++)
			System.out.println(name[i] + "\t" + pNumber[i]);
        */

	}
}

// 실행 결과
/*
입력 처리할 학생 수 입력(명, 1~10): 24
입력 처리할 학생 수 입력(명, 1~10): 3
이름 전화번호 입력[1](공백 구분): 최최최 010-0000-0000
이름 전화번호 입력[2](공백 구분): 김김김 010-1234-1234
이름 전화번호 입력[3](공백 구분): 이이이 010-4567-8435
------------------
전체 학생 수: 3명
------------------
이름    전화번호
최최최  010-0000-0000
김김김  010-1234-1234
이이이  010-4567-8435
계속하려면 아무 키나 누르십시오 . . .
*/