import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args)throws IOException
	{
		//�ֿ� ���� ����
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int bottomLength, height; // �غ��� ����
		double area; //����
	
		//���� �� ó��
		//�����ڿ��� �޽��� ���
		System.out.println("��ﰢ���� ���� ���ϱ��");
		System.out.print("-�ﰢ���� �غ� �Է�: ");
		//�� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ���� bottomLength�� ��Ƴ���
		bottomLength = Integer.parseInt(br.readLine());
		
		//------------------------------------------------------------------------------
		//�����ڿ��� �޽��� ���		
		System.out.print("-�ﰢ���� ���� �Է�: ");
		//�� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());
		//-------------------------------------------------------------------------------
		 area  =bottomLength * height /2.0;
		//          ����         ����   ����
		//�Ǽ� ����� ������ �ؾ��Ѵ�.(���� �� �ϳ��� �Ǽ��� �������Ѵ�)
	    //�� 2�� �ƴ� 2.0�� �Ǽ��� �ٲٴ� ���� ����
	//��� ���
	    //System.out.println(); //�Ű����� ������ ����
		//System.out.print(); // �Ű����� ������ error">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %f\n", a, b, c);
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", bottomLength,height,area);
	}
}
