//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//if~else�� �ǽ�
//==============================
//����ڷκ��� ������ ���� �� ���� �Է¹޾�
//���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�
//���� ��)
//ù ��° ���� �Է� : 5
//�� ��° ���� �Է� : 15
//�� ��° ���� �Է� : 10

//>>���� ��� : 5 10 15


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;

		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine()); //��Ƽ��

		System.out.print("�� ��° ���� �Է� : ");
		c= Integer.parseInt(br.readLine()); //��Ƽ��

		if(a>b) 
		{	//a��b �ڸ� �ٲٱ�
			a=a^b;
			b=b^a;
			a=a^b;
		}

		if(a>c) 
		{	//a��c �ڸ� �ٲٱ�
			a=a^c;
			c=c^a;
			a=a^c;
		}

		if(b>c) 
		{	//b��c �ڸ� �ٲٱ�
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.println("�ڸ��ٲ޹߻�");
		System.out.printf("\n>>���� ��� : %d %d %d\n",a,b,c);
	}
}

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 50
�� ��° ���� �Է� : 20

>>���� ��� : 10 20 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/