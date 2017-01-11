package paint;

public class Point implements Drawable{ //impements를 이용하여 인터페이스 연결  //연결하면 포인트에 빨간줄 뜨는데 그때 오버라이드 생성함녀 됨 (맨밑에 추가함)
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show(){
		System.out.println("x = " + x + ", y = "+y);
	}
	
	@Override
	public void draw() { //인터페이스를 통해서 드로우 생성
		// TODO Auto-generated method stub
		
	}

}
