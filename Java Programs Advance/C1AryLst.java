import java.util.*;

public class C1AryLst {

	public static void main(String[] args) {
		// ArrayList in Java

		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(20);
		ar.add(30);
		ar.add(0,10);
		ar.add(40);
		
		System.out.println("Element at index 2 : " + ar.get(2));
		System.out.println("Index of 40 : " + ar.indexOf(40));
		System.out.println(ar);
		
		ar.set(1,15);
		
		for(int i : ar) {				// Using For-Each Loop
			System.out.println(i);
		}
		
		ar.remove(1);
		
		for(Object ele : ar) {			// Using Object
			System.out.println(ele);
		}
		
		System.out.println(ar.contains(30));
		
		System.out.println("ArrayList Size : " + ar.size());
	}

}
