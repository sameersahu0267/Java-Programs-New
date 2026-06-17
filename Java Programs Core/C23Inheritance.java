
class Parent1{
	int x = 10;
	void m1() {
		System.out.println("Parent Class Method");
	}
}

class Child1 extends Parent1{
	int y = 20;
	void m2() {
		System.out.println("Child Class Method");
	}
}

public class C23Inheritance {

	public static void main(String[] args) {
		// Inheritance in Java
		
		Parent1 p = new Parent1();
		System.out.println(p.x);
		p.m1();
		
		Child1 c = new Child1();
		System.out.println(c.x);
		System.out.println(c.y);
		c.m1();
		c.m2();
	}

}
