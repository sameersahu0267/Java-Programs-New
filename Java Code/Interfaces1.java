
interface Naming{
	String name = "Sameer Sahu";
	void display();
}

class Name implements Naming{
	public void display() {
		System.out.println("My n ame is "+ name);
	}
}

public class Interfaces1 {

	public static void main(String[] args) {
		// Interface in Java
		
		Name o1 = new Name();
		o1.display();

	}

}
