/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
//List → Vector, ArratList,...
//순서있음
//배열과 유사
//중복 허용

/*
○ ArrayList 클래스
- ArrayList 와 Vector 클래스는
List를 크기 변경이 가능한 배열로 구현한 것으로
차이점은 vector 클래스의 객체는 기본적으로 동기화 되지만,
ArrayList는 그렇지 않다는 점이다.

-비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
스레드들이 컬렌션을 공유하지 않는 프로그램에서는
일반적으로 ArrayList 를 Vector 보다 더 선호하며,
ArrayList는 동기화를 고려하지 않은 vector 처럼 동작함으로써 스레드 동기화에
따르는 부담을 가지지 않기 때문에
vector 보다 더 빠르게 실행된다

-null을 포함한 모든 요소를 허용하며
List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.

*/
import java.util.*;

public class Test161
{
	public static void main(String[] args)
	{
		//ArrayList 자료구조 인스턴스 생성
		//ArrayList<String>list = new ArrayList<String>();
		//Vector<String>list = new Vector <String>();
		//List<String> list = new Vector <String>();
		List<String> list1 = new ArrayList <String>();


		//list1에 요소 추가 → add()
		list1.add("나이브스아웃");
		list1.add("인셉션");
		list1.add("인터스텔라");
		
		//ArrayList 자료구조 인스턴스 생성
		List<String> list2 = new ArrayList<String>(list1);
		//list1을 승계하고 모가디슈 추가

		//list2 에 요소 추가
		list2.add("모가디슈");

		//ArrayList 자료구조 인스턴스 생성
		List<String> list3 = new ArrayList<String>();

		//list3에 list2 의 전체 요소 추가 → addAll();
		list3.addAll(list2);

		//인셉션 앞에 분노의 질주 추가
		//1)인셉션 찾기 →indexOf() →위치값 인덱스 반환
		int n = list3.indexOf("인센션");

		//2) 인셉션 찾은 인덱스 위치에 분노의 질주 삽입
		list3.add(n, "분노의 질주");
		//그냥 add 하면 맨 뒤에 붙는데, n을 넣어 몇번째인지 정할 수 있어)

		//출력 -> 더미데이터 확인
		System.out.println("======================");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		System.out.println();
		//출력 ->listIterator()메소드 활용하여 출력
		System.out.println("======================");
		ListIterator<String> li = list3.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();

		System.out.println();
		//출력->역순으로 출력
		System.out.println("======================");
		while(li.previous());

	}
	System.out.print();
}

에러!!!