
class MulThrd1 extends Thread{
	public void run() {
		int i = 0;
		while(i<20) {
			System.out.println("Thread 1 Hello World");
			i++;
		}
	}
}

class MulThrd2 extends Thread{
	public void run() {
		int i = 0;
		while(i<20) {
			System.out.println("Thread 2 Sameer Sahu");
			i++;
		}
	}
}

public class C48MultiThreading {

	public static void main(String[] args) {
		// Multi-Threading in Java

		MulThrd1 t1 = new MulThrd1();
		MulThrd2 t2 = new MulThrd2();
		
		t1.start();
		t2.start();
	}

}
