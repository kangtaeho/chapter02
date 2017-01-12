package kr.ac.sum.paint.main;

import ka.ac.sum.paint.Circle;
import ka.ac.sum.paint.Drawable;
import ka.ac.sum.paint.Ractangle;
import ka.ac.sum.paint.Resizable;
import ka.ac.sum.paint.Shape;

public class InstanceOfTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println((c instanceof Drawable)+"\n");
		
		//애러 (같은 분모에 있어서..?)
		//System.out.println(c instanceof Ractangle);
		
		Shape s = new Ractangle();
		
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Ractangle);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Resizable);//인터페이스는 가능하다 (원래 하이라키엔 엉뚱한게 가면 안되지만)
		
		//애러 
		//System.out.println(s instanceof String); 오류가뜬다
		
		Drawable drawable = new Circle();
		System.out.println(drawable instanceof Drawable);
		System.out.println(drawable instanceof Shape);
		System.out.println(drawable instanceof Ractangle);
		System.out.println(drawable instanceof Circle);

	}

}
