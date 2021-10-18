/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -object 클래스
========================================*/

class NewCar
{

	private int velocity;				// 자동차의 속도
	private int wheelNum;				// 자동차의 바퀴 갯수
	private String carName;				// 자동차의 이름


	NewCar(int speed, String name, int wheel) {
		
		velocity = speed;
		carName = name;
		wheelNum = wheel;

	}

}

public class Test125 {

	public static void main(String[] args) {

		NewCar nCar1 = new NewCar(100, "볼보", 4);
		NewCar nCar2 = new NewCar(150, "BMW", 4);

		// equals()
		System.out.println("1-1 : " + nCar1.equals(nCar2));	// -> 주소값 비교
		System.out.println("1-2 : " + (nCar1 == nCar2));
		// 1-1 : false
		// 1-2 : false

		NewCar nCar3 = nCar1;	// 객체 복사 -> 얇은 의미 복사(참조형)
								//           -> 주소값 복사


		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		// 2-1 : true
		// 2-2 : true


		// toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		// 3-1 : NewCar@15db9742		---
		// 3-2 : NewCar@6d06d69c		  | 3-1, 3-3 같은 객체
		// 3-3 : NewCar@15db9742		---


		// hashCode()
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		// 4-1 : 366712642
		// 4-2 : 1829164700
		// 4-3 : 366712642
		// 결과값을 16진수 형태로 바꾸게 되면
		// [ toString() ] 메소드가 반환한 결과값 확인 가능.
		

		// getClass()	-> 어디에서 만들어진 객체냐~
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		// 5-1 : class NewCar
		// 5-2 : class NewCar
		// 5-3 : class NewCar
		
		// 생성된 객체를 통해
		// 기반 설계도 클래스를 확인할 수 있는 기능을 가진 메소드

		// clone()		// -> 객체 복사

		// finalize()	// -> 객체 직렬화(자바 마지막 시간에 수업할 내용)

		// 기타 나머지 메소드는 스레드 처리와 관련이 있다.

	}

}



