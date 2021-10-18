/*========================================
  ���� Ŭ���� ��� ����
  - �������̽�
========================================*/
// �������̽�
interface ADemo
{

	public void write();
	// public abstract void write();


}

// �������̽�
interface BDemo
{

	public void print();
	// public abstract void print();


}

// �� �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�.
//    -> Ŭ������ ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ���

// Ŭ����
//class DemoImp1
// class DemoImp1 extends ADemo, BDemo		// �Ұ�
// �߻� Ŭ���� - �� �������̽��� ������ �߻� Ŭ����
// abstract class DemoImp1 implements ADemo, BDemo	-> �������̽��� �ִ� �߻� �޼ҵ带 �������̵� �ϸ� Ŭ�������� abstract �� �� ����!
//		��
// Ŭ���� - �� �������̽��� ������ Ŭ����
class DemoImp1 implements ADemo, BDemo
{
	
	/*

	public void write();
	public void print();

	*/

	// JDK 1.5(5.0)������ �������̽� �޼ҵ带
	// �������̵�(Overriding)�� ��
	// [ @Override ]  ������̼�(anntation)�� ����� �� ����.
	// JDK 1.6(6.0) ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding)�� ������
	// JDK 1.5(5.0)������ [ @Override ] ������̼�(annotation) ����� �����ϴ�.
	@Override
	public void write() {

		System.out.println("ADemo �������̽� �޼ҵ� write()...");

	}

	@Override
	public void print() {

		System.out.println("BDemo �������̽� �޼ҵ� print()...");

	}

	

}


// Ŭ���� - main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test114 {

	public static void main(String[] args) {

		// ADemo ob = new ADemo();		// �������̽� -> �ν��Ͻ� ���� �Ұ�
		// BDemo ob = new BDemo();		// �������̽� -> �ν��Ͻ� ���� �Ұ�

		// ADemo, BDemo �������̽��� ����(implements)�� Ŭ����
		// -> DemoImp1
		// ����� �ν��Ͻ� ����
		DemoImp1 ob1 = new DemoImp1();

		ob1.write();
		ob1.print();
		// ADemo �������̽� �޼ҵ� write()...
		// BDemo �������̽� �޼ҵ� print()...

		ADemo ob2 = new DemoImp1();		// �� ĳ����
		BDemo ob3 = new DemoImp1();		// �� ĳ����

		// ob2.print();   --==>> ���� �߻�(������ ����) �θ�� �ڽ����� �̷� �޼ҵ尡 �ִ��� ����
		// ob3.write();	  --==>> ���� �߻�(������ ����)

		ob3.print();
		ob2.write();
		// BDemo �������̽� �޼ҵ� print()...
		// ADemo �������̽� �޼ҵ� write()...

		((BDemo)ob2).print();
		((ADemo)ob3).write();
		// DemoImp1 Ŭ������ �� �������̽��� ��� �����߱� ������ �����ϴ�.
		// ���� DemoImp1 Ŭ������ �̵� �� �� �������̽��� �����ߴٸ�
		// �� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�.
		// --==>>BDemo �������̽� �޼ҵ� print()...
		// --==>>ADemo �������̽� �޼ҵ� write()...


		// �� �ٿ� ĳ����
		((DemoImp1)ob3).write();
		// --==>> ADemo �������̽� �޼ҵ� write()...

	}

}
