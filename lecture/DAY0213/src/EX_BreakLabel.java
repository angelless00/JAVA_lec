/***********************************************
 * 제어문 - 라벨문
 * 		  가장 가까이 있는 반복문만 종료함
 *		  중첩의 경우 가장 가까이 있는 반복문만 종료함
 ***********************************************/
public class EX_BreakLabel {

	public static void main(String[] args) {
		// 중첩 반복문과 break문
		
		// 구구단
		// 반복문 모두 중단
		LABEL:
		for (int dan=2; dan<10; dan++) 
		{
			for (int n=1; n<10; n++) 
			{
				if ((dan*n)%7==0) {
					System.out.println("---END---");
					break LABEL;
				}
				System.out.printf("%d * %d = %d %n", dan,n,dan*n);
			}
		}
		
		System.out.println("OK");

			
	}

}
