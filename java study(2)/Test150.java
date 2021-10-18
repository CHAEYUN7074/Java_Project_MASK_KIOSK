/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
//�ſ� �߿�!!!! TOP5
/*

�� �÷��� �����ӿ�ũ(Collection Framework)

   == �÷���(Collection) + �����ӿ�ũ(Framework) -> �����ӿ�ũ ���� 3���� ����ϱ�
      ------------------   ---------------------
	        ����			��ȯ��, Ʋ, ��ӡ�
			  |
			  ����ǰ, ����ǰ, (����, �������) ����, ����, ����, ����
			  -------------------------------------------------------
			          ��Ƴ��� �͵�....	���ִ� �͵�...

==> �ڷᱸ��

�� �ڷ�

   ���� ����κ��� �ܼ��� �����̳� ������ ���� ������
   ����̳� ������ ���� �Ǵ� �� ������ ����.

   ��

�� �ڷ� ����

   �ڷ� ó���� ���� �ڷ��� ǥ��, ����, ����, ���� ��
   �̿뿡 ���� ��� ���� ������ �̿��Ͽ� ���α׷��� ����ϰ�
   ��ǻ�Ϳ� ���� ó���Ǵ� �������� ������ �ڷ��� ǥ��, ����, ���� ��
   ó���� ���� �˰����� �ۼ� �� ���ð� �̿� ����� �����ϴ� �о�.

   ��

�� �÷��� �����ӿ�ũ(Collection Framework)
   
   �÷���(��Ƴ��� �����͵�)�� ǥ���� ������ ���� ���ϵ� ��Ű��ó��
   �÷��� �����ӿ�ũ�� �����ϴ� ��Ҵ� ������ ����.

   1. �������̽�(Interface)
      -> �⺻������ �÷��ǿ� �ʿ��� ������ ���� ����� �����Ѵ�.
	  ���� ���, list �� �߰�, ����, �˻� ����� �����ϴ�
	  �÷��� �������̽��� �����ϸ�
	  �� �÷��Ǹ��� ������ �������̽��� ���ǵǾ� �ִ�.

   2. ����(Implementation)
      -> �������̽��� ������ Ŭ������ �� �÷�����
	     ���� � �ڷᱸ���� �̿��Ͽ� ǥ���ߴ��Ŀ� ����
		 �÷����� ������ �޶����� �ȴ�.

   3. �˰�����(Algorithms)
      -> �� �÷��ǵ鸶�� �����ϰ� ����� �� �ִ� �޼ҵ带 �ǹ��Ѵ�.


�� �ڹ� �÷����� �߰��� �÷��� �����ӿ�ũ ��� ���� ���ǵǾ� �����Ƿ�
   �� �÷��� �������� �����Ǵ� �޼ҵ��� �ϰ����� �ֱ� ������
   �� ���� �÷����� �����θ� �ٸ� �÷����� ����ϴµ� �����ϴ�.

�� ����(Stack)

 

   Stack Ŭ������ ������Ʈ ���Ի���(LIFO) ������ Stack �� ��Ÿ����.

   �̴� ����(Vector)�� �������� ó���ϴ� 5���� �޼ҵ��

   ����(Vector) Ŭ������ Ȯ���ϰ� �ȴ�.

 

   ����� push() �޼ҵ�� pop() �޼ҵ尡 �����Ǵ� �� �ܿ�

   ������ ���� �׸����� peek() �� �ǽ��ϴ� �޼ҵ�,

   ������ ����ִ����� ���θ� Ȯ���ϴ� �޼ҵ� inEmpty(),

   �������� �׸��� ã�Ƽ� ���ηκ��� �� ��°������ ã�Ƴ��� �޼ҵ� ���� �����ȴ�.

 

   ������ ó������ �ۼ��Ǿ��� ��, �׸��� �������� �ʴ´�.

 

   - boolean empty()

     ������ ����ִ��� Ȯ���Ѵ�.

 

   - E Object peek()

     ������ �� ���� ��ü�� ���ÿ��� �������� �ʰ� ��ȯ�Ѵ�.

 

   - E Object pop()

     ������ �� ���� ��ü�� ��ȯ�ϰ� ���ÿ��� �����Ѵ�.

 

   - E Object push(E item)

     ��ü�� ���� �ڷᱸ���� �����Ѵ�.

 

   - int search(Object o)

     ������ �� ���������� �Ķ���� ������ �Ѱܹ��� ��ü������ �Ÿ��� ��ȯ�Ѵ�.

	 �� ���� ��ü�� ��� 1�� ��ȯ�ϰ� �� �Ʒ��� 2�� ��ȯ�ϴ� ����.


���׸�, ���׸� ǥ����
<E> <K, V>
�������� ������ Ȯ��

*/
import java.util.Stack;

public class Test150 {
	public static void main(String[] args) {

		// Stack �ڷᱸ�� ����
		Stack<Object> myStack = new Stack<Object>();

		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		String str4 = "��";

		// myStack �̶�� Stack �ڷᱸ�� �ȿ� str1 ~ str4 ���� ��Ƴ���
		// add(), push() ����ϴ� �޼ҵ�
		myStack.add(str1);		// ����
		myStack.add(str2);
		myStack.push(str3);
		myStack.push(str4);
		

		// peek() : ���� �� ���� ��ü ��ȯ, ���Ŵ� ���� �ʴ´�.
		String val1 = (String)myStack.peek();	// ���� ����ȯ !
		System.out.println("val1 : " + val1);
		
		String val2 = (String)myStack.peek();
		System.out.println("val2 : " + val2);

		String val3 = (String)myStack.peek();
		System.out.println("val3 : " + val3);

		System.out.println();

		String value = "";
		//myStrack �̶�� �̸��� ���� ���� �ڷᱸ���� �����Ͱ� ����ִ�
		//��Ȳ�� �ƴ϶��(��, ���� ����ִ� ���¶��)
		//isEmpty() - is : ���� �ƴ��� Ȯ���ϴ�
		while(!myStack.isEmpty()) //i�� ���������̴ϱ� !flase -> true
		{
			value = (String)myStack.pop();
			System.out.println("value : " + value);
		}


		// myStack �̶�� �̸��� ���� Stack �ڷᱸ����
		// �����Ͱ� ������� ���� ���¶��...
		// (��, ä���� �ִ� ���¶��...)
		// [ isEmpty() ]			// �� �� �� ��
		//							// �� �� ��
									// �� ��
									// ��
									// 
		while(!myStack.isEmpty())	// true �� true �� true �� true �� false
		{
			//pop() : ���� �� ���� ��ü ��ȯ. �����Ѵ�.
			value = (String)myStack.pop();
			System.out.println("value : " + value);
		}

		

	}
}