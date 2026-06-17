
abstract class Outer3{				// Also use it with Interface
	
	abstract void m1();
}

public class C38AnonymousIC {

	public static void main(String[] args) {
		// Anonymous Inner Class in Java
		
		Outer3 out = new Outer3() {
			void m1() {
				System.out.println("Anonymous Inner Class");
			}
		};
		
		out.m1();

	}

}
