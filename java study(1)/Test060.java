/* ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
-break
==============================================
�Ʒ��� ���� ó���� �̷������ ���α׷��� �����Ѵ�
��, �Է¹޴� ������ 1~100 ���� �ȿ�����
�����ϵ��� �ۼ��Ѵ�

���� ��)
������ ���� �Է� : -20

������ ���� �Է� : 0

������ ���� �Է� : 2021

������ ���� �Է� : 10
>>1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�(Y/N)? : y

������ ���� �Է� : 100
>>1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�(Y/N)? : n
����Ϸ��� �ƹ� Ű�� ��������... �� ���α׷� ����
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��������
		int n,s,i;
		//n : �ܺηκ��� ������� �Է°��� ��Ƶ� ����
		//s : ������ ���� ����� ��Ƶ� ����
		//i : 1���� 1�� ������� �Է°����� ������ ����
		
		char ch;// ������� ���� ���� �Է�
		// break
		
		while(true) //���ѷ���
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);
		
			//�׽�Ʈ
			//System.out.println("��ȿ�� ���� �Է� �Ϸ�")
		
			s=0; //������ ������ �ʱ�ȭ ��ġ
			
			//������ ����
			for(i=1; i<=n; i++) 
			{
				s+=i; //s�� i��ŭ ����
			}
			
			System.out.printf(">>1~%d������ �� : %d\n" ,n,s);
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch= (char)System.in.read();
			System.out.println();

			//�׸��ҷ�
			//if(ch=='N' || ch=='n') //�������� ����or���� -> ���� and ����
			if(ch!='Y' && ch!='y')
			{
			break; //����� �׸��� ����������
			}
			// Y+ENTER �� enter���� interger�� ���µ� ���������� �ٲ� �� ��� ������ ����Եȴ�
			// enter��(\r\n)ó��
			System.in.skip(2);
			}//end while
		}
	}


