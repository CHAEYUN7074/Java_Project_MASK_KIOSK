/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
/*
Set → HashSet, TreeSet
순서가 의미가 없다
중복을 허용하지 않는 구조(기본)

○TreeSet<E> 클래스
java.util.TreeSet<E> 클래스는
Set 인터페이스를 상속한 SortedSet(자식) 인터페이스를 구현한 클래스로
데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 수행된다.
(무거워서 데이터가 많으면 사용 잘 안해..)

*/

import java.util.*;

public class Test165
{
	public static void main(String[] args)
	{
		//TreeSet 자료구조 인스턴스 생성
		TreeSet<String>set = new TreeSet<String>();

		//TreeSet자료구조 set에 요소 추가 → add();
		set.add("하울의움직이는성");
		set.add("토토로");
		set.add("둘리");
		set.add("귀멸의칼날");
		set.add("겨울왕국");
		set.add("짱구");
		set.add("인사이드아웃");
		set.add("코난");
		set.add("원령공주");
		
		//Iterator를 활용한 set 요소 전체 출력
		Iterator<String> it =set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//겨울왕국 귀멸의칼날 둘리 원령공주 인사이드아웃 짱구 코난 토토로 하울의움직이는성
		//적재된 순서가 아니네..

		//TreeSet자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyCOMPARATOR<GradeVO>());


		//GradeVO OB = new GradeVO();
		set2.add(new GradeVO("20211523", "김", 90, 80, 70));
		set2.add(new GradeVO("20211524", "최", 91, 81, 71));
		set2.add(new GradeVO("20211525", "이", 98, 78, 88));
		set2.add(new GradeVO("20211529", "박", 72, 49, 99));
		set2.add(new GradeVO("20211472", "정", 56, 31, 90));
		
		//Iterator를 활용한 set 요소 전체 출력
		
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println(); //에러발생
		*/

		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %6d\n "
							, vo.getHak(), vo.getName()
							, vo.getKor(), vo.getEng() , vo.getMat()
							, vo.getTot());

		}
	}

}
//계층구조
//VO → Value Object(=객체를 담고있는)
//DTO→ Data Transfer Object(VO와 DTO는 거의 같은 개념)
//굳이 차이점이 있다면 비즈니스 로직을 담고있는 VO, 담고있지 않은 DTO
//DAO→ Data Access Object
class GradeVO
{
	//주요 속성 구성
	private String hak; 
	private String name;
	private int kor,eng,mat;

	//생성자(사용자 정의 생성자 -> 5개의 매개변수를 가진 생성자
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	//생성자(사용자 정의 생성자 -> 매개변수 없는 생성자)
	//매개변수 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//추가로 정의한 생성자
	GradeVO()
	{

	}
	// getter / setter 구성 
	String getHak()
		{ 
		return hak; 
		} 
	void setHak(String hak)
		{ 
		this.hak = hak; 
		} 
	String getName()
		{ 
		return name; 
		} 
	void setName(String name)
		{ 
		this.name = name; 
		} 
	int getKor()
		{ 
		return kor; 
		}
	void setKor(int kor)
		{ 
		this.kor = kor; 
		} 
	int getEng()
		{
		return eng; 
		} 
	void setEng(int eng)
		{
		this.eng = eng; 
		} 
	int getMat()
		{ 
		return mat; 
		}
	void setmat()
		{
		this.mat = mat;
		} 
	int getTot() 
		{ 
		return kor + eng + mat; 
		} 

	}

class MyComparator<T> implements Comparator<T>
{
	//compare라는 메소드가 comparator 안에 있다
	@Override
	public int compare(T o1, T o2) //데이터 타입이 T ---제네릭때매 이게 가능한거
	{
		//GradeVO 타입으로 캐스팅
		GradeVO s1 = (GradeVO)o1; 
		GradeVO s2 = (GradeVO)o2; 
		
		// 학번 기준(오름차순) --내림차순이면 s1,s2 순서 바꾸면 된다.
		return Integer.parseInt(s1.getHak()) - s2.getHak());

		//총점 기준(오름)
		return s1.getTot() - s2.getTot();

		//이름 기준(오름차순)
		return s1.getName().compareTo(s2.getName());
		//이름 기준(내림차순)

	}
}