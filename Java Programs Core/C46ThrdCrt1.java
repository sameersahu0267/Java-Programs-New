
class MyThread1 extends Thread{

	public void run() {
		System.out.println("Creating Thread Using Thread Class");
		System.out.println("My Thread is Running...");
	}
}

public class C46ThrdCrt1 {

	public static void main(String[] args) {
		// Creating Thread Using Thread Class

		MyThread1 t1 = new MyThread1();
		t1.start();
	}
}