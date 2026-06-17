import java.util.Scanner;
public class C14Method {
	
	int max(int x,int y) {					// Creating Method (without static)
		if(x>y)
			return x;
		else
			return y;
	}
	
	int min(int x,int y) {					// Creating Method (without static)
		if(x<y)
			return x;
		else
			return y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		
		C14Method obj = new C14Method();
		
		System.out.println("Maximum Number is " + obj.max(a,b));
		System.out.println("Minimum Number is " + obj.min(a,b));

		sc.close();
	}

}
