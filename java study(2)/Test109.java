/*========================================
  ���� Ŭ���� ��� ����
  -���(Inheritance)
========================================*/
//������ ���� ���α׷��� �����Ѵ�
//�� ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�

//���� ��)
//������ �� ���� �Է�(���� ����) : 20 15
//������ �Է�(+ - * /) : -
//>>20-15=5.00
//����Ϸ��� �ƹ� Ű�� ��������...
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

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		super.x = scan.nextInt();
		super.y = scan.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
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

		System.out.print("������ �� ���� �Է�(���� ����) : ");		// 20 15
		String temp = br.readLine();								// "20 15"
		String[] strArr = temp.split("\\s");
		// ���ڿ�.split("\\s");		������ -> ����(\\s)
		// String[] strArr = {"20", "15"};
		
		// �� ���ڿ�.split("������");
		// "��� ���� �ٳ���".split("\\s");		-> {"���", "����", "�ٳ���"};

		if(strArr.length != 2) {
			return false;
			// false�� ��ȯ�Ͽ� input() �޼ҵ� ����
			// �� ������ ������ ���...
			// �Ʒ��� �����ؾ� �ϴ� �ڵ尡 �����ִ���
			// ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		}

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
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




