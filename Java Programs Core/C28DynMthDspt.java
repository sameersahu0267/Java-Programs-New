
class Phone{
	void on() {
		System.out.println("Phone is turning On");
	}
	void p1() {
		System.out.println("Phone Class Method");
	}
}

class SmartPhone extends Phone{
	void on() {
		System.out.println("SmartPhone is Turning On");
	}
	void sp1() {
		System.out.println("SmartPhone Class Method");
	}
}

public class C28DynMthDspt {

	public static void main(String[] args) {
		// Dynamic Method Dispatch in Java
		
		Phone obj = new SmartPhone();
		
		obj.on();
		obj.p1();
		
//		obj.sp1();		// Not Allowed
		
//		SmartPhone obj2 = new Phone();		// Not Allowed
	}

}
