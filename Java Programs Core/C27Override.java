
class Human{
	
	void eat() {
		System.out.println("Human is Eating");
	}
}

class Boy extends Human{
	
	@Override
	void eat() {
		System.out.println("Boy is Eating");
	}
}

public class C27Override {

	public static void main(String[] args) {
		// Method Overriding in Java
		
		Human h1 = new Human();
		h1.eat();
		
		Boy b1 = new Boy();
		b1.eat();
	}

}
