package com.data;
/******************************************************
 * 클래스기능 : 판매 제품 정보 저장
 * 클래스이름 : Product
 * 클래스속성 : 제품코드, 제품명, 단가, 수량
 * 클래스 메서드 : 제품정보 출력 기능
 * 			   제품코드에 따른 가격 안내 기능
 * 			   제품코드에 따른 수량 안내 기능
 *****************************************************/
public class Product {
	//-----------------------------------
	// 멤버 속성 (변수)
	//-------------------------------------
	private String code; // 제품코드
	private String pname;// 제품명
	private int price;// 단가
	private int count;// 수량
	
	//-----------------------------------
	// 생성자 메서드 오버로딩
	//-------------------------------------
	
	/**
	 * 
	 */
	public Product() {
		this("unknown","unknown",0,0);
	}
	/**
	 * @param code
	 * @param pname
	 */
	public Product(String code, String pname) {
		this(code,pname,0,0);
	}
	/**
	 * @param code
	 * @param pname
	 * @param price
	 */
	public Product(String code, String pname, int price) {
		this(code,pname,price,0);
	}
	/**
	 * @param code 제품코드
	 * @param pname
	 * @param price
	 * @param count
	 */
	public Product(String code, String pname, int price, int count) {
		this.code = code;
		this.pname = pname;
		this.price = price;
		this.count = count;
	}
	//-----------------------------------
	// getter/setter 메서드
	//-------------------------------------
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	//-----------------------------------
	// 인스턴스 메서드 : 객체 생성 후 사용가능 메서드
	//-------------------------------------
	// 제품정보 출력 기능
	// 제품 코드에 따른 가격 안내 기능
	// 제품 코드에 따른 수량 안내 기능
	/*********************************************
	 * 메서드기능 : 제품정보 출력 기능
	 * 메서드이름 : showInfo
	 * 매개변수들 : 없음
	 * 메서드결과 : void
	 * 접근지정자 : public 
	 ***********************************************/
	public void showInfo() {
		System.out.println("--------------------------");
		System.out.println("제품 코드 : "+this.code);
		System.out.println("제품 명  : "+this.pname);
		System.out.println("제품 수량 : "+this.count);
		System.out.println("제품 단가 : "+this.price);
		System.out.println("--------------------------");
	}
	
	/*********************************************
	 * 메서드기능 : 제품코드에 따른 가격 안내 기능
	 * 메서드이름 : searchPrice
	 * 매개변수들 : String code
	 * 메서드결과 : int
	 * 접근지정자 : public 
	 ***********************************************/
	public int searchPrice(String code) {
		return this.price;
	}
	
	/*********************************************
	 * 메서드기능 : 제품코드에 따른 수량 안내 기능
	 * 메서드이름 : searchCount
	 * 매개변수들 : String code
	 * 메서드결과 : int
	 * 접근지정자 : public 
	 ***********************************************/
	int searchCount(String code) {
		return this.price;
	}
}
