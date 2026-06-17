import java.util.*;

public class C4Vector {

	public static void main(String[] args) {
		// Vector in Java

		Vector<Integer> v = new Vector<>();
		
		v.add(10);
		v.add(30);
		v.add(20);
		v.addElement(50);
		
		System.out.println(v);
		
		System.out.println(v.get(2));
		
		v.set(3, 40);
		System.out.println(v);
		
		System.out.println(v.isEmpty());
	}

}
