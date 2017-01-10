package chapter02;

public class GoodsApp2 {

	public static void main(String[] args) {
		
		
		
		Goods2 goods = new Goods2();
		//camera.name = "nicok";
		
		// System.out.println(camera.getName()); //정보의 은닉화 (데이터를 프라이빗으로 만들고 겟터 셋터로 바꿔주면 됨)
		
		//객체변수에 바로 접근하면 잘못된 데이터를 세팅할 수 있는 가능성
		//goods.price=-1;
		
		goods.setPrice(-1);
		
		System.out.println(goods.getPrice());
		
		
		//static 변수테스트
		Goods2 goodsl = new Goods2();
		System.out.println(Goods2.countOfGoods);//외부에서는 이름으접근한다
		
		Goods2 goods2 = new Goods2();
		System.out.println(Goods2.countOfGoods);
		
		Goods2 goods3 = new Goods2();
		System.out.println(Goods2.countOfGoods);
		
		goods3.setName("tv");
		goods3.setPrice(5000);
		//goods3.setCountStrock("tv");
		goods3.setName("tv");
		
		
	
		
	}

}
