
public class Thread1 extends Thread{
	
	public void run() {
		System.out.println("My Thread is Running");
	}

	public static void main(String[] args) {
		// Thread in Java (using Thread Class)

		Thread1 t1 = new Thread1();
		t1.start();
		
	}

}
