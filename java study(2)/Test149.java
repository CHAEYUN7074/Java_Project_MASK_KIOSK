/*========================================
  ■■■예외처리  ■■■ (414p)
========================================*/

// 다른 예외 다시 던지기

public class Test149 
{
	public int getValue(int value) 
	{
		int a = 0;

		try
		{
			a = getData(-2);					//③ 예외발생 빨간 폭발물
		}
		catch (Exception e)						//④ 예외 잡음
		{
			//⑤잡은거 처리 중
			System.out.println("printStacktrace................");
			e.printStackTrace();
			//⑥ 새로운 예외 발생 시킴(파란 폭발물) (cf) throw e --> 잡은 예외(e) 다시 던지기
			throw new Exception("value가 음수입니다.");
		}
		
		return a;
	}
	public int getData(int data) throws Exception //② 예외 던지기 
												  //   빨간 폭발물
	{
		if(data<0)
			throw new Exception("data가 0보다 작습니다."); //①예외발생
														   // 빨간 폭발물
		return data + 10;
	}

	public static void main(String [] args)
	{
		Test149 ob=new Test149(); //인스턴스 생성
		
		try
		{
			int a = ob.getValue(-1);   // ⑧예외 발생 파란 폭발물
			System.out.println("a : " +a);
		}
		catch (Exception e) //⑨ 예외잡아내기 파란 폭발물
		{
			//⑩ 예외처리 파란 폭발물
			System.out.println("printStacktrace................");
			e.printStackTrace();
		}
		int a = ob.getValue(-1); //메인 메소드에 떨어지는건 파란 폭발물
		System.out.println("a : " +a);
	}
}
		