/**
 * Point
- 속성/필드 : x,y,dim
- 기능/역할 : 점 좌표 출력기능
		  점에 대한 정보출력기능
 */
package com.user;

public class Point {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	public static final String DIM="2D";
	// 인스턴스 멤버 변수
	private int x;
	private int y;
		
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	Point(){
		this(0, 0);
	}
	Point(int v){
		this(v,v);
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}


	
		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	public float getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	// 메서드기능 : 점그리기
	// 메서드이름 : draw
	// 매개변수들 : 없음
	// 메서드결과 : 없음
	//------------------------------------------
	public void draw() {
		System.out.println("●");
	}
	
	//------------------------------------------
	// 메서드기능 : 정보 출력하기
	// 메서드이름 : printInfo
	// 매개변수들 : 없음
	// 메서드결과 : 없음
	//------------------------------------------
	
	public void printInfo() {
		System.out.println("(" +this.x+","+this.y+")");
		System.out.println("차원 : "+this.DIM);
	}
}
