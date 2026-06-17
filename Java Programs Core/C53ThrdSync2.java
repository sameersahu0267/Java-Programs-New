
class Table2{
	void printTable(int n) {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(n * i);
			}
		}
		System.out.println("\n");
	}
}

class Thrd3 extends Thread{
	Table2 t;
	Thrd3(Table2 t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class Thrd4 extends Thread{
	Table2 t;
	Thrd4(Table2 t){
		this.t = t;
	}
	public void run() {
		t.printTable(8);
	}
}

public class C53ThrdSync2 {

	public static void main(String[] args) {
		// Thread Synchronization in Java (using synchronized block)

		Table2 obj = new Table2();
		
		Thrd3 t1 = new Thrd3(obj);
		Thrd4 t2 = new Thrd4(obj);
		
		t1.start();
		t2.start();
	}

}
