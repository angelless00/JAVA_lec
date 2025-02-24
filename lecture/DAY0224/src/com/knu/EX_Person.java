package com.knu;

public class EX_Person {

	public static void main(String[] args) {
		// Upcasting : 자신 인스턴스 => 부모 인스턴스로 변환
		Doctor doc = new Doctor("홍",40,'M',"내과");
		Person p1=doc;
		Person p2=new Doctor("마징가",52,'F',"정형외과");
		// Person p3=new A() // 부모-자식관계, super-sub 관계
		
		// 접근할 수 있는 멤버의 범위
		System.out.println(doc.getMajor());	// Doctor의 멤버메서드
		doc.operate("맹장염");				// Doctor의 멤버메서드
		doc.sleep("책상", 30);				// Doctor의 부모 Person의 멤버메서드
		
		// 자식인스턴스의 멤버들 접근 불가 즉, 사용불가
//		System.out.println(p1.getMajor());	// Doctor의 멤버메서드
//		p1.operate("맹장염");				// Doctor의 멤버메서드
//		dp1oc.sleep("책상", 30);				// Doctor의 부모 Person의 멤버메서드
//		=> ERROR
		
		
	}

}
