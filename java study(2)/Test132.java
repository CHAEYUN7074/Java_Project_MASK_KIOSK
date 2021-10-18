/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -String Ŭ����
========================================*/
/*
//String str=new String();
//int s=10l
//String name = "ȫ�浿";

�� String Ŭ������ ���� ���ڿ� �����Ϳ� ���� ������ �Ұ����ϴ�. (�߿�)
   (��, ���� �Һ� : Immutable)
   ���ڿ��� ������ ����Ǹ� ���ο� ��ü�� �����ϸ�
   ���� ����� �Ҿ���� ��ü�� ������ �÷����� ����� �ǰ�,
   ���ο� ��ü�� �� �ּҸ� �Ҵ��ϰ� �ǹǷ�
   �ؽ��ڵ嵵 ���ϰ� �ȴ�.


�� String Ŭ���� ���� [ + ] �����ڸ� ����ϰ� �Ǹ�
   ���ڿ� ���� ������ �����ϸ�,
   String Ŭ������ �ٸ� Ŭ���� ��ü, �Ǵ� �⺻�� ������ ����
   [ + ] �����ڸ� ����ϴ� ��쿡��
   ���������� �ڵ� String Ŭ������ ��ȯ�� �����ϴ�.

   �� check~!!!
      
	  ������ Ȯ�εǴ� ����� �̷�����...
	  String �� ���� ���ڿ��� ������ ������ �� ���� ������
	  [ + ] �����ڸ� ����Ͽ� ���ڿ��� ������ �����ϰ� �Ǹ�
	  ���������� StringBuffer �� �����Ͽ�
	  append() �޼ҵ带 �̿��� ���ڿ��� ���� ������ �����ϰ� �ȴ�.
	  ����, ������ ���ڿ��� ���� ����ϴ� Servlet �����
	  �ǵ����̸� String �� ����ϴ� �� ����
	  StringBuffer �� char[] �� ����ϴ� ���� ȿ������ �� �ִ�.

	  ==> ������ ���ڿ��� ó���ϴ� ��쿡�� �ַ� String Ŭ������ ���
	      ������ ���ڿ��� ó���ϴ� ��쿡��
		  �� Ÿ�� �� �������� ó�����ִ� StringBuffer Ŭ������
		  ����ϴ� ���� ȿ�����̴�.


�� String ��ü�� ���� �� Ư¡

   String ��ü�� �����ϴ� �����

   1. ���ڿ� ����� �����ϴ� ���
   2. String Ŭ������ �����ڸ� �̿��ϴ� ���
   �̷��� �� ���� ����� �ִ�.

   String str1 = "Java";
   String str2 = new String("Java");

   ������, [ ���ڿ� ��� ] �� ���� �����ڸ� ����Ͽ�
   �����ϴ� ����� ���� ��ü�� �����ϴ� ����
   [ new ] �����ڸ� �̿��Ͽ� ��ü�� �����ϴ� ����
   ó�� ������ �ǹ̰� �ٸ���.


*/

public class Test132 {

	public static void main(String[] args) {

		String s1 = "seoul";
		String s2 = "seoul";
		String s3 = new String("seoul");
		String s4 = new String("seoul");

		// s1 �� s2 ��ü�� �����ϴ� ���ڿ� ����� ������ ���
		// ���ڿ��� ����� �������� ������ �����ϱ� ������
		// s1 ��ü�� s2 ��ü�� ������ ��� ��Ҹ� �����ϰ� �ȴ�.
		// ������,
		// s3 �� s4 ��ü�� ������ ������ �ƴ� �ٸ� ��� ������
		// ���Ӱ�(new) Ȯ���Ͽ� ���ڿ� ����� �� ������
		// ������ ��Ȳ�̱� ������
		// �� �ν��Ͻ��� ���� ������ �����ϴ� ���� �ƴϴ�.
		// ���� [ s3 == s4 ] �� ������ �Ǹ�,
		// ���� ���� ���ڿ� ��������� ���θ�
		// ���ؾ� �ϴ� ��Ȳ�̶�� [ equals() ] �޼ҵ带 �̿��ؾ� �Ѵ�.
		// string class�� equals�� �ٸ� Ŭ������ �޶�(???)

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		// true
		// false
		// false

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s1));
		// true
		// true
		// true
		// true

		System.out.println();


		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		// s1 : seoul
		// s2 : seoul
		// s3 : seoul
		// s4 : seoul

		System.out.println();

		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		// s1 : 109324212
		// s2 : 109324212
		// s3 : 109324212
		// s4 : 109324212

		// �� ��ü�� ������ hashCode �� ������
		//    hashCode �� ���ٰ� �ؼ� ���� ��ü�� �ƴϴ�.

		s2 += " korea";
		System.out.println(s2);
		// seoul korea

		s2 = "korea";
		System.out.println(s2);
		// korea

		// �̿� ���� ���
		// s2 �� ������ "seoul" �� ����� ������
		// [ s2 += " korea"; ] �� ����Ǵ� ��������
		// ������ �÷����� ����� �Ǹ�
		// "seoul korea" ����� ����� ������
		// s2 �� �����ϰ� �Ǿ��ٰ�
		// �ٽ� s2 �� ������ "seoul korea" �� ����� ������
		// ������ �÷����� ����� �Ǹ�
		// "korea" ���ڿ� ����� ���Ӱ� ����� ������
		// s2 �� �����ϰ� �ȴ�.
		//
		// ==> �� String ��ü�� ������ �Һ��̴�~!!!(����� �����~~)

		s2 += 20;
		System.out.println(s2);
		// korea20


	}

}

