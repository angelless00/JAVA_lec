/*
 *  동물원 Zoo ==> 클래스 정의/설계 연습
 *  
 *  - 동물 5마리 ==> 5개 클래스
 *  - 필수메서드 : 울음소리 내는 것, 이동/움직이는 것, 먹는것
 */
public class Zoo {
	
	String name;
	
	// 생성자
	Zoo(String name_){
		name=name_;
	}
	
	void bark() {
		System.out.println(name+" 운다.");
	}
	
	void move() {
		System.out.println(name+" 움직인다.");
	}
	
	void eat(String food) {
		System.out.println(name +"이 " + food+" 먹는다." );
	}
	
	public static void main(String[] args) {
		Zoo lion=new Zoo("사자");
		lion.move();
	}

}
