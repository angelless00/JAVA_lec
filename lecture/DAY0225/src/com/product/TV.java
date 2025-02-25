/**
 * 클래스역할 : TV 데이터 표현 클래스
 * 클래스이름 : TV
 * 클래스속성 : 채널, 소리, 모드, 크기 => 인스턴스 생성시 초기화 후 변경 x
 * 			제조국   => 고정 Korea
 * 클래스기능 : 채널 up/down =>  자식이 재정의
 * 			소리 up/down => 자식이 재정의
 * 			전원 on/off
 */
package com.product;

public abstract class TV {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	public static final String NATIONALITY = "KOREA";
	
	// 인스턴스 멤버 변수
	private final int CHANNEL;
	private final int SIZE;
	private final int VOLUME;
	private final int MODE;
	
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	// Default 생성자
	TV(){
		this(4,10,10,2);
	}
	
	// 생성자
	TV(int channel,int size,int volume,int mode){
		this.CHANNEL=channel;
		this.SIZE=size;
		this.VOLUME=volume;
		this.MODE=mode;
	}
		
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	
	public int getCHANNEL() {
		return CHANNEL;
	}

	public int getSIZE() {
		return SIZE;
	}

	public int getVOLUME() {
		return VOLUME;
	}

	public int getMODE() {
		return MODE;
	}
	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	abstract public int channelUpDown(boolean isUp);
	

	abstract public int volumeUpDown(boolean isUp);
	
	public void powerOn() {
		System.out.println("전원 ON");
	}
	
	public void powerOff() {
		System.out.println("전원 OFF");
	}	
	
	
	
	
	
}
