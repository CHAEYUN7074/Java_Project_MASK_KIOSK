public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n); ������ ����
		System.out.print("CCC\n"); //����
		System.out.println();//����
		System.out.printf("1234567890123456780"); //like print method
		System.out.printf("1234567890\n");
		System.out.printf("1234567890%n" ); //%n�� ����
		//System.out.printf(); ������ ����
		//System.out.printf("%d+%d=%d",123);
		System.out.printf("%d\n",123);
		System.out.printf("%8d\n",1234); //��8�ڸ� Ȯ���ϰ� 1234 �Է��ϴ°Ŵϱ� �տ� 4ĭ ����

		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365);
		//�Ѵ� +365
		System.out.printf("+%d\n",+365);
		//365

		//System.out.printf("%-d\n",365);
		//��Ÿ�� ����

		System.out.printf("-%d\n",365); //-365
		System.out.printf("%d\n",-365); //-365

		System.out.printf("%(d\n",-365); //(365)��
		System.out.printf("%(d\n",365); //365��

		//System.out.printf("%d\n",'A'); //��Ÿ�ӿ���
		System.out.printf("%c\n",'A'); //A
		
		//System.out.printf("%c\n","ABCD"); //��Ÿ�ӿ���
		System.out.printf("%s\n","ABCD"); //ABCD

		System.out.printf("%h\n",365); //16d (16����)��
		System.out.printf("%o\n",24); //30��
		//System.out.printf("%d\n","true"); //true vs. "true" - �ڿ��� ���ڿ��� �Ұ� �١ٿ���

		System.out.printf("%f/n",123.23);
		System.out.printf("%.2f\n",123.23); //�ݿø���

		System.out.printf("%8.2f\n",123.23);
		//--123.34 (8ĭ Ȯ���ϰ� �Ҽ��� �ι�°�ڸ�����)

		System.out.printf("%2.2f\n",123.236);//�١�
		//123.24

		

	}
}