import java.util.*;

class Stud1 implements Comparable<Stud1>{
	int roll;
	String name;
	int age;
	
	Stud1(int roll, String name, int age){
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Stud1 st) {
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
	}
}

public class Comparable1 {

	public static void main(String[] args) {
		// Comparable in Java
		
		ArrayList<Stud1> a1 = new ArrayList<Stud1>();
		
		Stud1 s1 = new Stud1(101,"Sameer",21);
		a1.add(s1);
		Stud1 s2 = new Stud1(102,"Siddharth",24);
		a1.add(s2);
		Stud1 s3 = new Stud1(103,"Gopal",22);
		a1.add(s3);

		Collections.sort(a1);
		
		for(Stud1 st : a1) {
			System.out.println(st.roll + " " + st.name + " " + st.age);
		}
	}

}
