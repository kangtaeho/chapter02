package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point pt1 = new Point();
		Point pt2 = new Point();
		
		pt1.setX(100);
		pt1.setY(200);
		
		Point pt3 = new ColorPoint(500, 500, "red");
		
		Ractangle ractangle = new Ractangle();
		Circle circle = new Circle();
		
		// 그리기
		drawPoint(pt1);
		drawPoint(pt2);
		
		
		Point p =pt3;
		drawPoint(pt3);
		
		// drawRectangle(ractangle);
		
		drawShape(ractangle); //ractangle 객체가 shape을 가리키고 있음
		drawShape(circle);
		
		
		pt3.show(); //이상태로 컴파일하면 색이 나오지 않는다.. 이유는? color가 재정의 안되서(오버라이드하면 보임)

	}
	
	public static void drawShape(Shape shape){//한꺼번에 몰아서 넣기
		shape.draw();
	}
	
	public static void drawPoint(Point point){
		point.show();
	}
//	
//	public static void drawRectangle(Ractangle ractangle){
//		ractangle.draw();
//	}
//	
//	public static void drawCircle(Circle circle){
//		circle.draw();
//	}
	
	

}
