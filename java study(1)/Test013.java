//자바 기본 프로그래밍
//변수와 자료형
//자바의 기본 입출력 : BufferdReader 클래스
//=========================================
//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
//이름과 총점을 출력하는 프로그램을 구현한다.

//실행 예)
//이름을 입력하세요 : 채지윤
//국어 점수 입력 : 90
//영어 점수 입력 : 80
//수학 점수 입력 : 80

//===[결과]===
//이름 : 채지윤
//총점 : 240

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args)throws IOException
	{
		//주요 변수 선언
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//→BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 이걸
		//두줄로 늘여쓰면 이렇게
		
		String name;
		//String strName; //이름은 문자열이니까 string - name이 아니라 strName라고 표기할 수 있는데
		                //이건 나중에 string으로 표기했는지 잊어버릴때를 대비해서 
		int kor,eng,math,sum;

		String strTemp; //문자열 데이터 임시 저장 변수
		
		
		//연산 및 처리

		//①사용자에게 메시지 출력
		System.out.print("이름을 입력하세요 :");
		//②
		name = br.readLine();

		//①사용자에게 메시지 출력		
		System.out.print("국어 점수 입력: ");
		//②
		//kor = Integer.parseInt(br.readLine());
		strTemp=br.readLine(); //윗줄처럼 직접 변환하지 않고 담아낸 값을 옮겨담는 방법으로
		kor=Integer.parseInt(strTemp);
		//①사용자에게 메시지 출력
		System.out.print("영어 점수 입력: ");
		//②
		strTemp=br.readLine(); //덮어쓰기때문에 위에 strtemp에 담겨있던 국어점수는 사라져
		eng = Integer.parseInt(strTemp);
		//①사용자에게 메시지 출력
		System.out.print("수학 점수 입력: ");
		//②
		math = Integer.parseInt(br.readLine());

		sum = kor + eng + math;
		
		System.out.println();
		System.out.println("====[결과]====");
		System.out.println("이름: " + name);
		System.out.printf("이름 : %s\n", name);
		System.out.println("총점: " + sum);
		
		//정수형태 %d, 실수%f, 문자열%s
	}
}