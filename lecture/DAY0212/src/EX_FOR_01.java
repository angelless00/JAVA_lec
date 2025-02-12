/********************************************************
 * 제어문 -반복문 for문
 * for (반복시작;반복중단조건;증감)
 * {
 * 		반복 코드;
 * }
 ********************************************************/
public class EX_FOR_01 {

	public static void main(String[] args) {
		// 1~10 까지 화면 출력
		//		(1)		(2)		(4)	
		//				(5)
		for (int idx=1;idx<11;idx++) {
			//(3) 반복코드
			System.out.println(idx);
		}
		
		int cnt=0;
		for (cnt=1 ; cnt<11; cnt++)
		{
			System.out.println(cnt);
		}
		

	}

}
