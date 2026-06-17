
class Outer2{
	
	void display() {
		
		class Inner2{
			
			void show() {
				System.out.println("Local Inner Class");
			}
		}
		
		Inner2 in = new Inner2();
		in.show();
	}
}

public class C37LocalIC {

	public static void main(String[] args) {
		// Local Inner Class in Java

		Outer2 out = new Outer2();
		out.display();
		
	}

}
