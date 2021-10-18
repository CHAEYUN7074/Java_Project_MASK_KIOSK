/*=====================================
 ��������(Sort) �˰������
======================================*/
/*
���� : �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(�������� ��)

������ � �� ���� ������ �Ҹ� ���ϴ�

���� ��)
Source Data : 52	42	12	62	60
Sorted Data : 12	42	52	60	62
����Ϸ��� �ƹ� Ű�� ��������..

*/
/*
public class Test103
{
	public static void main(Spring [] args)
	{
		int[] a ={52, 42, 12, 62, 60};
		
		42	52	12	62	60	0��1��° ��
		12	52	42	62	60	0��2��° ��
		12	52	42	62	60	0��3��° ��
		12	52	42	60	62	0��4��° ��
		----------------------------------1ȸ��
		12	42	52	62	60	1��2��° ��
		12	42	52	62	60	1��3��° ��
		12	42	52	62	60	1��4��° ��
		----------------------------------2ȸ��
		12	42	52	62	60	2��3��° ��
				--	--
		12	42	52	62	60	2��4��° ��	
		----------------------------------3ȸ��
		12	42	52	60	62	3��4��° ��	
		----------------------------------4ȸ��

	}
}

*/


/*
public class Test103 
{

	public static void main(String[] args) 
	{
		
	
		int[] a = {52, 42, 12, 62, 60};
		System.out.print("Source Data : ");

		for(int n : a) 
			{		
			System.out.print(n + " ");
			}
		System.out.println();


		for(int i = 0; i < a.length; i++) 
			{
			for(int j = i + 1; j < a.length; j++) 
			{
				
				if(a[i] > a[j]) 
					{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					}

			}

		}
		System.out.print("Sorted Data : ");
		for(int i = 0; i < a.length; i++) 
			{
			System.out.print(a[i] + " ");
			}
			System.out.println();
	}
}
*/

public class Test103 
{

	public static void main(String[] args) 
	{
	
		int i, j;
		int[] a = {52, 42, 12, 62, 60};

		System.out.print("Source Data : ");
		/*
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// --==> Source Data : 52 42 12 62 60
		*/
		

		/*
		           2	                  1
		for(����ǵ�����Ÿ�� ������ : �ڷᱸ��) {
			������...
		}
		*/

		//���� for�� (forEach�����̶�� �Ѵ�)


		for(int n : a) //a���� �ϳ� ������(a�� ���) 'int �����̸�'  
			System.out.print(n + " ");
		System.out.println();
		

		// Selection Sort ����
		for(i = 0; i < a.length-1; i++) {			// �� ���� ������(0		1		2		3)
													//					|		|		|		|
			for(j = i + 1; j < a.length; j++) {		// �� ���� ������(1234	234		34		4)
				//     a[i]        a[j]
				// if(�񱳱����� �񱳴�󺸴� ũ�ٸ�) {
				//		�ڸ� �ٲ��

				// if(a[i] < a[j])		// �������� ����
				if(a[i] > a[j]) {		// �������� ����
					
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];

				}

			}

		}

		System.out.print("Sorted Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}





		