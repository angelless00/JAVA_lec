/***********************************************
 * 제어문 - while 반복문 
 * 		- 반복횟수가 정해지지 않은 경우
 * 		- 반복 횟수가 정해진 경우
 **********************************************/
public class EX_While {

	public static void main(String[] args) {
		// 1~10 까지 출력
		int num=1;
		
		while(num<=10) {
			// 반복 실행 코드
			System.out.println(num);
			
			// 조건식에 데이터 값 업데이트: 없으면 무한 반복
			num++;
		}

	}

}
