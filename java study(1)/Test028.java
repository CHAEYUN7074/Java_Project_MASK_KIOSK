//������
//���׿�����
//==============================
/*����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������ �������� ������� �Ǻ��Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�
�� �Է��� BufferedReader�� Ȱ���ϰ�
ó�� ������ ���� �����ڸ� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�

���� ��)
������ ���� �Է� : 
2021�� �� ���

������ 4�� ��� �̸鼭 100�� ����� �ƴϰų�
400�� ����̸� ���� �ƴϸ� ���
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args)throws IOException
	{
		//�ֿ� ���� ����
		int year;
		String strResult; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		//(������ 4�� ��� ������ 100�� ��� �ƴ� ������ 400�� ���) - �Ѱ����� �ΰ� �̻��� ������ �����ϸ� ������ �������ڰ� �;��Ѵ�
		strResult =(year%4==0 && year%100!=0 || year%400==0) ? ("����") : ("���"); 
		//strResult =(year%4==0)? ("���") : ((n<0) ? "����" : "��"); 

		//��� ���
		System.out.printf("%d�� �� %s\n",year,strResult);
	}
}

/*
������ ���� �Է� : 2000
2000�� �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/