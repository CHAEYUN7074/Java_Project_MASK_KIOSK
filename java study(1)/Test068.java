/*
����Ŭ������ �ν��Ͻ�����
=============================
����ڷκ��� ������ �� ������ �Է¹޾�
��Ģ������ �����ϴ� ���α׷��� �����Ѵ�.
�� Ŭ������ �ν��Ͻ� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�

���� ��)
������ �� ���� �Է�(���� ����) : 10 5
������ ������ �Է�(+ - * /) : +
>> 10 + 5 =15
*/
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Calculate
{
	//���ֿ亯������
	int a, b, result=0; 
	char op;
			
	//���Է� �޼ҵ�
	void input() throws IOException //System.in.read();������
	{
		Scanner sc = new Scanner(System.in); //���� �������� �����ؼ� �޾ƿ� �� �־�
		System.out.print("������ �� ���� �Է�(���� ����): ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("������ ������ �Է�(+ - * /)   : ");
		op = (char)System.in.read();
	}

	//�ۿ��� ó�� �޼ҵ�	
	int cal()
	{
		int result = 0;
		
		switch (op)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
			default  : System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");		
		}

		return result;
	}


    //����� �޼ҵ�
	void print(int s)
		{
		System.out.printf(">>%d %c %d=%d\n", a,op,b,s);
		}
	
}


public class Test068 
{
	public static void main(String[] args) throws IOException
	{
		//Calculate Ŭ���� �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input(); 
  		int result=cal.cal();
		cal.print(result);
	}
}




















