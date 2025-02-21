/**
 * 클래스설명 : 학생을 표현하는 클래스
 * 클래스이름 : Student
 * 클래스속성 : 이름 String name
 * 			 나이 int age
 * 			 성별 char gender
 * 			 학교명 String school
 * 			 학년 int grade
 * 클래스기능 : eat()	먹는다
 * 			 sleep() 잔다
 * 			 study() 공부한다.
 */
package com.kdt;

public class Student {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	private String name;	// 이름
	private int age;		// 나이
	private char gender;	// 성별
	private String school;	// 학교명
	private int grade;		// 학년

		
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	// Default Constructor
	public Student() {
		this("unknown",0,'M',"none",0);
	}
	
	// Overload Constructor
	public Student(String name,String school,int grade) {
		this(name,0,'M',school,grade);
	}
	
	public Student(String name,int age, char gender,String school,int grade) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.school=school;
		this.grade=grade;
	}


	
	//------------------------------------------
	// Getter/Setter 메서드
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
	//------------------------------------------
	// 메서드역할 : 먹는 음식 출력
	// 메서드이름 : eat
	// 매개변수들 : String food 음식명
	// 메서드결과 : void
	//------------------------------------------
	public void eat(String food) {
		System.out.println(this.name+"이/가 "+food+"을/를 먹는다.");
	}
	
	//------------------------------------------
	// 메서드역할 : 잔다
	// 메서드이름 : sleep
	// 매개변수들 : 없음
	// 메서드결과 : void
	//------------------------------------------
	public void sleep() {
		System.out.println(this.name+"이/가 잔다.");
	}
	
	//------------------------------------------
	// 메서드역할 : 공부 과목 출력
	// 메서드이름 : study
	// 매개변수들 : String subject 과목명
	// 메서드결과 : void
	//------------------------------------------
	public void sleep(String subject) {
		System.out.println(this.name+"이/가 "+subject+"을/를 공부하고 있다.");
	}	
	
	
}
