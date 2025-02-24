/**
 * 클래스이름 : Shape		<= 미완성 클래스
 * 클래스속성 : 없음
 * 클래스기능 : paint()
 * 			 draw() : 미완성 즉, abstract 메서드
 */
package com.abs;

abstract class Shape {

		// 멤버 필드 & 속성
		
		// 생성자
		public Shape() {}
		
		// 멤버 메서드
		public void paint(String color) {
			System.out.println(color+" painting!");
		}
	
		// 미완성 추상 메서드 => 자식클래스에서 반드시 오버랑디이 해야하는 메서드 
		abstract public void drawing();

	
}
