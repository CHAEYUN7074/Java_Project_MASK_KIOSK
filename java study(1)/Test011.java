//�ڹ� �⺻ ���α׷���
//-������ �ڷ���
//-�ڹ��� �⺻ ����� : BufferedReaderŬ�����١١١�


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//�濡���� ��𰡼� ���� ���� �̰� ���赵��

public class Test011
{
	public static void main(String [] args) throws IOException
	{
		//BuffereadReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Ű������ �Է°��� ���� ���� ���� System.in (����Ʈ ���·� ������)
		//InputStreamReader ����Ʈ�� ���ڷ� ����
		//BufferedReader ���ڸ� �д� ��

	   int r;
	   final double PI=3.141592;
	   double a, b;

	   //���� �� ó��
	   //�� ����ڿ��� �ȳ� �޽��� ���
	   System.out.print("���� ������ �Է� :");
	   //�� ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
	   //r=br.redline(); //��
	   //r="20";

	   //Interger.parsnint() ->�Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
	   //re = Integer.parseInt("20");
	   r=Integer.parseInt(br.readLine());//�� ���� ���� ������(������)���� ��ȯ ��

	   //�鿬��
	   a=r*r*PI;
	   b=r*2*PI;

	   //��� ���
	   //System.out.println(">>���� : "+a);
	   //System.out.println(">>�ѷ� : "+b);
	   
	   //System.out.printf(">>���� : ��\n",�ۿ� ���� ��);
	   //System.out.printf(">>�ѷ� : ��\n",�ۿ� ���� ��);

		System.out.printf(">>���� : %f\n",a);
		System.out.printf(">>�ѷ� : %f\n",b);
 }
}

/*
���� ������ �Է� :25
>>���� : 1963.495000
>>�ѷ� : 157.079600
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/