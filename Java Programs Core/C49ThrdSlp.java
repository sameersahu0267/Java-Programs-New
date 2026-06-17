
class MyThread3 extends Thread{
	public void run() {
		int i = 0;
		while(i<100) {
			if(i==50) {
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println("Interrupted Error Occurs!!");
				}
			}
			System.out.println("Hello World : " + i);
			i++;
		}
	}
}

class MyThread4 extends Thread{
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Sameer Sahu : " + i);
			i++;
		}
	}
}

public class C49ThrdSlp {

	public static void main(String[] args) {
		// Sleep Method in Thread

		MyThread3 t1 = new MyThread3();
		MyThread4 t2 = new MyThread4();
		
		t1.start();
		t2.start();
	}

}
