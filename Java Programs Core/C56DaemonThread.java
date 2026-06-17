
public class C56DaemonThread extends Thread{

	public void run() {
		System.out.println("Is Daemon : " + Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		// Daemon Thread in Java
		
		C56DaemonThread t1 = new C56DaemonThread();
		C56DaemonThread t2 = new C56DaemonThread();
		
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
	}

}
