/**
 * Person 클래스 상속 받은 Student 클래스
 */
package com.user;

public class Student extends Person {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	
	// 인스턴스 멤버 변수
	private String school;
	private int grade;
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	Student(){
		this("unknown",0,"unknown",0);
	}
	
	
	Student(String name, int age, String school, int grade){
		super(name,age);
		this.school=school;
		this.grade=grade;
	}
		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}


	

	//------------------------------------------
	// 멤버 메서드  
	//	상속받은 메서드 구현부분 수정 => 오버라이딩
	//------------------------------------------
	@Override
	public void eat(String food) {
		// ooo음식을 요리해서 먹는다.
		System.out.println(food+" 음식을 요리해서 먹는다.");
		
	// final 메서드는 오버라이딩 불가!
	// public void sleep() {
		
	}
}
	
	
	

