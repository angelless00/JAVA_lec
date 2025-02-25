/**
 * 클래스역할 : 인스턴스 생성 제한하는 클래스, 내부에서 인스턴스 생성
 * 클래스이름 : Singleton
 * 클래스속성 : 인스턴스
 * 클래스기능 : 인스턴스 반환 메서드
 */
package com.test;

public class Singleton {
	
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	private static Singleton instance;
	// Null 로 초기화
	
	// 인스턴스 멤버 변수
		
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	private Singleton() {}


		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	
	// 한개의 인스턴스만 메모리에 생성,그리고 공유
	public static Singleton getInstance() {
//		Singleton.instance=(instance!=null)? Singleton.instance:new Singleton();
		
		if(Singleton.instance!=null)
			return Singleton.instance;
		else {
			Singleton.instance=new Singleton();
			return Singleton.instance;
		}
	}	
	
	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------

}
