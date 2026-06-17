
class AgeException extends Exception{
	AgeException(String s) {
		super(s);
	}
}

public class C45CustomExcptn {

	static void validate(int age) throws AgeException{
		if(age < 18) {
			throw new AgeException("Invalid Age");
		}
		else {
			System.out.println("You can Vote");
		}
	}
	public static void main(String[] args) {
		// Custom / User-Defined Exception in Java
		
		try {
			validate(15);
		}
		catch(AgeException e) {
			System.out.println("Exception Occur : "+ e);
		}
		

	}

}
