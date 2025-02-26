package com.pay;

//------------------------------------------
// NAME : PayInterface
// METHOD : pay, refund,
//------------------------------------------

public interface PayInterface {
	public abstract boolean pay (int amount);
	public abstract boolean cancel (int amount);
	public abstract boolean refund (int amount);

}
