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

public class Doctor {
	
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	private String name;	// 이름
	private int age;		// 나이
	private char gender;	// 성별
	private String major; 	// 전공
	private int career;		// 경력

		
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	// Default Constructor


	public Doctor(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Doctor(String name, int age, char gender, String major, int career) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.major = major;
		this.career = career;
	}

	public Doctor() {
		super();
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
	// 메서드역할 : 불끄다
	// 메서드이름 : operate
	// 매개변수들 : String what 수술명
	// 메서드결과 : void
	//------------------------------------------
	public void operate(String what) {
		System.out.println(this.name+"이/가 "+what+"수술하고있다.");
		}	

	//------------------------------------------
	// 메서드역할 : 진료한다
	// 메서드이름 : treat
	// 매개변수들 : 
	// 메서드결과 : void
	//------------------------------------------
	public void treat() {
		System.out.println(this.name+"이/가 진료하고있다");
		}	

}
