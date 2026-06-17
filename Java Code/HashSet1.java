import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		// HashSet in Java

		HashSet hs = new HashSet();
		hs.add(20);
		hs.add(10);
		hs.add(20);
		
		System.out.println(hs);
		
		System.out.println("HashSet Size : " + hs.size());
		
		System.out.println(hs.contains(30));
		
		Iterator i = hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		hs.remove(20);
		
		System.out.println(hs);
	}

}
