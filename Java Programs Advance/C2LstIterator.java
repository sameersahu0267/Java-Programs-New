import java.util.*;

public class C2LstIterator {

	public static void main(String[] args) {
		// Iterator and ListIterator in Java

		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		ListIterator<Integer> l = a.listIterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		Iterator<Integer> i = a.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
