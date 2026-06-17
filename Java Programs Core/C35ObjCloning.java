
class Cln1{
	int x, y;
	Cln1(){
		x = 10;
		y = 20;
	}
}

public class C35ObjCloning {

	public static void main(String args[]) {
		// Object Cloning in Java
		
		Cln1 obj1 = new Cln1();
		Cln1 obj2 = obj1;
		
		System.out.println(obj1.x + " " + obj1.y);
		System.out.println(obj2.x + " " + obj2.y);
		
		obj2.x = 100;
		obj2.y = 200;
		
		System.out.println(obj1.x + " " + obj1.y);
		System.out.println(obj2.x + " " + obj2.y);
	}
}