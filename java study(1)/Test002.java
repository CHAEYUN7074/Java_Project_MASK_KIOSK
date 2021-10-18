/*
자바 컴파일 실행
*/

public class Test002
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to JAVA");
		System.out.println("First JAVA Program");

		System.out.print("첫 번째 프로그램");
		System.out.print("두 번째 프로그램");

		//System.out.print(첫 번째 프로그램);
		//System.out.print(두 번째 프로그램);  에러구문

		System.out.print("첫 번째\n 프로그램\n");
		System.out.print("두 번째\n 프로그램\n");

		System.out.print("\\\\"); 
		//역슬래쉬를 출력하고 싶으면 역슬래쉬 하나 더 붙이면 됨

		System.out.print("3+5"+"결과"); 
		


	}
}

/*
실행결과(1)
Welcome to JAVA
First JAVA Program
계속하려면 아무 키나 누르십시오 . . .

실행결과(2) ln(라인) 기능이 없어진거
첫 번째 프로그램두 번째 프로그램계속하려면 아무 키나 누르십시오 . . .

실행결과(3) complie error(run time erro는 실행과정에서 생기는 오류)
에러

실행결과(4)
\n는 줄 바꾸는 기능을 한다.(print()에서도 \n을 활용하여 println처럼 만들 수 있다.
*/

//★자바는 절대로 배포하는거 아님!!
//★배포하는건 CLASS 파일
//☆주석은 최대한 꼼꼼하고 친절하게 다는 습관, for 협업 프로젝트의 동료

