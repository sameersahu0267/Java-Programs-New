import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {

	public static void main(String[] args) throws IOException{
		// FileWrite in Java

		FileWriter w = new FileWriter("C:\\Users\\samee\\Documents\\file1.txt");
		w.write("This is an Example of ");
		w.write("Java FileWriter Class ");
		w.close();
		
	}

}
