
interface If1{
	void m1();
}

interface If2 extends If1{
	void m2();
}

class Cl implements If2{
	
	public void m1(){
		System.out.println("Method 1");
	}
	
	public void m2() {
		System.out.println("Method 2");
	}
}

public class C31Interfaces3 {

	public static void main(String[] args) {
		// Inheritance in Interfaces
		
		Cl obj = new Cl();
		obj.m1();
		obj.m2();

	}

}
