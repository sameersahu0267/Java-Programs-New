
public class throwKeyword {

	static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Not Valid");
		}
		else {
			System.out.println("You can Vote");
		}
	}
	
	public static void main(String[] args) {
		// throw in Java
		
		try {
			checkAge(15);
		}
		catch(ArithmeticException e){
			System.out.println("Exception is : "+e);
		}
		System.out.println("Code Continue");
	}

}
