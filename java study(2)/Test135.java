/*========================================
  ■■■자바의 주요(중요)클래스■■■
  -StringBuffer 클래스
========================================*/

public class Test135 {

	public static void main(String[] args) {
		
		String s1 = "123456789";
		s1 = (s1 + "123").replace('2', 'A');
		System.out.println(s1);
		// 123456789
		// 123456789123
		// 1A34567891A3

		// --==>> 1A34567891A3


		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0, 3).replace(1, 3, "24").delete(4, 5);	// StringBuffer class
		System.out.println(s2);
		// 123456789

		// 123456789.delete(0, 3).replace(1, 3, "24").delete(4, 5);

		// 456789.replace(1, 3, "24").delete(4, 5);

		// 424789.delete(4, 5);

		// 42479

		// --==>> 42479

		StringBuffer s3 = new StringBuffer("123456789");		// s3 -> StringBuffer class -> substring 가 있다.
		String s4 = s3.substring(3, 6);							// s4 -> String class
		System.out.println(s4);
		// 123456789.substirng(3, 6);
		// index
		// 012345678 (3, 6) -> 4 5 6
		// --==>> 456


		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		System.out.println(s5);
		// 123456789
		// 123456789.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		// ----------------------
		//       456789
		// 456789.delete(1, 3).delete(2, 5).insert(1, "24");
		// -------------------
		

	}

}
