/**
 * 사람 정보를 표현하는 클래스
 */

package com.user;

public class Person {
	//------------------------------------------
	// 멤버 필드 & 속성
	//------------------------------------------
	// 클래스 멤버 변수
	public static final String NATHIONALITY ="Korea" ;
	
	// 인스턴스 멤버 변수 => 정보은닉, 캡슐화
	private String name;
	private int age;
		
	
	//------------------------------------------
	// 생성자 메서드 :  2개 이상 => 메서드 오버로딩
//					메서드이름, 매개변수 종류와 갯수가 다른 경우
	//------------------------------------------
	// Default Constructor
	Person(){ this("unknown",0);
	}
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}



		
	//------------------------------------------
	// Getter/Setter 메서드 : private 필드/속성 의 간접접근 메서드
//		- get속성명(), set속성명()
	//------------------------------------------	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	//------------------------------------------
	// 멤버 메서드 : 인스턴스 생성 시 사용가능한 메서드
//		- final 메서드
	//------------------------------------------
	final public void sleep(String where) {
		// ooo이 ooo에서 잔다.
		System.out.println(this.name+"이/가 "+where+"에서 잔다.");
	}
	
	public void eat(String food) {
		// ooo가 ooo을/를 먹는다.
		System.out.println(this.name+"는/은 "+food+" 먹는다.");
	}
	
}
