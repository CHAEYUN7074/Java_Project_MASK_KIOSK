/*
■■■클래스와 인스턴스■■■
-생성자(constructor)
=============================
*/

class NumberTest2
{
	int num;

	/*
	NumberTest2()
	{
	}
	*/
	NumberTest2(int n)
	{
		num=n;
		System.out.println("생성자 호출 시 매개변수 전달 : " +n);
	}
	int getNum()
	{
		return num;
	}
}
public class Test070
{
	public static void main(String[] args)
	{
		//NumberTest2 클래스 인스턴스 생성
		//NumberTest2 ob1=new NumberTest2();
		//컴파일 에러
		//Nmber2 클래스에는
		//사용자 정의 생성자가 존재하고 있는 상황이기에 default 생성자가 자동으로 삽입되지 않으며
		//사용자 정의 생성자는 매개변수를 갖는 형태이기 때문에
		//위와 같이 매개변수 없는 생성자 호출 시 문제가 발생★★

		NumberTest2 ob1 = new NumberTest2(10);
		//생성자 호출 시 매개변수 전달 : 10
		System.out.println("메소드 반환 값 : "+ob1.getNum());
		
		NumberTest2 ob2=new NumberTest2(5214);

		System.out.println("메소드 반환 값 : "+ob2.getNum());
	}
}