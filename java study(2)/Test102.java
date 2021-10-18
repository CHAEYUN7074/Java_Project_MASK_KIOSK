/*=====================================
 ■■■ 주민등록번호 유효성 검사■■■
======================================*/
/*
○ 주민등록번호 검증 공식

   1. 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

   123456 - 1234567 (주민번호)
   ******   ******  ---------------------- 각 자릿수에 곱하기
   234567   892345  (각 자리에 곱해질 수)

   
   2. 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

 ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
     * * * * * *   * * * * * * 
	 2 3 4 5 6 7   8 9 2 3 4 5
	 -------------------------
  -> 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

     == 217

    
	3. 더해진 결과값을 11로 나누어 [ 나머지 ] 를 취한다.

		  19	
		-----
	11	|217
	     11
		-----
		 107
		  99
		-----
		   8 -> 나머지


	4. 11에서 나머지(8)을 뺀 결과값을 구한다.

		11 - 8 = 3
																(10으로 나눠서 나머지 값을 취해라)
		※ 3. 의 처리 과정에서 나머지가 0인 경우 -> 11 - 0 -> 11 -> 1
									    1인 경우 -> 11 - 1 -> 10 -> 0
		이를 다시 10으로 나누어 나머지를 취한다.

	
	5. 4. 연산 결과가 주민번호를 구성하는 마지막 숫자와
	   일치하는지의 여부를 확인한다.

	   일치   → 유효한 주민번호
	   불일치 → 잘못된 주민번호

*/

// 실행 예)
// 주민번호 입력(xxxxxx - xxxxxxx) : 123456-12345678 -> 입력 갯수 초과
// >> 입력 오류
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx - xxxxxx) : 123456-123456 -> 입력 갯수 미달
// >> 입력 오류
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx - xxxxxxx) : 750615-1252085 -> 유효한 주민번호
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나 누르세요...


// 주민번호 입력(xxxxxx - xxxxxxx) : 750615-1252086 -> 유효하지 않은 주민번호
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// TIP
// 배열.length			→ 배열의 길이(배열방의 갯수) 반환
// 문자열.length()		→ 문자열의 길이 반환
// String str=:abcdefg";
// str.length();
// "abcdefg".length();
// 문자열.substring()	→ 문자열 추출

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test102 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주민번호 입력 받기
		String str;
		// 주민번호의 각 자릿수에 곱하게 될 수(배열로 구성)
		int[ ] multiply = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		// 곱셈 연산하여 누적합 구하기
		int tot = 0; 

		System.out.print("주민 번호 입력 : ");
		str = br.readLine();

		if(str.length()!= 14) //자리수 14가 아니면 입력 오류
			{
			System.out.println(">> 입력 오류");
			return;	
			}

		for(int i = 0; i < 13; i++) 
			{
			if(i == 6) 
			  continue;	
			tot += multiply[i] * Integer.parseInt(str.substring(i, (i + 1)));
			}

		int number = 11 - tot % 11; 
		number = number % 10; //★

		//결과 출력
		if(number == Integer.parseInt(str.substring(13))) //마지막 자리
			System.out.println(">> 유효한 주민번호");
		else 
			System.out.println(">> 잘못된 주민번호");

	}
}