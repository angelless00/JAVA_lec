/*************************************************************
 * 형식지정 (format) print
 * - System.out.printf(" %알파벳 ",  데이터 )
 * - 형식지정 문자
 * 	%d		- 10진수 정수 int
 * 	%x		- 16진수 int
 * 	%o		- 8진수 int
 * 	%s		- 문자열 String
 * 	%f		- 실수 float
 * 	%c		- char
 * 	%n		- 줄바꿈 기능
 **************************************************************/
public class EX_06 {

	public static void main(String[] args) {
		// 형식에 맞는 데이터 지정해서 출력
		int age=100;
		char gender='M';
		String name="홍길동";
		float height =190.5f;
		
		// 출력하기
		System.out.printf("이름은 %s, 나이 %d, 키 %f , 성별 %c 입니다.",name,age,height,gender);
		System.out.println("END");
		
		System.out.printf("이름은 %s \n",name);
		System.out.println("줄바꿈");
		
		System.out.printf("나이 %d, %x %b %n",age,age,age);
		System.out.println("줄바꿈");
		

	}

}
