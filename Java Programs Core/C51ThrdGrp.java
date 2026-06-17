
public class C51ThrdGrp extends Thread{

	C51ThrdGrp(ThreadGroup tg, String name) {
		super(tg,name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// Thread Group in Java
		
		ThreadGroup tg = new ThreadGroup("Group 1");

		C51ThrdGrp t1 = new C51ThrdGrp(tg,"Thread 1");
		C51ThrdGrp t2 = new C51ThrdGrp(tg,"Thread 2");
		
		t1.start();
		t2.start();
		
		System.out.println(tg.getName());
	}

}
