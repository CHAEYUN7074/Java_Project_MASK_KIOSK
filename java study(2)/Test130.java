/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Wrapper Ŭ����
========================================*/
public class Test130 {

	public static void main(String[] args) {

		byte b = 3;
		int i = 256;	// �ڷ���

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);	// ��ü

		System.out.println("b2 : " + b2);
		System.out.println("i2 : " + i2);
		// b2 : 3
		// i2 : 256

		// �̿� ���� ȣ���� �����ϵ��� print() �޼ҵ� ����~!!!
		// API Document ����~!!!

		
		print(b2);
		print(i2);


		// Byte Ŭ������ btyeValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue();

		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue();

		// check~!!!
		int i4 = b2.byteValue();		// �ڵ� �� ��ȯ
		byte b4 = i2.byteValue();


		// byte b5 = i2.intValue();
		// ���� �߻�(������ ����)

	}
	
	// java.lang.Number Ŭ����(�߻� Ŭ����)		// Number nb = new Number(); -> �Ұ���
	// ��� Wrapper Ŭ������ ���� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number n �� �Ѿ���鼭
	// �� ĳ������ �Ͼ�� �ȴ�.
	static void print(Number j) {		// 3 <- (Auto-Boxing)

		System.out.println(j);

	}

	/*

	static void print(Object obj) {

		System.out.println(obj);
	}

	*/

	

}

/*

���� ���

b2 : 3
i2 : 256
3
256
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

