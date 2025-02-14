/****************************************************
 * 배열(Array) 선언 및 활용
 * : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
 *****************************************************/
public class Ex_Array03 {

	public static void main(String[] args) {
		// 정수 5개 저장하는 배열 선언 및 생성
		int[] nums=new int [5];
		
//		// 원소값 확인
//		System.out.println("0번원소 : " + nums[0]);
//		System.out.println("1번원소 : " + nums[1]);
//		System.out.println("2번원소 : " + nums[2]);
//		System.out.println("3번원소 : " + nums[3]);
//		System.out.println("4번원소 : " + nums[4]);
		
		for (int idx=0; idx<5; idx++)
		{	
			nums[idx]=idx*idx;
			System.out.printf("%d번 원소 : %d %n",idx,nums[idx]);
		}
	}

}
