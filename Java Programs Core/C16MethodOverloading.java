
public class C16MethodOverloading {
	
	// Same Method Name but Different Parameters
	
	void area(int s) {
		int ar1 = s * s;
		System.out.println("Area of Square : "+ar1);
	}
	
	void area(int l,int b) {
		int ar2 = l * b;
		System.out.println("Area of Rectangle : "+ar2);
	}
	
	void area(double r) {
		double ar3 = 3.14 * r * r;
		System.out.println("Area of Circle : "+ar3);
	}
	
	public static void main(String[] args) {
		
		// Method Overloading
		
		C16MethodOverloading obj = new C16MethodOverloading();
		obj.area(5);
		obj.area(10,8);
		obj.area(4.5);

	}

}
