/****************************************************
 * 제어문 - 조건문 switch ~ case 문
 * - case문 : 정수, 문자1개, 문자열 3개만 가능함!
 ****************************************************/
public class EX_SWITCH {

	public static void main(String[] args) {
		// 학점을 출력
		int jumsu=87;
		char grade=0;
		
		switch(jumsu/10)
		{
		case 10:	// 10과 9는 공통이므로 한번만 작성해도 가능
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
			break;
				
		}
		System.out.printf("%d %c학점 %n",jumsu,grade);
	}

}
