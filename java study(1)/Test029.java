//실행 흐름의 컨트롤(제어문, 조건문과 반복문)
//-if~else 문 실습
//==============================
/*사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
다음과 같은 형테로 출력하는 프로그램을 작성한다
등급은 평균 점수를 기준으로 산출하여 처리한다.

90점~100점 : A
60점 미만 : F

단 BufferedReader 활용하여 데이터를 받을 수 있도록 하며, printf() 메소드를 통해 출력할 수 있도록 구현한다

실행 예)
이름 입력 :
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>>당신의 이름은 김누구입니다.
>>국어 점수는 90,
>>영어 점수는 80,
>>수학 점수는 70,
>>총점은 240이고, 평균은 80입니다.
>>등급은 B입니다.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test029
{
	public static void main(String[] args)throws IOException
	{

		
		//주요 변수 선언
		int kor, eng, mat ;
		int tot;
		double avg;
		char grade='F'; //else로 끝나지 않아 에러가 난다는건 거짓말. 이렇게 설정해두면 되니까
		
		String name; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		//○연산 및 처리
		System.out.print("이름 입력 : ");
		name=br.readLine();
		
		System.out.print("국어 점수 : ");
		kor=Integer.parseInt(br.readLine());  

		System.out.print("영어 점수 : ");
		eng=kor=Integer.parseInt(br.readLine()); 
		
		System.out.print("수학 점수 : ");
		mat=kor=Integer.parseInt(br.readLine()); 


		//○총점, 평균 산출
		tot = kor+eng+mat;
		avg = tot/3.0; //★3아니고 3.0??


		//○등급산출 ※두 개 이상의 조건이 등장→논리연산자
		if(avg>=90 && avg<=100)
		{grade='A';}
			else if (avg>=80) 
			{grade='B';}
				else if (avg>=70)
				{grade='C';} 
					else if (avg>=60)
					{grade='D';}

					//문자열 아니고 문자라 '이거 하나
			
		//○결과출력
		System.out.println();
		System.out.printf(">>당신의 이름은 %s 입니다\n",name);
		System.out.printf(">>국어 점수는 %d\n",kor);
		System.out.printf(">>영어 점수는 %d\n",eng);
		System.out.printf(">>수학 점수는 %d\n",mat);
		System.out.printf(">>총점은 %d 이고, 평균은 %.2f 입니다\n",tot,avg);
		System.out.printf(">>등급은 %c 입니다\n",grade);		
	}
}


/*
이름 입력 : 채지윤
국어 점수 : 30
영어 점수 : 30
수학 점수 : 30

>>당신의 이름은 채지윤 입니다
>>국어 점수는 30
>>영어 점수는 30
>>수학 점수는 30
>>총점은 90 이고, 평균은 30.00 입니다
>>등급은 F 입니다
계속하려면 아무 키나 누르십시오 . . .
*/