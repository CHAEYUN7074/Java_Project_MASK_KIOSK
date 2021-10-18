/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Wrapper Ŭ����
========================================*/
import java.math.BigDecimal;

public class Test129 {

	public static void main(String[] args) {

		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("ó�� ��� : " + b);
		// ó�� ��� : 123456.789123456789


		// ������ ( �� ��° �Ķ���� Ȯ��)	-> ��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�. -> ����
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		//                                    ----------
		//                                    final / static ���� ����
		System.out.println("ó�� ��� : " + c);
		// ó�� ��� : 1000.000000000

		System.out.println(BigDecimal.ROUND_DOWN);
		// 1

		// BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());
		// 123456789

	}

}

