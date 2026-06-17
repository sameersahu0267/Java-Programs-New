
class Employee{
	
	int id;
	String name;
	
	void displayDetails() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
	}
}

public class C19CustomClass {

	public static void main(String[] args) {
		
		// Custom or User Defined Class in Java
		
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Sameer";
		e1.displayDetails();
		
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "Sumeet";
		e2.displayDetails();
	}

}
