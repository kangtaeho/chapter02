package Mypackage;

import chapter02.Goods;

public class SpecialGoods extends Goods{
	
	void test(){
		
		//private는 자식에서도 접근할수 없어서 name이 오류
		//name = "canon"
		
		//protected는 자식에서도 접근 가능하다.(중요)
		price = 20000;
		
		//public은 자식에서도 접근이 가능하다.
		countStock = 20;
	}

}
