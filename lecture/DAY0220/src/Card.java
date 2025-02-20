/**
 * 클래스역할 : 트럼프 카드 타입 
 * 클래스이름 : Card
 * 클래스속성 : 숫자 number, 무늬 kind
 * 클래스기능 : 카드 정보 즉, 숫자와 무늬가 저장된 카드
 * 			 현재 카드 정보
 */
public class Card {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// - 클래스변수
	static final int KIND_NUM=4; 	// 카드 무늬 종류 수
	static final int NUM_MAX=13;	// 무늬별 카드 개수 
	
	// 카드 무늬값
	static final char DIAMOND ='◆';
	static final char HEART ='♥';
	static final char SPADE ='♠';
	static final char CLOVER ='♣';

	
	//- 인스턴스 변수
	private int number;
	private char kind;
	
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	Card(){
		this(1,DIAMOND);
	}
	
	Card(int number,char kind){
		this.number=number;
		this.kind=kind;
	}
	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	// 메소드기능 : 카드 정보 출력
	// 메서드이름 : printInfo
	// 매개변수들 : 없음
	// 메서드결과 : String
	//------------------------------------------
	public String printInfo() {
		System.out.println(" 종류 : "+this.kind +" 번호 : "+this.number);
		return this.kind+","+this.number;
	}
}
