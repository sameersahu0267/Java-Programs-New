public class C06Strings {

	public static void main(String[] args) {
		
		// Strings in Java
		String s = new String("  Hello");				// String is a Class but can be used as a DataType
		String name = "Sameer";							// String is Immutable
		
		System.out.println(s);
		System.out.println(name);
		
		// Escape Sequences
		System.out.println("Hello\tWorld\n");
		
		// String Methods
		System.out.println("Length of name is "+ name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(s.trim());
		System.out.println(name.substring(2));
		System.out.println(name.substring(1,5));
		System.out.println(name.replace('e','i'));
		System.out.println(name.replace("ee","i"));
		System.out.println(name.startsWith("Sa"));
		System.out.println(name.endsWith("ir"));
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf('m'));
		System.out.println(name.lastIndexOf('e'));
		System.out.println(name.equals("sameer"));
		System.out.println(name.equalsIgnoreCase("sameer"));
		System.out.println(name.contains("Sam"));
	}

}
