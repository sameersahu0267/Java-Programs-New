import java.util.*;

public class LinkList1 {

	public static void main(String[] args) {
		// Linked List in Java

		LinkedList<Integer> ls = new LinkedList<>();
		
		ls.addFirst(20);
		ls.addFirst(10);
		
		ls.addLast(30);
		ls.addLast(50);
		
		ls.add(3,40);
		ls.add(5,60);
		
		System.out.println(ls);
		
		ls.add(2,25);
		System.out.println(ls);
		
		ls.removeFirst();
		ls.removeLast();
		
		System.out.println(ls);
		
		ls.remove(1);
		System.out.println(ls);
	}

}
