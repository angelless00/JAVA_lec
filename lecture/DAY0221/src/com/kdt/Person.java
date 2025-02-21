/**
 * 클래스설명 : 사람을 표현하는 클래스
 * 클래스이름 : Person
 * 클래스속성 : 이름 String name
 * 			 나이 int age
 * 			 성별 char gender
 * 클래스기능 : eat()	먹는다
 * 			 sleep() 잔다
 */

package com.kdt;

public class Person {
   //------------------------------------------
   // 멤버 변수
   //------------------------------------------
   private String name;
   private int age;
   private char gender;

      
   
   //------------------------------------------
   // 생성자 메서드
   //------------------------------------------
   public Person() {
	}


	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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
}
