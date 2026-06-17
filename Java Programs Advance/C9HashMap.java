import java.util.*;

public class C9HashMap {

	public static void main(String[] args) {
		// Hash Map in Java

		HashMap<String,Integer> hm = new HashMap<>();
		
		hm.put("Sameer",95);
		hm.put("Sumeet",90);
		hm.put("Gopal",85);
		hm.put("Siddharth",84);
		hm.put("Ayush",85);
		
		System.out.println(hm);
		System.out.println(hm.get("Sameer"));
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
	}

}
