package com.ex02;
/*
 * 전화 걸기 받기  : PhoneInterface
 * 문자보내기 받기 MobilePhoneInterface
 * 음악 실행 :PlayerInterface
 */



public class AppPlayerInterface implements PhoneInterface, PlayerInterface {
	// Abstract Method
	void voiceRec();
	
	
	
	
	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub

	}

}
