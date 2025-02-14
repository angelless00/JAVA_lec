/****************************************************
 * 배열(Array) 선언 및 활용
 * : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
 *****************************************************/
public class EX_Array02 {

	public static void main(String[] args) {
				
		// 배열 선언과 초기화
		int jumsu3[] = new int[] {5,7,9};
		
		// 출력
		System.out.println("jumsu3 : "+jumsu3);
		
		int jumsu4[]= {10,20,30,40};
		
		System.out.println("jumsu4 : "+jumsu4[1]);
		
		// 원소값 변경
		jumsu4[0]=100;
		
		System.out.println("jumsu4 : "+jumsu4[0]);
		
		
		
	}

}
