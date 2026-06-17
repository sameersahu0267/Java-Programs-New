import java.util.*;

public class LinkHashSet1 {

	public static void main(String[] args) {
		// Linked HashSet in Java

		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(20);
		
		System.out.println(set);
		
		System.out.println(set.contains(30));
		
		System.out.println("Linked HashSet Size : " + set.size());
		
		for(Integer i : set) {
			System.out.println(i);
		}
	}

}
