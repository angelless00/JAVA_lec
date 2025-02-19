/***
 * 클래스역할 : 다양한 변수 종류 확인용
 * 클래스이름 : Variable
 * 클래스속성 : 다양한 종류의 변수들 선언
 */
public class Variable {
	//----------------------------------------------
	// 멤버변수
	//----------------------------------------------
	// 클래스 변수
	static int code;
	// 인스턴스 변수 - new 키워드로 인스턴스 생성 시 사용 가능
	private String id;
	String name;

	
	//----------------------------------------------
	// 생성자 메서드 : 클래스이름과 동일한 이름, 반환 문법 x
	//			   클래스이름(){} - 기본 Default생성자
	//			   생성자 1개 없으면 컴파일가 
	//			   자동생성
	//----------------------------------------------
	// Default Constructor 생성자
	Variable(){
		this("unknown","unknown");
		System.out.println("생성자 Variable()");
	}
	
	// 1개 속성초기화 생성자
	Variable(String id){
		this(id,"unknown");
		System.out.println("생성자 Variable(String)");
//		this.id=id;
	}
	
	// 2개 속성초기화 생성자
	Variable(String id,String name){
		this.id=id;
		this.name=name;
		System.out.println("생성자 Variable(String,String)");
	}
	
	//----------------------------------------------
	// Getter/Setter 메서드 : 속성 간접 접근 메서드
	// - get속성명() : 속성값 읽어서 반환
	// - set속성명(새로운값) : 속성값 적용
	//----------------------------------------------
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//----------------------------------------------
	// 멤버 메서드
	//----------------------------------------------
	// 메서드기능 : 고객정보 출력 기능
	// 메서드이름 : printInfo
	// 매개변수들 : 인스턴스 내부의 속성/변수 사용. 추가필요 x
	// 메서드결과 : 반환x
	public void printInfo() {
		System.out.println("NAME : "+this.name);
		System.out.println("ID   : "+this.id);
	}
	// 메서드기능 : 인사 메세지 출력 기능
	// 메서드이름 : hello
	// 매개변수들 : 인스턴스 내부의 속성/변수 사용. 추가필요 x
	// 메서드결과 : 반환x
	// 			 인스턴스 생성 없이 사용 가능한 메서드
	public static void hello() {
		System.out.println("HELLO~");
	}
	}
	
