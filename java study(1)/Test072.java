/*
■■■클래스와 인스턴스■■■
-생성자(constructor)
=============================
*/


public class Test072
{
	int val1;
	double val2;

	Test072()
	{
		val1=0;
		val2=0;
		System.out.println("매개변수 없는 생성자...");
	}
	Test072(int x)
	{
		val1=0;
		val2=0;
		System.out.println("매개변수 없는 생성자...");
	}
	Test072(double y)
	{
		val1=0;
		val2=0;
		System.out.println("매개변수 없는 생성자...");
	}
	Test072(int x, double y)
	{
		val1=0;
		val2=0;
		System.out.println("매개변수 없는 생성자...");
	}
	public static void main(String[] args)
	{
		Test072 ob1=new Test072();
		Test072 ob2=new Test072(4);
		Test072 ob3=new Test072(4.0);
		Test072 ob4=new Test072(4,4.0);

		System.out.println(ob1.val1+","+ob1.val2);
		System.out.println(ob2.val1+","+ob2.val2);
		System.out.println(ob3.val1+","+ob3.val2);
		System.out.println(ob4.val1+","+ob4.val2);
	}

}