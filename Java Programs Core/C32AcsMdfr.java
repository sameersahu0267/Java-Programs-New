
class C1{
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
}

public class C32AcsMdfr {

	public static void main(String[] args) {
		// Access Modifier in Java
		
		C1 obj = new C1();
		obj.display();
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		System.out.println("c = "+obj.c);
//		System.out.println("d = "+obj.d);

	}

}
