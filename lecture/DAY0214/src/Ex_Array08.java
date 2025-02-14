/****************************************************
 * 배열(Array) 선언 및 활용
 * 2차원 배열 => 행과 열로 구성
 * 		   => 타입명[][] 변수명;
 * 			  타입명 변수명 [][];
 * 2차원 배열 원소 => 변수명[행][열]
 *****************************************************/
public class Ex_Array08 {

	public static void main(String[] args) {
		// 2차원 배열 객체 생성 및 초기화
		// 2행 3열 2차원 배열, 모두 정수
		String [][] nameArr = new String [][] {{"홍","박","이"},
											   {"Hong","Park","Lee"}};
		
		// 원소출력
		for (int row=0; row<nameArr.length; row++)
		{
			for (int col=0; col<nameArr[row].length;col++)
			{
			System.out.println(nameArr[row][col]);
			}
		}
		
		
		
	}
		
	

}
