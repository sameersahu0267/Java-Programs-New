
class Circle{
	
	int radius;
	
	Circle(int r){
		radius = r;
	}
	
	double area() {
		double a = Math.PI * radius * radius;
		return a;
	}
}

class Cylinder extends Circle{
	
	int height;
	
	Cylinder(int h,int r){
		super(r);
		height = h;
	}
	
	double area() {
		double a = Math.PI * radius * radius * height;
		return a;
	}
}

public class C29Inheritance2 {

	public static void main(String[] args) {
		// Inheritance Questions

		Circle obj1 = new Circle(10);
		System.out.println("Area of Circle : "+ obj1.area());
		
		Cylinder obj2 = new Cylinder(10,5);
		System.out.println("Area of Cylinder : "+ obj2.area());
	}

}
