/*========================================
  ■■■ 클래스 고급 ■■■
  - 인터페이스
========================================*/

//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

//    실행 예)
//    인원 수 입력(1~10) : 2
//    1번째 학생의 학번 이름 입력(공백 구분) : 2108006 가가가
//	  국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
//    2번째 학생의 학번 이름 입력(공백 구분) : 2108024 나나나
//	  국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

//    2108006 가가가	90 100 85	275	91
//						수 수  우
//    2108024 나나나	85 70  65   220 73
//                      우 미  양

import java.util.Scanner;


class Record
{
	String hak, name;			// 학번 이름
	int kor, eng, mat;			// 국어 영어 수학 점수
	int tot, avg;				// 총점 평균(편의상 정수)
}

// 인터페이스
interface Sungjuk
{
	public void set();		// 인원 수 구성
	public void input();	// 상세 데이터 입력
	public void print();	// 결과 출력
}

// ★★필요한 클래스 설계→sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	int inwon;
	Record[] arr;
	String[] grade = {"수", "우", "미", "양", "가"};

	@Override
	public void set() 
		{
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = scan.nextInt();
		}
		while (1 > inwon || inwon > 10);
		arr = new Record[inwon];
		}

	@Override
	public void input() 
		{
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < inwon; i++) 
			{
			arr[i] = new Record();
			
			System.out.print((i + 1) + "번째 학생의 학번 이름 입력(공백구분) : ");
			arr[i].hak = scan.next();
			arr[i].name = scan.next();

	
			System.out.print("국어 영어 수학 점수 입력(공백 구분) : ");
			arr[i].kor = scan.nextInt();		
			arr[i].eng = scan.nextInt();		
			arr[i].mat = scan.nextInt();		
				
			arr[i].tot += (arr[i].kor + arr[i].eng + arr[i].mat); //점수 누적 합
			arr[i].avg = arr[i].tot / 3; //평균
			}		
		}

	@Override
	public void print() 
		{
		String kor, eng, mat;

		for(int i = 0; i < inwon; i++) 
			{
			kor = Sungjukgrade(arr[i].kor);
			eng = Sungjukgrade(arr[i].eng);
			mat = Sungjukgrade(arr[i].mat);
			
			System.out.printf("%s %s %d\t %d\t %d\t %d\t %d\t\n", arr[i].hak, arr[i].name, arr[i].kor, arr[i].eng, arr[i].mat, arr[i].tot, arr[i].avg);
			System.out.printf("\t \t %s\t  %s\t  %s\t\n", kor, eng, mat);												
			}
		}

	private String Sungjukgrade(int n) 
		{
		String result;

		if(n >= 90) 
			result = grade[0];
		else if(n >= 80) 
			result = grade[1];
		else if(n >= 70) 
			result = grade[2];
		else if(n >= 60) 
			result = grade[3];
		else
			result = grade[4];
				
		return result;

		}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test117 
	{
	public static void main(String[] args) 
	{
		SungjukImpl ob = new SungjukImpl();
		// 필요한 ob 구성
		ob.set();
		ob.input();
		ob.print();

	}

}
