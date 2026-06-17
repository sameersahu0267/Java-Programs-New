class BankAccount1{
	
	int accNo;
	int balance;
	
	public BankAccount1(int acc, int b) {
		accNo = acc;
		balance = b;
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println("Amount Deposited Successfully");
	}
	
	void withdraw(int amount) {
		if(amount < balance) {
			balance -= amount;
			System.out.println("Amount Withdrawn Successfully");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void display() {
		System.out.println("Account Number : " + accNo);
		System.out.println("Current Balance : " + balance);
	}
}

public class A2MyBank {

	public static void main(String[] args) {
		
		BankAccount1 a1 = new BankAccount1(101, 10000);
		
		a1.display();
		
		a1.deposit(5000);
		a1.display();
		
		a1.withdraw(2000);
		a1.display();

	}

}
