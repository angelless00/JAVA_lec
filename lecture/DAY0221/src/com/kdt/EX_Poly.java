/**
 * 상속과 다형성
 */
package com.kdt;

public class EX_Poly {
	
	// 클래스 메서드
	// 매개변수 Shape 인스턴스, 자식 인스턴스 가능
	public static void runMethod(Shape s) {
		s.draw();
	}
	
	public static void calc(int num) {
		System.out.println(num*num*num);
	}
	
	public static void main(String[] args) {
		EX_Poly.calc(7);
		EX_Poly.calc((int)6.5);
		
		EX_Poly.runMethod(new Shape());
		
		Shape ss=new Shape();
		EX_Poly.runMethod(ss);
		
		Line ll=new Line();
		Circle cc=new Circle();
		
		EX_Poly.runMethod(ll);
		EX_Poly.runMethod(cc);
		
	}
	
	
	
	
	
	
	// 프로그램 진입점 Entry Point
//	public static void main(String[] args) {
		
	// 클래스 메서드
	// [오버라이딩 실습]	

//		// 인스턴스 생성
//		Shape s1=new Shape();
//		Line l1= new Line();
//		Circle c1=new Circle();
//		
//		// 인스턴스 메서드 호출 - public
//		s1.draw();
//		l1.draw();
//		c1.draw();
//		
//		l1.painting("red");
//		l1.remove(true);
//	}

}


//--------------------------------------------------------------------
class Shape{
	// Custructor Method
	Shape(){	}
	
	// Instance Method
	// 모두에게 허용
	public void draw() {
		System.out.println("[public] Drawing~");
	}
	// 자기자신에게만 허용
	private void printMessage() {
		System.out.println("[private]^---^");
	}
	
	// Default 접근 지정자 - 같은 패키지, 상속관계 사용 허용
	void painting(String color) {
		System.out.println( "[default]"+color+"도형");
	}
	// 상속관계, 같은 패키지에 사용허용
	protected void remove(boolean isall) {
		System.out.println("[protected] 지울까요?"+isall);
	}
}

// Shape를 상속받은 클래스들

class Line extends Shape{

	@Override
	public void draw() {
		System.out.println("Draw blue line----------------------");
	}

	@Override
	void painting(String color) {
		System.out.println("Draw "+color+"line-----------!!");
	}
	

	}
	

class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("----------");
		System.out.println("|         |");
		System.out.println("----------");
	}
	
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("O");
	}
}