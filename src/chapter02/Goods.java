package chapter02;

public class Goods {
	private String name;
	protected int  price;
	public int countStock;
	
	//접근지시자를 쓰지않은 것들은 다 디폴트로 된다.
	int countSold;
	
	String getName(){
		return name;
	};
	
	void discount(int percentage){
		price = price -price * percentage;
	}
}
