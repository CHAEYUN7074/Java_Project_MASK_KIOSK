public class Test022
{
	public static void main(String [] args)
	{
		int a = 13, b = 7;
		int c,d,e;

		//연산 및 처리
		c = a & b;
		d = a | b;
		e = a ^ b;

		//결과 출력
		System.out.printf("a&b : %d\n", c);
		System.out.printf("a|b : %d\n", d);
		System.out.printf("a^b : %d\n", e);

		//논리연산자로 혼동 주의!! 비트기반 연산자이다★

	}
}
/*
a&b : 5
a|b : 15
a^b : 10
계속하려면 아무 키나 누르십시오 . . .
*/



/*00000000 두개 각 자리가 같으면 1 다르면 0, |는 or개념, ^는 같으면 0 다르면1
*/