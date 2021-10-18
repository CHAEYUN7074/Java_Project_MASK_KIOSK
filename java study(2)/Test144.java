/*========================================
  ■■■예외처리  ■■■ (414p)
========================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test144
{
	private String[] data = new String[3];
					    //procedure 메소드를 살려야해서 exception 처리
	public void proc() throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;

		System.out.print("이름 입력(종료 : Ctrl+z) : ");
		
		//while( (str = br.readLine()) != null) // != 이렇게 붙여야한다. ★

		while ( ( str=br.readLine())!= null) //ctrl z를 누른 상황이 아니라면을 의미
		{
			data[n++] = str;
			System.out.print("이름 입력(종료 : Ctrl+z) : ");
		}
		System.out.println("입력된 내용...");
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