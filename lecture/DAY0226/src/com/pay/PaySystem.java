package com.pay;

import java.util.Scanner;

/*********************************************
 * 결제시스템 구현
 * - 사용자로 부터 결제 방식 선택 받기 => 메서드
 * - 선택 방식에 따른 결제 진행 => 메서드
 ******************************************/

public class PaySystem {
	// Class Member Field/Attribute/Variable--------
	public final static int CARD=1;
	public final static int PAY=2;
	public final static int etc=3;
	
	
	// Class/Static Method------------------------
	//-----------------------------------------------
	// 메서드기능 : 사용자로부터 결제 방식 선택 받은 후 반환
	// 메서드이름 : selectpayType
	// 매개변수들 : 없음
	// 메서드결과 : 카드,페이,나머지에 대한 정수값 int
	//-----------------------------------------------
	public static int selectPayType() {
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("결제 방식 선택");
		System.out.println("1.신용카드");
		System.out.println("2.페이");
		System.out.println("3.기타");
		System.out.print("입력 : ");
		
		int type=in.nextInt();
		in.close();
		return type;
		
		
	}
	//-----------------------------------------------
	// 메서드기능 : 선택방식에 따른 결제 진행
	// 메서드이름 : payProcess
	// 매개변수들 : PayInterface
	// 메서드결과 : 결제여부 boolean
	//-----------------------------------------------
	public static boolean payProcess(PayInterface p, int amount) {
		return p.pay(amount);
	}
	
	
	
	
	
	// Entry Point Method-------------------------
	public static void main(String[] args) {
		// 결제방식 선택
		int payType=PaySystem.selectPayType();
		
		switch(payType)
		{
		case PaySystem.CARD:
			CreditCard card=new CreditCard("삼성","보너스카드","154325146","2028-03",1000);
			PaySystem.payProcess(card, 280);
			break;
		case PaySystem.PAY: 
			NPay gsPay=new NPay("GSPay");
			// PayInterface 타입 <= NPay 인스턴스 전달 가능 OK 이유: PayInterface implement 하고 있음
			PaySystem.payProcess(gsPay, 300);
			break;
		
		default:			
			System.out.println("결제불가입니다");
			break;
		}
		
		System.out.println("END");
		
		
		
		

	}

}
