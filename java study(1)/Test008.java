//������ �ڷ���
//������ �ڷ��� �ǽ� �� �׽�Ʈ : char(2����Ʈ ������)

public class Test008
{
	public static void main(String[]args)
	{
		//�ֿ� ���� ����
		char ch1, ch2, ch3;
		int a; //��

		//���� �� ó��
		ch1='A'; //���ڴ� '�� ǥ�� "�ȵȴ� �̰� ���ڿ� //65
		ch2='\n'; //�츮���� �ΰ��� ���������� ���๮�� 1���� ����Ѵ�
		ch3='��';
		a=(int)ch1;  //���ڵ�����ȯ������ int �ѹ� �� �־��ִ°� ���� //

		//��� ���
		System.out.println("ch1 :" +ch1);
		System.out.println("ch2 :" +ch2);
		System.out.println("ch3 :"+ch3);
		System.out.println("a :"+a);
	}
}

/*
ch1 :A
ch2 :

ch3 :��
a :65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/