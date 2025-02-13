/***********************************************
 * 반복문 - for 반복문
 *************************************************/
public class EX_FOR_01 {

	public static void main(String[] args) {
		// 1~10 까지 화면 출력
		for (int n=1; n<=10; n++) {
			System.out.println(n);
		}
		
		// 1~50 범위에서 3의 배수만 출력
		for (int n=3;n<=50; n+=3) {
			System.out.println(n);
		}
		for (int n=1;n<=50;n++) {
			if (n%3==0)
				System.out.println(n);
		}
	}

}
