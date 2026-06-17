import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		// Tree Set in Java
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(45);
		ts.add(35);
		ts.add(75);
		ts.add(55);
		ts.add(15);
		
		System.out.println(ts);

		Iterator<Integer> i = ts.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ts.clear();
	}

}
