//�ڹ� �⺻ ���α׷���
//-�ڹ��� �⺻ ����� : java.util.Scanner
//=======================================
//��java.util.Scanner
//�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//����Ʈ�� ���Ǵ� �ܶ����ڴ� �����̴�
//�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.


import java.util.Scanner;
public class Test017
{
	public static void main(String[] args)

	{//���ֿ� ���� ����
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		String name; //�̸�
		int kor,eng,mat,tot;

		//�ۿ��� �� ó��
		System.out.print("�̸� �������� �������� �������� �Է�(���� ����) :");

		name=sc.next();
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();

		//������ ����
		tot=kor+eng+mat;

		//�۰�� ���
		System.out.println();
		System.out.println(">>�̸� : "+name);
		System.out.println(">>���� : "+tot); 
}
}