
class Table3{
	synchronized static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n * i);
		}
		System.out.println("\n");
	}
}

class Thrd5 extends Thread{
	public void run() {
		Table3.printTable(5);
	}
}

class Thrd6 extends Thread{
	public void run() {
		Table3.printTable(8);
	}
}

public class C54ThrdSync3 {

	public static void main(String[] args) {
		// Thread Synchronization in Java (using static synchronization)

		Thrd5 t1 = new Thrd5();
		Thrd6 t2 = new Thrd6();
		
		t1.start();
		t2.start();
	}

}
