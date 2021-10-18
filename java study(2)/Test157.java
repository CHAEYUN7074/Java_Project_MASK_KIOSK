/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
//검색 및 삭제
import java.util.Vector;

public class Test157
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","파랑","연두"};
	public static void main(String[] args)
	{
		// 벡터 자료구조 v 생성
		Vector<String> v = new Vector<String>();

		// v 라는 벡터 자료구조에 colors 의 요소 추가
		for (String color : colors)
			v.add(color);

		//벡터 자료구조 v의 전체 요소 출력
		System.out.print("전체 요소 출력 : ");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//==>전체요소 출력

		//indexOf() : 값을 가지고 인덱스를 확인
		String s1 = "분홍";
		
		int i = v.indexOf(s1);
		System.out.println(s1 + "→ index 위치 : " +i);
		System.out.println();

		String s2 = "노랑";
		//v.contains(s)
		//벡터 자료구조 v에 찾고자 하는 s가 포함되어 있다면
		if(v.contains(s2))
		{
			//벡터 자료구조 v에서 s2의 인덱스 위치 확인
			i = v.indexOf(s2);
			System.out.println(s2 + "→ index 위치 : " +i);
			
			//항상 위의 코드를 통해 제거하고자 하는 대상의 위치를 찾고
			//제대로 찾았으면 삭제해야한다.
			v.remove(i);
		}
		//찾아서 삭제한 후 전체 요소 출력
		System.out.println("삭제 후 전체 요소 출력 : ");
		for(String str : v)
			System.out.print(str+ " ");
		System.out.println();
		//==> 

		//추가 테스트
		System.out.println(colors);

		System.out.println(v);
		

	}
}
		