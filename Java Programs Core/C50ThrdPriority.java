
class MyThread5 extends Thread{
	public void run() {
		System.out.println("Thread is Running...");
	}
}

public class C50ThrdPriority {

	public static void main(String[] args) {
		// Thread Priority in Java

		MyThread5 t1 = new MyThread5();
		MyThread5 t2 = new MyThread5();
		MyThread5 t3 = new MyThread5();
		MyThread5 t4 = new MyThread5();
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		
		System.out.println("Thread 1 Priority : " + t1.getPriority());
		System.out.println("Thread 2 Priority : " + t2.getPriority());
		System.out.println("Thread 3 Priority : " + t3.getPriority());
		System.out.println("Thread 4 Priority : " + t4.getPriority());
	}

}
