/*==========================================================
 ■■■ 메소드 중복정의(Method Overloading) ■■■
============================================================
※ 메소드 오버로딩 개요(면접★★★★오버라이딩이랑 용어 혼동주의)
메소드 오버로딩이란 
메소드가 처리하는 기능은 같고
메소드 괄호 속에 오는 인수(인자,매개변수,파라미터)의 갯수가 다르거나
자료형(data type)이 다른 경우
메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록
문법적으로 허용하게 되는데
이를 메소드 오버로딩이라고 한다.
*/

public class Test099
{
	public static void main(String[] args)
	{
		drawLine();

		//--==>> ====================

		drawLine('-');

		//--==>> --------------------

		drawLine('+');

		//--==>> ++++++++++++++++++++

		drawLine('>', 30);

		//--==>> >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	}

	// 선을 그리는 메소드 정의
	
	public static void drawLine()
	{
		System.out.println("===================="); //'=' 20EA
	}

	// 선의 형태를 바꾸어 그리는 메소드 정의
	/*
	public static void drawLine()
	{
		System.out.println("+++++++++++++++++++");
	}
	*/

	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		System.out.print(c);
		System.out.println();

	}
	// 선의 형태와 길이를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(c);
		System.out.println();
	}
}



