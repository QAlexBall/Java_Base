import java.io.*;
class PrintWriterDemo {
	public static void main(String [] args) throws IOException {
		File f = new File("C:/Users/zhuderen/Desktop/javaReview/IOTest/abc.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter p = new PrintWriter(bw);
		p.println("hello java io kdfljalk;fa   dajf;dajf;a;dfj");
		p.close();
	}
}