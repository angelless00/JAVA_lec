import java.nio.file.FileSystemNotFoundException;

/***************************************************
 * - 파일명과 public class 이름 동일해야함
 * - 실행 위해서는 public class 안에 main() 메서드 필수
 ****************************************************/

public class Good {
	// 클래스이름의 첫글자를 대문자로 씀!
	// 프로그램 실행 함수
	public static void main(String[] args) {
		
		//지역변수 선언
		int age;
		boolean isOK;
		
		// 지역변수 초기화
		age=100;
		
		// 지역변수 + 초기화
		int jumsu=89;
		
		isOK=false;
		//isOK=1		// error. boolean 은 true, false 만 가능
				
		// 변수값 변경하기
		age=9;
		age=28;
		//age=30.6		// error. 정수타입에 실수
						// 선언시의 타입과 동일한 값으로만 변경가능
		
		// 상수 선언
		final int NUM=53;
		
		final int VALUE;
		VALUE=1000;
		//VALUE=5 		// error 변경불가
		
		//모니터에 출력
		System.out.println(age);
		System.out.println(jumsu);
		System.out.print("GOOD");
		System.out.print("gg");
	}
}
