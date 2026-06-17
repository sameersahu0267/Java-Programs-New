
abstract class Abs{
	
	Abs(){
		System.out.println("Abstract Class Constructor");
	}
	
	abstract void callme();
	
	void callmetoo() {
		System.out.println("Instance or Concrete Method");
	}
}

public class AbstractClass extends Abs{
	
	AbstractClass(){
		System.out.println("Sub-Class Constructor");
	}
	
	void callme() {
		System.out.println("Definition of Abstract Method");
	}
	
	public static void main(String[] args) {
		
		// Abstract Class in Java
		AbstractClass obj = new AbstractClass();
		
		obj.callme();
		obj.callmetoo();
		
	}	
}
