//Ŭ������ �ν��Ͻ�

//Test066.java ���ϰ� ��Ʈ

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{

	//�ֿ� ���� ����(������, ������)
	int r; //���� ������
	final double PI=3.141592; //������
	
	//���(����, ����) �� �޼ҵ�
	
	void input() throws IOException //�޼ҵ� �������� return���� �����ϱ� void
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //��ġ ���� class�� ���� ������ �ٶ��������� �ʾ�
		System.out.print("������ �Է� : ");
		r=Integer.parseInt(br.readLine());
	}
	
	double calLength() //�ѷ��� ��ȯ�ؾ��ϱ⶧���� (�Ӽ��� �ѷ��� ���� ���� �������� �ʾҰ�)
	{
		
		double result=0;
		result = r * 2 * PI;
		return result;
	
	}

	double calArea() // ���� ���(). �Ű����� �Ѱ����� �ʾƵ��ż�(?) ����ֵ� ��
	{
		//��������� ��ȯ�ϰ� �� ���� ���� �� �ʱ�ȭ
		double result=0;
		//������ ������ �� ä���ֱ�
		result = r * r * PI;
		//���� ����� ��ȯ
		return result;
		
	}
	void print(double a, double l)//������() ������ ���� ���� a,l�� ���ؼ��� �Ű� ������ �ʿ���
	{
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
	}
}




