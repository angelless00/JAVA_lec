/****************************************************
 * 제어문 - continue 문
 * 	      반복을 중단하고 다음 반복으로 진행 시킴
 * 		  아래쪽 코드 실행되지 않음
 * 		 - 주의 :  while/ do~while 문에서는 무한반복에 빠질 위험이 있음 
 * 						⇒ countinue 전에 증감처리 필수!
 ****************************************************/
public class EX_Continue {

	public static void main(String[] args) {
		// 1~10 범위에서 2의 배수만 출력하세요
		
		// for문과 continue문
		//		  1    2 <---3
		for (int n=1;n<=10; n++) {
			if (n%2==1) continue; // 3번의 n++로 이동
			
			System.out.println(n);// 조건문이 거짓일때
		}
		
		
		// while문과 continue문
		int count=0;
		// 		1번
		while(count<=10) {
			count++;
			if (count%2==1) continue; //1번으로 이동
			
			System.out.println(count);// 조건문이 거짓일때
		}
		
		
		// do~while 문과 continue문
		int value=0;
		do {
			value++;
			if (value%2==1) continue;
			System.out.println(value);
		}while(value<10);

	}

}
