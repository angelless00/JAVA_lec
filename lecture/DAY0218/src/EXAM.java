import com.data.Product;
/***********************************************
 * 프로그램 제어 및 컨트롤 클래스
 * - 프로그램 진입점 Entry Point main() 메서드 존재
 **********************************************/
public class EXAM {

	public static void main(String[] args) {
		// 제품 인스턴스 생성
		Product p1=new Product();
		
		// 메서드 호출
		p1.showInfo();
		// 접근지정자 default => 다른 pakage 호출 볼수 없음!
		//System.out.println(p1.setCount("P001"));
		
		System.out.println(p1.searchPrice("P001"));

	}

}
