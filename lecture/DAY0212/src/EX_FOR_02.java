/********************************************************
 * 제어문 -반복문 for문
 * for (반복시작;반복중단조건;증감)
 * {
 * 		반복 코드;
 * }
 ********************************************************/
public class EX_FOR_02 {

	public static void main(String[] args) {
		// 10~100까지 10단위로 출력 =? 10 20 30 ~ 100
		for (int idx=10;idx<=100;idx+=10)
		{
			System.out.println(idx);
		}
		
		// 10,9,8,...,1 까지 다운카운팅 출력
		for (int idx=10;idx>0;idx--)
		{
			System.out.println(idx);
		}
	}

}
