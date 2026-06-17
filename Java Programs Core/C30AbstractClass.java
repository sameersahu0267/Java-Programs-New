
abstract class Parent{
	Parent(){
		System.out.println("Abstract Parent Class Constructor");
	}
	
	abstract void greet();
	
	void greet2() {
		System.out.println("Concrete Method");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Class Constructor");
	}
	
	void greet() {
		System.out.println("Hello I am Child Class");
	}
}

public class C30AbstractClass {

	public static void main(String args[]) {
		// Abstract Class in Java
		
		Child c = new Child();
		c.greet();
		c.greet2();
	}
}
