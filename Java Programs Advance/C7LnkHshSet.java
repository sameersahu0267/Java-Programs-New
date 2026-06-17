import java.util.*;

public class C7LnkHshSet {

	public static void main(String[] args) {
		// Linked Hash Set in Java

		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		
		System.out.println(ls);
		
		System.out.println(ls.contains(30));
		
		ls.remove(20);
		System.out.println(ls);
		
		ls.clear();
		System.out.println(ls);
	}

}
