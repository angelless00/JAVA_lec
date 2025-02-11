/*******************************************************
 * 데이터 타입 별 초기화 값
 * - 지역 변수 즉, 메서드 안에 있는 변수는 반드시 초기화 해야 함!
 ********************************************************/
public class EX_01 {

	public static void main(String[] args) {
		// 타입별 변수 선언 및 초기화
		byte num1=0;		// 1바이트 메모리1칸
		short num2=0;		// 2바이트 메모리2칸
		int num3=0;			// 4바이트 메모리 4칸
		long num4=0;		// 8바이트 메모리 8칸
		
		float fnum1=0.0f;	// 4바이트 메모리 4칸
		double fnum2=0.0;	// 8바이트 메모리 8칸
				
		boolean bOK=false; 	// 1바이트 메모리 1칸 (true 나 false만 가능)	
				
		char cdata=0;		// 2바이트 메모리 2칸
		String sdata=null;	// 4바이트 메모리 4칸 (heap에 메모리 주소 데이터 저장)
		
		

	}

}
