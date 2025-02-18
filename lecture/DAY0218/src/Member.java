/******************************************
 * 클래스역할 : 회원정보 클래스
 * 클래스속성 : id, pw, name, age, gender, job, address, phone
 * 클래스행동 : 정보출력기능, 
 ******************************************/
public class Member {
	
	// 멤버 속성
	String id;
	String pw;
	String name;
	int age;
	String phone;
	char gender;
	String job;
	String address;
	//---------------------------------------
	// 생성자 메서드 : 속성 초기화
	//---------------------------------------
	
	Member(){
		// defalut 생성자
		id = "unknown";
		pw = "unknown";
		name = "unknown";
		age = 0;
		phone = "unknown";
		gender = 'N';
		job = "unknown";
		address= "unknown";
	}
	
	Member(String id_,String pw_){
		//속성명 = 저장할 값;
		id=id_;
		pw=pw_;
	}
	
	Member(String id_,String pw_,String name_,String phone_){
		//속성명 = 저장할 값;
		id=id_;
		pw=pw_;
		name=name_;
		phone=phone_;
		
	}
	
	Member(String id_,String pw_, String name_,int age_,
			String phone_, char gender_,String job_,String address_){
		//속성명 = 저장할 값;
		id=id_;
		pw=pw_;
		name=name_;
		age=age_;
		phone=phone_;
		gender=gender_;
		job=job_;
		address=address_;
	}
	
	// 멤버/인스턴스 메서드
	/************************************
	 * 메서드이름 : showInfo
	 * 매개변수들 : 없음
	 * 메서드결과 : 없음 void
	 *********************************/
	void showInfo() {
		System.out.println("=============================");
		System.out.println("회원이름 : "+name);
		System.out.println("전화번호 : "+phone);
		System.out.println("=============================");
	}
}
