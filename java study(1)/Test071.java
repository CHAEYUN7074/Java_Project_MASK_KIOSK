/*
����Ŭ������ �ν��Ͻ�����
-������(constructor)
=============================
*/

public class Test071
{
	int x;
	//�������� �̸��� �׻� ���ܾ��� Ŭ������ �̸��� �����ؾ� �ϸ�
	//�ʿ��� ��� �μ��� �޾Ƶ��̴� �͵� �����ϰ�
	//���� �̸��� �޼ҵ带 �����ϴ� �ߺ����ǰ� ����������
	//���ϰ�(��ȯ��)�� ���� �� ����
	
	//�����ڴ� �ٸ� �Ϲ� �޼ҵ�ó�� ȣ��� �� ����
	//new �����ڸ� �̿��Ͽ� ��ü�� �����ϱ� ���� ȣ��Ǹ�,
	//�� Ŭ������ �ν��Ͻ��� ��ü�� ������ �Ŀ�
	//������ ��ü�� ����� �ʱ�ȭ��Ű�� �۾��� �����Ѵ�.

	Test071()
	{
		System.out.println("���ڰ� ���� ������");
	}
	Test071(int x)
	{
		System.out.println("���ڰ� ���� ������");
	}
	public static void main(String[] args)
	{
		//Test071 Ŭ���� ��� �ν��Ͻ� ����
		Test071 ob1=new Test071();
		Test071 ob2=new Test071(100);


	}
}