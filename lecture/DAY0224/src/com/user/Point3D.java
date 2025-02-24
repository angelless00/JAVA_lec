package com.user;

public class Point3D extends Point {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	public static final String DIM="3D";
	
	// 인스턴스 멤버 변수
	private int z;
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	Point3D(){
		this(0,0,0);
	}
	Point3D(int v){
		this(v,v,v);
	}
	Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}


		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	
	public float getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	
	// 부모랑 하는 일이 같다면 굳이 적지 않아도 괜찮!
	
	
	@Override
	public void printInfo() {
	System.out.println("(" +this.getX()+","+this.getY()+","+this.z+")");	// 상속받앗기때문에 super,this 모두 가능
	System.out.println("차원 : "+this.DIM);
	}
	
	
}
