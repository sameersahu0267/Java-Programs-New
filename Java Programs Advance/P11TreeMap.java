import java.util.*;

public class P11TreeMap {

	public static void main(String[] args) {
		// Tree Map in Java

		TreeMap<String,Integer> tm = new TreeMap<>();
		
		tm.put("Sameer",95);
		tm.put("Sumeet",90);
		tm.put("Gopal",85);
		tm.put("Siddharth",84);
		tm.put("Ayush",85);
		
		System.out.println(tm);
		
		System.out.println(tm.get("Sameer"));
		
		System.out.println(tm.keySet());
		
		System.out.println(tm.values());
	}

}
