/****************************************************************
 * 제어문 - 조건문 다중 IF
 ****************************************************************/
import java.util.Scanner;
public class EX_IF_02 {

	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int jumsu=data.nextInt();
		
		// 학점 출력
		if (jumsu>=90)
			System.out.printf("%d - %s %n",jumsu,'A');
		else if (jumsu>=80)
			System.out.printf("%d - %c %n",jumsu,'B');
		else if (jumsu>=70)
			System.out.printf("%d - %c %n",jumsu,'C');
		else if (jumsu>=60)
			System.out.printf("%d - %c %n",jumsu,'D');
		else
			System.out.printf("%d - %c %n",jumsu,'F');

		// 키보드 입력 연결 해제
		data.close();
	}

}
