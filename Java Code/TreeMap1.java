import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {
		// TreeMap in Java

		TreeMap<Integer,Integer> tm = new TreeMap<>();
		
		tm.put(1,10);
		tm.put(4,40);
		tm.put(3,30);
		tm.put(2,20);
		
		System.out.println(tm);
		
		for(Integer i : tm.keySet()) {
			System.out.println("Key : " + i + ", Value : " + tm.get(i));
		}
	}

}
