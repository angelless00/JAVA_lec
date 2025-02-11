/***************************************************
 * 타입 캐스팅(Casting) / 형변환
 * - 작은 데이터 >> 큰 데이터로 변환 : 자동 진행 (묵시적 형변환)
 * - 큰 데이터 >> 작은 데이터 변환 : (데이터 손실이 있을수도 있으므로)개발자가 선택 강제 형변환 (명시적 형변환) 
 ****************************************************/
public class EX_04 {

	public static void main(String[] args) {
		// 변수 선언 및 초기화
		int num=0x12c;
		double dnum=1.98;
		
		// 화면에 출력
		// 정수 ==> 정수 형변환 : 큰데이터를 작은 데이터로 변환, 데이터 손실 발생
		System.out.println(num);
		System.out.println((byte)num);	// (타입명)숫자
		
		// 실수 ==> 정수 형변환 : 소수점 이하 버림, 데이터 손실 발생
		System.out.println(dnum);
		System.out.println((byte)dnum);	// (타입명)숫자
	}

}
