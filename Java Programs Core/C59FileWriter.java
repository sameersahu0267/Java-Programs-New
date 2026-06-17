import java.io.FileWriter;
import java.io.IOException;

public class C59FileWriter {

	public static void main(String[] args) throws IOException{
		// File Writer in Java
		
		FileWriter fw = new FileWriter("C:\\Users\\samee\\Desktop\\Java FH\\C59.txt");

		fw.write(65);
		
		fw.write("\nSameer Sahu\n");
		
		char c[] = {'A','B','C'};
		fw.write(c);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("Written Successfully");
	}

}
