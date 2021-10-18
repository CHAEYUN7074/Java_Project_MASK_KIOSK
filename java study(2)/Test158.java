/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
//벡터 자료구조 객체 선언 및 생성 시
//사용자 정의 클래스 활용 → 자료형


// import 구문이 누락된 상황
import java.util.Vector;

//사용자 정의 클래스를 설계하여 자료형처럼 활용해보고자 한다
//class MyDate	// 클래스 이름과 생성자 이름이 달라서... 생성자로 인식하지 못한 상황
class MyData
{
	//주요 속성 구성 -> 주소 변수 선언(멤버 변수)
	private String name;
	private int age;

	//getter/ setter 구성
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	//생성자 정의(매개변수가 2개인 생성자) - 사용자 정의 생성자라 default 생성자(?) 없고
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	//생성자(매개변수 없는 생성자) -> 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}
}

public class Test158
{
	public static void main (String[] args)
	{
		//벡터 자료 구조 생성
		//Vector <MyDate> v = new Vector<MyData>();
		Vector <MyData> v = new Vector<MyData>();

		//벡터 자료구조 v 에
		//채지윤 13세 / 김진령 7세/ 장진하 50세
		//담아내기
		
		/*
		//①
		MyData st1 = new MyData();
		st1.setName("채지윤");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("김진령");
		st1.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st1.setName("장진하");
		st1.setAge(50);
		v.add(st3);
		*/
		
		/*
		//②
		MyData st1 = new MyData("채지윤",13);
		v.add(st1);
		MyData st2 = new MyData("김진령",7);
		v.add(st2);
		MyData st3 = new MyData("장진하",50);
		v.add(st3);
		*/

		//③
		v.add(new MyData("채지윤", 13)); //마이데이터 기반의 객체가 들어가면 되니까
		v.add(new MyData("김진령", 7));
		v.add(new MyData("장진하", 50));

		//벡터 자료구조 v에 담긴 내용(요소) 전체 출력하기
		//실행 예)
		//이름 : 채지윤, 나이 : 13세
		//이름 : 김진령, 나이 : 7세
		//이름 : 장진하, 나이 : 50세

		//①
		for(MyData obj : v)
			System.out.printf("이름:%s, 나이:%d세\n", obj.getName(),obj.getAge());
		System.out.println();
		
		//②
		for(int i=0; i<v.size(); i++)
			System.out.printf("이름:%s, 나이:%d세\n",v.elementAt(i).getName(), v.elementAt(i).getAge());
		System.out.println();		
		//③향상된 for 문
		for(Object temp : v) //업캐스팅이 일어나며 여기 담김..생성된 인스턴스는 하위객체
			System.out.printf("이름:%s, 나이:%d세\n",((MyData)temp).getName(),((MyData)temp).getAge());//object가 temp//MyData타입으로 다운캐스팅
		System.out.println();
		
		
	}
}