/**
 * 블록 초기화 체크
 */
public class StaticBlock {
	//---------------------------------------------
	// 멤버변수
	//---------------------------------------------
	// 클래스변수
	static int arr[]=new int[10];
	
	// 인스턴스 변수
	private String name="unknown";
	private int age=7;
	

	//---------------------------------------------
	// 생성자 메서드
	//---------------------------------------------
	StaticBlock(String name,int age){
		this.name=name;
		this.age=age;
	}
}
	
	
//	
//	// 초기화 블록
//	static
//	{
//		for (int idx=0; idx<arr.length;idx++) 
//		{
//			arr[idx]=idx*idx;	
//		}
//	}
//
//}
