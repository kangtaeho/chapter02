package person;

public class PersonTest {

	public static void main(String[] args) {
		Student s =new Student();		
		Student s2 = new Student("둘리"); //파라미터에 상관없이 기본생성자 호출함 

		
		Person p = s; //Upcasting (업캐스팅
		Student s3 =(Student)p; // 다운 캐스팅
		
		//
		//레퍼런스 p로 객체의 기능을 사용하다가...
		
		//(Student)p.age test(); 오류
		((Student)p).test(); 
	}

}
