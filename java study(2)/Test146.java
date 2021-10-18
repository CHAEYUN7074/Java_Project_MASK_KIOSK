/*========================================
  ■■■예외처리  ■■■ (414p)
========================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Demo
{
	private int value;
	public void setValue(int value)
	{
		if(value<=0)
			return;
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}
public class Test146
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}





