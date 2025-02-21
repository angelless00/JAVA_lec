/**
 * 클래스설명 : 의사을 표현하는 클래스
 * 클래스이름 : Doctor
 * 클래스속성 : 이름 String name
 * 			 나이 int age
 * 			 성별 char gender
 * 			 전공 String major
 * 			 경력 int career
 * 클래스기능 : eat()	먹는다
 * 			 sleep() 잔다
 * 			 operate() 수술하다.
 */
package com.kdt;

public class Doctor2 extends Person{
	
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수

	private String major; 	// 전공
	private int career;		// 경력

		
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	// Default Constructor


	public Doctor2(String name, int age, char gender) {
		this(name,age,gender,"none",0);
	}

	public Doctor2(String name, int age, char gender, String major, int career) {
		super(name,age,gender);
		this.major = major;
		this.career = career;
	}

	public Doctor2() {
		this("none",0,'M',"none",0);
	}
	





	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------

	
	//------------------------------------------
	// 메서드역할 : 수술하다
	// 메서드이름 : operate
	// 매개변수들 : String what 수술명
	// 메서드결과 : void
	//------------------------------------------
	public void operate(String what) {
		System.out.println(super.getName()+"이/가 "+what+"수술하고있다.");
		}	

	//------------------------------------------
	// 메서드역할 : 진료한다
	// 메서드이름 : treat
	// 매개변수들 : 
	// 메서드결과 : void
	//------------------------------------------
	public void treat() {
		System.out.println(super.getName()+"이/가 진료하고있다");
		}	

}
