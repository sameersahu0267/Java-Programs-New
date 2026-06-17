import java.util.*;

class Stu2{
	
	int roll;
	String name;
	int age;
	
	Stu2(int r,String n,int a){
		roll = r;
		name = n;
		age = a;
	}
}

class NameComparator implements Comparator<Stu2> {
    public int compare(Stu2 s1, Stu2 s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator implements Comparator<Stu2> {
    public int compare(Stu2 s1, Stu2 s2) {
        return s1.age - s2.age; 
    }
}

public class P13Comparator {

	public static void main(String[] args) {
		// Comparator in Java

		ArrayList<Stu2> a1 = new ArrayList<>();
		
		Stu2 s1 = new Stu2(101,"Sameer",21);
		a1.add(s1);
		Stu2 s2 = new Stu2(102,"Gopal",23);
		a1.add(s2);
		Stu2 s3 = new Stu2(103,"Siddharth",24);
		a1.add(s3);
		Stu2 s4 = new Stu2(104,"Sumeet",22);
		a1.add(s4);
		
		System.out.println("Sorting by Name\n");
		Collections.sort(a1,new NameComparator());
		
		for(Stu2 st : a1) {
			System.out.println(st.roll + " " + st.name + " " + st.age);
		}
		
		System.out.println("\nSorting by Age\n");
		Collections.sort(a1,new AgeComparator());
		
		for(Stu2 st : a1) {
			System.out.println(st.roll + " " + st.name + " " + st.age);
		}
		
	}

}
