/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -StringTokenizer Ŭ����
========================================*/
/*

�� �ɸ��� ��(CharacterSet)


	�� �����ڵ�(unicode)

	   ���� ǥ������ ������ 2����Ʈ���� ���� ������ ���� ���ں�ȣ
	   ü��(UCS : Universal Code System)�� ���Ѵ�.
	   ������ǻ��, IBM, ����ũ�μ���Ʈ ���� ���ҽþ����� ������
	   �����ڵ�(Unicode)�� 1990�⿡ ù ������ ��ǥ�Ͽ���
	   ISO/IEC JTC1 ����  1995�� 9�� ����ǥ������ �����Ͽ���.
	   ���� ��Ī�� ISO/IEC 10646-1(Universal Multiple-Octet Coded Character Set)�̴�.

	   �����Ϳ� ��ȯ�� ��Ȱ�ϰ� �ϱ� ���� ���� 1���� �ο��Ǵ� ����
	   16��Ʈ�� �����Ͽ���.
	   �ڵ��� 1���� �� ����� 7��Ʈ, �񿵾�� 8��Ʈ
	   �ѱ��̴� �Ϻ���� 16��Ʈ�� ���� ������ �Ǵµ�
	   �̵��� ��� 16��Ʈ�� ������ ���̴�.


	�� UTF-8 �� UTF-16

	   UTF-8 �� UTF-16 �� ���̸� �� �� ����� ���ϸ�
	   ���ڸ� ǥ���� ���� ������ �ٸ��ٴ� ���̴�.
	   UTF-8�� 8��Ʈ ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���ϰ�
	   UTF-16�� 16��Ʈ ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���Ѵ�.

	   - UTF-8(88it UCS Transformation Format)
	     
		 ������ �⺻������ ����ϴ� �ڵ�.
		 UCS-2�� ���ǵǴ� ���� ������ �̿��Ͽ� ����� ���ڿ���
		 ����Ʈ ���� ��ȯ�ϴ� ����� 1�� 1���ڸ� 1-6����Ʈ ������
		 ��Ƽ����Ʈ�� ��ȯ�Ѵ�.

	   - UTF-16(168it UCS Transformation Format)

	     �ڹ��� �⺻ �ڵ�.
		 �ڹٿ����� ���� �ϳ��� �����ϸ� ����Ʈ ����
		 �������̵�, �ѱ۹����̵� 2����Ʈ�� �����ϰ� �ȴ�.
		 UCS-2�� ���ǵǴ� ���� ������ �̿��Ͽ� ����� ���ڿ���
		 UCS-4�� �Ϻ� ���ڸ� ä���ֱ� ���� ���ڵ� ���.
		 UTF-8�� ����(�ƿ﷯ ���� ��.)�� �� �ִ�.
		 UCS-2�� �̿��� �� �ִ� ���ڼ��� ���� �ø� �� �ִ�.


	�� �ڹٴܿ����� UTF-16�� ����ϰ�, �������� UTF-8�� ����ϱ� ������
	   ��쿡 ���� ��ȯ�ؾ� �ϴ� ��Ȳ�� �߻��� �� �ִ�.




�� ���� �ڵ��� ����


   �� KSC5601
      
	  �ѱ� �ϼ��� ǥ��(�ѱ� 2,350�� ǥ��)
	  �ѱ�����ǥ�� ����ó���о�(C)�� 5601�� ǥ�ؾ�

   �� KSC5636

      �����ڿ� ���� ǥ��.
	  �ѱ�����ǥ�� ����ó���о�(C)�� 5636�� ǥ�ؾ�
	  ���� ASCIII Code ���� ��������(\)�� ��(��) ǥ�÷� ��ü.

	
   �� EUC-KR(MS949)

      Bell-Laboratories ���� ���н� �󿡼� ������ �̿��� ���ڸ�
	  �����ϱ� ���� ������ Ȯ�� �����ڵ�(Extend UNIX Code) ��
	  �ѱ� ���ڵ� ���.
	  ������ KSC5636���� ó���ϰ�, �ѱ��� KSC5601�� ó��
	  ��, EUC-KR(MS949) = KSC5636 + KSC5601

	
   �� UTF-8
      
	  ������ ���ڴ� 1����Ʈ, �ѱ��� 3����Ʈ�� ǥ��
	  (������ ���� ���, UTF-8 �������� JSP �� �ۼ��� ������
	   ���ϵ� UTF-8 �������� �����ؾ� �Ѵ�,)

   �� UTP-16
  
      �ڹ� �⺻ ���� �ڵ�
	  ������ ���ڴ� 1����Ʈ, �ѱ��� 2����Ʈ�� ǥ��


   �� ISO-8859-1

      ������ ��� ǥ�⿡ �ʿ��� US-ASCII �� ����
	  94���� ������ ������ ����
	  
	  
*/

