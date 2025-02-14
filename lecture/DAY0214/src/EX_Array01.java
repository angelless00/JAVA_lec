/****************************************************
 * 배열(Array) 선언 및 활용
 * : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
 *****************************************************/
public class EX_Array01 {

	public static void main(String[] args) {
		// 일반 변수와 배열 저장 변수
		
		int kor, math, eng, art, music;
		int sci,dance,com,visual, social;
		
		// 1개 변수명으로 10과먹 점수를 저장 => 배열(Array)
		// 배열 선언
		int[] jumsu1;
		int jumsu2[];
		
		// 배열 생성 및 저장
		// 메모리 힙 영역에 주소를 저장함.
		jumsu1=new int[5];
		
		// 출력하기
		System.out.println("jumsu1 : "+jumsu1);
		// java에서는 한쪽만 String이어도 + 가능
		
		jumsu2=new int[3];
		
		System.out.println("jumsu2 : "+jumsu2);
		


	}

}
