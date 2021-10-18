/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
import java.util.Stack;

public class Test151 {

	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors
		= {"검정", "노랑", "초록", "파랑", "빨강", "연두"};


	// 생성자
	public Test151()
	{
		// st 라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → <String>
		Stack<String> st = new Stack<String>();

		// st 라는 Stack 자료구조에 데이터 담기
		// colors 에 담겨있는 데이터...
		// st = colors;	// (x) 값 담아내지 못 함
		for(String color : colors) //color 배열의 요소들 하나하나 꺼내서..
		{
			st.push(color);
		}

		st.push("흰색");

		// st.push(10);
		// st.push(10.0);
		// --==>> 에러 발생(컴파일 에러) cf)런타임 에러
		// -- 제네릭 표현식을 통해 선언하고 있는 -- Stack<String>
		//    String 이 아닌 다른 자료형(int 나 double)을
		//    스택 st 에 push() 하려고 했기 때문에...


		// 출력 메소드 호출
		popStack(st);

	}

	// 출력 메소드
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while(!st.empty())				// 비어있는 상황이 아니라면
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}



	public static void main(String[] args) {

		new Test151();

	}

}

/*

실행 결과

pop : 연두 빨강 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . . .


흰색 추가

pop : 흰색 연두 빨강 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . . .

*/
