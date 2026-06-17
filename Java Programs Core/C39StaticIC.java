
class Outer4{
	
	static int x = 10;
	static class Inner4{
		void show() {
			System.out.println("x = "+x);
		}
	}
}

public class C39StaticIC {

	public static void main(String[] args) {
		// Static Inner Class in Java

		Outer4.Inner4 obj = new Outer4.Inner4();
		obj.show();
	}

}
