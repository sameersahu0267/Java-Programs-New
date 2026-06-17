
class Student2{
	
	int id;
	String name;
	
	Student2(){
		id = 0;
		name = "Unknown";
	}
	
	Student2(int i){
		id = i;
		name = "Unknown";
	}
	
	Student2(String n){
		id = 0;
		name = n;
	}
	
	Student2(int i,String n){
		id = i;
		name = n;
	}
	
}
public class C22CnstrOvrldng {

	public static void main(String[] args) {
		// Constructor Overloading in Java

		Student2 s1 = new Student2();
		Student2 s2 = new Student2(101);
		Student2 s3 = new Student2("Rohit");
		Student2 s4 = new Student2(102,"Sameer");
		
		System.out.println(s1.id + "\t" + s1.name);
		System.out.println(s2.id + "\t" + s2.name);
		System.out.println(s3.id + "\t" + s3.name);
		System.out.println(s4.id + "\t" + s4.name);
	}

}
