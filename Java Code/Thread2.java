
class MyT1 extends Thread{
	
	public void run() {
		
		System.out.println("First Thread");
		
		for(int i=0;i<=5;i++) {
			System.out.println("i = " +i);
		}
	}
}

class MyT2 extends Thread{
	
	public void run() {
		
		System.out.println("Second Thread");
		
		for(int j=0;j<=5;j++) {
			System.out.println("j = " +j);
		}
	}
}

public class Thread2 {

	public static void main(String[] args) {
		// Multi-Threading in Java (using Thread Class)
		
		MyT1 t1 = new MyT1();
		t1.start();
		
		MyT2 t2 = new MyT2();
		t2.start();

	}

}
