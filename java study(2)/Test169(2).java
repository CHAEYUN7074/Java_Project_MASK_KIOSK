/*============================
????? ?? ?????
==============================
OutputStream???
*/

import java.io.IOException;
import java.io.OutputStream;

public class Test169
{
	public static void main(String[] args) throws IOException
	{
		//System.in  : ????? ??? ??? ?????
		//System.out : ????? ??? ??? ?????
		OutputStream out = System.out; //?????????? ???? //????? ????? ???????? ?????????? ??????

		byte[] ch = new byte[3]; //byte ???
		
		ch[0] = 65; //A
		ch[1] = 97; //a
		ch[2] = 122;  //z
        
		out.write(ch);	//?????? ?????? ??????(????)?? ??????? ???(????? ch??? ????) -?????
		out.flush( );			//???? ??????? ???????? ????? ????, ?????? Buffer?? ??????? ??? ??? ?????? ?????? ?????? ????
											//(Buffered ??? ??? ??????? ??? ??? ?? ???? ?????? ?? ???)
		out.close();			//out?? ?????????? ???????? 

		System.out.println("절대적인 신뢰를 갖고 있는 구문...")
			//out.close()를 작성한 이후 출력되지 않는 구문
			//출력되는 스트림을 닫았기 때문에
	}
}
