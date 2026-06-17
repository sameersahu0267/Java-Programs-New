import java.util.Scanner;
public class P03LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int y = sc.nextInt();
		
		if(y % 400 == 0)
				System.out.println("Leap Year");
		else if(y%4 == 0 && y%100 != 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		
		sc.close();
	}

}
