/****************************************************
 * 3차원 배열 선언 및 활용
 ****************************************************/
public class EX_ThreeArray {

	public static void main(String[] args) {
		// 3차원 배열 선언 및 초기화
		int intArray[][][];
		
		intArray=new int[3][2][3];	// 0으로 초기화
		
		// 배열에서 원소 갯수 파악 속성 => length
		System.out.println("intArray.length :" +intArray.length+"개");
		System.out.println("intArray[0].length :" +intArray[0].length+"개");
		System.out.println("intArray[0][0].length :" +intArray[0][0].length+"개");

	}

} 
