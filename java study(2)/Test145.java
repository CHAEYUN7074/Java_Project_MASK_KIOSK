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
	public void proc() //throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;

		try
		{
			System.out.print("�̸� �Է�(���� : Ctrl+z) : ");
		
			while( (str = br.readLine()) != null)
				{
				data[n++] = str;
				System.out.print("�̸� �Է�(���� : Ctrl+z) : ");
				}
			
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("=====[���� �߻�]=====");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace.............");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			Sytem.out.println(e.toString());
		}
	System.out.println("\n�Էµ� ����...");
	for(String s : data)
	{
		if(s != null)
		{
			System.out.println(s);
		}
	}
	}
		
	public static void main(String[] args) // throws IOException   // check~!!!
	{

		Test145 ob = new Test145();

		ob.proc();

	}

}



 ����....



