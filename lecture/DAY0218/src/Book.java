/*******************************************
 * 클래스역할 : 도서 정보 저장
 * 클래스이름 : Book
 * 클래스속성 : 제목, 저자, 출간년도
 * 클래스기능 : 도서 정보 출력
 *****************************************/
public class Book {
	/*******************************
	 * 멤버속성
	 ******************************/
	String title; //제목
	String author; //저자
	int year; //출간년도
	
	/*******************************************
	 * 생성자 메서드
	 ************************************/
	// Default 생성자 : 매개변수 x
	Book(){
//		this.title="unknown";
//		this.author="unknown";
//		this.year=0;
		this("unknown", "unknown", 0);
		// 바로 밑에있는 생성자를 불러서 사용할때 this()
	}
	
	// 속성 모두 초기화 생성자
	Book(String title, String author, int year){
		this.title=title;
		this.author=author;
		this.year=year;
	}
	
	// 제목, 저자만 초기화 생성자
	// 속성 모두 초기화 생성자
	Book(String title, String author){
//		this.title=title;
//		this.author=author;
		this(title,author,0);
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
