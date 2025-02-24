package com.abs;

public class Line extends Shape {
	// 멤버 필드 & 속성
	private String color; 	// 선 색상
	private int width;		// 선 두께
	private int length;		// 선 길이
	
	
	// 생성자
	Line(){this("black",1,1);}
	
	Line(String color,int width,int length){
		this.color=color;
		this.width=width;
		this.length=length;
	}
	
	
	// 메서드 오버라이딩
	@Override
	public void drawing() {
		// 출력 예: 두꼐 3, 길이 10인 파랑색 선 그리기
		System.out.println("두께 " +this.width+", 길이" +this.length+"인 "+this.color+"선 그리기" );
	}
	
}
