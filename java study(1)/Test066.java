//클래스와 인스턴스

//CricleTest.java 파일과 세트
/*
원의 넓이와 둘레 구하기
원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다
클래스명 : CircleTest

원의 넓이 = 반지름 * 반지름 *3.141592
원의 둘레 = 반지름 * 2 *3.141592

실행 예)
반지름 입력 : 13

반지름이 13인 원의
넓이 : 
둘레 : 
계속하려면 아무 키나 누르세요...
*/
import java.io.IOException;
public class Test066
{
	public static void main(String[] args)throws IOException
	{
		// CircleTest 클래스 인스턴스 생성
		CircleTest ct=new CircleTest();

		//생성된 인스턴스 ct를 활용하여 입력 메소드 호출
		ct.input();

		//생성된 인스턴스 ct를 활용하여 넓이 연산 메소드 호출
		//→메소드 호출로 얻어낸 값을 담아낼 준비 
		double a = ct.calArea();

		//생성된 인스턴스 ct를 활용하여 넓이 연산 메소드 호출
		//→메소드 호출로 얻어낸 값을 담아낼 준비 
		double l = ct.calLength();

		//생성된 인스턴스 ct를 활용하여 출력 메소드 호출
		ct.print(a, l);
		
	}
}

