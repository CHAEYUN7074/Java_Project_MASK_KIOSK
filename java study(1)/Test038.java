//���� �帧�� ��Ʈ��(���,���ǹ��� �ݺ���)
//switch �� �ǽ�
//============================================
/*����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, switch�� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���������� ó���� �� �ֵ��� �ϳ�.

���� ��)
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 14
������ �Է�[+ - * /] :+

>> 20+14=34
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		//��
		int a, b, result=0; 
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine()); //��Ƽ��

		//Integer.parseInt() ��·�� ���� ������� �Ǿ��־�� ��Ƽ���� ������ ������ ������

		System.out.print("������ �Է� [+ - * /] : ");
		op = (char)System.in.read(); //(����)���� chr, �ڴ� int�� ����ȯ�� �ʿ��ϴ�
		
		//+ �� op : 43, -�� 45, *�� 42 ,/�� 47
		switch(op)
		{
			case 43 : result=a+b; break; 
			case 45 : result=a-b; break; 
			case 42 : result=a*b; break; 
			case 47 : result=a/b; break; 
			//default : return; //result�� 0���� �ʱ�ȭ���� ���� ���
		}

		//return�� �ǹ�
		//1. ���� ��ȯ
		//2. �޼ҵ��� ����->���α׷� ����

		System.out.println();
		System.out.printf(">>%d %c %d=%d\n", a,op,b,result);
		*/

		//��
		int a, b, result=0; 
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine()); //��Ƽ��

		//Integer.parseInt() ��·�� ���� ������� �Ǿ��־�� ��Ƽ���� ������ ������ ������

		System.out.print("������ �Է� [+ - * /] : ");
		op = (char)System.in.read(); //(����)���� chr, �ڴ� int�� ����ȯ�� �ʿ��ϴ�
		
		//+ �� op : 43, -�� 45, *�� 42 ,/�� 47
		switch(op)
		{
			case 43 : result=a+b; break; 
			case 45 : result=a-b; break; 
			case 42 : result=a*b; break; 
			case 47 : result=a/b; break; 

		}


		System.out.println();
		System.out.printf(">>%d %c %d=%d\n", a,op,b,result);
		

	}
}
