/**
 * 클래스설명 : 소방관을 표현하는 클래스
 * 클래스이름 : Fireman
 * 클래스속성 : 이름 String name
 * 			 나이 int age
 * 			 성별 char gender
 * 			 소속명 String group
 * 			 학년 int grade
 * 클래스기능 : eat()	먹는다
 * 			 sleep() 잔다
 * 			 extinguish() 불끄다.
 */

package com.kdt;

public class Fireman2 extends Person {

	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	private String group;	// 소속명
	private int grade;		// 직급

		
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	// Default Constructor

	
	public Fireman2(String name, int age, char gender, String group, int grade) {
		super(name,age,gender);
		this.group = group;
		this.grade = grade;
	}



	
	public Fireman2(String name, int age, char gender) {
		this(name,age,gender,"none",0);
	}




	public Fireman2() {
		this("unknown",0,'M',"none",0);
	}




	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
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
	//------------------------------------------
	// 메서드역할 : 불끄다
	// 메서드이름 : extinguish
	// 매개변수들 : String where 장소
	// 메서드결과 : void
	//------------------------------------------
	public void extinguish(String where) {
		System.out.println(super.getName()+"이/가 "+where+"에서 불을끄다.");
		}	
		
		
	}


