
class Student1{
	int id;
	String name;
	
	Student1(){				// Default Constructor
		id = 0;
		name = "XYZ";
	}
	
	Student1(int i, String n){			// Parameterized Constructor
		id = i;
		name = n;
	}
}
public class C21Constructor {

	public static void main(String[] args) {
		// Constructor in Java
		
		Student1 s1 = new Student1();
		System.out.println(s1.id + "\t" + s1.name);
		
		Student1 s2 = new Student1(101,"Sameer");
		System.out.println(s2.id + "\t" + s2.name);

	}

}