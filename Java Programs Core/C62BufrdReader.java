import java.io.*;

public class C62BufrdReader {

	public static void main(String[] args) throws IOException{
		// Buffered Reader in Java
		
		FileReader fr = new FileReader("C:\\Users\\samee\\Desktop\\Java FH\\C61.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();

	}

}
