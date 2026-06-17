
public class ThisKeyword {

	int id = 101;
	String name = "Sameer Sahu";

	void display() {
		this.hello();
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}

	void hello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		// This Keyword in Java

		ThisKeyword obj = new ThisKeyword();
		obj.display();

	}
}