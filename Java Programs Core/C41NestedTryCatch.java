import java.util.Scanner;

public class C41NestedTryCatch {

	public static void main(String[] args) {
		// Nested Try - Catch Block in Java
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50};
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		try {
			
			try {
				System.out.println("8th Array Element : " + arr[8]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid Array Index. Error : " + e);
			}
			
			System.out.println("100 divide by n is " + 100/n);
		}
		
		catch(ArithmeticException  e) {
			System.out.println("Cannot Divide Number by 0. Error : " + e);
		}
	
		System.out.println("Rest of Code...");
		
		sc.close();
	}

}
