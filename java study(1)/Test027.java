//������
//-���׿�����
//===============================
/*����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������ ������� �������� 0���� �����Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�
��, �Էµ����ʹ� BufferedReader�� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �ϳ�.
���� �����ڸ� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

���� ��)
������ ���� �Է� : -12
-12������

������ ���� �Է� : 12
12����

������ ���� �Է� : 0
0�濵
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test027
{
	public static void main (String [] args)throws IOException
	{
		//�ֿ� ���� ����
		int n;
		String strResult; //���ڿ�(���, ����, ��)�� �ؾ���(�Ǻ� ����� ��Ƶ� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n=Integer.parseInt(br.readLine()); //�������·� ��ȯ

		strResult =(n>0)? ("���") : ((n<0) ? "����" : "��");

		//��� ���
		System.out.printf("%d �� %s\n",n,strResult);
		System.out.println("==========");
	}
}

/*
������ ���� �Է� : 0
0 �� ��
==========
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/