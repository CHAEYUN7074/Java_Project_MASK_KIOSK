/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
/*
※ Vector v = new Vector(8);
   → 8개의 초기 elements 를 가진 Vector 자료구조 생성.
      8개가 모두 채워지게 되면(모자라게 되면) 자동으로 확장된다.

※ Vector v = new Vector(3, 5);
   → 3개의 초기 elements 를 가진 Vector 자료구조 생성.
      3개가 모두 채워지게 되면 (모자라게 되면) 5개 증가(확장)된다.

※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열 ... 등을
   담아내는 것이 가능하다.

   → 접근 방법 → 데이터 안정성 확보하는 것이 중요하다 -- check~~!!!

*/
import java.util.Vector;
import java.util.Iterator;

//MyVector 클래스 설계 → Vector 클래스 상속
class MyVector extends Vector<Object>
{
	//사용자 정의 생성자
	MyVector()
	{
		//Vector(슈퍼클래스) 생성자 호출
		super(1,1);
		//첫 번째 인자 : 주어진 용량
		//두 번째 인자 : 증가량
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}
	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()

	{
		int length = size();
		System.out.println("벡터 요소 갯수 : " + length);
		
		Object o;
		
		for(int i=0; i<length; i++)

			o = elementAt(i);
		for (int i=0; i<length; i++)

		{
			o = elementAt(i); //오브젝트 타입

			// 『instanceof』 연산자 (오브젝트인건 알겠어 근데 태생이 어디니? 확인하는거)
			//-- 처리해야 하는 대상의 객체 타입 확인

			if (o instanceof char[])  //래퍼 클래스(?)가 아니라 오토언박싱이 안됨...☆☆☆
			{
				// System.out.println("문자배열 : " + o.toString());
				System.out.println("문자배열 : " + String.copyValueOf((char[])o)); //char배열을 문자열로 ☆☆☆
			    //                                                    ----------오브젝트를 캐릭터 문자배열로 형변환
				//						                 --------------string에 들어가면 copyValueOf가 있는데 이건 문자배열을 문자열로 바꾸는 메소드                            														
				/*
				for(int i; i<(char[]o).length;1++)
				{
					Systme.out.println((char[]o)[i]);
				}
				*/
			
			}
			else if (o instanceof String)	//-- o가 String타입인지 확인하는 연산자
			       //--           -------
				  //한국사람    태생이 문자열
			{
				System.out.println("문자배열 : " + o.toString()); //스트링에 to 스트링이니까 어차피 문자열로
			}
			else if (o instanceof Integer) //o 가 인티져 기반으로 만들어진 object라는 뜻
			{
				System.out.println("정수형 : " + o); //object를 찍으면 클래스명@해시코드

			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : " + o);
			}
			else
			{
				System.out.println("타입 확인 불가~!!!");
			}
		}
		/*
		Iterator<Object> it = this.iterator();	//<Object> 확인
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//--==>> 5
		//       3.14
		//       안녕하세요
		//       [C@6d06d69c

		
		*/
	 }
	}

public class Test155
{
	public static void main(String[] args)
	{
		//MyVector 클래스 기반 인스턴스 생성
		MyVector v = new MyVector();

		//주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);			//-- 벡터 자료구조에 정수 저장
		v.addFloat(real);			//-- 벡터 자료구조에 실수 저장
		v.addString(s);				//-- 벡터 자료구조에 문자열 저장
		v.addCharArray(letters);	//-- 벡터 자료구조에 배열주소(배열을객체로취급했다) 저장
		
		v.write();

	}
}