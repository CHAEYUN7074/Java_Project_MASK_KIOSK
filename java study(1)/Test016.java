//�ڹ� �⺻ ���α׷���
//�ڹ��� �⺻ ����� : java.util.Scanner
//=======================================
//��java.util.Scanner
//�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//����Ʈ�� ���Ǵ� �ܶ����ڴ� �����̴�
//�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner; //��

public class Test016
{
	public static void main(String[] args) // throws IOException �� ���� �ʿ���� �ڹٰ� �� ����߾� ��ĳ�ʴ�
	{
		//���ֿ� ���� ����
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		String name; //�̸�
		int kor,eng,mat;

		//�ۿ��� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		//br.readLine();
		name=sc.next();

		System.out.print("�������� �Է� : ");
		//kor=br.readLine(); --����
		//kor=Integer.parseInt(br.readLine());
		//kor=Integer.parseInt(sc.next());
		kor=sc.nextInt(); //scanner�� ������ Ÿ���� �����ؼ� �޾� �� �� �ְ� �ߴ� sc.next�� ���ڿ�, int�� ���̸� ���� 

		System.out.print("�������� �Է� : ");
		eng=sc.nextInt();
		
		System.out.print("�������� �Է� : ");
		mat=sc.nextInt();

		//�۰�����
		System.out.println();
		System.out.println(">>�̸� : "+name);
		System.out.println(">>���� : "+(kor+eng+mat)); //������� ���� �϶�� �濡�� ()
	}
}