
public class Product {
	static int count =0;		// 클래스 멤버 변수
	private int serialNO;		// 인스턴스 멤버 변수
	
	// 인스턴스 초기화 블록
	{						
		++count;
		serialNO=count;
	}
	
	// 생성자
	public Product() {	}
	
	// getter메서드
	public int getSerialNo() {return this.serialNO;}
	
}
