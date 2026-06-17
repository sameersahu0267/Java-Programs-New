
class A1{
	
	String s;
	
	void display(String s) {
		this.s = s;
		this.demo(10,20);
		System.out.println(s + " Class A");
	}
	
	void demo(int x,int y) {
		System.out.println("x = "+x + " y = "+y);
	}
	
}

public class C25This {

	public static void main(String[] args) {
		// this Keyword in Java
		
		A1 obj = new A1();
		obj.display("Hello");
		
	}

}
