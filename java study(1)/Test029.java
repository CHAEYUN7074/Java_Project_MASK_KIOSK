//���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
//-if~else �� �ǽ�
//==============================
/*����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
������ ���� ���׷� ����ϴ� ���α׷��� �ۼ��Ѵ�
����� ��� ������ �������� �����Ͽ� ó���Ѵ�.

90��~100�� : A
60�� �̸� : F

�� BufferedReader Ȱ���Ͽ� �����͸� ���� �� �ֵ��� �ϸ�, printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�

���� ��)
�̸� �Է� :
���� ���� : 90
���� ���� : 80
���� ���� : 70

>>����� �̸��� �贩���Դϴ�.
>>���� ������ 90,
>>���� ������ 80,
>>���� ������ 70,
>>������ 240�̰�, ����� 80�Դϴ�.
>>����� B�Դϴ�.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test029
{
	public static void main(String[] args)throws IOException
	{

		
		//�ֿ� ���� ����
		int kor, eng, mat ;
		int tot;
		double avg;
		char grade='F'; //else�� ������ �ʾ� ������ ���ٴ°� ������. �̷��� �����صθ� �Ǵϱ�
		
		String name; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		//�ۿ��� �� ó��
		System.out.print("�̸� �Է� : ");
		name=br.readLine();
		
		System.out.print("���� ���� : ");
		kor=Integer.parseInt(br.readLine());  

		System.out.print("���� ���� : ");
		eng=kor=Integer.parseInt(br.readLine()); 
		
		System.out.print("���� ���� : ");
		mat=kor=Integer.parseInt(br.readLine()); 


		//������, ��� ����
		tot = kor+eng+mat;
		avg = tot/3.0; //��3�ƴϰ� 3.0??


		//�۵�޻��� �ص� �� �̻��� ������ ������������
		if(avg>=90 && avg<=100)
		{grade='A';}
			else if (avg>=80) 
			{grade='B';}
				else if (avg>=70)
				{grade='C';} 
					else if (avg>=60)
					{grade='D';}

					//���ڿ� �ƴϰ� ���ڶ� '�̰� �ϳ�
			
		//�۰�����
		System.out.println();
		System.out.printf(">>����� �̸��� %s �Դϴ�\n",name);
		System.out.printf(">>���� ������ %d\n",kor);
		System.out.printf(">>���� ������ %d\n",eng);
		System.out.printf(">>���� ������ %d\n",mat);
		System.out.printf(">>������ %d �̰�, ����� %.2f �Դϴ�\n",tot,avg);
		System.out.printf(">>����� %c �Դϴ�\n",grade);		
	}
}


/*
�̸� �Է� : ä����
���� ���� : 30
���� ���� : 30
���� ���� : 30

>>����� �̸��� ä���� �Դϴ�
>>���� ������ 30
>>���� ������ 30
>>���� ������ 30
>>������ 90 �̰�, ����� 30.00 �Դϴ�
>>����� F �Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/