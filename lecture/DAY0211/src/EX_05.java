/*************************************************
 * 키보드로 입력 받기
 * - 추가 패키지 필요 : java.util.Scanner 클래스
 * - 객체 생성 필요 : new Scanner(System.in)
 *************************************************/
// 패키지 로딩
import java.util.Scanner;

// 메인 클래스
public class EX_05 {

	public static void main(String[] args) {
	// Scanner 객체 생성
	Scanner scan=new Scanner(System.in);
	
	// 입력받고 싶은 요청 메세지 출력
	System.out.print("이름,나이 입력 :");
	
	// 스캐너로 가져오기(기본은 String type으로 들어오게 됨)
	String name = scan.next();
	int age=scan.nextInt();

	System.out.println(name);
	System.out.println(age);
	
	// 입력 스트림 닫기
	scan.close();
	}

}
