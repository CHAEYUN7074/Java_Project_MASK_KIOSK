/*========================================
  ���� ����(Sort) �˰��� ����
========================================*/

// ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
// ������ ���� ������ ���� ������ ����� �ο��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�: 5
// �̸� ���� �Է�(1): ���� 90
// �̸� ���� �Է�(2): ������ 80
// �̸� ���� �Է�(3): �ڹڹ� 85
// �̸� ���� �Է�(4): ������ 75
// �̸� ���� �Է�(5): ������ 95
/*
---------------
1�� ������ 95
2�� ���� 90
3�� �ڹڹ� 85
4�� ������ 80
5�� ������ 75
---------------
����Ϸ���....
*/

import java.util.Scanner;

public class Test106
{
	public static void main(String []args)
	{

	int n;

	Scanner sc = new Scanner(System.in);

	System.out.print("�ο� �� �Է� : ");
	n = sc.nextInt();

	int []score=new int[n];
	String []name=new String[n];
	String stemp;

	for(int i=0;i<n;i++){
	System.out.printf("�̸� ���� �Է�(%d): ",i+1);
	name[i] = sc.next();
	score[i] = sc.nextInt();
	}

	boolean flag;
	int temp;

	for(int i=0;i<score.length;i++){
    flag = true;
    for(int j=0;j<score.length-i-1;j++){
    if(score[j]<score[j+1]){
         flag = false;
         temp = score[j];
         score[j]= score[j+1];
         score[j+1]=temp;
			
		 stemp = name[j];
         name[j]= name[j+1];
         name[j+1]=stemp;
         }
      }
      if(flag==true) break;
      }

	System.out.println("===============");
	for(int i=0;i<n;i++){
	System.out.printf("%d�� %s %d\n",i+1,name[i],score[i]);
	}
	System.out.println("===============");
	}
}
