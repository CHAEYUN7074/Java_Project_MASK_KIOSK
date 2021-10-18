/*========================================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스(내부클래스)
========================================*/
// outer
class InnerOuterTest
{

	static int a = 10;
	int b = 20;

	class InnerNested
	{

		int c = 30;

		void write() {
			
			System.out.println("inner 의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);

		}

	}

	void write() {
		
		System.out.println("outer 의 write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write();		// inner 의 write() 메소드 호출

	}

}

public class Test129 {

	public static void main(String[] args) {

		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();		// outer 의 write() 메소드 호출


		// InnerNested ob3 = new InnerNested();
		// 에러 발생(컴파일 에러)

		// InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		// 에러 발생(컴파일 에러)

		// ※ 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//    외부 클래스의 인스턴스(객체)를 사용하지 않고
		//    단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.



		// ※ Test127.java 파일과 비교할 것~!!!

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		// inner 의 write()...
		// a : 10
		// b : 20
		// c : 30

		
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		//                                  ob2             |
		ob6.write();
		// inner 의 write()...
		// a : 10
		// b : 20
		// c : 30
	}

}
