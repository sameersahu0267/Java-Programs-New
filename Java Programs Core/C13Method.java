public class C13Method {
	
	static int sum(int x, int y) {						// Creating Method (with static keyword)
		return x+y;
	}
	
	static int mul(int x, int y) {						// Creating Method (with static keyword)
		return x*y;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		int c , d;
		
		c = sum(a,b);
		System.out.println("Sum is " + c);
		d = mul(a,b);
		System.out.println("Product is " + d);
	}
}
