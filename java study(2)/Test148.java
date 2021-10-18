/*========================================
  ■■■예외처리  ■■■ (414p)
========================================*/
// 예외 다시 던지기

public class Test148 {

	public static void main(String[] args) {

		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);  //⑦ 예외발생
			System.out.println("a : " + a); 
		}
		catch (Exception e) //⑧ 예외잡기
		{
			System.out.println("ⓑ printStackTrace...........");
			e.printStackTrace();
		}

		
	}

	public int getData(int data) throws Exception // getdata에서 던졌으니 45 getvalue에서 예외
	{

		if(data < 0) {
			throw new Exception("data 가 0 보다 작습니다.");
			// ① 예외 발생 -던지거나/ try catch : 26보니까 던지기로했네
		}

		return data + 10;

	}
								// ⑥잡아낸 예외 다시 던지는 것이 가능하도록 처리
	public int getValue(int value) throws Exception
	{

		int a = 0;

		try
		{
			a = getData(-1);		// ② 예외 발생
		}
		catch (Exception e)			// ③ 예외 잡아내기
		{
			// ④ 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace.......");
			e.printStackTrace();

			// ⑤ 잡아낸 예외 다시 던지기 check~!!!
			throw e;
			// 주석 처리 시(즉, 잡아낸 예외를 다시 던지지 않을 경우)
			// getValue() 메소드를 호출하고 있는 main() 메소드의
			// 예외 처리 구문은 수행되지 않게 된다.
		}

		return a;

	}

}









