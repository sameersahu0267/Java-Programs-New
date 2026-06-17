
abstract class Abs1{
	abstract void M1();
	abstract void M2();
}

abstract class Abs2 extends Abs1{
	void M1(){
		System.out.println("Abstract Method 1");
	}
}

class Abs3 extends Abs2{
	void M2(){
		System.out.println("Abstract Method 2");
	}
}

public class AbstractClass2 {

	public static void main(String[] args) {
		// Abstract Class

		Abs3 obj = new Abs3();
		obj.M1();
		obj.M2();

	}

}