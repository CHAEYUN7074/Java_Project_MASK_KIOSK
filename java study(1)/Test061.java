/* 실행 흐름의 컨트롤(제어문, 조건문과 반복문)
-continue
=============================================
다음과 같이 출력될 수 있도록 프로그램을 구현한다
1:1
3:4
5:9
7:16
 :
99 : 2500
*/

public class Test061
{
	public static void main(String[] args)
	{
		int n=0,s=0;
		
		
		while(n<100)
		{
			n++;
			
			if (n%2==0)
			{
				continue;
			}
		
			s += n;
			System.out.println(+ n +" : " + s);
			
		}
	}
}