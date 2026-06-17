import java.util.Scanner;
public class C07Conditionals {

	public static void main(String[] args) {
		
		// If - Else If - Else in Java
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		
		if(n>0)
			System.out.println("Positive Number");
		else if(n==0)
			System.out.println("Zero");
		else
			System.out.println("Negative Number");
		
		sc.close();
	}
	
}
