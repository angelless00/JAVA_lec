package com.pay;

public class CreditCard implements PayInterface {
	// Member Field/Attribute/Variable
	private String company;
	private String name;
	private String number;
	private String date;
	private int maxMoney;
	
	// Constructor Method ----------------------------
	public CreditCard() {
		
	}
	
	
	public CreditCard(String company, String name, String number, String datem,int maxMoney) {
		super();
		this.company = company;
		this.name = name;
		this.number = number;
		this.date = date;
		this.maxMoney=maxMoney;
	}


	// PayInterface's Override Method---------------------
	@Override
	public boolean pay(int amount) {
		if (this.maxMoney-amount <0) { 
			System.out.println("한도초과 결제불가");
			return false;}
		else {
			System.out.println(amount+"결제 완료 되었습니다");
			return true;
		}

	}

	@Override
	public boolean cancel(int amount) {
		if (this.maxMoney-amount <0) { 
			System.out.println("한도초과 결제불가");
			return false;}
		else {
			this.maxMoney+=amount;
			System.out.println(amount+"취소 되었습니다.");
			return true;
		}

	}

	@Override
	public boolean refund(int amount) {
		if (this.maxMoney-amount <0) { 
			System.out.println("한도초과 결제불가");
			return false;}
		else {
			this.maxMoney+=amount;
			System.out.println(amount+"환불 되었습니다.");
			return true;
		}

	}

}
