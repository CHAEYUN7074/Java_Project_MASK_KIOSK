/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -Wrapper 클래스
========================================*/
import java.math.BigInteger;

public class Test128 {

	public static void main(String[] args) {

		// int a1 = 123456789123456789;
		// long b1 = 123456789123456789123456789L;
		// System.out.println(b1);

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		// 문자열의 형태로 담는 이유는 기본형태에서 못 담기 때문에 문자열 형태로 담는다.

		// BigInteger c = a + b;
		// System.out.println(c);


		// 더하기
		BigInteger c = a.add(b); 
		System.out.println("덧셈 결과 : " + c);
		// 덧셈 결과 : 246913578246913578

		
		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("빼기 결과 : " + d);
		// 빼기 결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱하기 결과 : " + e);
		// 곱하기 결과 : 15241578780673678515622620750190521

		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나누기 결과 : " + f);
		// 나누기 결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		// 2의 3승 : 8


	}

}
