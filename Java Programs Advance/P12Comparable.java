import java.util.*;

class Stu1 implements Comparable<Stu1>{

	int roll;
	String name;
	int age;

	Stu1(int r,String s,int a){
		roll = r;
		name = s;
		age = a;
	}

	@Override
	public int compareTo(Stu1 st) {
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
	}

}

public class P12Comparable {

	public static void main(String[] args) {
		// Comparable in Java

		ArrayList<Stu1> a1 = new ArrayList<>();
		
		Stu1 s1 = new Stu1(101,"Sameer",21);
		a1.add(s1);
		Stu1 s2 = new Stu1(102,"Gopal",23);
		a1.add(s2);
		Stu1 s3 = new Stu1(103,"Siddharth",24);
		a1.add(s3);
		Stu1 s4 = new Stu1(104,"Sumeet",22);
		a1.add(s4);
		
		Collections.sort(a1);
		
		System.out.println("Sorted Student (according to age) : ");
		for(Stu1 st : a1) {
			System.out.println(st.roll + " " + st.name + " " + st.age);
		}
	}

}
