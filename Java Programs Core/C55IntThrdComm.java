
class Customer1{
	
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		
		System.out.println("Going to Withdraw...");
		
		if(this.amount < amount) {
			System.out.println("Less Balance. Waiting for Deposit...");
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
		}
		
		this.amount -= amount;
		System.out.println("Withdraw Successfully\nCurrent Amount : " + this.amount);
	}
	
	synchronized void deposit(int amount) {
		
		System.out.println("Going to Deposit...");
		this.amount += amount;
		System.out.println("Deposited Successfully\nCurrent Amount : " + this.amount);
		notify();
	}
	
}

class NewThread1 extends Thread{
	Customer1 c;
	NewThread1(Customer1 c){
		this.c = c;
	}
	public void run() {
		c.withdraw(15000);
	}
}

class NewThread2 extends Thread{
	Customer1 c;
	NewThread2(Customer1 c){
		this.c = c;
	}
	public void run() {
		c.deposit(10000);
	}
}

public class C55IntThrdComm {

	public static void main(String[] args) {
		// Inter - Thread Communication in Java

		Customer1 c1 = new Customer1();
		
		NewThread1 t1 = new NewThread1(c1);
		NewThread2 t2 = new NewThread2(c1);
		
		t1.start();
		t2.start();

	}

}
