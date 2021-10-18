//실행 흐름의 컨트롤(제어문,조건문과 반복문)
//switch 문 실습
//============================================
/*
다중 선택문이라 하며, switch 문 다음의 수식 값에 따라
실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다

형식 및 구조
switch(수식)
{
	case 상수1 : 문장1; [break;]
	case 상수2 : 문장2; [break;]
	      :
	[default : 문장n+1; [break;]] ---생략가능하다는 표시로 [] 해둔거(혼동주의)


}

switch 문의 수식과 case의 상수는 byte,short,int,long이어야 한다.
case 문 뒤에 break;가 없는 형태인 경우
다음 case 문의 문장을 계속해서 이어서 수행하게 된다(→기본모델)

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//○연산 및 처리

		String name;
		int kor,eng,mat;

		System.out.print("이름 입력 : ");
		name=br.readLine();

		System.out.print("국어점수 입력 : ");
		kor= Integer.parseInt(br.readLine());

		System.out.print("영어점수 입력 : ");
		eng= Integer.parseInt(br.readLine()); //인티져

		System.out.print("수학점수 입력 : ");
		mat= Integer.parseInt(br.readLine()); //인티져

		int avg=(kor+eng+mat)/3; //-편의상 정수로 처리
		int tot=kor+eng+mat;
		char grade;

		if(avg>=90)
			grade='A';
		else if(avg>=80)
			grade='B';
		else if(avg>=70)
			grade='C';
		else if(avg>=80)
			grade='D';
		else
			grade='F';

		switch(avg/10)
		{
		case 10: case 9 : grade='A';break;
		case 8: grade='B';break;
		default: grade='F';break; //grade를 char grade ='F'로 초기화 해두었다면 default가 없어도 되지만 아니라면 default가 필수다
		}
		System.out.printf("\n당신의 이름은 %s 입니다\n");
		System.out.printf("\n총점은 %d, 평균은%d 입니다\n",tot, avg);
		System.out.printf("\n등급은 %c 입니다\n",grade);

	}

}

	/*비효율적이지만 오류는 없어
	switch(avg)
	{
		case 100: grade='A';break;
		case 99: grade='A';break;
		case 98: grade='A';break;
					:
		case 2: grade='F';break;
		case 1: grade='F';break;
		case 0: grade='F';break;
	}
	*/
