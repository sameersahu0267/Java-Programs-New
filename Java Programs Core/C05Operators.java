public class C05Operators {

	public static void main(String[] args) {
		// Operators in Java
		int a = 40;
		int b = 25;
		
		System.out.println("Arithmetic Operators");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("Assignment Operators");
		int c = a;
		b += 10;
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("Comparision Operators");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("Logical Operators");
		System.out.println(a>b && b>c);
		System.out.println(a>b || b>c);
		System.out.println(!(a>b));
		
		System.out.println("Bitwise Operators");
		int x = 2;
		int y = 3;
		System.out.println(x&y);
		System.out.println(x|y);
		
		System.out.println("Increment & Decrement Operators");
		System.out.println(x++);				// Post Increment
		System.out.println(++x);				// Pre Increment
		System.out.println(y--);				// Post Decrement
		System.out.println(--y);				// Pre Decrement
		
	}

}
