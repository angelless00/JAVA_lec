/**
 * 클래스 테스트 용
 */
public class Test {

	public static void main(String[] args) {
		// Point 인스턴스 생성
//		Point p1=new Point();
//		p1.drawingPoint();
		
		// ColorPoint 인스턴스 생성
		ColorPoint cp1=new ColorPoint(10,50,"red");
		
		cp1.drawingColor();
		cp1.drawingPoint();
		
		// getInfo()는 부모클래스, 자식클래스 2군데 모두 존재
		//		=> 자기클래스 내의 메서드 실행
		System.out.println(cp1.getInfo());
		
		
//		
//		// 속성사용
//		cp1.setX(50);
//		cp1.setY(30);
//		
		
		
	}

}
