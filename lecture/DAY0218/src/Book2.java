/*******************************************
 * 클래스역할 : 도서 정보 저장
 * 클래스이름 : Book
 * 클래스속성 : 제목, 저자, 출간년도
 * 클래스기능 : 도서 정보 출력
 *****************************************/
public class Book2 {
	/*******************************
	 * 멤버속성
	 ******************************/
	private String title; //제목
	String author; //저자
	private int year; //출간년도
	
	/*******************************************
	 * 생성자 메서드
	 ************************************/
	// Default 생성자 : 매개변수 x
	Book2(){
//		this.title="unknown";
//		this.author="unknown";
//		this.year=0;
		this("unknown", "unknown", 0);
		// 바로 밑에있는 생성자를 불러서 사용할때 this()
	}
	
	// 속성 모두 초기화 생성자
	Book2(String title, String author, int year){
		this.title=title;
		this.author=author;
		this.year=year;
	}
	
	// 제목, 저자만 초기화 생성자
	// 속성 모두 초기화 생성자
	Book2(String title, String author){
//		this.title=title;
//		this.author=author;
		this(title,author,0);
	}
	
	
	/************************************
	 * - getter/setter 메서드
	 * * private 멤버 속성 읽기/쓰기 기능 메서드
	 * * 필수는 아님!
	 * * get속성명()      => 해당 속성값 반환
	 * * set속성명(새로운값) => 해당 속성값 변경
	 ***************************************/
	//- 멤버속성 title
	String getTitle() {
		return this.title;
	}
	
	void setTitle(String title) {
		this.title=title;
	}
	//- 멤버속성 year
	int getYear() {
		return this.year;
	}
	
	//-----------------------------------
	// 인스턴스 메서드
	/**********************************
	 * 메서드기능 : 도서 정보 출력 기능
	 * 메서드이름 : printInfo
	 * 매개변수들 : -
	 * 매서드결과 : void
	 **********************************/
	void printInfo() {
		System.out.println("-----------------------------");
		System.out.println("도서명 : "+this.title);
		System.out.println("글쓴이 : "+this.author);
		System.out.println("출간연도 : "+this.year);
		System.out.println("-----------------------------");
	}
}
