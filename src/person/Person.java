package person;

public class Person {
	
	public Person(){
		System.out.println("펄슨생성자호출");
	}
	
	public Person(String name){
		System.out.println("펄슨생성자호출");
	}
	
	public String name;
	protected int height;
	int age;
	private int weight;
	

}
