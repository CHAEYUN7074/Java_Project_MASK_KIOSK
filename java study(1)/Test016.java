//자바 기본 프로그래밍
//자바의 기본 입출력 : java.util.Scanner
//=======================================
//※java.util.Scanner
//단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//디폴트로 사용되는 단락문자는 공백이다
//작성된 다음 토큰은 next() 메소드를 사용
//다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner; //★

public class Test016
{
	public static void main(String[] args) // throws IOException 이 구문 필요없어 자바가 다 허용했어 스캐너는
	{
		//○주요 변수 선언
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		String name; //이름
		int kor,eng,mat;

		//○연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		//br.readLine();
		name=sc.next();

		System.out.print("국어점수 입력 : ");
		//kor=br.readLine(); --오류
		//kor=Integer.parseInt(br.readLine());
		//kor=Integer.parseInt(sc.next());
		kor=sc.nextInt(); //scanner은 데이터 타입을 지정해서 받아 올 수 있게 했다 sc.next는 문자열, int을 붙이면 정수 

		System.out.print("영어점수 입력 : ");
		eng=sc.nextInt();
		
		System.out.print("수학점수 입력 : ");
		mat=sc.nextInt();

		//○결과출력
		System.out.println();
		System.out.println(">>이름 : "+name);
		System.out.println(">>총점 : "+(kor+eng+mat)); //산술연산 먼저 하라는 뜻에서 ()
	}
}