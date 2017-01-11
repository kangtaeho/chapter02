package person;

public class Student extends Person {
	
	public Student(){
		System.out.println("생성자호출");
	}
	
	public Student(String name){
		//명시하지 않으면 [기본생성자가 자동으로 호출 된다] 그래서
		//super();가 자동으로 끼어 들어간다
		
		super(name);
		System.out.println("Student String 호출");
		
		//부모 생성자를 명시할 경우에는 반드시 맨 앞에 한다.
		//super(); 뒤에 달면 오류뜸 
	}
	
	public void test(){
		//부모의 public 속성 접근
		name = "둘리";
		
		//부모의 protected 속성접근
		height =130;
		
		//부모의  default 속성접근(단 같은 패키지 애서만)
		age = 30;
		
		//부모의 private 속성 접근
		//weight=30;
		
		}

}
