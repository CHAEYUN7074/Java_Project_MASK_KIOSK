//�ڹ� �⺻ ���α׷���
//������ �ڷ���
//�ڹ��� �⺻ ����� : BufferdReader Ŭ����
//=========================================
//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//�̸��� �Է��ϼ��� : ä����
//���� ���� �Է� : 90
//���� ���� �Է� : 80
//���� ���� �Է� : 80

//===[���]===
//�̸� : ä����
//���� : 240

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args)throws IOException
	{
		//�ֿ� ���� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//��BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); �̰�
		//���ٷ� �ÿ����� �̷���
		
		String name;
		//String strName; //�̸��� ���ڿ��̴ϱ� string - name�� �ƴ϶� strName��� ǥ���� �� �ִµ�
		                //�̰� ���߿� string���� ǥ���ߴ��� �ؾ�������� ����ؼ� 
		int kor,eng,math,sum;

		String strTemp; //���ڿ� ������ �ӽ� ���� ����
		
		
		//���� �� ó��

		//�����ڿ��� �޽��� ���
		System.out.print("�̸��� �Է��ϼ��� :");
		//��
		name = br.readLine();

		//�����ڿ��� �޽��� ���		
		System.out.print("���� ���� �Է�: ");
		//��
		//kor = Integer.parseInt(br.readLine());
		strTemp=br.readLine(); //����ó�� ���� ��ȯ���� �ʰ� ��Ƴ� ���� �Űܴ�� �������
		kor=Integer.parseInt(strTemp);
		//�����ڿ��� �޽��� ���
		System.out.print("���� ���� �Է�: ");
		//��
		strTemp=br.readLine(); //����⶧���� ���� strtemp�� ����ִ� ���������� �����
		eng = Integer.parseInt(strTemp);
		//�����ڿ��� �޽��� ���
		System.out.print("���� ���� �Է�: ");
		//��
		math = Integer.parseInt(br.readLine());

		sum = kor + eng + math;
		
		System.out.println();
		System.out.println("====[���]====");
		System.out.println("�̸�: " + name);
		System.out.printf("�̸� : %s\n", name);
		System.out.println("����: " + sum);
		
		//�������� %d, �Ǽ�%f, ���ڿ�%s
	}
}