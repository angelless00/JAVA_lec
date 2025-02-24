/************************************************
 * Point 클래스와 자식 클래스들의 Up/Down 캐스팅
 *********************************************/
package com.user;

public class EX_Point {

	public static void main(String[] args) {
		// [실습] instanceof 연산자
		//		 해당 변수가 틀정 클래스로 생성된 인스턴스 여부 검사
		
		// 인스턴스 생성
		Point p1=new Point();
		Point p2=new Point3D();
		Point p3=new Point4D();
		Point4D p4=new Point4D();
		
		// 형제/자매 관계를 안됨!
		// Pointcolor p5 =new Point4D();
		
		// 인스턴스 확인 출력
		System.out.print("p1 instanceof Point : ");
		System.out.println(p1 instanceof Point);
		
		System.out.print("p2 instanceof Point3D : ");
		System.out.println(p2 instanceof Point3D);
		
		System.out.print("p2 instanceof Point : ");
		System.out.println(p2 instanceof Point);
		
		System.out.print("p3 instanceof Point4D : ");
		System.out.println(p3 instanceof Point4D);
		
		System.out.print("p4 instanceof Point4D : ");
		System.out.println(p4 instanceof Point4D);
		
		
		
////		[실습] Down-casting
////			  부모/슈퍼 인스턴스 => 자식/서브 인스턴스 타입으로 저장
////			  조건, 부모/슈퍼 인스턴스는 업캐스팅으로 지정된 인스턴스 임!
//		Point p1=new PointColor(40,30,"red");
//		
//		// p1으로 PointColor 의 멤버 접근 x
//		//p1.setColor("GOLD")
//		
//		// 다운캐스팅 : 자식/서브로 형변환
//		PointColor p2=(PointColor)(p1);
//		p2.setColor("Gold");
//		
//		((PointColor)p1).setColor("Pink");
//	
		
//		// [실습] Up-casting
//		// 		자식/서브 인스턴스를 부모/퓨터 인스턴스 타입으로 저장
//		// 		접근가능 멤버 범위 체크
//		PointColor pc1=new PointColor(40,30,"red");
//		
//		pc1.draw();
//		pc1.printInfo();
//		pc1.setColor("Yellow");
//		
//		// 부모 타입의 변수에 자식 인스턴스 저장
//		Point p1=pc1;
//		
//		System.out.println("p1 =>"+p1);
//		System.out.println("pc1 =>"+pc1);
//		
//		
//		p1.draw();
//		p1.printInfo();
	}

}
