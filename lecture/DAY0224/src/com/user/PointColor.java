package com.user;

public class PointColor extends Point {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	
	// 인스턴스 멤버 변수
	private String color;
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	PointColor(){
		this(0,0,"black");
	}
	PointColor(int v){
		this(v,v,"black");
	}
	PointColor(int x,int y,String color){
		super(x,y);
		this.color=color;
	}


		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------


	//------------------------------------------
	// 메서드기능 : 점그리기
	// 메서드이름 : draw
	// 매개변수들 : 없음
	// 메서드결과 : 없음
	//------------------------------------------
	@Override
	public void draw() {
		System.out.println(this.color+"●");
	}
	
	//------------------------------------------
	// 메서드기능 : 정보 출력하기
	// 메서드이름 : printInfo
	// 매개변수들 : 없음
	// 메서드결과 : 없음
	//------------------------------------------
	
	@Override
	public void printInfo() {
	System.out.println("(" +this.getX()+","+this.getY()+")");	// 상속받앗기때문에 super,this 모두 가능
	System.out.println("차원 : "+this.DIM);
	System.out.println("색상 : "+this.color);
	}
}
