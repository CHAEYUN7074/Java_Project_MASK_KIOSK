//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//if~else�� �ǽ�
//=============================
//����
/*����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������ �������� ������� �Ǻ��Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, �Է��� BufferedReader�� Ȱ���ϰ�,
ó�������� if ���ǹ� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�

���� ��)
������ ���� �Է� : 2021
2021�� �� ���
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[]args) throws IOException
	{
		//���ֿ� ���� ����
		int year;
		String strResult; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�ۿ��� �� ó��
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		//�����ǹ��� ��� ���
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			strResult="����";
		}
		else 
		{
			strResult= "���";
		}
		System.out.println(year + "��"+ "��" + strResult);	
	}
}
		

/*
������ ���� �Է� : 2021
2021�����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 2024
2024������
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
