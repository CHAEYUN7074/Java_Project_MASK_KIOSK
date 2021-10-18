import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args)throws IOException
	{
		//주요 변수 선언
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int bottomLength, height; // 밑변과 높이
		double area; //넓이
	
		//연산 및 처리
		//①사용자에게 메시지 출력
		System.out.println("■삼각형의 넓이 구하기■");
		System.out.print("-삼각형의 밑변 입력: ");
		//② 사용자가 입력한 데이터를 정수 형태로 변환한 후 변수 bottomLength에 담아내기
		bottomLength = Integer.parseInt(br.readLine());
		
		//------------------------------------------------------------------------------
		//①사용자에게 메시지 출력		
		System.out.print("-삼각형의 높이 입력: ");
		//② 사용자가 입력한 데이터를 정수 형태로 변환한 후 변수 height에 담아내기
		height = Integer.parseInt(br.readLine());
		//-------------------------------------------------------------------------------
		 area  =bottomLength * height /2.0;
		//          정수         정수   정수
		//실수 기반의 연산을 해야한다.(정수 중 하나를 실수로 만들어야한다)
	    //→ 2가 아닌 2.0의 실수로 바꾸는 것이 간편
	//결과 출력
	    //System.out.println(); //매개변수 없으면 개행
		//System.out.print(); // 매개변수 없으면 error">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %f\n", a, b, c);
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", bottomLength,height,area);
	}
}
