/*========================================
  ���Ό��ó��  ���� (414p)
========================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test144
{
	private String[] data = new String[3];
					    //procedure �޼ҵ带 ������ؼ� exception ó��
	public void proc() throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;

		System.out.print("�̸� �Է�(���� : Ctrl+z) : ");
		
		//while( (str = br.readLine()) != null) // != �̷��� �ٿ����Ѵ�. ��

		while ( ( str=br.readLine())!= null) //ctrl z�� ���� ��Ȳ�� �ƴ϶���� �ǹ�
		{
			data[n++] = str;
			System.out.print("�̸� �Է�(���� : Ctrl+z) : ");
		}
		System.out.println("�Էµ� ����...");
		for(String s: data)
		{ 
			if(s != null)
			//if(s! = null)
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}