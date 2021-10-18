/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Math Ŭ����
========================================*/
/*
��java.lang.Mate Ŭ������
���а� ���õ� ������ �Ӽ��� �Լ����� �����ϴ� Ŭ������
�����ڰ� �ֱ� ������ private���� ����Ǿ� �ֱ� ������
�ܺο��� ��ü(�ν��Ͻ�)�� ������ �� ����.
��, ��� �޼ҵ尡 static ���� ���ǵǾ� �����Ƿ�
��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

��java.lang.Mate Ŭ������ �ֿ� ��� �� �޼ҵ�
-public static final double E =2.71......;
:�ڿ� �α� ���

-public static final double PI =3.141592......;
: ������(��) //������ ���� ��ȣ ã���� �ȴ�.

-public static double sin(double a)
-public static double cos(double a)
-public static double tan(double a)
:sin(a), cos(a), tan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ�)

-public static double asin(double a)
-public static double acos(double a)
-public static double atan(double a)
:asin(a), acos(a), atan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ��� ���Լ�)

-public static double toRadians(double angdeg)
: ������ �������� �ٲپ� ��ȯ�Ѵ�.
-public static double toDegrees(double angrad)
: ������ ������ �ٲپ� ��ȯ�Ѵ�.

-public static double exp(double a)
: e�� a���� ���Ͽ� ��ȯ�Ѵ�.

-public static double log(double a)
: �α� ���� ���Ͽ� ��ȯ�Ѵ�.

-public static double sqrt(double a)
: a�� �������� ���Ͽ� ��ȯ�Ѵ�.

-public static double ceil(double a)
: a ���� ũ�ų� ���� ������ ��ȯ�Ѵ�. (�ø��� ����)

-public static double floor(double a)
: a ���� ũ�ų� ���� ������ ��ȯ�Ѵ�. (������ ����)

- public static double pow(double a, double b)
: a �� b ���� ���Ͽ� ��ȯ�Ѵ�.

- public static int rount(float a)
  public static long round(double a)
  : a �� �ݿø��Ͽ� ������� ��ȯ�Ѵ�.

- public static double random()
     : 0.0 ~ 1.0 ������ ����(������ �Ǽ�)�� �߻����� ��ȯ�Ѵ�.
*/

public class Test141
{
	public static void main(String[] args)
	{
		System.out.println("������	    : " +Math.PI); //�Ӽ����̳� �޼ҵ� ���� ���� �����ؼ� ����
		System.out.println("2�� ������	: " +Math.sqrt(2)); //�Ӽ����̳� �޼ҵ� ���� ���� �����ؼ� ����

		System.out.println("���̿� ���� Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2���̿� ���� Degree : " + Math.toDegrees(2.0*Math.PI));
		// ���̿� ���� Degree : 180.0
		// 2���̿� ���� Degree : 360.0

		double radian45 = Math.toRadians(45);
		// ������ �������� ��ȯ~!!!
		
		System.out.println("����   45 : " + Math.sin(radian45));
		System.out.println("�ڽ��� 45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ 45 : " + Math.tan(radian45));
		// ����   45 : 0.7071067811865475
		// �ڽ��� 45 : 0.7071067811865476
		// ź��Ʈ 45 : 0.9999999999999999

		System.out.println("�α� 25 : " + Math.log(25));
		// �α� 25 : 3.2188758248682006

		System.out.println("2�� 4�� : " + Math.pow(2, 4));
		// 2�� 4�� : 16.0

		System.out.println("0.0 ~ 1.0 ������ ���� : " + Math.random());
		// 0.0 ~ 1.0 ������ ���� : 0.42418254743730566
		// 0.0 ~ 1.0 ������ ���� : 0.4260247168289021
		// 0.0 ~ 1.0 ������ ���� : 0.7481540356109417
		// 0.0 ~ 1.0 ������ ���� : 0.3786080131582209
		// 0.0 ~ 1.0 ������ ���� : 0.2369806564969883
		// 0 �̶� 1 �� ���� �� ���̿� �ִ� �Ǽ��鸸 ��������� ���

	}
}