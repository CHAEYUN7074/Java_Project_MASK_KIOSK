/*===================
자바의 기본 입출력(I/O)
====================
*/
// Reader Writer 실습

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test172 {

	public void process(InputStream is)
	{
		int data;

		System.out.println("문자열 입력(종료 : (Ctrl+z)");

		try
		{
			// 매개변수 is 라는 바이트 기반 객체(InputStream)를
			// 문자 스트림으로 변환하여
			// -> inputStreamReader 가 수행
			// Reader 타입의 rd에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);			//inputStreamReader 번역! //inputstream(번역)?? = is --문자기반스트림의 물을 튼거
			

			// 바이트 기반 스트림인 자바 기본 출력 스트림 (System.out)을
			// 문자 스틂으로 변환하여
			// -> OupPutStreamWriter 가 수행)
			// Wirter 타입 wt에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);	//OutputStreamWriter 바이트기반의 스트림을 문자기반으 스트림으로 번역

			while ( (data = rd.read()) != -1)
			{
				wt.write(data);		//-- 스트림 물줄기에 기록
				wt.flush();			//-- 기록한 스트림을 밀어내어 내보냄
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args){

		Test172 ob = new Test172();
		ob.process(System.in);

	}

}

/*


문자열 입력(종료 : (Ctrl+z)
abcd
abcd
1234
1234
가나다라
가나다라
^Z
계속하려면 아무 키나 누르십시오 . . .


*/