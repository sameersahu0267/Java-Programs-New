import java.util.*;

public class P10LnkHshMap {

	public static void main(String[] args) {
		// Linked Hash Map in Java

		LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
		
		lh.put("Sameer",95);
		lh.put("Sumeet",90);
		lh.put("Gopal",85);
		lh.put("Siddharth",84);
		lh.put("Ayush",85);
		
		System.out.println(lh);
		
		System.out.println(lh.keySet());
		
		System.out.println(lh.values());
	}

}
