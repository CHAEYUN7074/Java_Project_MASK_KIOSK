/*==========================================================
 ■■■ 클래스 인스턴스 ■■■
 -클래스와 인스턴스 활용
============================================================*/

//학생별로 국어점수, 영어점수, 수학점수를 입력받아
//총점, 평균을 계산하는 프로그램을 구현한다.
//단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
//또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록한다.

//프로그램을 구성하는 클래스

//1.Record 클래스
//속성만 존재하는 클래스로 설계할 것

//2. Sungjuk 클래스
//인원 수를 입력받아, 입력받은 인원 수 만큼
//이름, 국어점수, 영어점수, 수학점수를 입력받고
//총점과 평균을 산출하는 클래스로 설계할 것
//속성 : 인원수, Record 형태의 배열
//기능 : 인원 수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

//3. Test097 클래스
//main() 메소드가 존재하는 외부 클래스로 설계할 것

/*
실행 예)
인원 수 입력(1~100) : 102
인원 수 입력(1~100) : -10
인원 수 입력(1~100) : 3

1번째 학생의 이름 입력 : 김땡땡
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

2번째 학생의 이름 입력 : 이땡땡
국어 점수 : 82
영어 점수 : 72
수학 점수 : 62

3번째 학생의 이름 입력 : 채땡땡
국어 점수 : 98
영어 점수 : 88
수학 점수 : 78

김땡땡	90	80	70	240	80.xx
이땡땡	
채땡땡
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test097
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk ob = new Sungjuk();
		ob.set();
		ob.input();
		ob.print();
	}
}