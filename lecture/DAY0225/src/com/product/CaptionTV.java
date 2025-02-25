package com.product;

public class CaptionTV extends TV {
	//------------------------------------------
	// 멤버 변수
	//------------------------------------------
	// 클래스 멤버 변수
	
	// 인스턴스 멤버 변수
	boolean caption;
		
	
	//------------------------------------------
	// 생성자 메서드
	//------------------------------------------
	// Default 생성자
	CaptionTV(){this(4,10,10,2,false);}
	
	// 생성자
	CaptionTV(int channel,int size,int volume,int mode,boolean caption){
		super(channel,size,volume,mode);
		this.caption=caption;
	}
	
	
	//------------------------------------------
	// Getter/Setter 메서드
	//------------------------------------------	
	
	
	

	//------------------------------------------
	// 멤버 메서드
	//------------------------------------------
	

	@Override
	public int channelUpDown(boolean isUp) {
		if (isUp==true)
			return this.getCHANNEL()+1;
		else
			return this.getCHANNEL()-1;
	}

	@Override
	public int volumeUpDown(boolean isUp) {
		if (isUp==true)
			return this.getVOLUME()+1;
		else
			return this.getVOLUME()-1;
	}
	
	public void captionONOFF() {
		if (this.caption==true) {
			System.out.println("자막 ON");
		}
		else 
			System.out.println("자막 OFF");
	}
	

}
