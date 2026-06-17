
interface Area1{
	double pi = 3.14;
	void myArea();
}

class Rectangle implements Area1{
	public void myArea() {
		int l = 5;
		int b = 8;
		System.out.println("Area of Rectangle : "+ l*b);
	}
}

class Circle implements Area1{
	public void myArea() {
		int r = 10;
		System.out.println("Area of Circle : "+ pi*r*r);
	}
}

public class Interfaces2 {

	public static void main(String[] args) {
		// Interface Implementation
		
		Rectangle r1 = new Rectangle();
		r1.myArea();
		
		Circle c1 = new Circle();
		c1.myArea();

	}

}
