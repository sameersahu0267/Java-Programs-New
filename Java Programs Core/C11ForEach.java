import java.util.Scanner;
public class C11ForEach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter Array Element : ");
			arr[i] = sc.nextInt();
		}

		// Displaying Array using For-Each Loop
		System.out.println("Array is : ");
		for(int element : arr) {
			System.out.println(element);
		}

		sc.close();
	}
}
