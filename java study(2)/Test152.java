/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
/*
Queue는 FIFO 구조로 먼저 입력된 자료를 먼저 출력하며
큐 인터페이스를 구현한 클래스는 쿠와 관련된 다양한 기능을 제공한다

큐 인터페이스 인스턴스를 생성하기 위해서는
new 연산자를 이용하여 큐 인터페이스를 구현한(implements)
클래스의 생성자를 호출한다

ex)Queue ob = new LinkedList();

○주요 메소드
-E element()
 큐의 head 요소를 반환하며 삭제하지 않는다
-boolean offer(E o)
지정된 요소를 큐에 삽입한다
-E peek()
큐의 head 요소를 반환하고 삭제하지 않으며
큐의 자료구조가 엠티인 경우 null 을 반환한다
-E poll()
큐의 head 요소를 반환하고 삭제하며 
큐의 자료구조가 엠티인 경우 null 을 반환한다

-E remove
큐의 헤드 요소를 반환하고 삭제한다.
 
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		//Quere 자료 구조 생성
		//Queue my Queue = new Queue(); // 불가능..큐는 인스턴스니까
		Queue myQueue = new LinkedList<Object>(); //my 큐엔 오브젝트를 담겠다
		
		//데이터 준비
		String str1 = "이지영";
		String str2 = "장민지";
		String str3 = "권순모";
		String str4 = "김소연";
		
		//myQue라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1); //str1과 같은 데이터(?)를 적제 + 제대로 적제가 되었는데 true false 반환
		myQue.offer(str2);
		myQue.offer(str3);
		myQue.offer(str4);

		System.out.prntln(myQue);
		//==> [이지영, 장민지, 권순모, 김소연] 클래스에서 제공하는 더미 데이터가 보이는거 실제 데이터가 아니라
		//이걸로 데이터를 컨트롤 하려면 안된다. (더미는 유리를 통해 본 데이터)
		//클래스명 엣 해시코드로 출력되어야함
		//클래스의 각 방엔 객체가 들어간다. 
		System.out.println(test);
		//==> true
		//큐라는 자료구조에서 요소를 제거하지 않고 head 요소 반환
		System.out.println("값1 : " +(String)myQue.element());
									        //----------------object라서 string으로 변환
		System.out.println("값2 : " +(String)myQue.element()); //head요소 제거 하지 않아서 또 이지영 나옴
										 
		//String[] arr = { "홍길동", "이순신", "강감찬" };
			//           -------문자열 타입
					// 	------------------------------문자열 배열 타입
	
		System.out.println();
		String val;

		//①
		//peek()
		//큐의 head요소 반환. 제거는 안함
		// 큐가 empty 일 경우 null 반환
		/*
		while(myQue.peek() !=null)
		{
			//poll()
			//큐의 head 요소 반환하고 제거함
			// 큐가 empty 일 경우 null 반환
 			val = myQue.poll(); //담고
			System.out.println("요소 : " + val); //출력+삭제 
												 
		}
		System.out.println();
		// 요소 : 이지영
		// 요소 : 장민지
		// 요소 : 권순모
		// 요소 : 김소연
		*/
		
		/*
		//테스트 : //만약에 poll poll 이었다면 2개당 하나씩 출력됨
		while(myQue.poll() !=null)
		{
			val = myQue.poll(); //담고
			System.out.println("요소 : " + val); //출력+삭제 
			//요소 : 장민지
			//요소 : 김소연 
		*/

		/*
		//②무한루프
		while(true)
		{
			val = (String)myQue.poll();
			
			if(val==null)
				break;
			else
				System.out.println("요소 : " +val);
		}
		System.out.println();
		*/
		
		//③
		while(!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
			
	}
}


오류....