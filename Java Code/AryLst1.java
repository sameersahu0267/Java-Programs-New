import java.util.*;

public class AryLst1 {

	public static void main(String[] args) {
		// ArrayList in Java

		ArrayList ar = new ArrayList();
		
		ar.add(45);
		ar.add("Sameer");
		ar.add(3.14);
		
		System.out.println(ar);
		
		ar.add(45);
		System.out.println(ar);
		
		System.out.println(ar.get(1));
		
		ar.set(3, 56);
		System.out.println(ar);
		
		System.out.println("\nElements are : ");
		for(Object ele : ar) {
			System.out.println(ele);
		}
		
	}

}
