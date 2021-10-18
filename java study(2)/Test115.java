/*

	●●● 클래스 고급 ●●●

	- 인터페이스(Interface)

*/


// 인터페이스
interface Demo
{

	public void write();
	public void print();

}


// 클래스 - 인터페이스를 구현하는 추상 클래스
// class DemoImp1 implements Demo
abstract class DemoImp1 implements Demo
{

	@Override
	public void write() {
		System.out.println("write() 메소드 재정의...");
	}
	
	/*
	@Override
	public void print() {
		System.out.println("print() 메소드 재정의...");
	}
	*/

}


// 클래스
// class DemoImp1Sub extends DemoImp1
// 추상 클래스를 상속받는 추상 클래스
// abstract class DemoImp1Sub extends DemoImp1
// 추상 클래스를 상속받는 클래스
class DemoImp1Sub extends DemoImp1
{

	@Override
	public void print() {
		System.out.println("print() 메소드 재정의...");
	}

}


// 클래스 - main() 메소드를 포함하고 있는 외부의 다른 클래스(동일 패키지)
public class Test115 {

	public static void main(String[] args) {

		// Demo ob1 = new Demo();
		// 인터페이스 -> 인스턴스 생성 불가

		// DemoImp1 ob2 = new DemoImp1();
		// 추상 클래스 -> 인스턴스 생성 불가

		DemoImp1Sub ob3 = new DemoImp1Sub();

		ob3.write();
		ob3.print();
		// --==>> write() 메소드 재정의...
		// --==>> print() 메소드 재정의...

	}

}

/*

실행 결과

write() 메소드 재정의...
print() 메소드 재정의...
계속하려면 아무 키나 누르세요...

*/
