//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//-�ݺ���(while) �ǽ�
//============================================

//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�

//���� ��)
//������ ���� �Է� :10
//10��Ҽ� �ƴ�
//����Ϸ��� �ƹ� Ű�� ��������

//���� ��)
//������ ���� �Է� :11
//10��Ҽ�
//����Ϸ��� �ƹ� Ű�� ��������

//1�� �Ҽ��� �ƴϴ�

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		
		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //
		int num;		//-- ����ڷκ��� ���� �Է� ���� ����
		int count=2;	//-- �Ҽ��� Ȯ���ϱ� ���� ����� ����
		String result="�Ҽ� �ƴ�";
		
		// �� ���� �� ó��

		System.out.print("������ ���� �Է�: ");
		num = Integer.parseInt(br.readLine()); 
		//readLine()�� Enter�� ������ �������� Ű���� �Է��� ��Ʈ���� �����մϴ�. (Enter���ڴ� ���Ե��� �ʽ��ϴ�.)
		//readLine�� string������ ���ڸ� �о���� �˴ϴ�.�׷��� IntegerŬ������ parseInt�� �ʿ��� ���Դϴ�.(���������� �ٲ���ϴϱ�)

		/*
		while(count<num)
		{
			if(num%count ==0) // ������ �������� �Ҽ� �ƴ�(==0 �������� 0)
			
			{
				result="�Ҽ� �ƴ�";	
				break;
			}
			else
			{
				result="�Ҽ�";
				count++;
			}
		}
		*/

		boolean flag= true; // �Ҽ���!!
		while(count<num)
		{
			if(num%count ==0)
			{
				flag=false; // �� �Ҽ��� �ƴϳפ�
				break;
			}
			num++;
		}
		// �� ��� ������� �ѹ� �� Ȯ��(1���� �ƴ����� ���� �߰� ����)
		if (flag && num!=1) //flag ��ü�� true�̰ų� flase�ϱ� flag=true �̷������� �� �ʿ� ����
			System.out.printf("%d ��Ҽ�\n",num);
		
		else
			System.out.printf("%d ��Ҽ� �ƴ�\n",num);	
		
	}
}

//flag ������ ������ ��