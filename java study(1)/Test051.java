
//����ڷκ��� ���� ���� ������ �Է¹޾�
//�� ���� ����Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�
//��, ����ڰ� -1�� �Է��ϰ� �Ǹ�
//�ݺ��ؼ� �Է¹޴� ������ �����ϰ�,
//�� ���� �Է��ص� �������� ����
//�����Ͽ� ����� �� �ֵ��� ó���Ѵ�
//�Է¹޴� ������ scanner �ν��Ͻ��� �����Ͽ� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
//1��° ���� �Է�[-1 ����] : 8
//2��° ���� �Է�[-1 ����] : 28
//3��° ���� �Է�[-1 ����] : 84
//4��° ���� �Է�[-1 ����] : 824
//5��° ���� �Է�[-1 ����] : -1

//>>������� �Էµ� ������ �� :
//����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Scanner;

public class Test051 
	{

		public static void main(String[] args) 
		{

		Scanner scan = new Scanner(System.in);

		int num;
		int sum = 0; //�������� ��� �� ����

		boolean run = true;

		int i = 1;  //���� ������ Ȱ���Ͽ� �� ��° �Է°������� ���� ����
 
		do
		{
			

			System.out.print(i + "��° ���� �Է�[-1 ����] : ");  //("%d��° ���� �Է�[-1����] :",i); �̷��� �ص� ������
			num = scan.nextInt();

			if(num != -1) 
				{

				sum += num; //sum�� num ��ŭ �������Ѷ�

				}
			else if(num == -1) 
				{
				run = false;
				System.out.printf("\n>> ������� �Էµ� ������ �� : %d\n",sum);

				}
					i++;

				}
		 while (run);
		}
	}

/*		do
		{	
			System.out.print(i + "��° ���� �Է�[-1 ����] : ");  //("%d��° ���� �Է�[-1����] :",i); �̷��� �ص� ������
			num = scan.nextInt();
			sum+=num;

			n++;
		}
		while(num!=-1);

				System.out.printf("\n>> ������� �Էµ� ������ �� : %d\n",(sum+1);
*/






	/*
	1��° ���� �Է�[-1 ����] : 8
2��° ���� �Է�[-1 ����] : 4
3��° ���� �Է�[-1 ����] : 16
4��° ���� �Է�[-1 ����] : 722
5��° ���� �Է�[-1 ����] : 85
6��° ���� �Է�[-1 ����] : -1
>> ������� �Էµ� ������ �� : 835
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
