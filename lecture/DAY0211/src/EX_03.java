/***************************************************
 * 리터럴 : 데이터 그대로의 의미
 * - 숫자 사이에 '_' 삽입 = > 사람을 위한 가독성
 * - 바이트 코드 변환 시에는 무시됨
 ****************************************************/
public class EX_03 {

	public static void main(String[] args) {
		// 숫자와 '_'
		int jumin=2010_1212;
		int num=0b010101_00011;
		int age=2__5;
		//int jumsu=100_; // 숫자 사이에서만 _ 가능함!
		//long maxvalue=1000_L;	// 불가능!
		//int jumsu=0b_1010;	// 불가능!
		
		
		// 화면 출력
		System.out.println(jumin);
		System.out.println(num);
		System.out.println(age);
		

	}

}
