import java.io.FileOutputStream;

public class C57FileOutputStrm {

	public static void main(String[] args) {
		// File Output Stream in Java
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\samee\\Desktop\\Java FH\\C57.txt");
			
			fout.write(65);
			
			String s = "\nHello World \nFile Output Stream\n";
			byte b[] = s.getBytes();
			fout.write(b);
			
			fout.close();
			
			System.out.println("Written Successfully");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
