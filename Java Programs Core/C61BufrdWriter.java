import java.io.*;

public class C61BufrdWriter {

	public static void main(String[] args) throws IOException{
		// Buffered Writer in Java
		
		FileWriter fw = new FileWriter("C:\\Users\\samee\\Desktop\\Java FH\\C61.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(65);
		bw.newLine();
		
		bw.write("Buffered Writer & Reader in Java");
		bw.newLine();
		
		char c[] = {'X','Y','Z'};
		bw.write(c);
		
		bw.flush();
		bw.close();
		
		System.out.println("Written Successfully");
		
	}

}
