/*
/*=====================================
 ��������(Sort) �˰������
 -���� ����
======================================*/
/*

�� ����
   
   �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)


�� ������ ����
   
   ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
   -> ���� ���� ~ �˻��ϱ� ����


�� ������ ����

   ����, ����, ����, ��, ��, �� ���� ...

*/

// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// ����Ϸ��� �ƹ� Ű�� ��������...


public class Test104 
{
	public static void main(String[] args) 
	{
		
		/*

		52 42 12 62 60

		42 52 12 62 60
		== --

		42 12 52 62 60
		   == --

		42 12 52 62 60
		      == --

		42 12 52 60 62
		         == --

		--------------------- 1ȸ��

		42 12 52 60 62

		12 42 52 60 62
		== --

		12 42 52 60 62
		   == --

		12 42 52 60 62
		      == --
		
		--------------------- 2ȸ��

		12 42 52 60 62
		== --
		   == --

		--------------------- 2ȸ��

		12 42 52 60 62
		== --


		*/

		// Ǯ�� �ڵ�

		
		int i, j;

		int[] a = {52, 42, 12, 62, 60};

		System.out.print("Source Data : ");
		for(int n : a) {
			System.out.print(n  + "��");
		}
		System.out.println();

		// Bubble Sort ����
		for(i = 1; i < a.length; i++) {			// ��~~~		-> �ڿ��� �񱳴���� �ϳ��� �ٿ��ִ� ����
			for(j = 0; j < a.length-i; j++) {	// ������
				
				// �׽�Ʈ(Ȯ��)
				// System.out.print("[" + j + ", " + (j + 1) + "]");
				// [0, 1][1, 2][2, 3][3, 4][0, 1][1, 2][2, 3][0, 1][1, 2][0, 1]

				if(a[j] > a[j + 1]) 
				{		// �������� ����

					a[j] = a[j]^a[j+1];
					a[j + 1] = a[j]^a[j+1];
					a[j] = a[j]^a[j+1];
				}

			}
		}

		System.out.print("Sorted Data : ");
		for(int n : a) {
			System.out.print(n  + " ");
		}
		System.out.println();


		/*
		int i, j, temp;
		
		int[] a = {52, 42, 12, 62, 60};

		System.out.print("Source Data : ");
		for(i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		int n = a.length - 1;		// �񱳱��ر����� 2��° for���� ���� �Ǳ� ������ -1 ���ش�.

		for(i = 0; i < a.length; i++) {
			for(j = 0; j < n ; j++) {
				
				if(a[j] > a[j + 1]) {		// ��������
					
					temp     = a[j + 1];
					a[j + 1] = a[j];
					a[j]	 = temp;

				}

			}
			n--;
		}

		System.out.print("Sorted Data : ");
		for(i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		*/

	}

}

/*

���� ���

Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/
