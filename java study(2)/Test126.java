/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Wrapper Ŭ����
========================================*/

/*

�� Wrapper Ŭ����

   1. �ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������
      �������� Ŭ������ �����ϸ� ��ü ������ ó���Ѵ�.
	  ���� �ڹٿ����� �̷��� �⺻�� �����͸�
	  ��ü ������ ó���� �� �ֵ��� Ŭ������ ������ �� �ۿ� ���µ�
	  �̷��� Ŭ�������� ������ Wrapper Ŭ������ �Ѵ�.

	  "10" -> String -> ��ü -> Object
	                              ��
								 ��ü -> Integer -> �޼ҵ� parseInt() -> 10


   2. �⺻ �ڷ�����
      byte, short, int    , long, float, double, char     , boolean ���� �����ϴ�
	  Byte, Short, Integer, Long, Float, Double, Character, Boolean ��
	  Wrapper Ŭ���� �� ū ���ڵ��� �ٷ�� ����
	  java.math.BigInteger �� java.math.BigDecimal Ŭ������ �����Ѵ�.

	  Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
	  ������ import ���� ���� �ٷ� ����ϴ� ���� �����ϸ�
	  �⺻���� ���������� Wrapper Ŭ������ ���� �޼ҵ带 ����
	  �� ��ȯ�� �����ϰ� ���� �񱳿� ���� ���굵 �����ϴ�.

	  ex) java.lang.Integer Ŭ����
	      
		  int �⺻ �ڷ����� Wrapper Ŭ������
		  ������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
		  �޼ҵ� ���� �����ϰ� �ִ�.

		  static int parseInt(String s)
		  ���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ѵ�.

		  static Integer valueOf(int i)
		  int ���� Integer ������ ��ȯ�Ѵ�.

		  byte byteValue(), int intValue()
		  , short shortValue(), long longValue()
		  , float floatValue(), double doubleValue()
		  �ش� �⺻ �ڷ������� �� ��ȯ�� ���� ��ȯ�Ѵ�.

*/


/*

�� ���� �ڽ�(Auto-Boxint)�� ���� ��ڽ�(Auto-UnBoxing)

   �Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������
   �� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
   ������, JDK1.5 ���� ���۷��� ���� �⺻ �ڷ�����
   ������ ���� ������� �� ��ȯ�� �����ϰ� �Ǿ���.

   int a = 10, b;
   Integer ob;

----------------------------------------------------
   int a = 10;
   Integer b = new Integer(); �̷��� �ؾ��߾�����

   JDK 1.5����
   
   int a = 10, b;
   Integer ob;
   ob = a;
   // �⺻ �ڷ���(int)�� Integer ������ �ڵ� ��ȯ(���� �ڽ�)
   // �����δ� ... [ ob = new Integer(a); ]

   b = ob; -> ���� ��ڽ�		
   ������Ƽ�� �ڷ��� = ��ü
   // Integer(��ü)�� �⺻ �ڷ��� int ������ �ڵ� ��ȯ(���� ��ڽ�)
   // �����δ� ... [ b = ob.intVale(); ]

   �̴� JDK1.5 ���� �߰��� ���� �ڽ� / ���� ��ڽ��̶��
   ������� ���� �������� ���̴�.

*/

public class Test126 {

	public static void main(String[] args) {
		
		int a = 10, b;
		Integer c;
		Object d;

		b = a; // int �� ������(�ڷ�) -> int �� ����
		c = new Integer(0);

		// �� ������ ���۷��� ��(���� Ÿ��)�� �⺻ �ڷ���(�� Ÿ��)�� ȣȯ���� �ʴ´�.!!!

		b = c;					// Integer �� ������(��ü) -> int �� ����(���� ��ڽ�)
		b = c.intValue();		// ��ڽ�

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		// d.toString() : java.lang.Object@15db9742

		d = new Integer(10);		// ���� ��ü = ���� ��ü(�� ĳ����)
		System.out.println("d.toString() : " + d.toString());
		// d.toString() : 10

		d = new Double(12.345);		// ���� ��ü = ���� ��ü(�� ĳ����)
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " +d);
		// d.toString() : 12.345
		// d            : 12.345



		d = 10;						// ���� �ڽ�

		/*

		Integer i = 10;
		  -> Integer i = new Integer(10);

		Object o = i;
		  -> Object o = new Integer(10);

		Object o = 10;

		*/
		
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " +d);
		// d.toString() : 10

	}

}