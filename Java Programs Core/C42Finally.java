
public class C42Finally {
	
	static int divide(int a,int b) {
		int c;
		try {
			c = a / b;
			return c;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block...");
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// Finally Block in Java

		int x = divide(10,0);
		
		System.out.println("x = "+ x);
		
	}

}
