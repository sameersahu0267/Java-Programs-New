import java.util.*;

public class C8TreeSet {

	public static void main(String[] args) {
		// Tree Set in Java

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(30);
		ts.add(20);
		ts.add(50);
		ts.add(10);
		ts.add(40);
		
		System.out.println(ts);
		
		ts.remove(40);
		System.out.println(ts);
		
		ts.pollFirst();
		System.out.println(ts);
		
		ts.pollLast();
		System.out.println(ts);
	}

}
