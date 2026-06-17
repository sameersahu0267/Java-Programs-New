import java.io.FileInputStream;

public class C58FileInputStrm {

	public static void main(String[] args) {
		// File Input Stream in Java

		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\samee\\Desktop\\Java FH\\C57.txt");
			
			int i = 0;
			
			while((i = fin.read()) != -1) {
				System.out.print((char)i);
			}
			
			fin.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
