/*******************************************
 * 클래스 정의
 * - 속성과 행동/기능 추출
 * - 속성 => 변수저장
 * - 행동/기능 => 함수
 ******************************************/
public class EX_DogClass {
	
	// 속성(Attribute)
	String kind;// 품종/종류
	String coatColor;// 털색상
	String eyeColor;// 눈색상
	float weight;// 무게

	// 행동/기능 (Method)
	
	// 메서드기능 : 짖는다.
	// 메서드이름 : bark
	// 매개변수들 : String sound
	// 메서드결과 : 없음
	// 반환타입 메서드이름(매개변수들) {}
	void bark(String sound) {
		System.out.println(sound);
	}
	
	// 메서드기능 : 꼬리친다.
	// 메서드이름 : tailing
	// 매개변수들 : 없음
	// 메서드결과 : 없음
	// 반환타입 메서드이름(매개변수들) {}
	void tailing() {
		System.out.println("신나게 꼬리친다.");
	}

	// 메서드 : 프로그램 시작 및 제어 메서드 
	public static void main(String[] args) {
		
		// 객체 생성 => 클래스명 변수명 new 클래스명 ()
		// 변수명은 메모리 힙에 저장된 객체의 주소를 저장, 레퍼런스 변수
		EX_DogClass dog = new EX_DogClass();
		
		System.out.println("dog=> "+dog);
		
		// 객체 속성 값 저장
		dog.coatColor="그레이";
		dog.eyeColor="블루";
		dog.weight=3.5f;
		
		// 객체 메서드 사용
		dog.bark("월월");
		dog.tailing();
		
		

	}

}
