/*========================================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����(����Ŭ����)
========================================*/


/*

�� Annonymous Ŭ����(�͸��� Ŭ����, ���� Ŭ����)

   - AWT �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���

   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���(�ǽ�)

   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο����� ���� �͸��� Ŭ������ �����Ͽ� ó���� �� �ִ�.


�� ���� �� ����

   new ����Ŭ������ ������() 
   {

	   �������������� �ڷ��� �޼ҵ�()
	   {
		   ...;
	   }
   }; // �ݵ�� �����ݷ� �ʿ���~!!!


*/


// package default;

// import java.lang.*;			-> import java.lang.Object;

class Test3 // extends Object
{

	/*

	Object Ŭ������ �����...
	...
	...

	public String toString()
	{
		...;
	}

	*/

	public Object getString()
	{

		// return ...;
		//        ----
		//        Object Ÿ��;

		// return new Object() { .... };
		//     -------------------------
		//       Object Ÿ��;

		return new Object()
		{

			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};		// �����ݷ� check~!!!
	}

}

public class Test121 {


	/*

	Object�� �����ִ� �����
	��, Object �� ���� ��ӹ��� �����
	...

	*/

	public static void main(String[] args) {

		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());

		System.out.println(ob2.getString());

	}

}

/*

public int �޼ҵ��()
{
	return 10;
	       --
		   int Ÿ��
}


public Scanner �޼ҵ��()
{
	Scanner scan = new Scanner(System.in);

	return scan;
	       ----
		   Scanner Ÿ��
}

public FruitSeller �޼ҵ��()
{
	return new FruitSeller();
	       ------------------
		   FruitSeller Ÿ��
}

*/


/*

���� ���

Test3@15db9742
�͸��� Ŭ����...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/


