
class Engine{
	
	void start() {
		System.out.println("Engine Starts...");
	}
}

class Car{
	
	Engine engine;
	
	Car(){
		engine = new Engine();
	}
	
	void drive() {
		engine.start();
		System.out.println("Car Moves...");
	}
}

public class C34Composition {

	public static void main(String[] args) {
		// Composition in Java (Strong Has-A Relationship)

		Car c1 = new Car();
		c1.drive();
	}

}
