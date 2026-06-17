import java.io.*;

public class C63PrintWriter {

	public static void main(String[] args) throws IOException{
		// Print Writer in Java
		
		PrintWriter pw = new PrintWriter("C:\\Users\\samee\\Desktop\\Java FH\\C63.txt");
		
		pw.print(100);
		pw.print("\n");
		
		pw.println(65.58);
		
		pw.print(true);
		pw.print("\n");
		
		pw.print("Hello World");
		pw.print("\n");
		
		pw.print('S');
		pw.print("\n");
		
		pw.flush();
		pw.close();
		
		System.out.println("Written Successfully");
	}

}
