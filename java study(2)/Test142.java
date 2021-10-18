/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -Math 클래스
========================================*/
/*
○ java.util.Random 클래스는
   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도
   난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는
   추가적인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.


// 로또 번호 생성기(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 5 12 24 31 41
// 1 2 8 23 36 38
// 4 9 11 13 22 30
// 5 10 13 15 27 40
// 22 31 32 33 40 45
// 계속하려면 아무 키나 누르세요...

*/

import java.util.Random; //랜덤은 유틸패키지에 있음
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 메모리 할당
	// -> 로또 번호를 담아둘 배열방 6칸
	private int[] num = new int[6];

	// private 으로 선언된 num 값을 얻어내기 위한 메소드
	// -> getter 외부에서 num이라는 방에 직접 수를 담을 일은 없고
	//내부에서 만들어서 채워질거라 setter는 필요없고, 내부에서 만들어진것을
	//외부에서 가져다 쓰게 해야해서 getter만
	public int[] getNum() //int배열을 반환하는 형태로
		{
		return num;
		}

	// 6개의 난수를 발생시키기 위한 메소드
	public void start() //외부에서 불러쓸거니까 접근제어지시자는 퍼블릭
		{
		Random ran = new Random(); //인스턴스 생성
		int n;
		int cnt = 0; //반복문을 위한 카운트 변수

		// 빈번하게 쓰면안된다 : 쓰는거
		// 두 개의 반복문을 빠져나왔다
		jump: //outer colon..변수같은거라 jump라고 꼭 안해도된다
		//앞에 발생한 난수들과 동일한지 아닌지 다 비교해야해
		while(cnt <6) //cnt가 6보다 작은 동안만 반복하겠다(0 1 2 3 4 5) 웅
			{
			n = ran.nextInt(45) + 1;	// 1 ~ 45 중 한 개 발생(+1안하면 0~44사이의 난수 발생)
			for(int i = 0; i < cnt; i++) //쑝
				{
				if(num[i] == n) //발생한 숫자가 num배열의 i번째와 같으면
					{
					continue jump;		// 난수를 다시 발생시킬 수 있도록 처리
					}

			}
			num[cnt++] = n; //1씩 증가
			
		}
		// 정렬 메소드 호출
		sorting();

	}
	//정렬 메소드 정의
	private void sorting() 
		{
		// Arrays 클래스의 정적 메소드 sort() 호출하며
		// 멤버인 num 을 매개변수로 넘겨주기
		//private 하면된다 같은 클래스 안에 있는 멤버니까
		Arrays.sort(num); //기본 오름차순 정렬로 알아서 된다.
		}
	}

public class Test142 
{
	public static void main(String[] args) 
	{
		// Random ran = new Random();
		/*
		// 내 풀이
		// 임의의 45개 숫자

		int[] arr = new int[6];

		int n = 1;

		while(n <= 5) {
		
			for(int i = 0; i < arr.length; i++) {
			
				arr[i] = ran.nextInt(45) + 1;

				for(int j = 0; j < i; j++) {
				
					if(arr[i] == arr[j]) {
						i--;
					}

					else if(arr[i] < arr[j]) {
						
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

					}

				}

			}

			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();


			n++;
	    
		}

		*/

		//로또 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5게임
		for(int i = 1; i <= 5; i++) 
			{
			lotto.start();

			// 결과 출력(향상된 for문)
			for(int n : lotto.getNum()) //getnum배열에서 숫자하나(int)꺼내기 
				{
				System.out.printf("%4d", n);
				}
			System.out.println();
		}


	}

}
