/*
����Ŭ������ �ν��Ͻ�����
-�迭�� ����� �ʱ�ȭ
-�迭�� �⺻�� Ȱ��
=============================
char �ڷ����� �迭�� �����
�� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�
��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

���� ��)
A B C D E F G...W X Y Z
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test076
{
	public static void main(String[] args)
	{
		
		char[] arr = new char[26];
		// �� ���ĺ� ä���
		for (int i=0, ch=65; i<arr.length; i++, ch++)
			arr[i] = (char)ch;

		// �� ���ĺ� ���
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
