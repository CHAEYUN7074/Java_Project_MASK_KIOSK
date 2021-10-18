/*==========================================================
 ■■■ 클래스 인스턴스 ■■■
 정보 은닉과 접근제어지시자
============================================================*
*/

import java.util.Scanner;

class CircleTest2
{
	//정보은닉
	//멤버 변수, 인스턴스 변수,전역변수
	//private이라는 접근제어지시자의 선언은
	//클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	//int형 변수 0으로 초기화 지원
	private int r;
	//int r;
	//getter / setter 구성
	int getR()
	{
		return r;
	}
	void setR(int r)
	{
		this.r=r;
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		r=sc.nextInt();
	}
	double calArea()
	{
		return r*r*3.141592;
	}
	void write(double a)
	{
		System.out.println("반지름 : "+r);
		System.out.println("넓  이 : "+a);
	}
}

public class Test093
{
	public static void main(String[] args)
	{
		CircleTest2 ob1=new CircleTest2();
		//ob1.r=10;
		//System.out.println("원의 반지름 : "+ob1.r);
		ob1.setR(10);
		System.out.println("원의 반지름 : "+ob1.getR());

	}
}


//setter는 값을 받기만하고 getter는 읽을때 쓰는건가요?
/*
private int num;
private char op;
예) int getNum()
	{
		return this.num;
	}

    getOP()
	{
		return op;

	}
    void setNum(int num)//집어넣으면 되니까 void
    {
		this.num=num;
	}
	void setOP(char op)
	{
		this.op=op;	
	}
