package com.user;

public class Point4D extends Point3D {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	public static final String DIM="4D";
	
	// 인스턴스 멤버 변수
	private int t;
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	Point4D(){
		this(0,0,0,0);
	}
	Point4D(int v){
		this(v,v,v,v);
	}
	Point4D(int x,int y,int z,int t){
		super(x,y,z);
		this.t=t;
	}


		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	
	public float getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	
	// 부모랑 하는 일이 같다면 굳이 적지 않아도 괜찮!
	
	
	@Override
	public void printInfo() {
	System.out.println("(" +this.getX()+","+this.getY()+","+this.getZ()+","+this.t+")");	// 상속받앗기때문에 super,this 모두 가능
	System.out.println("차원 : "+this.DIM);
	}
	
	
}
