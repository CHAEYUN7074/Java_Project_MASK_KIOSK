/*
■■■클래스와 인스턴스■■■
-배열의 선언과 초기화
-배열의 기본적 활용
=============================
char 자료형의 배열을 만들어
그 배열의 각 방에 알파벳 대문자를 채우고
채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다
단, 채우는 구문과 출력하는 구문을 따로 분리하여 처리한다.

실행 예)
A B C D E F G...W X Y Z
계속하려면 아무 키나 누르세요...
*/

public class Test076
{
	public static void main(String[] args)
	{
		
		char[] arr = new char[26];
		// ○ 알파벳 채우기
		for (int i=0, ch=65; i<arr.length; i++, ch++)
			arr[i] = (char)ch;

		// ○ 알파벳 출력
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
