/*========================================
  ■■■ 클래스 고급 ■■■
  -상속(Inheritance)
========================================*/
/*
상속이란
새로 설계하고자 하는 클래스가
이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.

즉 상속은 객체를 좀 더 쉽게 만들 수 있는
고소준의 재사용성을 확보하고
객체간의 관계를 구성함으로써
객체 지향의 또 다른 큰 특징인 다형성의 문법적 토대가 된다

상속은 기존 프로그램의 클래스 내용을 공유함으로써
중복된 코드들을 재작성할 필요 없이
반복적이고 세부적인 작업을 처리하지 않기때문에
프로그램을 작성하는 시간을 절약할 수 있고
유지보수를 편리하게 할 수 있으며
프로그램의 길이도 짧아지게 된다

또한 이미 작성된 프로그램들을 앞서 테스트되었기 때문에
오류를 줄일 수 있어 현재 작성중인 프로그램에만 전념할 수 있다.

※주의
자바는 다중상속을 지원하지 않아서
두개 이상의 클래스로부터 상속을 받을 수 없다
상위클래스==부모 클래스==조상클래스==super클래스 ->물려주는 클래스
하위클래서==자식 클래스==자손클래스==sub클래스->물려받는 클래스(여기서 상속을 결정(?) 돈 많으세요? 아,,아빠!!)

※super
static으로 선언되지 않은 메소드에서 사용되며
현재 클래스가 상속받은 상위 클래스의 객체를 가리킨다.
super는 상위 클래스의 생성자를 호출하거나
상위 클래스의 멤버 변수 또는 메소드를 호출할 때 사용할 수 있다.

하위 클래스의 생성자에서 상위 클래스의 생성자를 호출할 때에는
하위 클래스의 생성자 정의 구문에서 맨 처음에만 위치할 수 있다.

*/

//부모 클래스
class SuperTest107
{
	protected double area;
	SuperTest107()
	{
		System.out.println("Super class...");
	}
	void write(String title)
	{
		System.out.println(title+"-"+area);
	}
}
//자식 클래스
//※자바는 단일 상속만 지원되며, 다중 상속(108,109,110도 우리아빠야)은 허용되지 않는다.(어 우리아빠도 슈퍼테스트야! 이건 가능)
public class Test107 extends SuperTest107
{
	/*눈에 보이지는 않지만 여기 들어있다고 생각하면된다.(상속받은 내용)
	protected double area;
	SuperTest107(); //클래스의 이름인데 만약에 this();으로 쓴다면 Test107();로 쓴 것과 동일하게되어 내가 나를 호출하는 재귀가 된다. 그래서 super라는 키워드를 만들어서
					//this 대신 쓴다. super=superTest107
	{
		System.out.println("Super class...");
	}
	void write(String tltle)
	{
		System.out.println(tile+"-"+area);
	}
	*/
	double area = 10.1234; //여기서 물려받은(지금 주석처리된) area와 여기 area 두개가 보인다.
	//자식 클래스의 생성자
	Test107()
	{
		//부모 클래스 생성자 호출(생성자 내용 참고..)
		//실행문에서 실행문을 호출 할 수 있지만 제일 먼저 실행되는 위치에서 호출해야되요
		super(); //반드시 이 위치여야해. 만약 system.out.println 뒤에 쓰면 error
		System.out.println("Sub class...");
	}
	public void circle()
	{
		int r=10;
		area = r*r*3.141592;
		write("원");
	}
	
	public void rect()
	{
		int w=20, h=5;
		area=w*h; 
		write("사각형"); 
	}
	
	public static void main(String [] args)
	{
		//Test107 클래스 기반 인스턴스 생성
		Test107 ob=new Test107();

		ob.circle();//circle메소드 호출
		ob.rect();//rect메소드 호출
	}
}