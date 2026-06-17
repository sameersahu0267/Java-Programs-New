
class Parent2{
	Parent2(){
		System.out.println("Parent Class Constructor");
	}
	Parent2(int n){
		System.out.println("Parent Class : "+ n);
	}
}

class Child2 extends Parent2{
	Child2(){
		// By Default Call super()
		System.out.println("Child Class Constructor");
	}
	
	Child2(int n){
		super(n);
		System.out.println("Child Class : "+ n);
	}
}

class GrandChild2 extends Child2{
	GrandChild2() {
		// By Default Call super()
		System.out.println("Grand Child Class Constructor");
	}
	
	GrandChild2(int n){
		super(n);
		System.out.println("Grand Child Class : "+ n);
	}
}
public class C24CnstrInheritance {

	public static void main(String[] args) {
		// Constructor Inheritance in Java

		GrandChild2 o1 = new GrandChild2();
		GrandChild2 o2 = new GrandChild2(10);
		
	}

}
