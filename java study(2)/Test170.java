/*==========================================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
==========================================================*/

// Reader 실습
// Test168.java 파일과 비교~!!


import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test170 {


	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		

		//System.in : 자바 표준 입력 스트림 → 바이트 기반 스트림
		//InputStreamReader :  바이트 기반 스트림을 문자기반 스트림으로 변환
		//Reader : 문자 기반 스트림 갬체

		Reader rd = new InputStreamReader(System.in);
		
		System.out.println("문자열 입력(종료 : Ctrl+z)");

		while ( (data = rd.read()) != -1 )
		{
			ch = (char)data;
			//System.out.write(ch);
			/*
			문자열 입력(종료 : Ctrl+z)
			123
			123
			abc
			abc
			가나다
			섆

			*/


			System.out.print(ch);
			/*
			문자열 입력(종료 : Ctrl+z)
			123
			123
			abc
			abc
			가나다
			가나다


			*/



		}

	}





}