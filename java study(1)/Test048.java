//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//-�ݺ���(while) �ǽ�
//============================================
//����ڷκ��� ������ �� ������ �Է¹޾�
//1���� �Է¹��� �� �� ������
//��ü �հ�, ¦���� �հ�, Ȧ���� ����
//���� ��������� ����ϴ� ���α׷��� �����ϴ�.

//���� ��)
//������ ���� �Է� : 270
//>> 1~270 ���� ������ �� :
//>> 1~270 ���� ¦���� �� :  xxx
//>> 1~270 ���� Ȧ���� �� :  xxx

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test048

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		// �ۺ��� ����		
		int num, sum, even, odd;			
		int i=1;
		sum=even=odd=0;
		// �� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine()); //������� �Է°� ��ȯ

		
		while (i <= num)		//--������ ���ڱ��� �ݺ���
		{
			sum +=i;			//--�����Ǽ� ��
			
			if(i%2==0)			//¦��
			{
				even +=i;		
			}
			else if(i%2!=0)		//Ȧ��
			{
				odd +=i;		
			}
			
			i++;
		}

		//�۰�� ���

		System.out.printf("\n>> 1 ~ %d ���� ������ �� : %d", num, sum);
		System.out.printf("\n>> 1 ~ %d ���� ¦���� �� : %d", num, even);
		System.out.printf("\n>> 1 ~ %d ���� Ȧ���� �� : %d\n", num, odd);
	}
}
