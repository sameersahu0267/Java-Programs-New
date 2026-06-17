
public class C15Method {
	void change(int arr[]) {
		arr[0] = 99;
		arr[2] = 98;
	}

	public static void main(String[] args) {
		
		// Passing Array in Method and Changing its Value
		
		int marks[] = {90,85,88,92,83,80};
		C15Method obj = new C15Method();
		
		System.out.println("Before Changing : "+marks[0] +"  "+ marks[2]);
		obj.change(marks);
		System.out.println("After Changing : "+marks[0] +"  "+ marks[2]);

	}

}
