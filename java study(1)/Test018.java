//�ڹ� �⺻ ���α׷���
//-�ڹ��� �⺻ ����� : java.util.Scanner
//=======================================
//��java.util.Scanner
//�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//����Ʈ�� ���Ǵ� �ܶ����ڴ� �����̴�
//�ۼ��� ���� ��ū�� printf() �޼ҵ带 ���
//�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.


import java.util.Scanner;
public class Test018
{
	public static void main(String[] args)
	{
	//���ֿ� ���� ����
	Scanner sc=new Scanner(System.in);
	String name;
	int kor, eng, mat, tot;

	//�ۿ��� �� ó��
	System.out.print("�̸�,��������,��������,��������,�Է�(, ����) :");
	sc=new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
	name=sc.next();
	kor=sc.nextInt();
	eng=sc.nextInt();
	mat=sc.nextInt();

	}
}