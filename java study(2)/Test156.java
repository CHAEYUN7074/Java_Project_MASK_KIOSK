/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
import java.util.Vector;
import java.util.Collections;

public class Test156
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","파랑","연두"};
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<String> v = new Vector<String>();

		// v 라는 벡터 자료구조에 colors 의 요소 추가
		for (String color : colors)
			v.add(color);

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("마지막  요소 : " + v.lastElement());
		System.out.println("요소의  갯수 : " + v.size());
		System.out.println();

		//--==>> 첫 번째 요소 : 검정
		//       두 번째 요소 : 노랑
		//       마지막  요소 : 연두
		//       요소의  갯수 : 6

		// ○ 첫 번째 요소를 『하양』으로 변경 → set()
		v.set(0, "하양"); //변경(검정을 대체함)

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의  갯수 : " + v.size());

		//--==>> 첫 번째 요소 : 하양
		//       두 번째 요소 : 노랑 //-- 첫번째 요소가 교체된 것임을 확인함
		//       요소의  갯수 : 6

		System.out.println();

		// ○ 첫 번째 요소에 『주황』추.가. → insertElementAt()
		v.insertElementAt("주황", 0);

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의  갯수 : " + v.size());
		System.out.println();

		//--==>> 첫 번째 요소 : 주황
		//       두 번째 요소 : 하양
		//       요소의  갯수 : 7

		// ○ 전체 출력
		System.out.print("전체 출력 : ");
		for	(String str : v)
			System.out.print(str + " ");
		System.out.println("\n");
		//--==>> 전체 출력 : 주황 하양 노랑 초록 파랑 파랑 연두

		// ○ 오름차순 정렬
		Collections.sort(v);
		System.out.print("오름차순 정렬 후 전체 출력 : ");
		for	(String str : v)
			System.out.print(str + " ");
		System.out.println();

		//--==>> 전체 출력 : 노랑 연두 주황 초록 파랑 파랑 하양


		// ○ 검색
		// Collections.binarySerch()
		// 검색 기능 수행. 단, 오름차순 정렬된 자료에서만 사용 가능
		// 검색 결과가 존재하지 않을 경우... 음수를 반환한다.
		int idx = Collections.binarySearch(v, "파랑");
		System.out.printf(">> 파랑 : %d 번째 인덱스에 위치하고 있다.\n", idx);
		//--==>> >> 파랑 : 5 번째 인덱스에 위치하고 있다.

		int idxNavi = Collections.binarySearch(v, "남색");
		System.out.printf(">> 남색 : %d 번째 인덱스에 위치하고 있다.\n", idxNavi);
		System.out.println();
		//--==>> >> 남색 : -1 번째 인덱스에 위치하고 있다. → 검색결과 없음.

		// ○ 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		System.out.print("내림차순 정렬 후 전체 출력 : ");
		for	(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 내림차순 정렬 후 전체 출력 : 하양 파랑 파랑 초록 주황 연두 노랑

		int idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf(">> 파랑 : %d 번째 인덱스에 위치하고 있다.\n\n", idxBlue);
		//--==>> >> 파랑 : -8 번째 인덱스에 위치하고 있다.->못찾았다는 말
		// 음수형태의 -1이 아닌 다른 숫자가 나오면 찾을 수 없는 환경
		idxBlue = Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.printf(">> 파랑 : %d 번째 인덱스에 위치하고 있다.\n\n", idxBlue);
		//--==>> >> 파랑 : 1 번째 인덱스에 위치하고 있다.

		System.out.print("오름차순 정렬 후 전체 출력 : ");
		for	(String str : v)
			System.out.print(str + " ");
		System.out.println();
	}

}
