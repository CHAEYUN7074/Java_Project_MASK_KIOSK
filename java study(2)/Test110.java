/*========================================
  ���� Ŭ���� ��� ����
  -���(Inheritance)
========================================*/

/*

�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡

   - �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.

   - �ݵ�� ��� ���谡 �־�� �Ѵ�.

   - �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
     ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	 ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� [ protected ] �� ���
	 ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding) �ϴ� ���
	 �������������ڴ� [ protected ] �Ǵ� [ public ] �̾�� �Ѵ�.

   - [ static ], [ final ], [ private ] �޼ҵ�� �������̵�(Overriding)�� �� ����.

   - Exception �� �߰��� �Ұ����ϴ�.
     ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	 ���ο� Exception �� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.

*/

// �θ� Ŭ����
class SuperTest110 
{

	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write() {
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}

}

// �ڽ� Ŭ����
class SubTest110 extends SuperTest110
{
	
	protected int b = 100;

	public void print() {
		// System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		// ����Ŭ�������� ����� ���� a ���� ������ �� ����.
		// private �����̱� ������...

		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);

		// System.out.println("Sub print() �޼ҵ� : " + b);
		// Sub print() �޼ҵ� : 100 -> �ڽ� Ŭ������ ������ �ִ� b = 100 ���
		// System.out.println("Sub print() �޼ҵ� : " + this.b);
		// Sub print() �޼ҵ� : 100 -> �ڽ� Ŭ������ ������ �ִ� b = 100 ���
		// System.out.println("Sub print() �޼ҵ� : " + super.b);
		// Sub print() �޼ҵ� : 10  -> �θ� Ŭ������ ������ �ִ� b = 10 ���

		// ���� b �� ���� ����� ����
		// �ٸ� b �� ���� �� ����� �̷������.
		// ����Ŭ�������� ����� b, ����Ŭ�������� ����� b

		// -------------------------------------------------------------------

		// System.out.println("Sub print() : " + c);
		// Sub print() : 20
		// System.out.println("Sub print() : " + this.c);
		// Sub print() : 20
		// System.out.println("Sub print() : " + super.c);
		// Sub print() : 20

		// ���� c �� �����ϴµ� �ƹ��� ����� ������ ����..
		// ����Ŭ�������� ����� c 


	}
	
	
	@Override
	public void write() {
		// System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
		// ����Ŭ�������� ����� ���� a ���� ������ �� ����.
		// private �����̱� ������...
		
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);
	}
	
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test110 {

	public static void main(String[] args) {

		// ���� Ŭ����(SubTest119) �ν��Ͻ� ����
		SubTest110 ob = new SubTest110();

		ob.print();
		// Sub print() �޼ҵ� : 100 : 20

		
		// ob.write() �޼ҵ带 Override �ϱ� ���� ��Ȳ
		ob.write();
		// Super write() �޼ҵ� : 5 : 10 : 20


		// write() �޼ҵ带 Override �� ������ ��Ȳ
		// ob.write();
		// Sub write() �޼ҵ� : 100 : 20

		System.out.println("------------------------------���м�");


		System.out.println(ob.b);
		// 100

		// System.out.println(ob.super.b);
		// ���� �߻�(������ ����)

		System.out.println(((SuperTest110)ob).b);
		// 10
		// �� ���� �θ�
		// ����
	

		// �޼ҵ�
		// �޼ҵ�� ������̴�.
		// �ؿ� �ҽ��� �̹� ����⸦ �� ��Ȳ�̶� �ٽ� ����⸦ �ؼ� �������� ���ư� �� ����.
		// �θ�Ŭ������ �ִ� write�� ����ϰ� �; ����⸦ ������ �������� ���ư� �� ���ٴ� �ǹ�
		// ((SuperTest119)ob).write();
		// Sub write() �޼ҵ� : 100 : 20 -> �ڽ��� ������ �� ������� ��� �ȴ�.

		// �� �޼ҵ�� ������ ��~!!!! �����Ͽ� ������ ��~!!! check~!!!

	}

}
