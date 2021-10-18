/*==========================================================
 ■■■ 배열 ■■■
 - 배열의 복사
============================================================*
/// 배열 변수의 복사에는 데이터복사, 주소값 복사 두 가지 형태가 존재
//  주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
								(배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사방법)
//  데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
								원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법

// 실행 예)
*/

//데이터 복사
//int형 배열에 대한 깊은 의미의 복사를 처리하는
//메소드를 정의하는 형태로 실습을 진행한다.
//Test091 파일과 비교하기


public class Test092
{
	public static void main(String[] args)
	{
		int[] nums={10, 20, 30, 40, 50};	//배열 원본
		int[] copys1=nums;	//얕은 의미의 복사(주소값 복사)
		int[] copys2=copyArray(nums);	//깊은 의미의 배열복사 수행
										//(사용자 정의 메소드 호출)
		int[] copys3=(int[])nums.clone();	//깊은 의미의 배열복사 수행
										//(사용자 정의 메소드 호출)
	
		//원본 배열 요소의 수정 발생
		nums[1]=2;

		//결과확인
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
		System.out.println();

		for(int i=0; i<copys1.length; i++)
			System.out.print(copys1[i]+" ");
		System.out.println();

		for(int i=0; i<copys2.length; i++)
			System.out.print(copys2[i]+" ");
		System.out.println();
		
		for(int i=0; i<copys2.length; i++)
			System.out.print(copys3[i]+" ");
		System.out.println();
	}
	//매개변수로 int 배열 타입을 넘겨받아 이를 복사한 후
	//복사한 배열을 반환하는 기능을 가진 메소드 정의
	public static int[] copyArray(int[]os) 
	//copyArray라는 메소드는 int 배열타입의 매개변수를 넘겨받는다. os라는 이름을 붙인다.
	{
		//매개변수로 넘겨받은 배열(os)
		//즉, 원본 배열 만큼의 배열방을 확보한
		//복사할 배열방 생성

		int[] temp=new int[os.length];
		//int[] temp=new int[5];			//[] [] [] [] [] 방이 만들어짐

		
		//원본 배열(os)에 담겨있는 각각의 요소들을
		//복사 배열(temp)에 담아내기..하나씩..하나씩..

		for(int i=0;i<os.length;i++)		//i는 0 1 2 3 4
		{
			temp[i]=os[i];					//temp[0]=os[0]/temp[1]=os[1].... os0번에 있는걸 0번에, 1번에 있는걸 1번에
		}
		//복사한 배열(temp) 반환
		return temp;
	}
}