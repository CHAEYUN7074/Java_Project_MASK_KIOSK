/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -StringBuffer Ŭ����
========================================*/
/*

�� StringBuffer Ŭ������

   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִٴ� ���̴�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

   ����, JDK1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�.				-> ������ ����ڰ� �� �ڿ��� ������� �� ���ÿ� �����ϴµ� ������ ������ ��
   ��, Syncronization �� ���� ������									(���� �۾��� ���� �Ҿ�����) - �� ������ �� ��� �̻��� ������ ��...
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.

	
   Syncronization : ����ȭ
   thread : (���� �����̿���) �۾� ����

*/

public class Test134 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));		// equals �������̵� �� ��
		// false									// StringBuffer equals
		// false


		System.out.println(sb1);
		System.out.println(sb1.toString());			// toString �������̵� ��
		// korea									// sb1.toString() �̷��� �ϸ� String Ÿ���� ��
		// korea								

		System.out.println(sb1.toString().equals(sb2.toString()));
		// true							// String equals


		StringBuffer sb3 = new StringBuffer();
		// StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		// �⺻������ �����Ǵ� ���� ũ��� [ 16 ]


		// StringBuffer���� ������ ũ�⸦ �����ϴ� �޼ҵ带 ����
		System.out.println("���� ũ�� : " + sb3.capacity());
		// ���� ũ�� : 16

		// =====================================================

		System.out.println(sb3);
		// ��


		/*
		String name = "ȫ�浿";
		name += " �̼���";
		name += " ������";
		System.out.println(name);
		// ȫ�浿 �̼��� ������
		*/

		//                    ��
		// StringBuffer������ �� ��� ����
		sb3.append("seoul");		// += "seoul";
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);
		System.out.println(sb3.toString());
		// seoul korea �츮���� ���ѹα�
		// seoul korea �츮���� ���ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		// ���� ũ�� : 34
		// ������ ũ�Ⱑ Ŀ���� �޸𸮸� �� �����

		// =================================================

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());   // String Ŭ����
		//                       --------------
		//                        �ҹ��� -> �빮��
		// JAVA AND ORACLE

		
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());	// String Ŭ����
		//						 -------------
		//                        �빮�� -> �ҹ���
		// java and oracle


		// System.out.println(sb3.toUpperCase());		// StringBuffer Ŭ����
		// System.out.println(sb3.toLowerCase());		// StringBuffer Ŭ����
		// ���� �߻�(������ ����)
		// StringBuffer Ŭ�������� toUpper/Lower �޼ҵ�� �������� ����

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());	// ���� ���������� �ٲ�°� �ƴ�
		// SEOUL KOREA �츮���� ���ѹα�

		System.out.println(sb3.toString());
		// seoul korea �츮���� ���ѹα�

		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//    [ "�ѱ�" ] �̶�� ���ڿ� �߰�

		// insert(ù ��° �Ű����� : �ε���, �� ��° �Ű����� : ������ ���ڿ�);
		// ���� ���������� �ٲ�
		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� [ �ѱ� ] �߰� : " + sb3.toString());
		// seoul �տ� [ �ѱ� ] �߰� : �ѱ�seoul korea �츮���� ���ѹα�
// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//    [ "���" ] �̶�� ���ڿ� �߰�
		//    ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ ����...
		
		/*
		String temp4 = sb3.toString();
		temp4 = temp4.replace("korea", "korea���");
		System.out.println(temp4.toString());
		// �ѱ�seoul korea��� �츮���� ���ѹα�
		*/
		
		/*
		String str = "korea";
		//								ù ��° �Ű����� : �ε�����ȣ
		System.out.println(sb3.insert(sb3.indexOf(str) + str.length(), "���"));
		//                                      7      +      12
		//                                      �ε��� ��ȣ : 11
		// �ѱ�seoul korea��� �츮���� ���ѹα�
		*/


		// �׽�Ʈ 1��
		System.out.println(sb3.toString());
		// �ѱ�seoul korea �츮���� ���ѹα�

		// �׽�Ʈ 2��
		/*
		sb3.insert(13, "���");
		System.out.println("korea �ڿ� [ ��� ] �߰� : " + sb3.toString());
		// korea �ڿ� [ ��� ] �߰� : �ѱ�seoul korea��� �츮���� ���ѹα�
		*/

		// �׽�Ʈ 3��
		/*
		System.out.println(sb3.indexOf("korea"));
		// 7
		*/

		// �׽�Ʈ 4��	-> �ε��� 7
		/*
		System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));
		// �ѱ�seoul ���korea �츮���� ���ѹα�
		*/

		// �׽�Ʈ 5��	-> �ε��� 12 (�ε��� 7 + 5)
		/*
		System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "���"));
		// �ѱ�seoul korea��� �츮���� ���ѹα�
		*/

		// sb3.insert("korea"���ڿ� �ε��� + "korea"���ڿ��Ǳ��� + "���");
		sb3.insert(sb3.indexOf("korea") + "korea".length(), "���");
		//             ----------------    ----------------
		//                     7        +          5

		System.out.println(sb3);
		// �ѱ�seoulkorea����츮������ѹα�


		// �� ��� ���ڿ�(sb3)����
		//    [ �츮���� ] ���ڿ� ����

		// �ѱ�seoulkorea����츮������ѹα�
		/*
		sb3.delete(14, 18);
		System.out.println(sb3);
		// �ѱ�seoulkorea������ѹα�
		*/
		
		sb3.delete(sb3.indexOf("��"), sb3.indexOf("��"));
		System.out.println(sb3);
		// �ѱ�seoulkorea������ѹα�

		/*

		String str = "�츮����";
		int n = sb3.indexOf(str);
		if(n != -1) {
			sb3.delete(n, n+str.length());
		System.out.println(sb3);

		*/



		// �� ��� ���ڿ�(sb3)����
		//    [ korea ] ���� ���ڿ� ����(korea ����)

		// �ѱ�seoulkorea������ѹα�

		/* 
		String str = "korea������ѹα�";
		int n = sb3.indexOf(str);
		if(n != -1) 
			sb3.delete(n, n+str.length());
		System.out.println(sb3);
		// �ѱ�seoul
		*/
		
		// sb3.delete(7, 18);
		// System.out.println(sb3);
		// �ѱ�seoul

		// sb3.delete("korea"���ڿ��ε���, sb3��ü���ڿ��Ǳ���);
		sb3.delete(sb3.indexOf("k"), sb3.length());
		System.out.println(sb3);
		// �ѱ�seoul

		// ======================================================
		
		// ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		// ���� ũ�� : 34
		// ���� ũ��� ������ ����

		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("sb3�� ���ڿ� ���� : " + sb3.length());
		// sb3�� ���ڿ� ���� : 7

		
		// ���� ũ�� ����
		// -> ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();

		
		// ���� ũ�� ���� ���� ������ ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		// ���� ũ�� : 7

	}

}
