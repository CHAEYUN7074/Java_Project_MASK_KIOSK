// 연산자(Operator)
//-비트 단위 연산자
//-비트 shift 연산(독보적으로 빠름)
//----------------------------------------------


public class Test023 {

	public static void main(String[] args) {


					  //						     |
		int x = 128;  //  00000000 00000000 00000000 10000000
																		//     |
		System.out.printf("x << 3 : %d\n", x << 3);  // 00000000 00000000 00000100 00000000   (1024) 
		System.out.printf("x * 8 : %d\n", x * 8);
		// x << 3 : 1024
		// x * 8 : 1024
													 //								  |
		System.out.printf("x >> 3 : %d\n", x >> 3);  // 00000000 00000000 00000000 00010000    (16)
		System.out.printf("x / 8 : %d\n", x / 8);
		// x >> 3 : 16
		// x / 8 : 16
													    // |
		System.out.printf("x << 24 : %d\n", x << 24);   // 10000000 00000000 00000000 00000000
		// ==> x << 24 : -2147483648

		System.out.printf("x << 25 : %d\n", x << 25);
		// ==> x << 25 : 0
		
		System.out.printf("x << 26 : %d\n", x << 26);
		System.out.printf("x << 27 : %d\n", x << 27);
		System.out.printf("x << 28 : %d\n", x << 28);
		System.out.printf("x << 29 : %d\n", x << 29);
		System.out.printf("x << 30 : %d\n", x << 30);
		System.out.printf("x << 31 : %d\n", x << 31);
		// ==> x << 26 ~ 31 : 0

		System.out.printf("x << 32 : %d\n", x << 32);
		// ==> x << 32 : 128
		

	}

}

/*
	실행 결과

x << 3 : 1024
x * 8 : 1024
x >> 3 : 16
x / 8 : 16
x << 24 : -2147483648
x << 25 : 0
x << 26 : 0
x << 27 : 0
x << 28 : 0
x << 29 : 0
x << 30 : 0
x << 31 : 0
x << 32 : 128
계속하려면 아무 키나 누르십시오 . . .

*/
