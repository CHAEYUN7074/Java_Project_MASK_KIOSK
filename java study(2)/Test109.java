/*========================================
  ■■■ 클래스 고급 ■■■
  -상속(Inheritance)
========================================*/
//다음과 같은 프로그램을 구현한다
//단 상속의 개념을 적용하여 작성할 수 있도록 한다

//실행 예)
//임의의 두 정수 입력(공백 구분) : 20 15
//연산자 입력(+ - * /) : -
//>>20-15=5.00
//계속하려면 아무 키나 누르세요...
/*
import java.util.Scanner;
	
	class Aclass
	{
		protected int x,y;
		protected char op;

		Aclass( )
		{
		}
		void write(double result)
		{
			System.out.printf(">>%d%c%d=%.2f%n",x,op,y,result);
		}
	} 

	class Bclass extends Aclass
	{
	private int w, h;
	public Bclass() 
	{
	}

	public void input() 
		{
		Scanner scan = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		super.x = scan.nextInt();
		super.y = scan.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		super.op = scan.next().charAt(0);
		}

	public void calc() 
		{

		double result = 0;
		this.w = w;
		this.y = y;

		if(super.op == '+') 
			{
			result = x + y;
			}
		else if(super.op == '-') 
			{
			result = x - y;
			}
		else if(super.op == '*') 
			{
			result = x * y;
			}
		else if(super.op == '/') 
			{
			result = x / y;
			}
		write(result);
	}
}

public class Test109 
{

	public static void main(String[] args) 
	{
		Bclass ob = new Bclass();
		ob.input();
		ob.calc();
	}
}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass() {

	}

	void write(double result) {
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

class Bclass extends Aclass {
	
	Bclass() {

	}

	boolean input() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");		// 20 15
		String temp = br.readLine();								// "20 15"
		String[] strArr = temp.split("\\s");
		// 문자열.split("\\s");		구분자 -> 공백(\\s)
		// String[] strArr = {"20", "15"};
		
		// ※ 문자열.split("구분자");
		// "사과 딸기 바나나".split("\\s");		-> {"사과", "딸기", "바나나"};

		if(strArr.length != 2) {
			return false;
			// false을 반환하여 input() 메소드 종료
			// 이 조건을 수행할 경우...
			// 아래에 수행해야 하는 코드가 남아있더라도
			// 결과값을 반환하며 메소드는 종료된다.
		}

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		//System.out.println(op);

		if(op != '+' && op != '-' && op != '*' && op != '/') {
			return false;
		 }

	    return true;
		/*
		if(op == '+' && op == '-' && op == '*' && op == '/') {
			return true;
		}

		return false;
		*/
	} // end input()

	double calc() {
		
		double result = 0;

		switch (op) {
			
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break;

		}

		return result;

	} // end calc();


} // end Bclass

public class Test109 {

	public static void main(String[] args) throws IOException {
		
		Bclass ob = new Bclass();

		if(!ob.input()) {
			
			System.out.println("Error...");
			return;

		}

		double result = ob.calc();

		ob.write(result);

	}

}




