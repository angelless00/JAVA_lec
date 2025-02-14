/****************************************************
 * 배열(Array) 선언 및 활용
 * : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
 *****************************************************/
import java.util.Scanner;
public class Ex_Array04 {

	public static void main(String[] args) {
		// 사용자로 부터 세 과목 점수를 입력 받아서 배열에 저장
		// 합계와 평균을 출력
		Scanner data=new Scanner(System.in);
		
		int jumsu[]=new int[3];
		int total=0;
		
		for (int idx=0;idx<3;idx++) {
			System.out.printf(" %d 번째 점수를 입력하세요 :",idx+1);
			int jum=data.nextInt();
			total+=jum;
			jumsu[idx]=jum;
			
		}
		System.out.printf("입력한 점수는 : %d %d %d 입니다. \n" ,jumsu[0],jumsu[1],jumsu[2]);
		System.out.printf("합계는 %d , 평균은 %f 입니다.", total,(float)total/3);
		data.close();
		
		
		
	}

}
