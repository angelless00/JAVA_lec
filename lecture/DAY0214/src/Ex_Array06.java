/****************************************************
 * 배열(Array) 선언 및 활용
 * : 순차적으로 들어 있는 데이터 추출에 유용한 for-each 구문
 * for(타입 변수명 : 배열명)
 * - 변수명 : 배열의 원소가 순서대로 1개씩 저장됨
 *****************************************************/
public class Ex_Array06 {

	public static void main(String[] args) {
		// 배열 객체 생성 및 초기화
		int values[]=new int[] {1,3,5,7,9,11};
		
		// 배열 안에 모든 원소 출력 - (1) 일반 for 문
		for (int idx=0; idx < values.length;idx++)
			System.out.printf("%d번째 원소 = %d %n", idx,values[idx]);
		
		// 배열 안에 모든 원소 출력 - (2) for-each문
		for (int v:values)
		{
			System.out.printf("values의 원소 - %d %n",v);
		}
		
		//---------------------------------------
		// => 문자열 배열
		//---------------------------------------
		// 계절이름을 저장 후 하나씩 출력하기
		String seasonArr[]= {"초봄","봄","초여름","여름","늦여름","가을","늦가을","겨울","한겨울"};
		
		// 인덱스로 원소 하나하나 읽어오기
		for (int idx=0; idx<seasonArr.length; idx++)
			System.out.println(seasonArr[idx]);
		
		// 원소를 순서대로 하나씩 가져오기
		for (String name : seasonArr)
			System.out.println(name);
	}
		
	

}
