/**
 * 상속과 다형성
 */
package com.kdt;

public class EX_Poly2 {
	
	// 클래스 메서드
	// 매개변수 Shape 인스턴스, 자식 인스턴스 가능
	public static void runMethod(Point s) {
		s.draw();
	}

	public static void painting(ColorPoint cp) {
		System.out.println(cp.color+"페인팅~");
	}
	
	public static void main(String[] args) {
		
		Point p1=new Point();
		
		System.out.println(p1);
	}
}
	
	
	
	
//	public static void main(String[] args) {
//		Point p1 = new Point();
//		ColorPoint cp1=new ColorPoint(20,40,"red");
//		Point3D pd=new Point3D(10,10,10);
//		
//		// 인스턴스를 매개변수로 가지는 메서드 호출
//		// 매개변수 - Point 인스턴스, 자식 인스턴스
//		EX_Poly2.runMethod(p1);
//		EX_Poly2.runMethod(cp1);
//		EX_Poly2.runMethod(pd);
//		
//		// 매개변수 - ColorPoint 인스턴스
//		EX_Poly2.painting(cp1);
//		//EX_Poly2.painting(p1);  => Error
//		//EX_Poly2.painting(pd);  => Error
//	}
//
//}







//--------------------------------------------------------------------
class Point{
	// Instance Variable
	int x;
	int y;
	
	// Custructor Method
	Point(){	}
	
	Point(int x, int y){	
		this.x=x;
		this.y=y;
	}
	
	// 최상위 부모 클래스 Object 메서드 재정의
	@Override
	public String toString() {
//		System.out.println("toString()");
//		return super.toString();
		return "Good";
	}
	
	
	// Instance Method
	// 모두에게 허용
	public void draw() {
		System.out.println("[public]"+ "("+this.x+","+this.y+")");
	}
}

// Point 클래스 상속 받은 자식 클래스들----------------
class ColorPoint extends Point{
	// Instance Variable
	String color;
	
	// Constructor method
	ColorPoint(){}
	
	ColorPoint(int x, int y, String color){
		super(x,y);
		this.color=color;
		}
	}

class Point3D extends Point{
	// Instance Variable
	int z;
	
	// Constructor method
	Point3D(){}
	
	Point3D(int x, int y, int z ){
		super(x,y);
		this.z=z;
		}
	}
