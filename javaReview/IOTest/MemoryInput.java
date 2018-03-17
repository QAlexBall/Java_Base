import java.io.*;
public class MemoryInput {
	public static void main(String[] args) throws IOException {
		// FileReader f = new FileReader("C:/Users/zhuderen/Desktop/javaReview/IOTest/a.txt");
		/**
		 * [StringReader description]
		 * @param  BufferInputFile.read("MemoryInput.java") [description]
		 * @return 
		 * 
		 */
		StringReader sr = new StringReader(
			BufferInputFile.read("MemoryInput.java"));
		// StringReader in = new StringReader("fdahkljaf");
		int c;
		while((c = sr.read()) != -1)
			System.out.print((char)c);
	}
}