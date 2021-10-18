/*========================================
  ■■■ 클래스 고급 ■■■
  -상속(Inheritance)
========================================*/

/*

○ 메소드 오버라이딩(Method Overriding)의 특징

   - 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.

   - 반드시 상속 관계가 있어야 한다.

   - 재정의된 하위 클래스의 메소드 접근제어지시자는
     상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	 예를 들어, 상위 클래스 메소드의 접근제어지시자가 [ protected ] 인 경우
	 하위 클래스가 이 메소드를 오버라이딩(Overriding) 하는 경우
	 접근제어지시자는 [ protected ] 또는 [ public ] 이어야 한다.

   - [ static ], [ final ], [ private ] 메소드는 오버라이딩(Overriding)할 수 없다.

   - Exception 의 추가가 불가능하다.
     즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에
	 새로운 Exception 을 추가하는 것은 불가능하다는 것이다.

*/

// 부모 클래스
class SuperTest110 
{

	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write() {
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}

}

// 자식 클래스
class SubTest110 extends SuperTest110
{
	
	protected int b = 100;

	public void print() {
		// System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		// 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.
		// private 변수이기 때문에...

		System.out.println("Sub print() 메소드 : " + b + " : " + c);

		// System.out.println("Sub print() 메소드 : " + b);
		// Sub print() 메소드 : 100 -> 자식 클래스가 가지고 있는 b = 100 출력
		// System.out.println("Sub print() 메소드 : " + this.b);
		// Sub print() 메소드 : 100 -> 자식 클래스가 가지고 있는 b = 100 출력
		// System.out.println("Sub print() 메소드 : " + super.b);
		// Sub print() 메소드 : 10  -> 부모 클래스가 가지고 있는 b = 10 출력

		// 변수 b 는 접근 방법에 따라
		// 다른 b 로 접근 및 출력이 이루어진다.
		// 슈퍼클래스에서 선언된 b, 서브클래스에서 선언된 b

		// -------------------------------------------------------------------

		// System.out.println("Sub print() : " + c);
		// Sub print() : 20
		// System.out.println("Sub print() : " + this.c);
		// Sub print() : 20
		// System.out.println("Sub print() : " + super.c);
		// Sub print() : 20

		// 변수 c 는 접근하는데 아무런 제약과 제한이 없다..
		// 슈퍼클래스에서 선언된 c 


	}
	
	
	@Override
	public void write() {
		// System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
		// 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.
		// private 변수이기 때문에...
		
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
	}
	
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스(동일 패키지)
public class Test110 {

	public static void main(String[] args) {

		// 하위 클래스(SubTest119) 인스턴스 생성
		SubTest110 ob = new SubTest110();

		ob.print();
		// Sub print() 메소드 : 100 : 20

		
		// ob.write() 메소드를 Override 하기 이전 상황
		ob.write();
		// Super write() 메소드 : 5 : 10 : 20


		// write() 메소드를 Override 한 이후의 상황
		// ob.write();
		// Sub write() 메소드 : 100 : 20

		System.out.println("------------------------------구분선");


		System.out.println(ob.b);
		// 100

		// System.out.println(ob.super.b);
		// 에러 발생(컴파일 에러)

		System.out.println(((SuperTest110)ob).b);
		// 10
		// ※ 슈퍼 부름
		// 변수
	

		// 메소드
		// 메소드는 덮어쓰기이다.
		// 밑에 소스는 이미 덮어쓰기를 한 상황이라 다시 덮어쓰기를 해서 원본으로 돌아갈 수 없다.
		// 부모클래스에 있는 write를 사용하고 싶어서 덮어쓰기를 했지만 원본으로 돌아갈 수 없다는 의미
		// ((SuperTest119)ob).write();
		// Sub write() 메소드 : 100 : 20 -> 자식이 재정의 한 결과값이 출력 된다.

		// ※ 메소드와 변수를 꼭~!!!! 구분하여 정리할 것~!!! check~!!!

	}

}
