
public class ObjectClass {
	String n;
	public ObjectClass(String n) {
		this.n = n;
	}
	public String toString() {
		return n+" ";
	}

	public static void main(String[] args) {
		
		// Object Class in Java
		
		ObjectClass obj = new ObjectClass("seeks");
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
	}

}
