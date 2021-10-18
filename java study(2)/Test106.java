/*========================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
========================================*/

// 사용자로부터 여러 학생의 성적 데이터를 입력받아
// 점수가 높은 순에서 낮은 순으로 등수를 부여하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력: 5
// 이름 점수 입력(1): 김김김 90
// 이름 점수 입력(2): 이이이 80
// 이름 점수 입력(3): 박박박 85
// 이름 점수 입력(4): 최최최 75
// 이름 점수 입력(5): 정정정 95
/*
---------------
1등 정정정 95
2등 김김김 90
3등 박박박 85
4등 이이이 80
5등 최최최 75
---------------
계속하려면....
*/

import java.util.Scanner;

public class Test106
{
	public static void main(String []args)
	{

	int n;

	Scanner sc = new Scanner(System.in);

	System.out.print("인원 수 입력 : ");
	n = sc.nextInt();

	int []score=new int[n];
	String []name=new String[n];
	String stemp;

	for(int i=0;i<n;i++){
	System.out.printf("이름 점수 입력(%d): ",i+1);
	name[i] = sc.next();
	score[i] = sc.nextInt();
	}

	boolean flag;
	int temp;

	for(int i=0;i<score.length;i++){
    flag = true;
    for(int j=0;j<score.length-i-1;j++){
    if(score[j]<score[j+1]){
         flag = false;
         temp = score[j];
         score[j]= score[j+1];
         score[j+1]=temp;
			
		 stemp = name[j];
         name[j]= name[j+1];
         name[j+1]=stemp;
         }
      }
      if(flag==true) break;
      }

	System.out.println("===============");
	for(int i=0;i<n;i++){
	System.out.printf("%d등 %s %d\n",i+1,name[i],score[i]);
	}
	System.out.println("===============");
	}
}
