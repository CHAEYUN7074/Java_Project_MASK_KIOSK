/*========================================
  ■■■예외처리  ■■■ (414p)
========================================*/
//test146과 비교

class Demo2
{

	private int value;
                                 // ② 알겠어 폭발물을 밖으로 던질게
	public void setValue(int value) throws Exception 
		{
		if(value <= 0) 
		{

			// 예외 객체를 만들겠다. 폭발물 제작을 여기서 해버린 것
			// ①
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다.");

		}

		this.value = value;

	}

	public int getValue() {
		
		return value;

	}

}

public class Test147 {
										   // ③ 이거 안하면 44 set value에 폭발물이니까 이렇게 하던지
	public static void main(String[] args) // throws Exception 
	{

		Demo2 ob = new Demo2();

		// ④ 아니면 try catch로 잡아내야지
		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println("main() 에서 잡아낸 예외");
			System.out.println(e.toString());
		}
		
	

	}

}








