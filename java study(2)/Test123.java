/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
========================================*/

// �� Test122.java �� ��~!!!

// import java.lang.*;
// -> import java.lang.Object;

public class Test123 // extends Object
{

	/*

	...
	public String toString()
	{
	}

	*/

	public String toString()				// �������̵�
	{
		return "�������� toString()...";		
	}

	public static void main(String[] args) 
	{

		Test123 ob = new Test123();

		System.out.println(ob.toString());
		// �������� toString()...

		System.out.println(ob);
		// �������� toString()...

	}

}

