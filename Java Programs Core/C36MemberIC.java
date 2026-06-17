
class Outer1{
	int x = 10;
	class Inner1{
		void show() {
			System.out.println("Member Inner Class");
			System.out.println("x = "+x);
		}
	}
}

public class C36MemberIC {

	public static void main(String[] args) {
		// Member Inner Class in Java
		
		Outer1 out = new Outer1();
		Outer1.Inner1 in = out.new Inner1();
		
		in.show();
	}

}
