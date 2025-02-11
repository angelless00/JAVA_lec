
public class GOOD {
	// public class 안에 public static void main()메서드 존재
	// 실행 시 진입 메서드
	public static void main(String[] args) {
		// 메서드 안에 존재하는 변수 => 지역변수 (Local Variable)
		// [변수 선언] 타입명 변수명;
		// [변수 초기화] 변수명 = 데이터 ;
		int age;
		age = 10;
		
		// [변수 선언 + 초기화] 타입명 변수명 = 데이터 ;
		char gender='F';
		// 문자 한개 일때는 "" 안됨! '' 만 가능!
				
		// 화면에 출력
		System.out.println(age);
		System.out.println(gender);
		
		System.out.println(sum(5,7));
		}
		//사용자 정의 메서드
		// 매개 변수 : int n, int m 2개정수
		// 반 환 값 : int
		public static int sum(int n,int m) {
			return n+m;
		}

}
