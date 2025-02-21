package Zoo;

public class Dog extends Zoo {
	String cry;
	//생성자
	//Default 생성자
	Dog(){}
	
	Dog(String name){
		this(name,"멍멍");
	}
	
	Dog(String name, String cry){
		super(name);
		this.cry=cry;
		System.out.println("강아지 " + this.name);
	}
	
	// 메서드
	
	void tailing() {
		System.out.println("강아지 "+this.name+"꼬리친다.");
	}
	
	void bark() {
		
		System.out.println("강아지 "+this.name+"이/가"+this.cry+"하고운다.");
	}
	
	
	
	
}
