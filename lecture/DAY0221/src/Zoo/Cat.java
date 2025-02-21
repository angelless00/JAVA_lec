package Zoo;

public class Cat extends Zoo {
	// 클래스 변수
	String cry;
	
	//생성자
	//Default 생성자
	Cat(){}
	
	Cat(String name){
		this(name,"야옹");
	}
	
	Cat(String name, String cry){
		super(name);
		this.cry=cry;
		System.out.println("고양이 " + this.name);
	}
	
	
	// 메서드
	
	void grooming() {
		System.out.println("고양이 "+this.name+"이/가 그루밍한다.");
	}
	
	void crying() {
		System.out.println("고양이 "+this.name+"이/가"+this.cry+"하고운다.");
	}
	
	
	
	
}
