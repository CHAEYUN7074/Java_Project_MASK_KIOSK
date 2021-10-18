/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
import java.util.Stack;

public class Test151 {

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};


	// ������
	public Test151()
	{
		// st ��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� <String>
		Stack<String> st = new Stack<String>();

		// st ��� Stack �ڷᱸ���� ������ ���
		// colors �� ����ִ� ������...
		// st = colors;	// (x) �� ��Ƴ��� �� ��
		for(String color : colors) //color �迭�� ��ҵ� �ϳ��ϳ� ������..
		{
			st.push(color);
		}

		st.push("���");

		// st.push(10);
		// st.push(10.0);
		// --==>> ���� �߻�(������ ����) cf)��Ÿ�� ����
		// -- ���׸� ǥ������ ���� �����ϰ� �ִ� -- Stack<String>
		//    String �� �ƴ� �ٸ� �ڷ���(int �� double)��
		//    ���� st �� push() �Ϸ��� �߱� ������...


		// ��� �޼ҵ� ȣ��
		popStack(st);

	}

	// ��� �޼ҵ�
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while(!st.empty())				// ����ִ� ��Ȳ�� �ƴ϶��
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}



	public static void main(String[] args) {

		new Test151();

	}

}

/*

���� ���

pop : ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


��� �߰�

pop : ��� ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
