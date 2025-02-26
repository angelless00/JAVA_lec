package com.pay;

public class NPay implements PayInterface {
	private String name;

	// constructor Method -------------------------------
	public NPay() {}
	public NPay(String name) {
		this.name=name;
	}
	
	
	// PayInterface's Override Method---------------------
	@Override
	public boolean pay(int amount) {
		System.out.println("["+this.name+"]"+amount+"원 결제");
		return false;
	}

	@Override
	public boolean cancel(int amount) {
		System.out.println("["+this.name+"]"+amount+"원 결제취소");
		return false;
	}

	@Override
	public boolean refund(int amount) {
		System.out.println("["+this.name+"]"+amount+"원 환불");
		return false;
	}

}
