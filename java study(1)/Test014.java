//�ڹ� �⺻ ���α׷���
//-�ڹ��� �⺻ ����� : System.in.read()
//=========================================
//���� ��)
//�� ���� �Է� : A
//�� �ڸ� ���� �Է� : 7

//>> �Է��� ���� : A
//>> �Է��� ���� : 7

/*
System.in.read() �޼ҵ�� �� ���ڸ� �����´�
��, �ϳ��� ���ڸ� �Է¹޾� �Է¹��� ������ ASCII(�ƽ�Ű) Code �ڵ带 ��ȯ�Ѵ�
*/

import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ����
		char ch; // �Է¹��� ���ڸ� ���� ����
		int n; // �Է¹��� ������ ���� ����

		//���� �� ó��
		//����ڿ��� �ȳ� �޽���
		System.out.print("�� ���� �Է�: ");
		//ch = System.in.read(); //System.in.read(A); - A��� ���� �����°� �ƴ϶� 65��� ������ �����°� �Ǵϱ�
		                       //ch�� �ƴ϶� int Ÿ���̰� ū �ڷ����� ���� �ڷ����� �Ű� ���� �� ��� error
		ch=(char)System.in.read(); //char�� ����ȯ�ؼ� �����;��Ѵ�.
		//���Է� ��⿭�� �����ִ� \r�� \n�� ��ŵ�ؼ� �ǳʶٱ�
		System.in.skip(2);
		
		
		//����ڿ��� �ȳ� �޽��� ��� �� �Է°� ������
		System.out.print("�� �ڸ� ���� �Է�:" );
		n=System.in.read();

		//1->49 ��
		//2->50
		//48��ŭ ���ؼ� ������ ��Ģ�� �߰������� n�� 48��ŭ ���ҽ��Ѿ��Ѵ�
		//n-=48; //

		temp=(char)n;

		//������
		System.out.println();
		System.out.println(">>�Է��� ���� : "+ch);
		System.out.println(">>�Է��� ���� : "+n);
		//System.out.println(">>�Է��� ���� : "+temp); //----��
	}
}