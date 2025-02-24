/*
 * 클래스역할 : 사람 데이터 저장 클래스 => 특징/속성 + 기능/역할
 * 클래스이름 :  Person
 * 클래스필드 : 이름, 성별, 나이
 * 클래스기능 : 먹는다, 잔다
 */
package com.knu;

public class Person {
	//------------------------------------------
	// 멤버 속성/필드
	//------------------------------------------
	// 클래스 속성/필드 : 객체 생성 x 사용, static 키워드
	public static final String LOG= "KOREA";
	
	// 인스턴스 속성/필드 : 객체 생성 시 사용
	private String name; 	// 이름
	private int age;	 	// 나이
	private char gender;			// 성별
	
	//------------------------------------------
	// 생성자 메서드 => 클래스 이름과 동일한 이름 메서드
//					반환값 문법 없음
//				 => default 생성자 () + 추가 : 생성자 오버로딩
	//------------------------------------------
	// Default Constructor
	Person(){
		this("unknown",0,'M');
	}
	
	// Field Constructor
	Person(String name,int age){
		this(name,age,'M');
	}
	
	Person(String name,int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}


		
	//------------------------------------------
	// Getter/Setter 메서드 => OOB 캡슐화/ 정보은닉
	//------------------------------------------	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	// 클래스 메서드 : 객체 생성 X 사용 가능 메서드,
// 				   static 접근자
//				   인스턴스 변수/메서드 사용 불가
	
	// 인스턴스 메서드
	// 기능 : 먹는다
	public void eat(String food) {
		System.out.println(this.name+"가"+food+"먹는다.");
	}
	
	// 기능: 잔다
	public void sleep(String where,int time) {
		System.out.println(this.name+"가"+where+"에서"+time+"분 동안 자고 있다.");
	}

}
