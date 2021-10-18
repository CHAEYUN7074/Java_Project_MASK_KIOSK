//���� �帧�� ��Ʈ��(���,���ǹ��� �ݺ���)
//switch �� �ǽ�
//============================================
/*
���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
���� ������ ���� �������� �б��� �� ����ϴ� �����̴�

���� �� ����
switch(����)
{
	case ���1 : ����1; [break;]
	case ���2 : ����2; [break;]
	      :
	[default : ����n+1; [break;]] ---���������ϴٴ� ǥ�÷� [] �صа�(ȥ������)


}

switch ���� ���İ� case�� ����� byte,short,int,long�̾�� �Ѵ�.
case �� �ڿ� break;�� ���� ������ ���
���� case ���� ������ ����ؼ� �̾ �����ϰ� �ȴ�(��⺻��)

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//�ۿ��� �� ó��

		String name;
		int kor,eng,mat;

		System.out.print("�̸� �Է� : ");
		name=br.readLine();

		System.out.print("�������� �Է� : ");
		kor= Integer.parseInt(br.readLine());

		System.out.print("�������� �Է� : ");
		eng= Integer.parseInt(br.readLine()); //��Ƽ��

		System.out.print("�������� �Է� : ");
		mat= Integer.parseInt(br.readLine()); //��Ƽ��

		int avg=(kor+eng+mat)/3; //-���ǻ� ������ ó��
		int tot=kor+eng+mat;
		char grade;

		if(avg>=90)
			grade='A';
		else if(avg>=80)
			grade='B';
		else if(avg>=70)
			grade='C';
		else if(avg>=80)
			grade='D';
		else
			grade='F';

		switch(avg/10)
		{
		case 10: case 9 : grade='A';break;
		case 8: grade='B';break;
		default: grade='F';break; //grade�� char grade ='F'�� �ʱ�ȭ �صξ��ٸ� default�� ��� ������ �ƴ϶�� default�� �ʼ���
		}
		System.out.printf("\n����� �̸��� %s �Դϴ�\n");
		System.out.printf("\n������ %d, �����%d �Դϴ�\n",tot, avg);
		System.out.printf("\n����� %c �Դϴ�\n",grade);

	}

}

	/*��ȿ���������� ������ ����
	switch(avg)
	{
		case 100: grade='A';break;
		case 99: grade='A';break;
		case 98: grade='A';break;
					:
		case 2: grade='F';break;
		case 1: grade='F';break;
		case 0: grade='F';break;
	}
	*/
