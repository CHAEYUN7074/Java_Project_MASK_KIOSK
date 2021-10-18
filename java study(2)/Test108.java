/*========================================
  ■■■ 클래스 고급 ■■■
  -상속(Inheritance)
========================================*/
//생성자와 클래스 상속간의 관계
//하위 클래스는 상위 클래스 멤버를 상속받지만
//생성자는 상속 대상에서 제외된다
//그리고 하위 클래스의 생성자가 호출될 때
//자동으로 상위 클래스의 생성자가 호출된다
//이때 호출되는 상위 클래스의 생성자는 
//인수가 없는 생성자(default 생성자)가 된다

//상위클래스 및 하위 클래스를 설계하는 과정에서
//상위클래스의 생성자를 정의하지 않거나
//인수가 없는 생성자만을 정의한 경우
//명시적으로 하위 클래스에서 상위 클래스의 생성자를 호출하지 않아도
//아무런 문제가 발생하지 않지만
//상위 클래스에 인자가 있는 생성자만 존재하는 경우에는 주의해야한다

//예를 들어 다음에서...
/*
	class A_class
	{
		A_class(int n)
		{
		}
	}
	class B_class Extends A_class
	{
		B_class( )
		{
			super(10);
			...
			...
		}
	}
*/


//Rect108클래스와 circle108클래스의 부모 클래스
class SuperTest108
{
	protected double area;//default와 프로텍티드 차이는 상속에서만 차이가 있어서 protected가 나왔다?? 오 상속이다! 생각해도된다.
	private String title; //상속받은 클래스에서는 여기 접근 조차 할 수 없다. (부모님의 개인 금고 그건 상속 안되지)---기본서 무시하고 여기까지만 이해하자
	
	//부모 클래스의 인자없는 사용자 정의 생성자
	public SuperTest108()
	{
		System.out.println("SuperTest108...인자 없는 생성자");
	}
	//부모 클래스의 문자열을 인자로 받는 사용자 정의 생성자
	public SuperTest108(String title)
	{
		this.title=title;
		System.out.println("SuperTest108...문자열을 인자로 받는 생성자");
	}
	public void write()
	{
		System.out.println();
	}
}
//supertest108 클래스를 상속받는 자식 클래스
class Rect108 extends SuperTest108
{	
	/*생성자는 상속받지 못해서 그 나머지만
	protected double area;
	public void write()
	{
		System.out.println(title+"-"+area);
	}
	*/
	private int w,h;
	public Rect108()
	{
		//자동으로 삽입
		//super(); → superTest108();
	}
	public void calc(int w, int h)
	{
		this.w=w;
		this.h=h;
		area=(double)this.w*this.h;
		//super.area=(double)this.w*this.h;
		//this.area=(double)this.w*this.h;

		write();
	}
	public void wirte()
	{
		System.out.println("w:"+w);(",h:"+h);
		System.out.println("tkrkrgud-"+area);
	}
	//※메소드 오버라이딩
	//상위 클래스를 상속받은 하위 클래스에서
	//상위 클래스에 정의된 메소드를 다시 정의하는 것으로(재정의)
	//객체 지향 프로그래밍의 특징인 다형성을 나타낸다
	//재정의(오버로딩)는 반드시 상속 관계에 있어야하며
	//메소드의 이름, 리턴타입, 매개변수의 갯수나 타입이 완전히 일치해야한다.
}
//supertest108 클래스를 상속받는 자식 클래스
class Circle108 extends SuperTest108
{
	/*생성자는 상속받지 못해서 그 나머지만
	protected double area;
	public void write()
	{
		System.out.println(title+"-"+area);
	}
	*/
	//default 생성자 → 아래의 사용자 정의 생성자가 있기 때문에 자동으로 삽입되지 않는다.
	public Circle108()
	//자식 클래스의 문자역을 인자로 받는 사용자 정의 생성자
	public Circle108(String title)
	{
		
	}
	public void calc(int r)
	{
		area=r*r*3.141592;
		write();
	}
}
//main() 메소드를 포함하고 있는 외부의 다른 클래스 
public class Test108
{
	public static void main(strgint [] args)
	{
		Rect108 ob1=new Rect108();
		//-->SuperTest108..인자 없는 생성자(부모클래스가 호출된거...)
		
		//Circle108 ob2 =new Circle108();
		//현재 Circle108 클래스에는 매개변수를 필요로하는 사용자 정의 생성자가 만들어져 있으며
		//이로인해 default 생성자가 자동으로 삽입되지 않는 상황(컴파일 에러)

	    Circle108 ob2=new Circle108("원");
	}
}