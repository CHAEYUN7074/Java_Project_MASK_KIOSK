/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
//�˻� �� ����
import java.util.Vector;

public class Test157
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","�Ķ�","����"};
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� v ����
		Vector<String> v = new Vector<String>();

		// v ��� ���� �ڷᱸ���� colors �� ��� �߰�
		for (String color : colors)
			v.add(color);

		//���� �ڷᱸ�� v�� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//==>��ü��� ���

		//indexOf() : ���� ������ �ε����� Ȯ��
		String s1 = "��ȫ";
		
		int i = v.indexOf(s1);
		System.out.println(s1 + "�� index ��ġ : " +i);
		System.out.println();

		String s2 = "���";
		//v.contains(s)
		//���� �ڷᱸ�� v�� ã���� �ϴ� s�� ���ԵǾ� �ִٸ�
		if(v.contains(s2))
		{
			//���� �ڷᱸ�� v���� s2�� �ε��� ��ġ Ȯ��
			i = v.indexOf(s2);
			System.out.println(s2 + "�� index ��ġ : " +i);
			
			//�׻� ���� �ڵ带 ���� �����ϰ��� �ϴ� ����� ��ġ�� ã��
			//����� ã������ �����ؾ��Ѵ�.
			v.remove(i);
		}
		//ã�Ƽ� ������ �� ��ü ��� ���
		System.out.println("���� �� ��ü ��� ��� : ");
		for(String str : v)
			System.out.print(str+ " ");
		System.out.println();
		//==> 

		//�߰� �׽�Ʈ
		System.out.println(colors);

		System.out.println(v);
		

	}
}
		