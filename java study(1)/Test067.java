/*
����Ŭ������ �ν��Ͻ�����
=============================
����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �� ������ ���� �����Ͽ�
������� ����ϴ� ���α׷��� �����Ѵ�.

�� Ŭ������ �ν��Ͻ� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�
���� �Է� ó�� �������� BufferedReader�� Ȱ���ϸ�
�Է� �����Ͱ� 1���� �۰ų� 100���� ū ���
�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �ϳ�.

���� ��)
������ ���� �Է� (1~100) :
������ ���� �Է� (1~100) :
������ ���� �Է� (1~100) : 100
>> 1~100������ �� : 5050
����Ϸ��� �ƹ� Ű�� ��������...

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	//���ֿ亯������
	int n;
	//n : �ܺηκ��� ������� �Է°��� ��Ƶ� ����
			
	//���Է� �޼ҵ�
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
		System.out.print("������ ���� �Է�(1~100) : ");
		n = Integer.parseInt(br.readLine());

		}
		while(n<1 || n>100);
	}

	//�ۿ��� ó�� �޼ҵ�
	int cal()
		{
			int result=0;
			for (int i=1; i<=n; i++)
			{
			result += i;
			}
			return result;		
		}

    //����� �޼ҵ�
	void print(int sum)
		{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", n,sum);
		}
}



public class Test067
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();

		ob.input();
		int sum=ob.cal();
		ob.print(sum);
	}
}











