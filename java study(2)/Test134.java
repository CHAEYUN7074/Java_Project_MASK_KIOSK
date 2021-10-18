/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -StringBuffer 클래스
========================================*/
/*

○ StringBuffer 클래스는

   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다는 것이다.

   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

   또한, JDK1.5 이후부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
   가장 큰 차이점은 multi-thread unsafe 라는 점이다.				-> 다중의 사용자가 한 자원을 사용했을 때 동시에 적용하는데 문제가 생겼을 때
   즉, Syncronization 이 없기 때문에									(다중 작업에 대한 불안정성) - 한 파일을 두 사람 이상이 열었을 때...
   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
   StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.

	
   Syncronization : 동기화
   thread : (현재 눈높이에서) 작업 단위

*/

public class Test134 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));		// equals 오버라이딩 안 함
		// false									// StringBuffer equals
		// false


		System.out.println(sb1);
		System.out.println(sb1.toString());			// toString 오버라이딩 함
		// korea									// sb1.toString() 이렇게 하면 String 타입이 됨
		// korea								

		System.out.println(sb1.toString().equals(sb2.toString()));
		// true							// String equals


		StringBuffer sb3 = new StringBuffer();
		// StringBuffer 기본 생성자 호출(인스턴스 생성 과정)
		// 기본적으로 생성되는 버퍼 크기는 [ 16 ]


		// StringBuffer에는 버퍼의 크기를 지원하는 메소드를 제공
		System.out.println("버퍼 크기 : " + sb3.capacity());
		// 버퍼 크기 : 16

		// =====================================================

		System.out.println(sb3);
		// 無


		/*
		String name = "홍길동";
		name += " 이순신";
		name += " 강감찬";
		System.out.println(name);
		// 홍길동 이순신 강감찬
		*/

		//                    ↑
		// StringBuffer에서의 위 기능 사용법
		sb3.append("seoul");		// += "seoul";
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");

		System.out.println(sb3);
		System.out.println(sb3.toString());
		// seoul korea 우리나라 대한민국
		// seoul korea 우리나라 대한민국

		System.out.println("버퍼 크기 : " + sb3.capacity());
		// 버퍼 크기 : 34
		// 버퍼의 크기가 커지면 메모리를 더 사용함

		// =================================================

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());   // String 클래스
		//                       --------------
		//                        소문자 -> 대문자
		// JAVA AND ORACLE

		
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());	// String 클래스
		//						 -------------
		//                        대문자 -> 소문자
		// java and oracle


		// System.out.println(sb3.toUpperCase());		// StringBuffer 클래스
		// System.out.println(sb3.toLowerCase());		// StringBuffer 클래스
		// 에러 발생(컴파일 에러)
		// StringBuffer 클래스에는 toUpper/Lower 메소드는 존재하지 않음

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());	// 값이 직접적으로 바뀌는게 아님
		// SEOUL KOREA 우리나라 대한민국

		System.out.println(sb3.toString());
		// seoul korea 우리나라 대한민국

		// ○ 대상 문자열(sb3) 중 seoul 앞에
		//    [ "한국" ] 이라는 문자열 추가

		// insert(첫 번째 매개변수 : 인덱스, 두 번째 매개변수 : 삽입할 문자열);
		// 값이 직접적으로 바뀜
		sb3.insert(0, "한국");
		System.out.println("seoul 앞에 [ 한국 ] 추가 : " + sb3.toString());
		// seoul 앞에 [ 한국 ] 추가 : 한국seoul korea 우리나라 대한민국
// ○ 대상 문자열(sb3) 중 korea 문자열 뒤에
		//    [ "사랑" ] 이라는 문자열 추가
		//    단, 대상 문자열의 인덱스를 눈으로 직업 확인하지 말고...
		
		/*
		String temp4 = sb3.toString();
		temp4 = temp4.replace("korea", "korea사랑");
		System.out.println(temp4.toString());
		// 한국seoul korea사랑 우리나라 대한민국
		*/
		
		/*
		String str = "korea";
		//								첫 번째 매개변수 : 인덱스번호
		System.out.println(sb3.insert(sb3.indexOf(str) + str.length(), "사랑"));
		//                                      7      +      12
		//                                      인덱스 번호 : 11
		// 한국seoul korea사랑 우리나라 대한민국
		*/


		// 테스트 1번
		System.out.println(sb3.toString());
		// 한국seoul korea 우리나라 대한민국

		// 테스트 2번
		/*
		sb3.insert(13, "사랑");
		System.out.println("korea 뒤에 [ 사랑 ] 추가 : " + sb3.toString());
		// korea 뒤에 [ 사랑 ] 추가 : 한국seoul korea사랑 우리나라 대한민국
		*/

		// 테스트 3번
		/*
		System.out.println(sb3.indexOf("korea"));
		// 7
		*/

		// 테스트 4번	-> 인덱스 7
		/*
		System.out.println(sb3.insert(sb3.indexOf("korea"), "사랑"));
		// 한국seoul 사랑korea 우리나라 대한민국
		*/

		// 테스트 5번	-> 인덱스 12 (인덱스 7 + 5)
		/*
		System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "사랑"));
		// 한국seoul korea사랑 우리나라 대한민국
		*/

		// sb3.insert("korea"문자열 인덱스 + "korea"문자열의길이 + "사랑");
		sb3.insert(sb3.indexOf("korea") + "korea".length(), "사랑");
		//             ----------------    ----------------
		//                     7        +          5

		System.out.println(sb3);
		// 한국seoulkorea사랑우리나라대한민국


		// ○ 대상 문자열(sb3)에서
		//    [ 우리나라 ] 문자열 삭제

		// 한국seoulkorea사랑우리나라대한민국
		/*
		sb3.delete(14, 18);
		System.out.println(sb3);
		// 한국seoulkorea사랑대한민국
		*/
		
		sb3.delete(sb3.indexOf("우"), sb3.indexOf("대"));
		System.out.println(sb3);
		// 한국seoulkorea사랑대한민국

		/*

		String str = "우리나라";
		int n = sb3.indexOf(str);
		if(n != -1) {
			sb3.delete(n, n+str.length());
		System.out.println(sb3);

		*/



		// ○ 대상 문자열(sb3)에서
		//    [ korea ] 이후 문자열 삭제(korea 포함)

		// 한국seoulkorea사랑대한민국

		/* 
		String str = "korea사랑대한민국";
		int n = sb3.indexOf(str);
		if(n != -1) 
			sb3.delete(n, n+str.length());
		System.out.println(sb3);
		// 한국seoul
		*/
		
		// sb3.delete(7, 18);
		// System.out.println(sb3);
		// 한국seoul

		// sb3.delete("korea"문자열인덱스, sb3전체물자열의길이);
		sb3.delete(sb3.indexOf("k"), sb3.length());
		System.out.println(sb3);
		// 한국seoul

		// ======================================================
		
		// 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		// 버퍼 크기 : 34
		// 버퍼 크기는 이전과 동일

		// 문자열(sb3)의 길이 확인
		System.out.println("sb3의 문자열 길이 : " + sb3.length());
		// sb3의 문자열 길이 : 7

		
		// 버퍼 크기 조절
		// -> 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		sb3.trimToSize();

		
		// 버퍼 크기 조절 이후 버퍼의 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		// 버퍼 크기 : 7

	}

}
