/**
 * 클래스역할 : 평면 좌표에 직히는 점 정보 저장 클래스
 * 클래스이름 : Point
 * 클래스속성 : int x, int y
 * 클래스기능 : 점찍기 기능, 정보출력기능
 */
public class ColorPoint extends Point{
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	
	// 인스턴스 멤버 변수
//	private int x;
//	private int y;
	private String color;
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	ColorPoint(){
		this(0,0,"black");
	}
	
	ColorPoint(int x, int y,String color){
//		this.x=x;
//		this.y=y;
		super(x,y,"rectangle");
		this.color=color;
		System.out.println("CP");
	}
		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
//	public int getX() {return this.x;}
//	public void setX(int x) { this.x=x;}
	
//	public int getY() {return this.y;}
//	public void setY(int y) {this.y=y;}
	
	public String getColor() {return this.color;}
	public void setColor(String Color) {this.color=color;}
	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	// 메서드기능 : 색상 출력기능
	// 메서드이름 : drawingcolor
	// 매개변수들 : 없음
	// 메서드결과 : 없음 void
	public void drawingColor() {
		System.out.println(this.color);
	}
	
	
	// 메서드기능 : 정보 출력 기능
	// 메서드이름 : getInfo()
	// 매개변수들 : 없음
	// 메서드결과 : 정보문자열 String
	public String getInfo() {
		return this.color;
	}
}
