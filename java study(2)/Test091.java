/*==========================================================
 ���� �迭 ����
 - �迭�� ����
============================================================*
/// �迭 ������ ���翡�� �����ͺ���, �ּҰ� ���� �� ���� ���°� ����
//  �ּҰ� ���� �� ���� ���� �� ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���
								(�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ������)
//  ������ ���� �� ���� ���� �� ���� ��ҷ� ����ִ� ���� ���� �����
								������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���

// ���� ��)
*/

//�ּҰ� ����
//Test092 ���ϰ� ���ϱ�

public class Test091
{
	public static void main(String[] args)
	{
		int[] nums={10,20,30,40,50};
		int[] copys;

		int temp;

		copys=nums;
		temp=nums[0];	//temp�� 10�� ��ڴ�
		nums[0]=1000;	//1000 20 30 40 50

		for(int i=0; i<copys.length; i++)
			System.out.print(copys[i]+""); //�ּҰ��� �����ؼ� 1000�� ���´�
		System.out.println();

		System.out.println("temp: "+temp); //�ּҰ��� �ƴ϶� ���� �����ϱ⶧���� 10�� ���´�

	}
}