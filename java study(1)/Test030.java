//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//if~else�� �ǽ�
/*
����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������ ¦������, Ȧ������, ������
����� �Ǻ��Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
������ ���� �Է� : 14
14��¦��
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[]args) throws IOException
	{
		//�ֿ� ���� ����
		int n;
		String strResult;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է� : ");
		n=Integer.parseInt(br.readLine());

		/* ���� ¦���� ����Ǵ� ���� �߻�
		if (n%2==0)
		{
			System.out.println(n+"��¦��");
		}
		else if(n%2!=0)
		{
			System.out.println(n+"������");
		}
		else
		{
			System.out.println(n+"��");
		}
		*/
		//String strResult ="�Ǻ��Ұ�";�١�
		if(n==0)
		{
			strResult = "��";
		}
		else if (n%2==0)
		{
			strResult = "¦��";
		}
		else
		{
			strResult="����";
		}	
		System.out.println(n+"��"+strResult);		
	}
}
