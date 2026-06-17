public class C10Arrays {
	public static void main(String args[]) {
		
		// Arrays in Java
		
		int arr1[] = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		int arr2[] = {11,22,33,44,55};
		
		System.out.println(arr1[3]);
		System.out.println(arr2[3]);
		
		// Finding Length of Array
		System.out.println("Length is "+arr1.length);
		
		// Displaying all Array Elements
		System.out.println("Array is :");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
