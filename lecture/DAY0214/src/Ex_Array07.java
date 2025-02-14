/****************************************************
 * 배열(Array) 선언 및 활용
 * 2차원 배열 => 행과 열로 구성
 * 		   => 타입명[][] 변수명;
 * 			  타입명 변수명 [][];
 *****************************************************/
public class Ex_Array07 {

	public static void main(String[] args) {
		// 2차원 배열 객체 생성 및 초기화
		// 2행 3열 2차원 배열, 모두 정수
		int [][] numArray = new int [2][3];
		
		System.out.println("numArray       => " +numArray);
		System.out.println();
		System.out.println("numArray[0]    => "+numArray[0]);
		System.out.println("numArray[0][0] => "+numArray[0][0]);
		System.out.println();
		System.out.println("numArray[1]    => "+numArray[1]);
		System.out.println("numArray[1][0] => "+numArray[1][0]);
		System.out.println();
		System.out.println("numArray 길이 : " +numArray.length);
		System.out.println("numArray[0] 길이 : " +numArray[0].length);
		
	}
		
	

}
