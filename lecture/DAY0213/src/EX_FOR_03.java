/***********************************************
 * 반복문 - for 반복문
 *************************************************/
public class EX_FOR_03 {

	public static void main(String[] args) {
		// 구구단 가로로 출력하기
		for (int i=0;i<20;i++)
		{	
			int dan=0;
			for (dan=2;dan<=5;dan++)
			{
				if (i%10==0){
					System.out.printf("    [%d단]\t", (i<10)?dan:dan+4);
				}
				else if (i>10) {
					System.out.printf("%d X %d = %d \t ",dan+4,i-10,(dan+4)*(i-10));
				}
				else {
					System.out.printf("%d X %d = %d \t ",dan,i,dan*i);
				}
				
			}
			System.out.println();

		}

	}

}
