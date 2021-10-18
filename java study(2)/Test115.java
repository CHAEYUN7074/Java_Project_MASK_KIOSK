/*

	�ܡܡ� Ŭ���� ��� �ܡܡ�

	- �������̽�(Interface)

*/


// �������̽�
interface Demo
{

	public void write();
	public void print();

}


// Ŭ���� - �������̽��� �����ϴ� �߻� Ŭ����
// class DemoImp1 implements Demo
abstract class DemoImp1 implements Demo
{

	@Override
	public void write() {
		System.out.println("write() �޼ҵ� ������...");
	}
	
	/*
	@Override
	public void print() {
		System.out.println("print() �޼ҵ� ������...");
	}
	*/

}


// Ŭ����
// class DemoImp1Sub extends DemoImp1
// �߻� Ŭ������ ��ӹ޴� �߻� Ŭ����
// abstract class DemoImp1Sub extends DemoImp1
// �߻� Ŭ������ ��ӹ޴� Ŭ����
class DemoImp1Sub extends DemoImp1
{

	@Override
	public void print() {
		System.out.println("print() �޼ҵ� ������...");
	}

}


// Ŭ���� - main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����(���� ��Ű��)
public class Test115 {

	public static void main(String[] args) {

		// Demo ob1 = new Demo();
		// �������̽� -> �ν��Ͻ� ���� �Ұ�

		// DemoImp1 ob2 = new DemoImp1();
		// �߻� Ŭ���� -> �ν��Ͻ� ���� �Ұ�

		DemoImp1Sub ob3 = new DemoImp1Sub();

		ob3.write();
		ob3.print();
		// --==>> write() �޼ҵ� ������...
		// --==>> print() �޼ҵ� ������...

	}

}

/*

���� ���

write() �޼ҵ� ������...
print() �޼ҵ� ������...
����Ϸ��� �ƹ� Ű�� ��������...

*/
