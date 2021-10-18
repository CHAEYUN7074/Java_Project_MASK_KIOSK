/*==========================================================
 ■■■ 클래스 인스턴스 ■■■
 -클래스 변수(static 변수)와 클래스 메소드(static 메소드)
============================================================*/

public class Test096
{
		//클래스 변수 또는 클래스 메소드는
		//클래스 정보가 로딩되는 순간 메모리 할당이 이루어지며
		//클래스 이름 또는 객체(인스턴스)를 통해 접근할 수 있다.
		//즉 new 연산자를 통해 메모리를 할당받지 않아도 사용이 가능하다는 것이다.

		static int a = 10;	//static 변수(클래스 변수) class 변수
		//인스턴스 변수 또는 인스턴스 메소드는 동일한 클래스의 메소드에는
		//바로 접근하는 것이 가능하나 클래스 메소드에서는 접근할 수 없다.
		int b = 20;	//non static 변수(인스턴스 변수) instance 변수

		void write() //non static 메소드(인스턴스 메소드) instance 메소드
		{
			System.out.println("클래스 변수a   : "+a);

			System.out.println("인스턴스 변수b : "+b);
			
		}
		static void print()		//static 메소드(클래스 메소드) class 메소드
		{
			System.out.println("클래스 변수a   : "+a);
			//System.out.println("인스턴스 변수b : "+b); 
			//컴파일 에러

		}
		public static void main(String [] args)
		{
			System.out.println("main→클래스 변수a   : "+Test096.a);
			//클래스 변수에 접근하기 위해서는
			//클래스명, 변수명의 형태로
			//클래스의 이름을 통해 접근하는 것이 가능하다		
			System.out.println("main→클래스 변수a   : "+a);
			//동일한 클래스에 있을때는 클래스 이름이 생략 가능
			Test096.print();
			print();
			//둘 다 가능해 같은 클래스에 있으니까
			//클래스 메소드에서 클래스 호출은 가능하며 
			//클래스명, 변수명의 형태로
			//클래스의 이름을 통해 접근하는 것이 가능하다
			
			
			//System.out.println("main→인스턴스 변수 b   : "+b);
			//컴파일 에러

			//System.out.println("main() →인스턴스 변수 b   : "+Test096.a);
			//컴파일 에러

			//Test096.write();
			//컴파일 에러
			
			//write();
			//컴파일 에러

			//Test096 클래스 기반 인스턴스 생성
			Test096 ob = new Test096();
			//System.out.println("main() → 인스턴스 변수 b :"+b);
			//컴파일 에러

			//생성된 인스턴스를 통한 인스턴스 변수 접근
			System.out.println("main() → 인스턴스 변수 b :"+ob.b);

			//생성된 인스턴스를 통한 인스턴스 메소드 접근(호출)
			ob.write();

			//생성된 인스턴스를 통한 클래스 변수 접근
			System.out.println("main() → 클래스 변수 a :"+ob.a);
			
			//생성된 인스턴스를 통한 인스턴스 메소드 접근(호출)
			ob.print();

			//클래스 변수나 클래스 메소드는 생성된인스턴스명.변수명
			//생성된인스턴스명.메소드명()의 형태로 접근이 가능하지만
			//클래스명.변수명/ 클래스명.변수명()의 형태로 접근하는 것이 일반적

			System.out.println("main() → 클래스 변수 a :"+a);
			System.out.println("main() → 클래스 변수 a :"+Test096.a);
			System.out.println("main() → 클래스 변수 a :"+ob.a);
			//여기까지 탄생 시점을 기반으로 접근 가능여부 확인
			System.out.println();

			//Test096 클래스 기반 인스턴스 생성
			Test096 ob.2=new Test096();

			ob2.a=10000;	//클래스 변수 초기화
			ob2.b=20000;	//인스턴스 변수 초기화

			System.out.println("ob2 확인-------------");
			ob2.wirte();
			ob2.print();

			System.out.println();

			System.out.println("ob 확인-------------");
			ob.wirte();
			ob.print();
		
	}
}