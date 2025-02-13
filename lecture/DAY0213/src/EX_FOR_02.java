/***************************************************
 * 제어문 - for 반복문
 ***************************************************/
public class EX_FOR_02 {

	public static void main(String[] args) {
		// 구구단 출력 - 3단 출력
		for (int n=1;n<10; n++) {
			System.out.printf("3 * %d = %d\n",n,3*n);
		}
		
		// 구구단 2단 ~ 9단 출력
		for (int dan=2;dan<10;dan++) {
			System.out.printf("[%d단]\n", dan);
			for(int n=1; n<10;n++) {
				System.out.printf("%d * %d = %d%n",dan,n,dan*n);
			}
		}

	}

}
