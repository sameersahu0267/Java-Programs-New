
class Address{
	int houseno;
	String street;
	Address(int houseno, String street){
		this.houseno = houseno;
		this.street = street;
	}
	void displayad(){
		System.out.println("House No. : "+houseno);
		System.out.println("Street : "+street);
	}
}

class Customer{
	String name;
	Address address;
	Customer(String name, Address address){
		this.name = name;
		this.address = address;
	}
	void displaycust() {
		System.out.println("Name : "+name);
		System.out.println("House No. : "+address.houseno);
		System.out.println("Name : "+address.street);
	}
}

public class Aggregation {

	public static void main(String[] args) {
		// Aggregation in Java

		Address a1 = new Address(101,"Shuklaganj");
		Customer c1 = new Customer("Sameer Sahu",a1);
		
		a1.displayad();
		c1.displaycust();
	}

}
