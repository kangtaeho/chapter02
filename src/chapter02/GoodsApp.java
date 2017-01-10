package chapter02;

public class GoodsApp {

	static int i;
	
	public static void main(String[] args) {
			
		Goods camera = new Goods(); //객체생성(기본생성자들은 자동으로 만들어진다)
		
		
		//camera.name = "nikon"; //private를 사용해서 접근을 할 수 없음
		camera.price = 4000000; //protected는 자식에서도 접근이 가능하다
		camera.countSold = 100;
		camera.countStock = 50;
		
	}

}
