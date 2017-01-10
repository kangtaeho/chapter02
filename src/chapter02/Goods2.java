package chapter02;

public class Goods2 {
	
	public static int countOfGoods; //외부에서 접근할때 클레스에서 접근해야함(static의 사용용도)
	
	private String name;
	private int price;
	private int countStrock;
	private int countSold;
	
	public Goods2(){//이런걸 기본생성자라고 한다
		
		System.out.println(countOfGoods+"번출력");
		System.out.println("기본 생성자 호출");
		countOfGoods++;
		
	}
	
	public void setName(String name){
		this.name = name; //this의 사용 ( string의  name은 파라마터이고 this.name이 
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0){
			price=0;
		}
		this.price = price;
	}

	public int getCountStrock() {
		return countStrock;
	}

	public void setCountStrock(int countStrock) {
		this.countStrock = countStrock;
	}
	
	//리턴값은 있고 파라미터가 없는

	public int getCountSold() {
		return countSold;
	}
	
	
	//return 값이 없어, 파라미터가 있는 메소드
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
 
	public void getName(){
		this.name =name;
		
	}
	//리턴값도 없고 파라미터도 없는데 메소드 값
	public void showInfo(){
		System.out.println("name = "+name+"price = "+price+"countStock = "+countStrock+"countSold"+countSold);;
		
	}
	//리턴값도 있고 파라미터도 있는 메소드갑 
	public double calcDiscountPrice(double rate){//파라미터 =괄호안의 값
		double discountPrice = price *rate;
		return discountPrice;
	}

}
