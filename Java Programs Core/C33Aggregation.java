
class Clg{
	
	String name;
	
	Clg(String name){
		this.name = name;
	}
}

class Stu{
	
	String name;
	Clg college;
	
	Stu(String name,Clg college){
		this.name = name;
		this.college = college;
	}
	
	void display() {
		System.out.println(name + " studies at " + college.name);
	}
}

public class C33Aggregation {

	public static void main(String[] args) {
		// Aggregation in Java (Weak Has-A Relationship)

		Clg c1 = new Clg("PSIT");
		Stu s1 = new Stu("Sameer",c1);
		s1.display();
	}

}
