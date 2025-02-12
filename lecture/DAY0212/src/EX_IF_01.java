/**********************************************
 * 제어문 - 조건문 
 *********************************************/
public class EX_IF_01 {

	public static void main(String[] args) {
		// 짝수 홀수 구분
		int num=11;
		
		// 짝수 홀수 여부 출력
		if (num%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		// 짝수 홀수 여부 출력
		if (num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		// 들여쓰기 중요하지 않음!
		
		
		// 삼항연산자 ? :
		String msg=(num%2==0)?"짝수":"홀수";
		System.out.println(msg);
	}

}
