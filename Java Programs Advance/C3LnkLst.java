import java.util.*;

public class C3LnkLst {

	public static void main(String[] args) {
		// Linked List in Java

		LinkedList<Integer> l = new LinkedList<>();
		
		l.addFirst(20);
		l.addFirst(10);
		
		l.addLast(40);
		l.addLast(50);
		
		l.add(2,30);
		l.add(5,60);
		
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		l.remove(3);
		
		System.out.println(l);
		
		System.out.println("First Element: " + l.getFirst());
		System.out.println("Last Element: " + l.getLast());
		
		Collections.reverse(l);
		System.out.println("Reversed List: " + l);
		
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("Sorted List: " + l);
		
	}

}
