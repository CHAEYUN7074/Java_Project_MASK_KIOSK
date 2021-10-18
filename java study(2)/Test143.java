/*========================================
  ���Ό��ó��  ���� (414p)
========================================*/
/*

�� ���α׷����� �߻��ϴ� ����(Error)��

   1. �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
      ��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����(Error)
	  -> ������ ����

   2. ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����

      - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	    ������ ����� �������� �Ǵ� ������ ����(Error)

      - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error)	-> Ex) ��� ��ũ��

      - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
	    ���ܻ���(Exception)�� �ִ�.

		Ex) 
		- � ���� 0���� �����ų�
		- �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�
		- �������� �ʴ� ������ �����Ͽ� �о���δٰų�

	    �� ���� �� �ִ�.

==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
    ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��.


�� ������ ���� ����(-> Exception Ŭ����)

   - ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
     ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	 �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

   - ���α׷� ���� �߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
     �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.

   - �ڹٿ��� ��� ���� Ŭ������ Throwable Ŭ������
     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

   - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
     ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

   - Throwable Ŭ�������� �Ļ��� Ŭ����

     * Exception Ŭ����
	 
	 -> Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
	    ������ �� �ִ� ���� ��Ȳ����
		�޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

	 * Error Ŭ����

	 -> �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.


�� ������ ����

   - checked exception
   
   -> �޼ҵ� ������ ���ܰ� �߻��� ���
      �޼ҵ带 ������ �� [ throws ] ���� �޼ҵ� ������ �߻��� �� �ִ�
	  ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� [ try-catch ] ����
	  ó���� �־�߸� �ϴ� �����̴�.
	  �����Ϸ��� �������� �����ϴ� ��������
	  [ checked exception ] �� [ throws ] �Ǵ°��� ����
	  Ȥ�� [ try-catch ] �Ǵ����� ���θ� �Ǵ��Ͽ�
	  ���α׷����� ���ܸ� � �������ε� ó������ ������
	  ������ ��ü�� �Ұ����ϴ�.

   - unchecked exception

   -> ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
      ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�.
	
		  
�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�

   - String toString()
     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
   
   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.


�� �ֿ� ��Ÿ�� ���� Ŭ����

   - ArithmeticException
     : ��ġ ������ ����(0���� ������ ��)
  
   - ArrayStoreException
     : �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����

   - IndexOutOfBoundException
     : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����

   - ClassCastException
     : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����

   - NullPointerException
     : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����

   - SecurityException
     : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����

						.
						.
						.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143 {
										   // ��
	public static void main(String[] args) // throws IOException 
	{

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int a, b, c;

		/*
		// �ذ��ϴ� ��� 
		// 1. throws IOException -> import java.io.IOException;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());		//��ü.readLine() -> checked exception
		System.out.println(a);						

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		c = a + b;

		System.out.println(c);
		*/
		
		/*
		// �ذ��ϴ� ���
		// 2.

		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);

		}
		catch (IOException e)
		{
			// IOException -> checked exception
			// �޼ҵ带 �����ϴ� �������� throws  gks dPdhl.
			// ��Ƴ��ų� ������ ���� ��� ������ ����
			System.out.println(e.toString());
		}
		*/
		

		/*
		// �ذ��ϴ� ���
		// 3.

		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);

		}
		catch (IOException e)
		{
			// IOException -> checked exception
			// �޼ҵ带 �����ϴ� �������� throws  gks dPdhl.
			// ��Ƴ��ų� ������ ���� ��� ������ ����
			System.out.println(e.toString());
		}
		catch (NumberFormatException e2) 
		{
			// NumberFormatException -> unchecked exception
			// ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			// ���������� �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ϼ���.~!!!");
		}

		*/
		

		/*
		// �ذ��ϴ� ���
		// 4.
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);

		}
		catch (Exception e)
		{
			System.out.println("[e.toString()]");
			System.out.println(e.toString());

			System.out.println("[e.getMessage()]");
			System.out.println(e.getMessage());

			System.out.println("[printStackTrace]");
			e.printStackTrace();
		}
		
		*/

		// etc...

		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			// ���ܰ� �߻��ϰų� �߻����� �ʰų�
			// �����ϰ� ������ ����Ǵ� ����

			System.out.println("��������̽��ϴ�. �����մϴ�.");
		}
	}

}

/*

���� ���

ù ��° ���� �Է� : a
��������̽��ϴ�. �����մϴ�.
Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Test152.main(Test152.java:247)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 15
��� : 25
��������̽��ϴ�. �����մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
