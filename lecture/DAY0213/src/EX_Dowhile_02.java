/***************************************************
 * 제어문 - do ~ while 반복문
 * 	 : 최소 1번은 실행되는 반복문
 ***************************************************/
public class EX_Dowhile_02 {

	public static void main(String[] args) {
		// 문자 타입과 연산
		char ch=0;	//정수
		
		System.out.println(ch+1);
		System.out.println(ch+10);

		ch='A';		// 아스키코드 값
		System.out.println(ch+1);
		System.out.println(ch+5);
		System.out.println((char)(ch+5));
		
		System.out.println('A'+'3');
		System.out.println((char)('A'+'3'));

		// a~z까지 출력
		do {
			System.out.println(ch);
			ch++;
		}while(ch<'a');
	}

}
