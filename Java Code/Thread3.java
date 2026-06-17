
public class Thread3 implements Runnable{

	public void run() {
		System.out.println("My Thread is Running");
	}
	
	public static void main(String[] args) {
		// Thread in Java (using Runnable Interface)

		Thread3 mt = new Thread3();
		Thread t1 = new Thread(mt);
		
		t1.start();
	}

}
