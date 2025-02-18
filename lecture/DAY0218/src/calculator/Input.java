package calculator;

public class Input {
	int a;
	int b;
	
	// 생성자 메서드
	public Input(int a,int b) {
		this.a=a;
		this.b=b;

		System.out.printf(" %d 와 %d 가 입력되었습니다. %n", this.a,this.b);
		
	}


	
	// getter,setter

	public void getA() {
		System.out.printf(" 첫번째 숫자는 %d 입니다. %n", this.a);
	}

	public void setA(int a) {
		this.a = a;
		System.out.printf(" 첫번째 숫자가 %d로 변경되었습니다. %n", this.a);
	}

	public void getB() {
		System.out.printf(" 두번째 숫자는 %d 입니다. %n", this.b);
	}

	public void setB(int b) {
		this.b = b;
		System.out.printf(" 두번째 숫자가 %d로 변경되었습니다. %n", this.b);
	}





	// 인스턴스 메서드
	public void sum() {
		System.out.printf("%d + %d = %d %n",this.a,this.b,this.a+this.b);
	}
	
	public void minus() {
		System.out.printf("%d - %d = %d %n",this.a,this.b,this.a-this.b);
	}
	
	public void prod() {
		System.out.printf("%d * %d = %d %n",this.a,this.b,this.a*this.b);
	}
	
	public void div() {
		System.out.printf("%d / %d = %f %n",this.a,this.b,(float)this.a/this.b);
	}
	
	

}
