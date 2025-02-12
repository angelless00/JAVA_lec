/*****************************************************************
 * 연산자 - 비교연산자 & 논리연산자
 * 
 ******************************************************************/
public class EX_OP01 {

	public static void main(String[] args) {
		// 비교연산자
		int num1=30;
		int num2=7;
		
		// 비교 연산 결과 화면
		System.out.printf("%d > %d : %b %n",num1,num2,num1>num2);
		System.out.printf("%d < %d : %b %n",num1,num2,num1<num2);
		System.out.printf("%d >= %d : %b %n",num1,num2,num1>=num2);
		System.out.printf("%d <= %d : %b %n",num1,num2,num1<=num2);
		System.out.printf("%d == %d : %b %n",num1,num2,num1==num2);
		System.out.printf("%d != %d : %b %n",num1,num2,num1!=num2);
		
		// 논리 연산 결과 화면 출력
		// '그리고' 논리 연산자 &&
		/*
		 * num1이 짝수이면서 30이하 숫자인지 여부
		 * -num1 % 2 ==0 짝수, num1 % 2 ==1 홀수
		 * -num1 <=30
		 */
		System.out.println(num1 % 2 ==0);
		System.out.println(num1<=30);
		System.out.printf("and 논리연산자 && : %b %n",(num1%2==0) && (num1 <=30));
		System.out.printf("and 논리연산자 && : %b %n",(num1%2==1) && (num1 <=30));
		
		// '또는' 논리 연산자 ||
		System.out.printf("or 논리연산자 || : %b %n",(num1%2==0) || (num1 <=30));
		System.out.printf("or 논리연산자 || : %b %n",(num1%2==1) || (num1 <=30));
		System.out.printf("or 논리연산자 || : %b %n",(num1%2==0) || (num1 >=30));
		System.out.printf("or 논리연산자 || : %b %n",(num1%2==1) || (num1 >30));
		
		// XOR 논리 연산자 : ^
		// 둘다 같은 결과 즉, true 이거나 false 이면 거짓
		System.out.printf("xor 논리연산자 ^ : %b %n",(num1%2==0) ^ (num1 <=30));
		System.out.printf("xor 논리연산자 ^ : %b %n",(num1%2==1) ^ (num1 <=30));
		System.out.printf("xor 논리연산자 ^ : %b %n",(num1%2==0) ^ (num1 >30));
		System.out.printf("xor 논리연산자 ^ : %b %n",(num1%2==1) ^ (num1 >30));
		
		// NOT 논리 연산자 : ! 현재 결과의 반대 Toggle
		System.out.printf("Not 논리연산자 ! : %b %n",!(num1%2==0));
		System.out.printf("Not 논리연산자 ! : %b %n",!(num1%2==1));
		
		// num1이 30대인지 체크 => 30~39
		//System.out.printf("num1은 30대? %d %n",30<=num1<40);	//문법에러
		System.out.printf("num1은 30대? %b %n",(30<=num1) && (num1<40));
		
	}

}
