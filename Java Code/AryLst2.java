import java.util.*;

public class AryLst2 {

	public static void main(String[] args) {
		// ArrayList, ListIterator and Iterator in Java
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		ListIterator<Integer> l = ar.listIterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		Iterator<Integer> i = ar.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
