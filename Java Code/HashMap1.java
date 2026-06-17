import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		// HashMap in Java
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(101,"Sameer");
		hm.put(102,"Gopal");
		hm.put(103,"Sumeet");
		hm.put(104,"Siddharth");

		System.out.println(hm);
		
		System.out.println("Keys : " + hm.keySet());
		
		System.out.println("Values : " + hm.values());
		
		System.out.println(hm.get(101));
		
		System.out.println(hm.entrySet());
		
	}

}
