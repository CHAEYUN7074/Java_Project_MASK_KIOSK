//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//-�ݺ���(while) �ǽ�
//============================================
//����ڷκ��� ������ �� ������ �Է¹޾�
//���� �� ���� ū �� ������ ���� ���Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�

//���� ��)
//ù ��° ���� �Է� :
//�� ��° ���� �Է� :
//>>10~20������ �� :  xxx

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test047
{
	public static void main(String[] args)throws IOException
	{

		//���ֿ� ���� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su1,su2;    //ù ��°, �� ��° �Է°��� ���� ����
		int n;			//����(�ݺ�) ������ Ȱ���� ����
		int result=0;

		//�ۿ��� �� ó��
		
		System.out.print("ù ��° ���� �Է� : ");
		su1=Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		su2=Integer.parseInt(br.readLine());
		
		//�Է¹��� �� ���� ũ�� �񱳿� �ڸ� �ٲٱ�
		if(su1>su2) 
		{	
			//a��b �ڸ� �ٲٱ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		//�ݺ� ���� ����
		//�ݺ� ������ �����ϱ� ���� 
		//���� ���� ���� �����ؼ� ���� ������ Ȱ���ؾ��Ѵ�
		n=su1; //���� ��ġ�ٲٴ°� ���ؼ� su1�� ���� ���� ��ġ�ϰ� �������

		while(n<=su2)
		{
			result +=n;
			n++;
		}

		//�۰�� ���
		System.out.printf(">>%d~%d ������ �� : %d\n", su1,su2,result); 
	
	}

}
