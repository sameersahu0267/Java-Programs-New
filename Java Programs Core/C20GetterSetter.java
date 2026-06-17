
class Employee1{
	
	private int id;
	private String name;
	
	// Setter
	public void setName(String n) {
		name = n;
	}
	public void setId(int i) {
		id = i;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
}

public class C20GetterSetter {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1();
		e1.setName("Sameer");
		e1.setId(101);
		
		System.out.println(e1.getId() + " " + e1.getName());
	}

}
