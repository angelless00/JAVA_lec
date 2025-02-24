/**
 * 클래스역할 : 사람 데이터 저장 클래스 => 특징/속성 + 기능/역할
 * 클래스이름 : Doctor
 * 부모클래스 : com.knu.person
 * 클래스필드 : 이름,성별,나이,진료과목
 * 클래스기능 : 먹는다, 잔다, 수술한다
 */
package com.knu;

public class Doctor extends Person {
	   //------------------------------------------
	   // 멤버 변수
	   //------------------------------------------
	   // 클래스 멤버 변수
	   
	   // 인스턴스 멤버 변수
	   private String major;
	   
	   //------------------------------------------
	   // 생성자 메서드
	   //------------------------------------------
	   Doctor(){
		   this("unknown",0,'M',"none");
	   }
	   
	   Doctor(String name,int age,String major){
		   this(name,age,'M',major);
	   }
	   
	   Doctor(String name, int age, char gender,String major){
		   super(name,age,gender);
		   this.major=major;
	   }
	      
	   //------------------------------------------
	   // Getter/Setter 메서드
	   //------------------------------------------   
	   public String getMajor() {
		   return major;
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
			System.out.println(this.major+"에ㅔ서 "+what+"수술하고있다.");
	   
		}
}
	