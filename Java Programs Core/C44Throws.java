import java.io.FileWriter;
import java.io.IOException;

public class C44Throws {

	public static void main(String[] args) throws IOException{
		// throws Keyword in Java

		FileWriter f = new FileWriter("D:/data.txt");
		System.out.println("Hello World");
		f.close();
	}
}
