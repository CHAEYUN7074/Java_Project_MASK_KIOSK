/*========================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
  - 향상된 버블 정렬(Bubble Sort)
========================================*/

/*
※ 앞에서 확인해 본 Selection Sort(Test103)나 Bubble Sort(Test104)의 성능은 같다.
   (→ 반복의 횟수로 추정)
   하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라서
   일반 Bubble Sort 나 Selection Sort보다 성능이 좋을 수 있다.

원본 데이터: 61 15 20 22 30
          15 20 22 30 61      - 1회전 (스왑 발생 → true) → 다음 회전 진행 o
          15 20 22 30 61      - 2회전 (스왑 발생 → false) → 다음 회전 진행 x

=> 1회전 수행... 2회전 수행...을 해보았더니...
   2회전에서 스왑(자리 바꿈)이 전혀 일어나지 않았기 때문에
   불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
   수행하지 않는다.
*/

//실행 예)
//Source Data: 10 50 20 30 40
//Source Data: 10 50 20 30 40
// 계속하려면...

public class Test105
{
   public static void main(String[] args)
   {
      int[] a = {10, 50, 20, 30, 40};
      /*
      10 50 20 30 40         0   1
      == --
      10 20 50 30 40         1   2
         == --
      10 20 30 50 40         2   3
            == --
      10 20 30 40 50         3   4
             == --
      ------------------------------------- 1회전 → 스왑 발생
      
      10 20 30 40 50         0   1
      == --
      10 20 30 40 50         1   2
         == --
       10 20 30 40 50         2   3
            == --
      ------------------------------------- 2회전 → 스왑 발생하지 않음
                  X
                  X
      ------------------------------------- 3회전 → X
                  X
      ------------------------------------- 4회전 → X
      */

      /*
      boolean test = false;

      System.out.print("Source Data: ");
      for (int n: a)
         System.out.print(n + " ");
      System.out.println();

      for (int i=1; i<a.length; i++)
      {
         test= false;
         for (int j=0; j<a.length-i; j++)
         {
            if (a[j]>a[j+1])
            {
               a[j] = a[j]^a[j+1];
               a[j+1] = a[j+1]^a[j];
               a[j] = a[j]^a[j+1];

               test= true;
            }
         }
         if (test == false)
            break;

         // 테스트
         //System.out.println(test);
      }

      System.out.print("Source Data: ");
      for (int n: a)
         System.out.print(n + " ");
      System.out.println();
   */

   //[함께 풀이한 내용]
   
   System.out.print("Source Data: ");
   for (int n : a)
      System.out.print(n + " ");
   System.out.println();

   boolean flag; ☆
   int temp;
   int pass=0;


   // 향상된 Bubble Sort 구현
   do
   {
      flag = false;
      pass++;

      for (int i=0; i<a.length-pass; i++)
      {
         // 테스트
         //System.out.println(i + "쑝");

         if (a[i] > a[i+1])   //01 12 23 34
         {               //01 12 23
            // 자리 바꾸기   //01 12
            temp = a[i];   //01
            a[i] = a[i+1];
            a[i+1] = temp;

            flag = true;
            //-- 단 한 번 이라도 스왑(자리바꿈)이 발생하게 되면
            //   flag 변수는 true로 변경~!!!
         }
      }
      // 테스트
      //System.out.println("웅");
   }
   while (flag);
   //-- flag 변수가 false라는 것은
   //    회전이 구분적으로 발생하는 동안 스왑이 일어나지 않는 경우로
   //   더 이상의 반복문 수행은 무의미한 것으로 판단 가능~!!!

   System.out.print("Source Data: ");
   for (int n : a)
      System.out.print(n + " ");
   System.out.println();


   }
}

// 실행 결과
/*
Source Data: 10 50 20 30 40
Source Data: 10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/