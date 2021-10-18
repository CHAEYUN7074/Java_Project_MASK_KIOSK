/*========================================
  �����ڹ��� �ֿ�(�߿�)Ŭ��������
  -Math Ŭ����
========================================*/
/*
�� java.util.Random Ŭ������
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵
   ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ���
   �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.


// �ζ� ��ȣ ������(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ�
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 41
// 1 2 8 23 36 38
// 4 9 11 13 22 30
// 5 10 13 15 27 40
// 22 31 32 33 40 45
// ����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.util.Random; //������ ��ƿ��Ű���� ����
import java.util.Arrays;

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ�
	// -> �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num = new int[6];

	// private ���� ����� num ���� ���� ���� �޼ҵ�
	// -> getter �ܺο��� num�̶�� �濡 ���� ���� ���� ���� ����
	//���ο��� ���� ä�����Ŷ� setter�� �ʿ����, ���ο��� �����������
	//�ܺο��� ������ ���� �ؾ��ؼ� getter��
	public int[] getNum() //int�迭�� ��ȯ�ϴ� ���·�
		{
		return num;
		}

	// 6���� ������ �߻���Ű�� ���� �޼ҵ�
	public void start() //�ܺο��� �ҷ����Ŵϱ� �������������ڴ� �ۺ���
		{
		Random ran = new Random(); //�ν��Ͻ� ����
		int n;
		int cnt = 0; //�ݺ����� ���� ī��Ʈ ����

		// ����ϰ� ����ȵȴ� : ���°�
		// �� ���� �ݺ����� �������Դ�
		jump: //outer colon..���������Ŷ� jump��� �� ���ص��ȴ�
		//�տ� �߻��� ������� �������� �ƴ��� �� ���ؾ���
		while(cnt <6) //cnt�� 6���� ���� ���ȸ� �ݺ��ϰڴ�(0 1 2 3 4 5) ��
			{
			n = ran.nextInt(45) + 1;	// 1 ~ 45 �� �� �� �߻�(+1���ϸ� 0~44������ ���� �߻�)
			for(int i = 0; i < cnt; i++) //��
				{
				if(num[i] == n) //�߻��� ���ڰ� num�迭�� i��°�� ������
					{
					continue jump;		// ������ �ٽ� �߻���ų �� �ֵ��� ó��
					}

			}
			num[cnt++] = n; //1�� ����
			
		}
		// ���� �޼ҵ� ȣ��
		sorting();

	}
	//���� �޼ҵ� ����
	private void sorting() 
		{
		// Arrays Ŭ������ ���� �޼ҵ� sort() ȣ���ϸ�
		// ����� num �� �Ű������� �Ѱ��ֱ�
		//private �ϸ�ȴ� ���� Ŭ���� �ȿ� �ִ� ����ϱ�
		Arrays.sort(num); //�⺻ �������� ���ķ� �˾Ƽ� �ȴ�.
		}
	}

public class Test142 
{
	public static void main(String[] args) 
	{
		// Random ran = new Random();
		/*
		// �� Ǯ��
		// ������ 45�� ����

		int[] arr = new int[6];

		int n = 1;

		while(n <= 5) {
		
			for(int i = 0; i < arr.length; i++) {
			
				arr[i] = ran.nextInt(45) + 1;

				for(int j = 0; j < i; j++) {
				
					if(arr[i] == arr[j]) {
						i--;
					}

					else if(arr[i] < arr[j]) {
						
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

					}

				}

			}

			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();


			n++;
	    
		}

		*/

		//�ζ� Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5����
		for(int i = 1; i <= 5; i++) 
			{
			lotto.start();

			// ��� ���(���� for��)
			for(int n : lotto.getNum()) //getnum�迭���� �����ϳ�(int)������ 
				{
				System.out.printf("%4d", n);
				}
			System.out.println();
		}


	}

}