import java.io.*;

public class BasicFileOutput {
	static String file = "BasicFileOutput.out";
	public static void main(String[] args) 
	throws IOException {
		BufferedReader br = new BufferedReader(
			new StringReader(
				BufferInputFile.read("BasicFileOutput.java")));
		/**
		 * [PrintWriter description]
		 * the func for PrintWriter achieved BufferedWriter and FileWriter? 
		 * slove:
		 * PrintWriter Added auxiliary constructor
		 * @param  file [description]
		 * @return      [description]
		 */
		PrintWriter pw = new PrintWriter(file);
		/*
		PrintWriter pw = new PrintWriter(
			new BufferedWriter(new FileWriter(file)));
		// the same result with line 16
		*/
		int lineCount = 1;
		String s;
		while((s = br.readLine()) != null)
			pw.println(lineCount++ + ": " + s);
		pw.close();
		System.out.println(BufferInputFile.read(file));
	}
}