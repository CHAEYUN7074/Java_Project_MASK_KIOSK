/* ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)
-continue
=============================================
������ ���� ��µ� �� �ֵ��� ���α׷��� �����Ѵ�
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