import java.io.UnsupportedEncodingException;

public class Test137 
{

	public static void main(String[] args) // throws UnsupportedEncodingException 
	{

		byte[] buf;
		String name = new String("�ƹ���");

		System.out.println("����Ʈ �ɸ��ͼ� : " + System.getProperty("file.encoding"));
		// ����Ʈ �ɸ��ͳ� : MS949
		

		// [ String��ü.getBytes() ]
		// : ����Ʈ �ɸ��� ������ ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ�
		buf = name.getBytes(); //�ü���� �⺻ ���ڵ� ��Ŀ� ����...

		System.out.println("Length : " + buf.length);
		// Length : 6

		for(byte b : buf) {
			System.out.println("[" + b + "]");
 		}
		System.out.println();
	    // [-68][-37][-57][-40][-76][-10]


		try
		{
			// "UTF-8"�� ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ� ȣ��
			buf = name.getBytes("UTF-8");

			System.out.println("Length : " + buf.length);

			for(byte b : buf)
				System.out.println("[" + b + "]");
			System.out.println();


			// new String("��¹�");
			// new String(����Ʈ�迭, ���ڵ����);
			// new String(buf, "UTF-8");

			// UTF-8 ���·� ����� ����Ʈ �迭��
			// String ��ü�� �Ķ���Ͱ� [ UTF-8 ] �� �ο��Ͽ� ����
			// UTF-8 ������� buf ����Ʈ �迭�� �����Ͽ�
			// ���ڿ� ��ü ������ �� �̸� ���
			System.out.println("Value1 : " + new String(buf, "UTF-8"));
			// Value1 : �ƹ���


			System.out.println();

			// UTF-8 ���·� ����� ����Ʈ �迭(-> buf)��
			// String ��ü�� �Ķ���Ͱ� ����(-> ����Ʈ ĳ���� ��)�� �ο��Ͽ� ����
			System.out.println("Value2 : " + new String(buf));
			//                               ---------------
			//                                new Sring(buf, MS949);
			//                                               -----
			//                                               �ý����� ������� defaultt character set


			System.out.println();
			String convert = new String(name.getBytes("EUC-KR"), "UTF-8");
			
			System.out.println("Value3 : " + convert);
			// Value3 : ?????

			buf = convert.getBytes();
			System.out.println("Length : " + buf.length);
			// Length : 5

			buf = convert.getBytes("UTF-8");
			System.out.println("Length : " + buf.length);
			// Length : 14

			/*

			�� check~!!!

			   EUC-KR �� UTF-8 �� ��ȯ�ϰڴٴ� �ǵ���
			   �̿� ���� �ڵ��� �ع�����...
			   String convert = new String(name.getBytes("EUC-KR"), "UTF-8");
			   �̷��� ��ȯ���� ���� ����Ʈ �迭�� ������
			   EUC-KR �̵�... UTF-8 �̵�...
			   ��� ����Ʈ �迭�� �о����
			   �����ִ� ���� Ȯ���� �� �ִ�.

			   �̹� ������ ������ String ��ü�� ����Ʈ �迭��
			   � ������ε� ������ �Ұ����ϴ�.
			*/


		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println(e.toString());
		}
		

	}

}

