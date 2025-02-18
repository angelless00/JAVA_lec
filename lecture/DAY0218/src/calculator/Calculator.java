package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요 (ex. 3 4) :");
		int a=data.nextInt();
		int b=data.nextInt();
		
		// 데이터 입력
		Input s1=new Input(a,b);
		
		s1.sum();
		s1.prod();
		s1.minus();
		s1.div();
		
		s1.setA(7);
		s1.sum();
		s1.prod();
		s1.minus();
		s1.div();
	}

}
