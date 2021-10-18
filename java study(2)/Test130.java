/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -Wrapper 클래스
========================================*/
public class Test130 {

	public static void main(String[] args) {

		byte b = 3;
		int i = 256;	// 자료형

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);	// 객체

		System.out.println("b2 : " + b2);
		System.out.println("i2 : " + i2);
		// b2 : 3
		// i2 : 256

		// 이와 같은 호출이 가능하도록 print() 메소드 정의~!!!
		// API Document 참조~!!!

		
		print(b2);
		print(i2);


		// Byte 클래스의 btyeValue() 메소드 호출
		byte b3 = b2.byteValue();

		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue();

		// check~!!!
		int i4 = b2.byteValue();		// 자동 형 변환
		byte b4 = i2.byteValue();


		// byte b5 = i2.intValue();
		// 에러 발생(컴파일 에러)

	}
	
	// java.lang.Number 클래스(추상 클래스)		// Number nb = new Number(); -> 불가능
	// 모든 Wrapper 클래스의 조상 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number n 에 넘어오면서
	// 업 캐스팅이 일어나게 된다.
	static void print(Number j) {		// 3 <- (Auto-Boxing)

		System.out.println(j);

	}

	/*

	static void print(Object obj) {

		System.out.println(obj);
	}

	*/

	

}

/*

실행 결과

b2 : 3
i2 : 256
3
256
계속하려면 아무 키나 누르십시오 . . .

*/

