
public class C43Throw {

	public static void main(String[] args) {
		// throw Keyword in Java
		
		int age = 15;
		if(age < 18) {
			throw new ArithmeticException("Not Eligible to Vote");
		}
		
		System.out.println("Eligible to Vote");

	}

}
