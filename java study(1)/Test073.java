/*
■■■클래스와 인스턴스■■■
-생성자(constructor)와 초기화 블럭(initialized bolck)
=============================
*/

public class Test073
{	
	//int n=100;
	//int m=200;
	int n;
	int m;

	//클래스에서는 연산을 하는 것이 원칙적으로 불가해서 {}안에 넣어서 해야한다
	// 이 블럭을 초기화 블럭이라고 한다
	{
		n=100;
		m=200;
		System.out.println("초기화 블럭 실행...");

	}


	//생성자(Constructor)
	Test073()
	{
		n=1000;
		m=2000;
		System.out.println("생성자 실행...");
	}

	//생성자(Constructor)
	Test073(int n, int m)
	{
		n=100;
		m=200;
		System.out.println("매개변수 있는 생성자 실행...");
	}


	//출력 메소드 정의
	void write()
	{
		System.out.println("n:"+n+",m"+m);
	}
	public static void main(String[]args)
	{
		Test073 ob1=new Test073();
		//초기화 블럭 실행
		ob1.write();
		//n:1000, m:2000

		Test073 ob2=new Test073(1234,5678);

		ob1.write();


		}

	}
