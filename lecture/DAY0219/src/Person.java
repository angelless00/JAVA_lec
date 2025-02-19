/**
 * 클래스역할 : 사람 정보 저장 클래스
 * 클래스이름 : Person
 * 클래스속성 : gender,age,height,weight,name, loc
 */
public class Person {
	//---------------------------------------------
	// 멤버변수
	//---------------------------------------------
	// 클래스변수
	public static final String LOC="대한민국";
	
	
	private char gender;
	private int age;
	private float height;
	private float weight;
	private String name;
	//private String loc;
	
	//---------------------------------------------
	// 생성자 메서드
	//---------------------------------------------
	Person(){
		this('N',0,0.f,0.f,"unknown");
	}
	
	Person(char gender,int age,float height,float weight,String name){
		this.gender=gender;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.name=name;
		//this.loc=loc;
	}
	

	public Person(char gender, int age, String name) {
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	

	public Person(char gender, String name) {
		super();
		this.gender = gender;
		this.name = name;
	}

	//---------------------------------------------
	// Getter/Setter 메서드
	//---------------------------------------------
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}
	
	
	//---------------------------------------------
	// 멤버메서드
	//---------------------------------------------
	// 먹는다 eat, 잔다 sleep, 논다 play, 정보출력 printInfo
	/**
	 * 메서드역할 : 음식을 먹는다 메세지 출력
	 * 메서드이름 : eat
	 * 매개변수들 : 음식 String food
	 * 메서드결과 : void
	 */
	public void eat(String food) {
		System.out.println(this.name+"이/가"+food+"를 먹는다.");
	}
	
	/**
	 * 메서드역할 : 잔다 메세지 출력
	 * 메서드이름 : sleep
	 * 매개변수들 : 장소 String where
	 * 메서드결과 : void
	 */	
	public void sleep(String where) {
		System.out.println(this.name+"이/가"+where+"에서 잔다.");
	}
	
	/**
	 * 메서드역할 : 논다 메세지 출력
	 * 메서드이름 : play
	 * 매개변수들 : 무엇을 String what
	 * 메서드결과 : void
	 */
	public void play(String what) {
		System.out.println(this.name+"이/가"+what+"하고 있다.");
	}
	/**
	 * 메서드역할 : 정보출력 메세지 출력
	 * 메서드이름 : printInfo
	 * 매개변수들 : 없음
	 * 메서드결과 : void
	 */
	public void prinInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("성별 : "+this.gender);
	}
	

}