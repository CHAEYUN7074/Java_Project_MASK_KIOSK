//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//if~else�� �ǽ�
//=============================

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���������� ó���� �� �ֵ��� �ϳ�.

//���� ��)
//ù ��° ���� �Է� : 20
//�� ��° ���� �Է� : 14
//������ �Է�[+ - * /] :+

//>> 20+14=34
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args)throws IOException //readLine������ ���� IOException
	{
		/*
		//�����	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		char op; //������
		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine()); //��Ƽ��

		//Integer.parseInt() ��·�� ���� ������� �Ǿ��־�� ��Ƽ���� ������ ������ ������

		System.out.print("������ �Է� [+ - * /] : ");
		//op = Stytem.in.read(); //(����)���� chr, �ڴ� int�� ����ȯ�� �ʿ��ϴ�
		op=(char)System.in.read();

		if(op=='+')
		{
			System.out.printf("\n>>%d+%d=%d\n",a,b,(a+b));
		}
		else if(op=='-')
		{	
			System.out.printf("\n>>%d-%d=%d\n",a,b,(a-b));
		}
		else if(op=='*')
		{
			System.out.printf("\n>>%d*%d=%d\n",a,b,(a*b));
		}
		else if(op=='/')
		{	
			System.out.printf("\n>>%d/%d=%d\n",a,b,(a/b));
		}
		else
		{
			System.out.printf("�Է°����� ������ �����մϴ�.\n");
		}
		*/

		
		/*
		//�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op; //�����ڵ� ������ �ޱ�
		
		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine()); //��Ƽ��

		//Integer.parseInt() ��·�� ���� ������� �Ǿ��־�� ��Ƽ���� ������ ������ ������

		System.out.print("������ �Է� [+ - * /] : ");
		op = System.in.read(); //(����)���� chr, �ڴ� int�� ����ȯ�� �ʿ��ϴ�
			---------------
			�ƽ�Ű�ڵ� �޾ƿ´�
		

		if(op==43)
			System.out.printf("\n>>%d+%d=%d\n",a,b,(a+b)); // �ڵ尡 �����̸� {}(���̽�) ���� ����
		else if(op==45)
			System.out.printf("\n>>%d-%d=%d\n",a,b,(a-b));
		else if(op==42)
			System.out.printf("\n>>%d*%d=%d\n",a,b,(a*b));
		else if(op==47)
			System.out.printf("\n>>%d/%d=%d\n",a,b,(a/b));
		else
			System.out.printf("�Է°����� ������ �����մϴ�.\n");
		*/

		//�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//check!!
		int a, b, result=0; //0���� �ʱ�ȭ�ؼ� else ��� ������.
		char op;
		
		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine()); //��Ƽ��

		//Integer.parseInt() ��·�� ���� ������� �Ǿ��־�� ��Ƽ���� ������ ������ ������

		System.out.print("������ �Է� [+ - * /] : ");
		op = (char)System.in.read(); //(����)���� chr, �ڴ� int�� ����ȯ�� �ʿ��ϴ�
		

		if(op=='+')
			result=a+b;
		else if(op=='-')
			result=a-b;
		else if(op=='*')
			result=a*b;
		else if(op=='/')
			result=a/b;

		System.out.printf("\n>>%d%c%d\n", a,op, b);


	}
}

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
������ �Է� [+ - * /] : +

>>10+2=12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/