import java.io.FileReader;
import java.io.IOException;

public class C60FileReader {

	public static void main(String[] args) throws IOException{
		// File Reader in Java
		
		FileReader fr = new FileReader("C:\\Users\\samee\\Desktop\\Java FH\\C59.txt");
		
		int i = 0;
		
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}

		fr.close();
	}

}
