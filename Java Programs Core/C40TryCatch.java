import java.util.Scanner;

public class C40TryCatch {

	public static void main(String[] args) {
		// Try - Catch Block in Java
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50};
		
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		try {
			System.out.println("100 / n is : "+ 100/n);
			System.out.println("8th Array Element is : "+ arr[8]);
		}
		catch(ArithmeticException e) {
			System.out.println("You cannot Divide Number by 0. Error : "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing Invalid Array Index. Error : "+ e);
		}
		
		System.out.println("Rest of Code...");

		sc.close();
	}

}
