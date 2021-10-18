//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-반복문(while) 실습
//============================================

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 소수인지 아닌지를 판별하여
//결과를 출력하는 프로그램을 구현한다

//실행 예)
//임의의 정수 입력 :10
//10→소수 아님
//계속하려면 아무 키나 누르세요

//실행 예)
//임의의 정수 입력 :11
//10→소수
//계속하려면 아무 키나 누르세요

//1은 소수가 아니다

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		
		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //
		int num;		//-- 사용자로부터 값을 입력 받을 변수
		int count=2;	//-- 소수를 확인하기 위해 사용할 변수
		String result="소수 아님";
		
		// ○ 연산 및 처리

		System.out.print("임의의 정수 입력: ");
		num = Integer.parseInt(br.readLine()); 
		//readLine()은 Enter를 누르기 전까지의 키보드 입력을 스트림에 저장합니다. (Enter문자는 포함되지 않습니다.)
		//readLine은 string형으로 문자를 읽어오게 됩니다.그래서 Integer클래스의 parseInt가 필요한 것입니다.(정수형으로 바꿔야하니까)

		/*
		while(count<num)
		{
			if(num%count ==0) // 나누어 떨어지면 소수 아님(==0 나머지가 0)
			
			{
				result="소수 아님";	
				break;
			}
			else
			{
				result="소수";
				count++;
			}
		}
		*/

		boolean flag= true; // 소수다!!
		while(count<num)
		{
			if(num%count ==0)
			{
				flag=false; // 앗 소수가 아니네ㅠ
				break;
			}
			num++;
		}
		// ○ 결과 출력전에 한번 더 확인(1인지 아닌지에 대한 추가 검토)
		if (flag && num!=1) //flag 자체가 true이거나 flase니까 flag=true 이런식으로 쓸 필요 없다
			System.out.printf("%d →소수\n",num);
		
		else
			System.out.printf("%d →소수 아님\n",num);	
		
	}
}

//flag 구문도 가능해 ★