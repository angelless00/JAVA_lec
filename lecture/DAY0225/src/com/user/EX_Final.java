/**
 * final 제어자 실습
 */

package com.user;

public class EX_Final {

	public static void main(String[] args) {
		// [실습3] - final 클래스
		A a=new A();
		
		// 최상위 부모 클래스 Object로 부터 상속 받은 메서드
		System.out.println(a.toString());
		
		
		
////		[실습2]
//		// Person 인스턴스 생성
//		Person p1=new Person("홍",10);
//		p1.sleep("책상");
//		p1.eat("치킨");
//			
//		
		
		
		
//		
//		
//		
//		//---------------------------------------------
//		// - final 필드/속성/변수 => 상수 (constant)
//		//---------------------------------------------
//		
//		String msg="Good Luck";
//		final int CODE=82;
//		final String NATION;
//		
//		// 일반 필드/속성/변수 값 변경 가능
//		msg="Happy";
//		
//		// final 필드/속성/변수 값 변경 X
////		CODE=100;
////		=>ERROR
//
//		// final 필드/속성/변수 1회 초기화 가능
//		NATION="KOR";
//		// NATION="082_KOR"; // 1회 초기화 후 변경 X
	}

}
