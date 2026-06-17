import java.util.Scanner;

public class C04UserInput {

	public static void main(String[] args) {
		
		// User Input in Java
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Full Name : ");
		String fullName = sc.nextLine();					// Takes String as Input (Multiple Words)
		
		System.out.print("Enter Your Course : ");
		String course = sc.next();							// Takes String as Input (Single Word Only)
		
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();								// Takes Integer as Input
		
		System.out.print("Enter Your Percentage : ");
		float per = sc.nextFloat();							// Takes Float as Input
		
		System.out.println("Hello "+fullName);
		System.out.println("Your Age is "+age);
		System.out.println("Your Course is "+course);
		System.out.println("Your Percentage is "+per);
		
		sc.close();
	}

}
