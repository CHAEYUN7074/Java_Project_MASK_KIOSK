/*========================================
  ■■■자바의 주요(중요)클래스■■■
========================================*/

// ※ Test122.java 와 비교~!!!

// import java.lang.*;
// -> import java.lang.Object;

public class Test123 // extends Object
{

	/*

	...
	public String toString()
	{
	}

	*/

	public String toString()				// 오버라이딩
	{
		return "재정의한 toString()...";		
	}

	public static void main(String[] args) 
	{

		Test123 ob = new Test123();

		System.out.println(ob.toString());
		// 재정의한 toString()...

		System.out.println(ob);
		// 재정의한 toString()...

	}

}

