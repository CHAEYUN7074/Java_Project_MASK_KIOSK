public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n); 컴파일 오류
		System.out.print("CCC\n"); //개행
		System.out.println();//개행
		System.out.printf("1234567890123456780"); //like print method
		System.out.printf("1234567890\n");
		System.out.printf("1234567890%n" ); //%n도 개행
		//System.out.printf(); 컴파일 에러
		//System.out.printf("%d+%d=%d",123);
		System.out.printf("%d\n",123);
		System.out.printf("%8d\n",1234); //총8자리 확보하고 1234 입력하는거니까 앞에 4칸 공백

		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365);
		//둘다 +365
		System.out.printf("+%d\n",+365);
		//365

		//System.out.printf("%-d\n",365);
		//런타임 에러

		System.out.printf("-%d\n",365); //-365
		System.out.printf("%d\n",-365); //-365

		System.out.printf("%(d\n",-365); //(365)☆
		System.out.printf("%(d\n",365); //365☆

		//System.out.printf("%d\n",'A'); //런타임에러
		System.out.printf("%c\n",'A'); //A
		
		//System.out.printf("%c\n","ABCD"); //런타임에러
		System.out.printf("%s\n","ABCD"); //ABCD

		System.out.printf("%h\n",365); //16d (16진수)☆
		System.out.printf("%o\n",24); //30☆
		//System.out.printf("%d\n","true"); //true vs. "true" - 뒤에껀 문자열에 불과 ☆☆오류

		System.out.printf("%f/n",123.23);
		System.out.printf("%.2f\n",123.23); //반올림됨

		System.out.printf("%8.2f\n",123.23);
		//--123.34 (8칸 확보하고 소숫점 두번째자리까지)

		System.out.printf("%2.2f\n",123.236);//☆☆
		//123.24

		

	}
}