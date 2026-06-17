import java.util.*;

public class Stck1 {

	public static void main(String[] args) {
		// Stack in Java

		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println("Stack : " + s);
		
		s.pop();
		s.pop();

		System.out.println("Stack : " + s);
		
		System.out.println("Stack Top : " + s.peek());
	}

}
