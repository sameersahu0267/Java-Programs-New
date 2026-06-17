
class Parent{
	int x = 10;
	void display() {
		System.out.println("Parent Class");
	}
	void display_x() {
		System.out.println("Value of x is "+x);
	}
}


public class SuperKeyword extends Parent {
	void display_x() {
		super.x = 50;
		super.display();
		super.display_x();
		System.out.println("The Value of x is "+super.x);
	}
	public static void main(String[] args) {
		// Super Keyword in Java
		SuperKeyword obj = new SuperKeyword();
		obj.display_x();

	}
}
