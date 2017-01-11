package paint;

public class ColorPoint extends Point {
	
	private String color; //은닉화를 위해 프라이빗으로

	public ColorPoint (int x, int y, String color){
		
		setX(x); //부모한테 물려받았으니깐 사용가능
		setY(y);
		
		this.color=color;
		
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override //그냥 오버라이드 체크 해주는것 (가독성을 좋게 해주기 위해서)
	public void show() {
		
		System.out.println("x = "+getX()+" , "+"y = "+getY()+", color = "+ color);
		
	}
	
	
}
