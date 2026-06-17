
class Table1{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n * i);
		}
		System.out.println("\n");
	}
}

class Thrd1 extends Thread{
	Table1 t;
	Thrd1(Table1 t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class Thrd2 extends Thread{
	Table1 t;
	Thrd2(Table1 t){
		this.t = t;
	}
	public void run() {
		t.printTable(8);
	}
}

public class C52ThrdSync1 {

	public static void main(String[] args) {
		// Thread Synchronization in Java (using synchronized method)

		Table1 obj = new Table1();
		
		Thrd1 t1 = new Thrd1(obj);
		Thrd2 t2 = new Thrd2(obj);
		
		t1.start();
		t2.start();
	}

}
