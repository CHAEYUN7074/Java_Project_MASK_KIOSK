//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//-�ݺ���(do~while) �ǽ�
//============================================
/*
�� ����
��do~while������ ��while������ ����������
Ư���� ������ �ݺ� �����ϴ� �ݺ����̴�.
��while������ �ٸ� ����
���ǽĿ� ���� �˻縦 �ݺ����� ������ ���Ŀ� �Ѵٴ� ���̴�.
�̿� ���� �������� ���� �ݵ�� �� ���� �����ϰ� �Ǵ� Ư¡�� ���´�

�� ����
do
{
	���๮;
}
while(���ǽ�);

*/

public class Test050
{
	public static void main(String[] args)
	{
		//��while �ݺ����� ���� �����ߴ� �������
		// do~while ���� ���ؼ��� ������ �� �ִ�.

		/*
		int n=1;

		do
		{
			System.out.println("n="+n);
			n++;
		}
		while (n<=10);
		*/

		/*
		int n=1;

		do
		{
			n++;
			System.out.println("n="+n);
		}
		while (n<=10);
		*/
		
		/*
		int n=0;

		do
		{
			n++;  //1��ŭ ����?
			System.out.println("n="+n);
		}
		while (n<10);
		*/

		/*
		int n=0;

		do
		{
			System.out.println("n="+ ++n);
		}
		while (n<=10);
		*/

		//do~while ���� Ȱ�� ��
		//���� ���..����ڷκ��� Ư�� ������ ���� �Էµ� �� ����
		//�Է¹޴� ������ �ݺ��ؼ� �����ؾ� �ϴ� ��Ȳ�̶� �����Ѵ�.

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int num;

		do
		{
			System.out.print("100 �̻��� ������ �Է��ϼ��� :");
			num=sc.nextInt();
		}
		while (num<100);
		
		System.out.println(num+"100 �̻��� ���� �Է� �Ϸ�");


	}
}