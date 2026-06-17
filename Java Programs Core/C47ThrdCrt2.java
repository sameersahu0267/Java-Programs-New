
class MyThread2 implements Runnable{
	
	public void run() {
		System.out.println("Creating Thread Using Runnable Interface");
		System.out.println("My Thread is Running...");
	}
}

public class C47ThrdCrt2 {

	public static void main(String[] args) {
		// Creating Thread Using Runnable Interface

		MyThread2 mt = new MyThread2();
		Thread t1 = new Thread(mt);
		t1.start();
	}

}
