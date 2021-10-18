//클래스와 인스턴스

//Test066.java 파일과 세트

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{

	//주요 변수 선언(반지름, 원주율)
	int r; //원의 반지름
	final double PI=3.141592; //원주율
	
	//기능(동작, 행위) → 메소드
	
	void input() throws IOException //메소드 영역에서 return문이 없으니까 void
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //위치 주의 class에 직접 넣으면 바람직하지는 않아
		System.out.print("반지름 입력 : ");
		r=Integer.parseInt(br.readLine());
	}
	
	double calLength() //둘레를 반환해야하기때문에 (속성에 둘레를 담을 곳을 선언하지 않았고)
	{
		
		double result=0;
		result = r * 2 * PI;
		return result;
	
	}

	double calArea() // 넓이 계산(). 매개변수 넘겨주지 않아도돼서(?) 비워둬도 됨
	{
		//결과값으로 반환하게 될 변수 선언 및 초기화
		double result=0;
		//선언한 변수에 값 채워넣기
		result = r * r * PI;
		//최종 결과값 반환
		return result;
		
	}
	void print(double a, double l)//결과출력() 가지고 있지 않은 a,l에 대해서는 매개 변수가 필요해
	{
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}
}




