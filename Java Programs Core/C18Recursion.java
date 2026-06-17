public class C18Recursion {

	int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		// Recursion : Function Calling itself

		C18Recursion obj = new C18Recursion();
		
		int f = obj.factorial(5);
		System.out.println("Factorial of 5 is : "+f);
	}

}
