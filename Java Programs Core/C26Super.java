
class A2{
	
	int x = 5;
	void display() {
		System.out.println("Super Class");
	}
}

class B2 extends A2{
	
	void result() {
		super.display();
		System.out.println(super.x);
	}
}

public class C26Super {

	public static void main(String[] args) {
		// super Keyword in Java
		
		B2 o1 = new B2();
		o1.result();
	}

}
