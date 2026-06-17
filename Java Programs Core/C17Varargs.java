
public class C17Varargs {
	
	int sum(int ...arr) {				// Recieving Arguments as Array
		int s = 0;
		for(int n : arr) {
			s += n;
		}
		return s;
	}
	
	int mul(int x, int ...arr) {		// Pass Atleast One Argument
		int m = x;
		for(int n : arr) {
			m *= n;
		}
		return m;
	}

	public static void main(String[] args) {
		
		// Variable Arguments in Java
		C17Varargs obj = new C17Varargs();
		
		System.out.println("Sum of 10, 20 and 30 is : " + obj.sum(10,20,30));
		System.out.println("Sum of nothing is : " + obj.sum());
		System.out.println("Product of 5, 10, 15, 20 is : " + obj.mul(5,10,15,20));
		System.out.println("Product of 5 is : " + obj.mul(5));
		
	}

}
