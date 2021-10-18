/*========================================
  ���� Ŭ���� ���� ����
  - ��� ���迡 �ִ� Ŭ������ ���� ĳ����
  - ��ĳ����, �ٿ� ĳ����
========================================*/

// super class, �θ� Ŭ����, ���� Ŭ����
class SuperTest121
{

	public int a = 10, b = 20;

	public void write() {
		
		System.out.println("���� Ŭ���� write() �޼ҵ�...");

	}

	public int hap() {
		
		return a + b;

	}


}

// sub class, �ڽ� Ŭ����, ���� Ŭ����
class SubTest121 extends SuperTest121
{

	public int b = 100, c = 200;

	@Override
	public int hap() {
		
		return a + b + c;

	}

	public void print() {
		System.out.println("���� Ŭ���� print() �޼ҵ�...");
	}

}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test121 {

	public static void main(String[] args) {

		// sub class ��� �ν��Ͻ� ����
		SubTest121 ob1 = new SubTest121();		// �ڽ� �θ� ��ü ���⼭ �������
		System.out.println("ob1.b : " + ob1.b);
		// ob1.b : 100
		
		// �۾� ĳ����
		// SuperTest121 ob2;
		SuperTest121 ob2 = ob1;					
		// SuperTest121 ob2 = (SuperTest121)ob1 �� ������ ����

		/*

		�л� �ΰ� = new �л�();
		�ΰ� ��� = �ΰ�;			// [ �ΰ� ��� = (�ΰ�)�ΰ�; ] �� ������ ����

		byte a = 10;
		short b = a;				// [ short b = (short)a; ] �� ������ ����

		*/

		System.out.println("ob2.b : " + ob2.b);
		// ob2.b : 20
		// ������ ��ü���� ���� �Ҵ�ǹǷ�
		// ���� b�� ob2�� �����̴�.

		System.out.println("�� : " + ob2.hap());
		// �� : 310		30�� ���� �� �˾����� �̷��� ������ ����

		// hap() �޼ҵ�� �������̵�(Overriding)�Ǿ� �ְ�
		// ob2 �� ob1�� ��ĳ������ ������ ��ü�̹Ƿ�
		// [ SuperTest121 ] �� hap() �޼ҵ带 ȣ���ϴ� ���� �ƴ϶�
		// [ SubTest121 ] ���� �������� hap() �޼ҵ带 ȣ���ϰ� �ȴ�.
		// ��, �޼ҵ�� ��ĳ������ �Ǵ���
		// ������(�����)�� �̻�... ������ ������� �ǵ��� �� ����!!!

		ob2.write();
		// ���� Ŭ���� write() �޼ҵ�...

		// ob2.print();
		// ���� �߻�(������ ����)
		// �θ� Ŭ������ �ڽ� Ŭ������ �ִ� �޼ҵ带 ����� �� ����


		// �� �ٿ� ĳ����
		((SubTest121)ob2).print();
		// ���� Ŭ���� print() �޼ҵ�...

		// �� �߰� ���� ------------------------------------
		//    �ٿ� ĳ���� ���� ����

		SuperTest121 ob3 = new SuperTest121();					// �θ�Ŭ������ �޸𸮿� �ö� �ִ� ��Ȳ
		SubTest121 ob4;											// �ڽ�Ŭ������ �޸𸮿� �ö� ���� ���� ��Ȳ

		// System.out.println(ob3.c);
		// ���� �߻�(������ ����)
		// ���� ��ü�� ���� ��ü�� ����� �����ϴ� ���� �Ұ����ϴ�.
		
		// ob4 = ob3;
		// ���� �߻�(������ ����)
		// ���� ��ü�� ���� ��ü�� ���� ��(������ ��) ����.


		
		// ob4 = (SubTest121)ob3;
		// ���� �߻�(��Ÿ�� ����)
		// �ۼ��� ������ �������� ������ ���� ��
		// �ٿ� ĳ������ �̷������ ��Ȳ�̴�.
		// ������, �������� ĳ������ �̷������ �ʴ´�.
		// ���� SubTest121 ��ü�� ���� �޸� �Ҵ��� �̷������ ���� �����̱� ������
		// �ٿ� ĳ������ �Ұ����� ���̴�.
		

	}

}

/*

�� �� ĳ����, �ٿ� ĳ������ ���������� �̷������ ���

   1. ���� ��ü ����;			// check~!!!
   2. ���� = ����;				// �� ĳ����, ���������� ����
   3. ���� = ����;				// ���� �߻�(������ ����)
   4. ���� = (����)����;		// �ٿ� ĳ����, ���������� ����


�� �ٿ� ĳ������ ���������� �̷������ �ʴ� ���

   1. ���� ��ü ����;			// check~!!!
   2. ���� = ����				// ���� �߻�
   3. ���� = (����)����;		// �ٿ� ĳ����, ��Ÿ�� ���� �߻�


�� �� ĳ������ �׻� ����, �ٿ� ĳ������ ��쿡 ���� ����.

*/