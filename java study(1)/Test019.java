//�ڹ� �⺻ ���α׷���
//-��� ������
//-BufferedReader
//-printf()
//=============================
/*����ڷκξ� ������ ������ �� �� �Է¹޾�
��Ģ���� �� ������ ������ �����Ͽ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�
����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

���� ��)
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====[���]====
10 + 2 = 12
10 - 2 = 8
10 * 2 =20
10 / 2 =5
10 % 2 =0
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test019
{
	public static void main(String[] args) throws IOException
	{
	//���ֿ� ���� ����
	int num1, num2;
	int res1, res2, res3, res4, res5;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//�ۿ��� �� ó��
	System.out.print("ù ��° ���� �Է� : ");
	num1=Integer.parseInt(br.readLine());

	System.out.printf("�� ��° ���� �Է� : ");
	num2=Integer.parseInt(br.readLine());


	//������ ����
	res1=num1+num2;
	res2=num1-num2;
	res3=num1*num2;
	res4=num1/num2;
	res5=num1%num2;

	//�۰�� ���
	System.out.printf("\n====[���]====\n"); //��
	System.out.printf("%d + %d = %d\n", num1, num2, res1); 
	System.out.printf("%d - %d= %d\n", num1, num2, res2);  
	System.out.printf("%d * %d= %d\n", num1, num2, res3); 
	System.out.printf("%d / %d= %d\n", num1, num2, res4); 
	System.out.printf("%d %% %d= %d\n", num1, num2, res5); //�� (�ۼ�Ʈ�� �����ϸ� %%�ι� ��� ��)
	
	}
}
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====[���]====
10 + 2 = 12
10 - 2= 8
10 * 2= 20
10 / 2= 5
10 % 2= 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/