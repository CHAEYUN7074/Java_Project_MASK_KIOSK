//���� �帧�� ��Ʈ��(���,���ǹ��� �ݺ���)
//if~else �� �ǽ�
//=============================================
/*����
����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾�
�̸� �Ǻ��Ͽ� �Է¹��� ���ĺ��� ������ ��츸
����� ����ϴ� ���α׷��� �����Ѵ�
��, ��ҹ��ڸ� ��� ������ �� �ֵ��� ó���Ѵ�
����, ���ĺ� �̿��� ���ڰ� �ԷµǾ��� ���
�Է� ������ ���� ������ ����ڿ��� �ȳ��� �� �� �ֵ��� �Ѵ�
*/

// ���� ��)
// ���ĺ� �� ���� �Է� : A
// >> ���� OK~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : e
// >> ���� OK~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : 1
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		
		// ���ֿ� ���� ����
		char a;

		// �ۿ��� �� ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ĺ� �� ���� �Է� : ");
		a = (char)System.in.read();

		// �� ��� ���
		if ((a>=65 && a<=90) || (a>=97 && a<=122))
		{
			if (a==65 || a==69 || a==73 || a==79 || a==85
				|| a==97 || a==101 || a==105 || a==111 || a==117)
			
			{
				System.out.println(">> ���� OK~!!!");
			}
		}

		else
		{
			System.out.println(">> �Է� ����~!!!");
		}
	}
}
