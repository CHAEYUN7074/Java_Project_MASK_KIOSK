/* 실행 흐름의 컨트롤(제어문, 조건문과 반복문)
-break
==============================================
아래와 같은 처리가 이루어지는 프로그램을 구현한다
단, 입력받는 정수는 1~100 범위 안에서만
가능하도록 작성한다

실행 예)
임의의 정수 입력 : -20

임의의 정수 입력 : 0

임의의 정수 입력 : 2021

임의의 정수 입력 : 10
>>1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 100
>>1 ~ 100 까지의 합 : 5050
계속하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르세요... → 프로그램 종료
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//변수선언
		int n,s,i;
		//n : 외부로부터 사용자의 입력값을 담아둘 변수
		//s : 누적합 연산 결과를 담아둘 변수
		//i : 1부터 1씩 사용자의 입력값까지 증가할 변수
		
		char ch;// 계속할지 말지 문자 입력
		// break
		
		while(true) //무한루프
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);
		
			//테스트
			//System.out.println("유효한 정수 입력 완료")
		
			s=0; //누적합 변수의 초기화 위치
			
			//누적합 산출
			for(i=1; i<=n; i++) 
			{
				s+=i; //s를 i만큼 증가
			}
			
			System.out.printf(">>1~%d까지의 합 : %d\n" ,n,s);
			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch= (char)System.in.read();
			System.out.println();

			//그만할래
			//if(ch=='N' || ch=='n') //논리연산자 긍정or긍정 -> 부정 and 부정
			if(ch!='Y' && ch!='y')
			{
			break; //멈춘다 그리고 빠져나간다
			}
			// Y+ENTER → enter값이 interger에 들어가는데 정수형으로 바꿀 수 없어서 에러가 생기게된다
			// enter값(\r\n)처리
			System.in.skip(2);
			}//end while
		}
	}


