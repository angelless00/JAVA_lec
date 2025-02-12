/*****************************************************************
 * 키보드로 입력 받아서 조건에 해당 여부 결과 출력
 * - Scanner 인스턴스 생성 : 표준 입력 즉, System.in 스트림
 ******************************************************************/
import java.util.Scanner;
public class EX_TEST01 {

	public static void main(String[] args) {
		Scanner test=new Scanner(System.in);
		System.out.printf("데이터를 입력하시오.(예 : A 9 7) : ");
		
		// 1. 입력 받은 문자가 알파벳 대문자 여부
		String data=test.next();
		char data1=data.charAt(0);	// 0번째 값을 char로 바꿔줘
		
		System.out.printf("입력받은 문자가 알파벳 대문자 인가? %b %n",('A'<=data1)&& ('Z' >=data1));
		
		// 2. 입력 받은 문자가 짝수인지 여부
		int data2=test.nextInt();
		System.out.printf("입력받은 문자가 짝수인가? %b %n",(data2%2) ==0);
		
		// 3. 입력 받은 문자가 숫자 (0~9)여부
		char data3=test.next().charAt(0);
		System.out.printf("입력받은 문자가 숫자인가? %b %n",('0'<=data3)&&(data3<='9'));
		
		
		test.close();
	}

}
