/*===================
자바의 기본 입출력(I/O)
====================
*/
public class Test171{


	public static void main(String[] args) {

		// System.out : 자바 기본 출력 스트림

		System.out.write(65);		//-- 'A'
		System.out.write(66);		//-- 'B'

		System.out.write(180);		//-- 180 + 235 = '대'
		System.out.write(235);
		
		System.out.flush();
		//-- 현재 구문에서는 생략 불가~!!!

		// 출력 버퍼가 채워지지 않으면
		// 출력할 데이터(자료)를 출력 디바이스(장치)로 보내지 않기 때문에
		// flush() 메소드를 통해 아직 다 채워지지 않은
		// 출력 버퍼의 내용을 출력장치로 밀어내어 보낼 수 있도록 처리해야 한다.
	}

}

/*
import java.util.*;

public class Test171
{
	public void process(InputStream is)
	{
		int data;
		
		System.out.println("문자열 입력(종료 : Ctrl+z");

		try
		{
			//매개변수 is 라는 바이트 기반 객체(inputStream)를
			//문자 스트림으로 변환하여
			//inputstreamreader가 수행
			//reader 타입의 rd애서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is); //inputstream(번역)?? = is --문자기반스트림의 물을 튼거
			Writer wt = new OutputStreamWriter(System.out);
			
			//바이트 기반 스트림인 자바 기본 출력 스트림(System.out)dmf
			//문자 스트림으로 변환하여 (OutputStreamwriter 가 수행)
			//Writer 타입의 wt에서 참조할 수 있도록 처리
			while((data = rd.read() !=-1))
			{
				wt.write(data);
				wt.flush();
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
}
}
*/