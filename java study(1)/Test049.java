//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//-�ݺ���(while) �ǽ�
//============================================
//�۰���(������)
//����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
//�ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�
//��, 1~9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
//���α׷��� ������ ���� �� �ֵ��� ó���Ѵ�.

//���� ��)
//���ϴ� ��(1��~9��) �Է� : 7
// 7*1=7
// 7*2=14
// 7*3=21
// 7*4=28
//	:
// 7*9=63

//���ϴ� ��(1��~9��) �Է� : 11
// 1 ���� 9������ ������ �Է� �����մϴ�.

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test049
{
	public static void main(String[] args) throws IOException
	{
		// �ۺ��� ����		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ϴ� �� (1~9) �Է� : ");
		int i = Integer.parseInt(br.readLine());  // ������� �Է� ��
		int n = 1; // ���� ����
		
		// �ۿ��� �� ó��		
		if( i<1 || i>9) // 1 ~ 9�� �ƴ� ������ �Է��� ���
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}

		while (n<=9) 
		{ 
			System.out.printf("\n%d * %d = %d", i, n, (i*n));
			n++; 
		}
	System.out.println(); 
	}
}

/*
���ϴ� �� (1~9) �Է� : 9

9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/