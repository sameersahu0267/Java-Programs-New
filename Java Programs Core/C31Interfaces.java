
interface I1{
	
	String name = "Sameer";			// By Default public static final
	void display();					// By Default public abstract
}

public class C31Interfaces implements I1{
	
	public void display() {
		System.out.println("My Name is : "+name);
	}
	
	public static void main(String[] args) {
		// Interfaces in Java
		
		C31Interfaces obj = new C31Interfaces();
		
		System.out.println("Hello "+ name);
		obj.display();
	}

}
