import java.util.*;

public class C5Stack {

	public static void main(String[] args) {
		// Stack in Java

		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		
		System.out.println(s.search(40));
		
		System.out.println("Stack Top : " + s.peek());
		
		System.out.println(s.isEmpty());
		
		System.out.println("Deleted Item : " + s.pop());
	}

}
