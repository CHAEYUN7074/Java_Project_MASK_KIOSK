/*자바의 개요 및 특징
-변수와 자료형
-키워드 및 식별자*/

public class Test004
{
	public static void main(String[ ]args)
	{
		double height = 172.8;
		int age = 25;
		char degree = 'A'; 
		
		String name = "채지윤";
		//String name = "김민지";
		//스코브 영역 안에서 변수명은 식별자

		//String #name = "이찬호";
		//변수 이름에 특수문자는 달러와 언더바만 가능하다

		//int tel = 01012342345; 맨 앞자리가 0이면 다른 값을 변환되어 나온다
		//전화번호, 주민번호, 학번 등의 데이터는 정수형으로 저장하면안된다(문자열의 형태로 저장해야한다. 맨앞에 0이 올 가능성이 있는 경우)
	    String tel = "01027437074";
		String _tel = "010-2743-7074";
		String 주소 ="경기도 고양시";

		System.out.println(name);

		//결과출력
		System.out.println("name : "+name);
		System.out.println("tel : " +tel);
		System.out.println("_tel : " +tel);
		System.out.println("주소 :" +주소);
		//문법적으로는 가능하나 실무적으로는 한글은 절대 변수 명으로 사용해서는 안된다.
	}
}

/*
채지윤
name : 채지윤
tel : 01027437074
_tel : 01027437074
주소 :경기도 고양시
계속하려면 아무 키나 누르십시오 . . .
*/
