/**
 * private 생성자 클래스의 인스턴스 생성
 * => 간접 접근 방식의 메서드 존재, 클래스 즉, static 타입 이어야함
 */
package com.test;

public class EX_Singleton {

	public static void main(String[] args) {
		// 인스턴스 생성
		//Singleton s=new Singleton();
		//=>private 생성자라서 외부공개 불가
		Singleton s=Singleton.getInstance();
	}

}
