/**
 * 클래스역할 : 평면 좌표에 직히는 점 정보 저장 클래스
 * 클래스이름 : Point
 * 클래스속성 : int x, int y
 * 클래스기능 : 점찍기 기능, 정보출력기능
 */
public class Point {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	
	// 인스턴스 멤버 변수
	private int x;
	private int y;
	String type;
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	Point(){
		this(0,0,"circle");
		System.out.println("P0000");
	}
	
	Point(int x, int y,String type){
		this.x=x;
		this.y=y;
		this.type=type;
		System.out.println("P");
	}
		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	public int getX() {return this.x;}
	public void setX(int x) { this.x=x;}
	public int getY() {return this.y;}
	public void setY(int y) {this.y=y;}
	
	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	// 메서드기능 : 점그리기
	// 메서드이름 : drawingPoint
	// 매개변수들 : 없음
	// 메서드결과 : 없음 void
	public void drawingPoint() {
		System.out.println("("+this.x+","+this.y+")"+"●");
	}
	
	
	// 메서드기능 : 정보 출력 기능
	// 메서드이름 : getInfo()
	// 매개변수들 : 없음
	// 메서드결과 : 정보문자열 String
	public String getInfo() {
		return "("+this.x+","+this.y+")";
	}
}
