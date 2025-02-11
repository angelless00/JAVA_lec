/***************************************************
 * 리터럴 : 데이터 그대로의 의미
 * - 정수 리터럴 : 5, 8, ..., 2진수, 8진수, 16진수
 * - 실수 리터럴 : 8.5F, 8.5f, 8.5(double), 8.5D, 8.5d
 ****************************************************/
public class EX_02 {

	public static void main(String[] args) {
		// 리터럴 데이터 표기법
		int num ;
		num =17;	// 10진수	
		num=0b11;	// 0b 2진수
		num=017;	// 0 8진수
		num=0x17;	// 0x 16진수
		
		long value;
		value=100;	// 8바이트 메모리 8칸
		value=100L;	// 숫자L, 숫자l (안적어도 됨! but, 자료형 확실히 표현하기 위해)
				
		double d;
		d=0.1234;			// 일반적인 실수 표기법
		d=1234E-4;			// 과학적/지수 표기법
		d=.1234D;			// 숫자D,숫자d 
		
		//float f =0.1234;	// 실수의 기본 기준은 double이므로 double로 인식
		float f =0.1234f;	// f나 F를 적어야 float로 인식!
		
		char c='A';			// 2바이트 메모리 2칸 UNICODE
		c='\u0041';			// 유니코드 코드값 표현
		
		// 화면에 출력
		System.out.println(num);
		System.out.println(value);
		System.out.println(d);
	
	}

}
