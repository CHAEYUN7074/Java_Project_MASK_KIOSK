/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
/*
○List 인터페이스
-순서가 있음, 배열과 유사, 종복을 허용
-주요 구현 클래스
Vector(동기화 지원)
ArrayList(동기화 지원하지 않음)
LinkedList(체인,링크,결합)

*/
import java.util.*;

public class Test162
{
	public static void main(String[] args)
	{
		List<String>list = new ArrayList<String>();
		
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("대구");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		//더미체크
		System.out.println(list);

		System.out.println("전체 개수 : " + list.size());

		//첫 번째 요소 출력
		System.out.println("첫 번째 요소 : " + list.get(0));
		//마지막 요소 출력
		System.out.println("마지막 요소 : " + list.get(list.size()-1));
		//처음 위치에 목포 추가
		list.add(0,"목포"); //인덱스(0) 주고 넘기면 해당 위치에
		//더미체크
		System.out.println(list);

		//처음 위치의 데이터(요소)를 "대한민국"으로 변경
		//덮어쓰는건 add가 아니라 set
		list.set(0,"대한민국");
		//더미체크
		System.out.println(list);

		//서울 존재 여부 확인
		if(list.contains("서울")) //constains라는 메소드
			System.out.println("서울이 존재합니다."); //없으면 출력 안됨
		
		//대한민국 지우기
		//list.remove("대한민국"); //테스트 위해서 주석처리
		list.remove(0); //이렇게 처리해도 됨

		System.out.println(list);
		
		//ArrayList 자료구조 list의 전체 요소 출력
		System.out.println("전체 요소 출력..1");
		for(int idx=0; idx<list.size();idx++);
		{
			System.out.println(list.get(idx)+ " "); //!!!!!
		}
		System.out.println();
		
		
		
		System.out.println("역순 출력..2");
		for(int idx=list.size()-1; idx>=0;idx--);
		{
			System.out.println(list.get(idx)+ " ");
		}
		System.out.println();
		

		
		System.out.println("전체 요소 출력..3");
		for(String s : list); //☆
		{
			System.out.print( s + " ");
		}
		System.out.println();
		
		
		System.out.println("전체 출력..4");
		Iterator<String> it =list.iterator();
		while(it.hasNext())
		{
			String s =it.next();
			System.out.print(s+ " ");
		}
		System.out.println();

		System.out.println("전체 출력..5");
		ListIterator<String> li =list.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+ " ");
		}
		System.out.println();
		
		
		System.out.println("역순출력..6");
		while(li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s+ " ");
		}
		System.out.println();
			
	}
}



//에러!!!!!